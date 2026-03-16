package paf.project.soundtracks.observer;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import paf.project.soundtracks.model.PerformanceRating;
import paf.project.soundtracks.model.PersonalEventRating;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Order(2)
public class PersonalEventRatingObserver implements RatingObserver {

    private static final Logger log = LoggerFactory.getLogger(PersonalEventRatingObserver.class);

    @Override
    public void update(PersonalEventRating review) {

        log.info("atmosphere: " + review.getAtmosphere().getAverage());
        log.info("gastronomy: " + review.getGastronomy().getAverage());
        log.info("location: " + review.getLocation().getAverage());
        log.info("restroom: " + review.getRestroom().getAverage());
        log.info("security: " + review.getSecurity().getAverage());
        log.info("sound: " + review.getSound().getAverage());
        log.info("wardrobe: " + review.getWardrobe().getAverage());
        log.info("performance: " + review.getPerformanceRatings().stream()
                .map(PerformanceRating::getAverage)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(
                        BigDecimal.valueOf(review.getPerformanceRatings().size()),
                        2,
                        RoundingMode.HALF_UP));

        /* BigDecimal sum =
                review.getAtmosphere().getAverage()
                .add(review.getGastronomy().getAverage())
                .add(review.getLocation().getAverage())
                .add(review.getRestroom().getAverage())
                .add(review.getSecurity().getAverage())
                .add(review.getSound().getAverage())
                .add(review.getWardrobe().getAverage()); */
        BigDecimal sum = BigDecimal.ZERO;

        sum = sum.add(review.getAtmosphere().getAverage());
        sum = sum.add(review.getGastronomy().getAverage());
        sum = sum.add(review.getLocation().getAverage());
        sum = sum.add(review.getRestroom().getAverage());
        sum = sum.add(review.getSecurity().getAverage());
        sum = sum.add(review.getSound().getAverage());
        sum = sum.add(review.getWardrobe().getAverage());

        int divisor = 7;

        BigDecimal performanceAvg = BigDecimal.ZERO;

if (review.getPerformanceRatings() != null && !review.getPerformanceRatings().isEmpty()) {

    List<BigDecimal> values =
            review.getPerformanceRatings().stream()
                    .map(PerformanceRating::getAverage)
                    .filter(Objects::nonNull)
                    .toList();

    if (!values.isEmpty()) {

        performanceAvg =
                values.stream()
                        .reduce(BigDecimal.ZERO, BigDecimal::add)
                        .divide(
                                BigDecimal.valueOf(values.size()),
                                2,
                                RoundingMode.HALF_UP
                        );

        sum = sum.add(performanceAvg);
        divisor++;
    }
}

        review.setPersonalEventAverageRating(
                sum.divide(BigDecimal.valueOf(divisor), 2, RoundingMode.HALF_UP));
    }
}
