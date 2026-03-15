package paf.project.soundtracks.controller;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.Performance;
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.model.Artist;
import paf.project.soundtracks.repository.ArtistRepository;
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
import java.util.List;

@Controller
@RequestMapping("/event")
public class EventController {

    private final EventRepository eventRepository;
    private final ArtistRepository artistRepository;
    private final LocationRepository locationRepository;
    private final PerformanceRepository performanceRepository;
    private final PersonalEventRatingRepository personalEventRatingRepository;

    public EventController(EventRepository eventRepository, ArtistRepository artistRepository, LocationRepository locationRepository, PerformanceRepository performanceRepository, PersonalEventRatingRepository personalEventRatingRepository) {
        this.eventRepository = eventRepository;
        this.artistRepository = artistRepository;
        this.locationRepository = locationRepository;
        this.performanceRepository = performanceRepository;
        this.personalEventRatingRepository = personalEventRatingRepository;
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
    
    // event details
    @GetMapping("/{id}")
    //@RequestMapping("/event")
    public String eventDetails(@PathVariable("id") Long id, Model model) {
        Event event = eventRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Event not found: " + id));

        List<Performance> performances = performanceRepository.findByEvent_EventId(id);

        List<PersonalEventRating> reviews = personalEventRatingRepository.findByEvent_EventId(id);

        model.addAttribute("event", event);
        model.addAttribute("performances", performances);
        model.addAttribute("reviews", reviews);

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
