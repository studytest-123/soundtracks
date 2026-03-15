package paf.project.soundtracks.observer;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.stereotype.Component;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.EventRating;
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.repository.EventRatingRepository;
import paf.project.soundtracks.repository.PersonalEventRatingRepository;

@Component
public class EventRatingObserver implements RatingObserver {

    private final PersonalEventRatingRepository reviewRepository;
    private final EventRatingRepository eventRatingRepository;

    public EventRatingObserver(
            PersonalEventRatingRepository reviewRepository,
            EventRatingRepository eventRatingRepository) {

        this.reviewRepository = reviewRepository;
        this.eventRatingRepository = eventRatingRepository;
    }

    @Override
    public void update(PersonalEventRating review) {

        Event event = review.getEvent();

        EventRating eventRating =
                eventRatingRepository.findByEvent_EventId(event.getEventId());

        List<PersonalEventRating> reviews =
                reviewRepository.findByEvent_EventId(event.getEventId());

        BigDecimal sum = reviews.stream()
                .map(PersonalEventRating::getPersonalEventAverageRating)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal avg = reviews.isEmpty()
                ? BigDecimal.ZERO
                : sum.divide(BigDecimal.valueOf(reviews.size()), 2, RoundingMode.HALF_UP);

        eventRating.setEventAverageRating(avg);

        eventRatingRepository.save(eventRating);
    }
}