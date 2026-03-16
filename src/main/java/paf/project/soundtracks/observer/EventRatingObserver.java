package paf.project.soundtracks.observer;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.EventRating;
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.repository.EventRatingRepository;
import paf.project.soundtracks.repository.PersonalEventRatingRepository;

@Component
@Order(3)
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

        List<PersonalEventRating> reviews = reviewRepository.findByEvent(event);

        BigDecimal sum = reviews.stream()
                .map(PersonalEventRating::getPersonalEventAverageRating)
                .filter(Objects::nonNull)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        long count = reviews.stream()
                .map(PersonalEventRating::getPersonalEventAverageRating)
                .filter(Objects::nonNull)
                .count();

        BigDecimal avg = BigDecimal.ZERO;

        if (count > 0) {
                avg = sum.divide(BigDecimal.valueOf(count), 2, RoundingMode.HALF_UP);
        }

        EventRating eventRating = eventRatingRepository.findByEvent(event)
                .orElseGet(() -> {
                        EventRating r = new EventRating();
                        r.setEvent(event);
                        return r;
                });

        eventRating.setEventAverageRating(avg);

        eventRatingRepository.save(eventRating);
        }
}