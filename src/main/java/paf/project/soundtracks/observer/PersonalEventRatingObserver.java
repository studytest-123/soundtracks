package paf.project.soundtracks.observer;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import paf.project.soundtracks.model.PersonalEventRating;

@Component
@Order(2)
public class PersonalEventRatingObserver implements RatingObserver {

    @Override
    public void update(PersonalEventRating review) {

        // calculate overall average
        review.setAtmosphereAverage(review.getAtmosphereCalculated());
        review.setGastronomyAverage(review.getGastronomyCalculated());
        review.setLocationAverage(review.getLocationCalculated());
        review.setRestroomAverage(review.getRestroomCalculated());
        review.setSecurityAverage(review.getSecurityCalculated());
        review.setSoundAverage(review.getSoundCalculated());
        review.setWardrobeAverage(review.getWardrobeCalculated());
        /* review.setAtmosphereAverage(review.getAtmosphere().getAverage());
        review.setGastronomyAverage(review.getGastronomy().getAverage());
        review.setLocationAverage(review.getLocation().getAverage());
        review.setRestroomAverage(review.getRestroom().getAverage());
        review.setSecurityAverage(review.getSecurity().getAverage());
        review.setSoundAverage(review.getSound().getAverage());
        review.setWardrobeAverage(review.getWardrobe().getAverage()); */

        BigDecimal sum = BigDecimal.ZERO;
        int divisor = 0;

        sum = sum.add(review.getAtmosphereCalculated()); divisor++;
        sum = sum.add(review.getGastronomyCalculated()); divisor++;
        sum = sum.add(review.getLocationCalculated()); divisor++;
        sum = sum.add(review.getRestroomCalculated()); divisor++;
        sum = sum.add(review.getSecurityCalculated()); divisor++;
        sum = sum.add(review.getSoundCalculated()); divisor++;
        sum = sum.add(review.getWardrobeCalculated()); divisor++;

        review.setPersonalEventAverageRating(
                sum.divide(BigDecimal.valueOf(divisor), 2, RoundingMode.HALF_UP)
        );

        
    }
}
