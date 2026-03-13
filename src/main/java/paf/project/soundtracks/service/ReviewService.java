package paf.project.soundtracks.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.EventRating;
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.repository.EventRatingRepository;
import paf.project.soundtracks.repository.EventRepository;
import paf.project.soundtracks.repository.PersonalEventRatingRepository;

@Service
@Transactional
public class ReviewService {

    private final PersonalEventRatingRepository reviewRepository;
    //private final EventRatingRepository eventRatingRepository;
    private final EventRepository eventRepository;
    private final EventRatingService eventRatingService;

    public ReviewService(PersonalEventRatingRepository reviewRepository,
                         EventRatingRepository eventRatingRepository,
                         EventRepository eventRepository,
                         EventRatingService eventRatingService) {
        this.reviewRepository = reviewRepository;
        /* this.eventRatingRepository = eventRatingRepository; */
        this.eventRepository = eventRepository;
        this.eventRatingService = eventRatingService;
    }

    public void createReview(PersonalEventRating review) {

        reviewRepository.save(review);

        // Trigger rating recalculation (Observer-ready)
        Event event = eventRepository
                .findById(review.getEvent().getEventId())
                .orElseThrow();

        review.setEvent(event);

        review.calculateOverallRating();
        
        reviewRepository.save(review);

        eventRatingService.recalculateEventRating(event);
    }
}

