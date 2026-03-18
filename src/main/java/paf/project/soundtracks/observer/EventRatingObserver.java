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
import paf.project.soundtracks.repository.EventRepository;
import paf.project.soundtracks.repository.PersonalEventRatingRepository;

@Component
@Order(3)
public class EventRatingObserver implements RatingObserver {

    private final PersonalEventRatingRepository reviewRepository;
    private final EventRatingRepository eventRatingRepository;
    private final EventRepository eventRepository;

    public EventRatingObserver(
            PersonalEventRatingRepository reviewRepository,
            EventRatingRepository eventRatingRepository,
            EventRepository eventRepository) {

        this.reviewRepository = reviewRepository;
        this.eventRatingRepository = eventRatingRepository;
        this.eventRepository = eventRepository;
    }
    
    private BigDecimal average(List<BigDecimal> values) {

        List<BigDecimal> filtered = values.stream()
                .filter(Objects::nonNull)
                .toList();

        if (filtered.isEmpty()) {
                return BigDecimal.ZERO;
        }

        return filtered.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(filtered.size()), 2, RoundingMode.HALF_UP);
}

        // 🔥 MAIN LOGIC: recalculate and update EventRating whenever a PersonalEventRating is created or updated
        @Override
        public void update(PersonalEventRating review) {

                // Fetch the associated event
                Event event = eventRepository.findById(review.getEvent().getEventId())
                .orElseThrow();

                // Fetch all reviews for the event
                List<PersonalEventRating> reviews = reviewRepository.findByEvent(event);

                // overall average rating calculation
                BigDecimal sum = reviews.stream()
                        .map(PersonalEventRating::getPersonalEventAverageRating)
                        .filter(Objects::nonNull)
                        .reduce(BigDecimal.ZERO, BigDecimal::add);

                // count how many reviews have a non-null average rating to avoid division by zero
                long count = reviews.stream()
                        .map(PersonalEventRating::getPersonalEventAverageRating)
                        .filter(Objects::nonNull)
                        .count();

                BigDecimal overallAvg = BigDecimal.ZERO;

                if (count > 0) {
                        overallAvg = sum.divide(BigDecimal.valueOf(count), 2, RoundingMode.HALF_UP);
                }


                // Update or create EventRating
                EventRating eventRating = eventRatingRepository.findByEvent(event)
                        .orElseGet(() -> {
                                EventRating r = new EventRating();
                                r.setEvent(event);
                                return r;
                        });

                // setting overall average rating
                eventRating.setEventAverageRating(overallAvg);

                // category average rating calculation
                eventRating.setAtmosphereAverageRating(
                        average(reviews.stream()
                                .map(r -> r.getAtmosphere().getAverage())
                                .toList())
                );

                eventRating.setGastronomyAverageRating(
                        average(reviews.stream()
                                .map(r -> r.getGastronomy().getAverage())
                                .toList())
                );

                eventRating.setLocationAverageRating(
                        average(reviews.stream()
                                .map(r -> r.getLocation().getAverage())
                                .toList())
                );

                eventRating.setRestroomAverageRating(
                        average(reviews.stream()
                                .map(r -> r.getRestroom().getAverage())
                                .toList())
                );

                eventRating.setSecurityAverageRating(
                        average(reviews.stream()
                                .map(r -> r.getSecurity().getAverage())
                                .toList())
                );

                eventRating.setSoundAverageRating(
                        average(reviews.stream()
                                .map(r -> r.getSound().getAverage())
                                .toList())
                );

                eventRating.setWardrobeAverageRating(
                        average(reviews.stream()
                                .map(r -> r.getWardrobe().getAverage())
                                .toList())
                );

                // performance average rating calculation 
                eventRating.setPerformanceAverageRating(
                        average(reviews.stream()
                                .flatMap(r -> r.getPerformanceRatings() != null
                                        ? r.getPerformanceRatings().stream()
                                        : java.util.stream.Stream.empty())
                                .map(p -> p.getAverage())
                                .toList())
                );

                
                // saving
                eventRatingRepository.save(eventRating);
        }
}