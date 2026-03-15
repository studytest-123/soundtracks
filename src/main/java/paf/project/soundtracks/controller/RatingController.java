package paf.project.soundtracks.controller;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.Performance;
import paf.project.soundtracks.model.EventRating;
import paf.project.soundtracks.model.Artist;
import paf.project.soundtracks.model.SetlistItem;
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.model.PerformanceRating;
import paf.project.soundtracks.model.Person;
import paf.project.soundtracks.repository.EventRepository;
import paf.project.soundtracks.repository.PersonalEventRatingRepository;
import paf.project.soundtracks.repository.EventRatingRepository;
import paf.project.soundtracks.repository.PerformanceRepository;
import paf.project.soundtracks.repository.PersonRepository;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import paf.project.soundtracks.model.Location;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Controller
@RequestMapping("/review")
public class RatingController {

    private final EventRepository eventRepository;
    private final EventRatingRepository eventRatingRepository;
    private final PersonalEventRatingRepository personalEventRatingRepository;
    private final PerformanceRepository performanceRepository;
    private final PersonRepository personRepository;

    public RatingController(EventRepository eventRepository,
                           EventRatingRepository eventRatingRepository,
                           PersonalEventRatingRepository personalEventRatingRepository,
                           PerformanceRepository performanceRepository,
                           PersonRepository personRepository) {
        this.eventRepository = eventRepository;
        this.eventRatingRepository = eventRatingRepository;
        this.personalEventRatingRepository = personalEventRatingRepository;
        this.performanceRepository = performanceRepository;
        this.personRepository = personRepository;
    }

    /* ======================
       SHOW CREATE EVENT FORM
       ====================== */
    @GetMapping("/new")
    public String showCreateReviewForm(@RequestParam("eventId") Long eventId, Model model) {
        Event event = eventRepository.findById(eventId)
            .orElseThrow(() -> new IllegalArgumentException("Invalid event ID: " + eventId));
        
            List<Performance> performances = performanceRepository.findByEvent_EventId(eventId);
        PersonalEventRating review = new PersonalEventRating();
        review.setEvent(event);

        model.addAttribute("review", review);
        model.addAttribute("event", event);
        model.addAttribute("performances", performances);
        //model.addAttribute("personalRating", new PersonalEventRating());
        //model.addAttribute("eventRatings", eventRatingRepository.findAll());
        //model.addAttribute("locations", locationRepository.findAll());
        return "review-create";
    }

    /* ======================
       HANDLE FORM SUBMIT
       ====================== */
    /* @PostMapping("/new")
    public String createReview(@ModelAttribute EventRating eventRating) { */

        //Event event = eventRepository.findById(eventRating.getEvent().getEventId())
         //   .orElseThrow(() -> new IllegalArgumentException("Invalid event ID: " + event.getEventId()));
        
        //eventRating.setEvent(event);
        
        //PersonalEventRating savedReview = personalEventRatingRepository.save(review);
      /*   return "redirect:/review/";//+ eventRating.getEventRatingId();
    } */

    @PostMapping("/new")
    public String saveReview(@ModelAttribute PersonalEventRating review) {

        Authentication auth = SecurityContextHolder
        .getContext()
        .getAuthentication();

        String username = auth.getName();

        Person person = personRepository
        .findByUserName(username)
        .orElseThrow();

        review.setPerson(person);

        review.calculateOverallRating();

        personalEventRatingRepository.save(review);

        return "redirect:/event/" + review.getEvent().getEventId();
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
        return "review-details";
    }
}
