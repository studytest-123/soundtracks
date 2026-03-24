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
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.repository.EventRepository;
import paf.project.soundtracks.repository.PersonRepository;
import paf.project.soundtracks.repository.PersonalEventRatingRepository;

@Controller
public class IndexController {

    private final EventRepository eventRepository;
    private final PersonRepository personRepository;
    private final PersonalEventRatingRepository personalEventRatingRepository;

    // constructors
    public IndexController(EventRepository eventRepository, PersonRepository personRepository, PersonalEventRatingRepository personalEventRatingRepository) {
        this.eventRepository = eventRepository;
        this.personRepository = personRepository;
        this.personalEventRatingRepository = personalEventRatingRepository;
    }

    // show index
    @GetMapping("/")
    public String index(Model model) {

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

        // latest reviewed event
        PersonalEventRating latestReview = personalEventRatingRepository.findTopByOrderByPersonalEventRatingIdDesc();

        Event latestReviewedEvent = null;

        if (latestReview != null) {
            latestReviewedEvent = latestReview.getEvent();
        }

        // upcoming events
        List<Event> upcomingEvents = eventRepository.findByEventDateGreaterThanEqualOrderByEventDateAsc(today);

        // past events
        List<Event> pastEvents = eventRepository.findByEventDateBeforeOrderByEventDateDesc(today);
        
        // pass to Thymeleaf
        model.addAttribute("user", user);
        model.addAttribute("latestReviewedEvent", latestReviewedEvent);
        model.addAttribute("latestEvent", latestEvent);
        model.addAttribute("upcomingEvents", upcomingEvents);
        model.addAttribute("pastEvents", pastEvents);
        model.addAttribute("events", eventRepository.findAll());

        return "index"; // returns to templates/index.html
    }
}
