package paf.project.soundtracks.controller;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.Performance;
import paf.project.soundtracks.model.GastronomyRating;
import paf.project.soundtracks.model.AtmosphereRating;
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.model.RestroomRating;
import paf.project.soundtracks.model.SecurityRating;
import paf.project.soundtracks.model.SoundRating;
import paf.project.soundtracks.model.WardrobeRating;
import paf.project.soundtracks.repository.EventRepository;
import paf.project.soundtracks.service.RatingService;
import paf.project.soundtracks.repository.PerformanceRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import paf.project.soundtracks.model.LocationRating;
import paf.project.soundtracks.model.MerchandiseRating;
import java.util.List;

@Controller
@RequestMapping("/review")
public class RatingController {

    private final EventRepository eventRepository;
    private final PerformanceRepository performanceRepository;
    private RatingService ratingService;

    public RatingController(EventRepository eventRepository,
                            PerformanceRepository performanceRepository,
                            RatingService ratingService) {
        this.eventRepository = eventRepository;
        this.performanceRepository = performanceRepository;
        this.ratingService = ratingService;
    }

    // ADD THIS HERE
    @ModelAttribute("review")
    public PersonalEventRating initReview() {
        System.out.println("INIT REVIEW CALLED");

        PersonalEventRating review = new PersonalEventRating();

        review.setAtmosphere(new AtmosphereRating());
        review.setGastronomy(new GastronomyRating());
        review.setLocation(new LocationRating());
        review.setMerchandise(new MerchandiseRating());
        review.setRestroom(new RestroomRating());
        review.setSecurity(new SecurityRating());
        review.setSound(new SoundRating());
        review.setWardrobe(new WardrobeRating());

        return review;
    }
    /* ======================
       SHOW CREATE EVENT FORM
       ====================== */
    @GetMapping("/new")
    public String showCreateReviewForm(@RequestParam("eventId") Long eventId, Model model) {
        Event event = eventRepository.findById(eventId)
            .orElseThrow(() -> new IllegalArgumentException("Invalid event ID: " + eventId));
        
            List<Performance> performances = performanceRepository.findByEvent(event);
        PersonalEventRating review = new PersonalEventRating();
        review.setEvent(event);

        // initialize category ratings
        /* review.setAtmosphere(new AtmosphereRating());
        review.setGastronomy(new GastronomyRating());
        review.setLocation(new LocationRating());
        review.setRestroom(new RestroomRating());
        review.setSecurity(new SecurityRating());
        review.setSound(new SoundRating());
        review.setWardrobe(new WardrobeRating()); */

        // adding attributes to model
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
    public String saveReview(@ModelAttribute("review") PersonalEventRating review, @RequestParam("eventId") Long eventId) {
        /* System.out.println("POST HIT"); */


        // 🔥 FIX: reload event
        /* Event event = eventRepository.findById(eventId)
            .orElseThrow(() -> new IllegalArgumentException("Invalid event ID: " + eventId));

        review.setEvent(event);

        System.out.println("Event AFTER fix: " + review.getEvent());
 */
        // Authentication and Person association
        /* Authentication auth = SecurityContextHolder
        .getContext()
        .getAuthentication();

        String username = auth.getName();

        Person person = personRepository
        .findByUserName(username)
        .orElseThrow();

        System.out.println("Atmosphere BEFORE fix: " + review.getAtmosphere());

        review.setPerson(person); */

        // setting default values for null category ratings
        /* if (review.getAtmosphere() == null)
        review.setAtmosphere(new AtmosphereRating());

        if (review.getGastronomy() == null)
            review.setGastronomy(new GastronomyRating());

        if (review.getLocation() == null)
            review.setLocation(new LocationRating());

        if (review.getRestroom() == null)
            review.setRestroom(new RestroomRating());

        if (review.getSecurity() == null)
            review.setSecurity(new SecurityRating());

        if (review.getSound() == null)
            review.setSound(new SoundRating());

        if (review.getWardrobe() == null)
            review.setWardrobe(new WardrobeRating()); */

        //System.out.println("Atmosphere AFTER fix: " + review.getAtmosphere());
        //review.calculateOverallRating();

        // prevent null crashes
        /* review.initializeEmbeddeds(); */

        // save review
        /* personalEventRatingRepository.save(review); */

        // notify observers 
        //ratingSubject.notifyObservers(review);

        // save persistent changes from observers
        //personalEventRatingRepository.save(review);

        ratingService.saveReview(review, eventId);

        return "redirect:/event/" + review.getEvent().getEventId();
    }
    
    /* ======================
       SHOW EVENT DETAILS
     */

    //@GetMapping("/{id}")
    //@RequestMapping("/event")
    /* public String eventDetails(@PathVariable("id") Long id, Model model) {
        Event event = eventRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Event not found: " + id));

        model.addAttribute("event", event); */
        //debugging
    /*     System.out.println("EVENT: " + event.getEventName());
        System.out.println("LOCATION: " + event.getLocation().getLocationName());
        return "review-details";
    } */
}
