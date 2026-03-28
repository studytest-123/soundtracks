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
import paf.project.soundtracks.model.Performance;
import paf.project.soundtracks.model.Person;
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.repository.EventRepository;
import paf.project.soundtracks.repository.PerformanceRepository;
import paf.project.soundtracks.repository.PersonRepository;
import paf.project.soundtracks.repository.PersonalEventRatingRepository;
import paf.project.soundtracks.service.ImageResolver;

@Controller
public class IndexController {

    private final EventRepository eventRepository;
    private final PersonRepository personRepository;
    private final PersonalEventRatingRepository personalEventRatingRepository;
    private final ImageResolver imageResolver;
    private final PerformanceRepository performanceRepository;

    // constructors
    public IndexController(EventRepository eventRepository, PersonRepository personRepository, PersonalEventRatingRepository personalEventRatingRepository, ImageResolver imageResolver, PerformanceRepository performanceRepository) {
        this.eventRepository = eventRepository;
        this.personRepository = personRepository;
        this.personalEventRatingRepository = personalEventRatingRepository;
        this.imageResolver = imageResolver;
        this.performanceRepository = performanceRepository;
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
        // resolve image for latest reviewed event
        if (latestReviewedEvent != null) {

            List<PersonalEventRating> reviews =
                personalEventRatingRepository.findByEvent(latestReviewedEvent);

            List<Performance> performances =
                performanceRepository.findByEvent(latestReviewedEvent);

            String imageUrl = imageResolver.resolveEventImage(
                latestReviewedEvent, reviews, performances
            );

            latestReviewedEvent.setResolvedImage(imageUrl);
        }

        // upcoming events
        List<Event> upcomingEvents = eventRepository.findByEventDateGreaterThanEqualOrderByEventDateAsc(today);
        // resolve images for upcoming events
        for (Event event : upcomingEvents) {
            List<PersonalEventRating> reviews =
                personalEventRatingRepository.findByEvent(event);

            List<Performance> performances =
                performanceRepository.findByEvent(event);

            String imageUrl = imageResolver.resolveEventImage(event, reviews, performances);
            event.setResolvedImage(imageUrl);
        }

        // past events
        List<Event> pastEvents = eventRepository.findByEventDateBeforeOrderByEventDateDesc(today);
        // resolve images for past events
        for (Event event : pastEvents) {
            List<PersonalEventRating> reviews =
                personalEventRatingRepository.findByEvent(event);

            List<Performance> performances =
                performanceRepository.findByEvent(event);

            String imageUrl = imageResolver.resolveEventImage(event, reviews, performances);
            event.setResolvedImage(imageUrl);
        }

        // pass to Thymeleaf
        model.addAttribute("user", user);
        model.addAttribute("latestReviewedEvent", latestReviewedEvent);
        model.addAttribute("latestEvent", latestEvent);
        model.addAttribute("upcomingEvents", upcomingEvents);
        model.addAttribute("pastEvents", pastEvents);
        model.addAttribute("events", eventRepository.findAll());
        model.addAttribute("latestReview", latestReview);

        //System.out.println(System.getProperty("user.dir"));

        return "index"; // returns to templates/index.html
    }
}
