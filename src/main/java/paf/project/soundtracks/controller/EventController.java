package paf.project.soundtracks.controller;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.EventRating;
import paf.project.soundtracks.model.Performance;
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.model.Artist;
import paf.project.soundtracks.repository.ArtistRepository;
import paf.project.soundtracks.repository.EventRatingRepository;
import paf.project.soundtracks.repository.EventRepository;
import paf.project.soundtracks.repository.LocationRepository;
import paf.project.soundtracks.repository.PerformanceRepository;
import paf.project.soundtracks.repository.PersonalEventRatingRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import paf.project.soundtracks.model.Location;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/event")
public class EventController {

    private final EventRepository eventRepository;
    private final ArtistRepository artistRepository;
    private final LocationRepository locationRepository;
    private final PerformanceRepository performanceRepository;
    private final PersonalEventRatingRepository personalEventRatingRepository;
    private final EventRatingRepository eventRatingRepository;  

    public EventController(EventRepository eventRepository, ArtistRepository artistRepository, LocationRepository locationRepository, PerformanceRepository performanceRepository, PersonalEventRatingRepository personalEventRatingRepository, EventRatingRepository eventRatingRepository) {
        this.eventRepository = eventRepository;
        this.artistRepository = artistRepository;
        this.locationRepository = locationRepository;
        this.performanceRepository = performanceRepository;
        this.personalEventRatingRepository = personalEventRatingRepository;
        this.eventRatingRepository = eventRatingRepository;
    }

    
    // create event form
    @GetMapping("/new")
    public String showCreateEventForm(Model model) {
        model.addAttribute("event", new Event());
        List<Artist> artists = artistRepository.findAll();
        model.addAttribute("artists", artists);
        model.addAttribute("locations", locationRepository.findAll());
        return "event-create";
    }

    // submit form
    @PostMapping("/new")
    public String createEvent(@ModelAttribute Event event, @RequestParam(name = "artistIds", required = false) List<Long> artistIds) {

        Location location = locationRepository.findById(event.getLocationId())
            .orElseThrow(() -> new IllegalArgumentException("Invalid location ID: " + event.getLocationId()));
        
        event.setLocation(location);
        
        Event savedEvent = eventRepository.save(event);
        // Save participating artists as performances
    if (artistIds != null) {

        for (Long artistId : artistIds) {

            Artist artist = artistRepository.findById(artistId)
                    .orElseThrow(() ->
                        new IllegalArgumentException("Invalid artist ID: " + artistId));

            Performance performance = new Performance();

            performance.setEvent(savedEvent);
            performance.setArtist(artist);

            performanceRepository.save(performance);
        }
    }
        return "redirect:/event/" + savedEvent.getEventId();
    }
    
    // helper method to safely handle null ratings
    private BigDecimal safe(BigDecimal value) {
            return value != null ? value : BigDecimal.ZERO;
    }

    // event details
    @GetMapping("/{id}")
    //@RequestMapping("/event")
    public String eventDetails(@PathVariable("id") Long id, Model model) {
        Event event = eventRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Event not found: " + id));

        List<Performance> performances = performanceRepository.findByEvent(event);

        List<PersonalEventRating> reviews = personalEventRatingRepository.findByEvent(event);

        EventRating eventRating = eventRatingRepository.findByEvent(event)
            .orElse(new EventRating()); // return empty EventRating if not found to avoid null pointer

        if(eventRating != null) {
            Map<String, BigDecimal> segments = Map.of(
                "Atmosphäre", safe(eventRating.getAtmosphereAverageRating()),
                "Gastronomie", safe(eventRating.getGastronomyAverageRating()),
                "Location", safe(eventRating.getLocationAverageRating()),
                "Sanitärbereich", safe(eventRating.getRestroomAverageRating()),
                "Security", safe(eventRating.getSecurityAverageRating()),
                "Sound", safe(eventRating.getSoundAverageRating()),
                "Garderobe", safe(eventRating.getWardrobeAverageRating())
             );
             model.addAttribute("segments", segments);
        }
        
        boolean hasRating = eventRating != null
            && eventRating.getEventAverageRating() != null
            && event.getEventDate().isBefore(LocalDate.now());

        model.addAttribute("hasRating", hasRating);
        model.addAttribute("event", event);
        model.addAttribute("performances", performances);
        model.addAttribute("reviews", reviews);
        model.addAttribute("eventRating", eventRating);

        //debugging
        /* System.out.println("EVENT: " + event.getEventName());
        System.out.println("LOCATION: " + event.getLocation().getLocationName()); */
        return "event-details";
    }

    // add event performances
    @GetMapping("/{eventId}/performance/new")
    public String showAddPerformanceForm(@PathVariable("eventId") Long eventId, Model model) {

        Event event = eventRepository.findById(eventId)
            .orElseThrow(() -> new IllegalArgumentException("Event not found: " + eventId));

        Performance performance = new Performance();
        performance.setEvent(event);

        model.addAttribute("performance", performance);
        model.addAttribute("artists", artistRepository.findAll());
        model.addAttribute("event", event);

        return "performance-create";
    }

    // save new performances
    @PostMapping("/{eventId}/performance/new")
    public String addPerformance(
            @PathVariable("eventId") Long eventId,
            @RequestParam("artistId") Long artistId) {

        Event event = eventRepository.findById(eventId)
            .orElseThrow(() -> new IllegalArgumentException("Event not found: " + eventId));

        Artist artist = artistRepository.findById(artistId)
            .orElseThrow(() -> new IllegalArgumentException("Artist not found: " + artistId));

        Performance performance = new Performance();
        performance.setEvent(event);
        performance.setArtist(artist);

        performanceRepository.save(performance);

        return "redirect:/event/" + eventId;
    }
}
