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

    // constructors
    public RatingController(EventRepository eventRepository,
                            PerformanceRepository performanceRepository,
                            RatingService ratingService) {
        this.eventRepository = eventRepository;
        this.performanceRepository = performanceRepository;
        this.ratingService = ratingService;
    }

    // initialize review for null handling
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
    /* show event review form */
    @GetMapping("/new")
    public String showCreateReviewForm(@RequestParam("eventId") Long eventId, Model model) {
        Event event = eventRepository.findById(eventId)
            .orElseThrow(() -> new IllegalArgumentException("Invalid event ID: " + eventId));
        
            List<Performance> performances = performanceRepository.findByEvent(event);
        PersonalEventRating review = new PersonalEventRating();
        review.setEvent(event);

        // adding attributes to model
        model.addAttribute("review", review);
        model.addAttribute("event", event);
        model.addAttribute("performances", performances);
        return "review-create";
    }

    /* form submit */

    @PostMapping("/new")
    public String saveReview(@ModelAttribute("review") PersonalEventRating review, @RequestParam("eventId") Long eventId) {
        

        ratingService.saveReview(review, eventId);

        return "redirect:/event/" + review.getEvent().getEventId();
    }
    
}
