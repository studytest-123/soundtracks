package paf.project.soundtracks.observer;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import paf.project.soundtracks.model.PerformanceRating;
import paf.project.soundtracks.model.PersonalEventRating;


@Component
@Order(1)
public class PerformanceRatingObserver implements RatingObserver {

    public PerformanceRatingObserver() {
    }

    @Override
    public void update(PersonalEventRating review) {

        if (review.getPerformanceRatings() == null) return;

            for (PerformanceRating performance : review.getPerformanceRatings()) {
                performance.setPerformanceAverageRating(performance.getAverage());
        }
    }
}