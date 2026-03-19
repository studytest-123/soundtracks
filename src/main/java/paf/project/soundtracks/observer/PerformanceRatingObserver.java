package paf.project.soundtracks.observer;

//import java.math.BigDecimal;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import paf.project.soundtracks.model.PerformanceRating;
import paf.project.soundtracks.model.PersonalEventRating;
//import paf.project.soundtracks.repository.PerformanceRatingRepository;
//import paf.project.soundtracks.repository.PersonalEventRatingRepository;


@Component
@Order(1)
public class PerformanceRatingObserver implements RatingObserver {

    //private final PerformanceRatingRepository performanceRatingRepository;
    //private final PersonalEventRatingRepository personalEventRatingRepository;

    public PerformanceRatingObserver(
           /*  PerformanceRatingRepository performanceRatingRepository *//* ,
            PersonalEventRatingRepository personalEventRatingRepository */) {

        /* this.performanceRatingRepository = performanceRatingRepository *//* ;
        this.personalEventRatingRepository = personalEventRatingRepository */;
    }

    @Override
    public void update(PersonalEventRating review) {

        /* if (review.getPerformanceRatings() == null ||
            review.getPerformanceRatings().isEmpty()) {
            return;
        }

        for (PerformanceRating performance : review.getPerformanceRatings()) {

            BigDecimal avg = performance.getAverage();

            performance.setPerformanceAverageRating(avg);

            performanceRatingRepository.saveAll(review.getPerformanceRatings());
        } */
        if (review.getPerformanceRatings() == null) return;

            for (PerformanceRating performance : review.getPerformanceRatings()) {
                performance.setPerformanceAverageRating(performance.getAverage());
        }
    }
}