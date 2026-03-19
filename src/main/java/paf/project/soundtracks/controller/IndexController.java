package paf.project.soundtracks.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.Person;
import paf.project.soundtracks.repository.EventRepository;
import paf.project.soundtracks.repository.PersonRepository;

@Controller
public class IndexController {

    private final EventRepository eventRepository;
    private final PersonRepository personRepository;

    public IndexController(EventRepository eventRepository, PersonRepository personRepository) {
        this.eventRepository = eventRepository;
        this.personRepository = personRepository;
    }

    @GetMapping("/")
    public String index(Model model) {

        // Mock user
        /* Person user = new Person();
        user.setPersonId(1L);
        user.setUserName("john_doe"); */
        Authentication auth = SecurityContextHolder
            .getContext()
            .getAuthentication();

        Person user;

        if (auth != null && auth.isAuthenticated()
                && !"anonymousUser".equals(auth.getName())) {

            user = personRepository
                    .findByUserName(auth.getName())
                    .orElseThrow();

        } else {

            // anonymous placeholder
            user = new Person();
            user.setUserName("Anonymous User");

            user.setReviewCount(0);
            user.setEventCount(0);
            user.setReviewScore(BigDecimal.ZERO);
        }

        // set today for reference
        LocalDate today = LocalDate.now();

        // Get the latest event by ID
        Event latestEvent = eventRepository.findTopByOrderByEventIdDesc(); 

        // upcoming events
        List<Event> upcomingEvents = eventRepository.findByEventDateGreaterThanEqualOrderByEventDateAsc(today);

        // past events
        List<Event> pastEvents = eventRepository.findByEventDateBeforeOrderByEventDateDesc(today);
        
        // pass to Thymeleaf
        model.addAttribute("user", user);
        model.addAttribute("latestEvent", latestEvent);
        model.addAttribute("upcomingEvents", upcomingEvents);
        model.addAttribute("pastEvents", pastEvents);
        model.addAttribute("events", eventRepository.findAll()); // Add this line to pass all events to the template

        return "index"; // returns to templates/index.html
    }
}
