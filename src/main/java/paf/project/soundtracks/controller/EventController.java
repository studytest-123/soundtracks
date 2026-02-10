package paf.project.soundtracks.controller;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.Performance;
import paf.project.soundtracks.model.PerformanceRating;
import paf.project.soundtracks.model.Artist;
import paf.project.soundtracks.model.SetlistItem;
import paf.project.soundtracks.repository.EventRepository;
import paf.project.soundtracks.repository.LocationRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import paf.project.soundtracks.model.Location;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Controller
@RequestMapping("/event")
public class EventController {

    private final EventRepository eventRepository;
    private final LocationRepository locationRepository;

    public EventController(EventRepository eventRepository,
                           LocationRepository locationRepository) {
        this.eventRepository = eventRepository;
        this.locationRepository = locationRepository;
    }

    /* ======================
       SHOW CREATE EVENT FORM
       ====================== */
    @GetMapping("/new")
    public String showCreateEventForm(Model model) {
        model.addAttribute("event", new Event());
        model.addAttribute("locations", locationRepository.findAll());
        return "event-create";
    }

    /* ======================
       HANDLE FORM SUBMIT
       ====================== */
    @PostMapping("/new")
    public String createEvent(@ModelAttribute Event event) {

        Location location = locationRepository.findById(event.getLocationId())
            .orElseThrow(() -> new IllegalArgumentException("Invalid location ID: " + event.getLocationId()));
        
        event.setLocation(location);
        
        Event savedEvent = eventRepository.save(event);
        return "redirect:/event/" + savedEvent.getEventId();
    }
    
    /* ======================
       SHOW EVENT DETAILS
     */

    @GetMapping("/{id}")
    //@RequestMapping("/event")
    public String eventDetails(@PathVariable("id") Long id, Model model) {
        Event event = eventRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Event not found: " + id));

        model.addAttribute("event", event);
        //debugging
        System.out.println("EVENT: " + event.getEventName());
        System.out.println("LOCATION: " + event.getLocation().getLocationName());
        return "event-details";
    }
}
