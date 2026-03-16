package paf.project.soundtracks.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

//import org.checkerframework.checker.units.qual.g;

import jakarta.persistence.*;
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.util.RatingUtils;

/* @Entity
@Table(name = "gastronomy_rating") */
@Embeddable
public class GastronomyRating {
    /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gastronomy_rating_id")
    private Long gastronomyRatingId;
    @OneToOne
    @JoinColumn(name = "personal_event_rating_id_personal_event_rating")
    private Old_PersonalEventRating personalEventRating;
    @Column(name = "gastronomy_average_rating") */
    //private BigDecimal gastronomyAverageRating;
    
    //@Column(name = "gastronomy_food_variety")
    private BigDecimal gastronomyFoodVariety;
    //@Column(name = "gastronomy_food_quality")
    private BigDecimal gastronomyFoodQuality;
    //@Column(name = "gastronomy_food_prices")
    private BigDecimal gastronomyFoodPrices;
    //@Column(name = "gastronomy_drink_variety")
    private BigDecimal gastronomyDrinkVariety;
    //@Column(name = "gastronomy_drink_quality")
    private BigDecimal gastronomyDrinkQuality;
    //@Column(name = "gastronomy_drink_prices")
    private BigDecimal gastronomyDrinkPrices;
    //@Column(name = "gastronomy_staff_efficiency")
    private BigDecimal gastronomyStaffEfficiency;
    //@Column(name = "gastronomy_staff_friendliness")
    private BigDecimal gastronomyStaffFriendliness;
    //@Column(name = "gastronomy_rating_comments")
    //private String gastronomyRatingComments;

    // constructors
    public GastronomyRating() {
    }

    public GastronomyRating(BigDecimal gastronomyFoodVariety,
            BigDecimal gastronomyFoodQuality, BigDecimal gastronomyFoodPrices, BigDecimal gastronomyDrinkVariety,
            BigDecimal gastronomyDrinkQuality, BigDecimal gastronomyDrinkPrices, BigDecimal gastronomyStaffEfficiency,
            BigDecimal gastronomyStaffFriendliness) {
        /* this.gastronomyRatingId = gastronomyRatingId;
        this.personalEventRating = personalEventRating;
        this.gastronomyAverageRating = gastronomyAverageRating; */
        this.gastronomyFoodVariety = gastronomyFoodVariety;
        this.gastronomyFoodQuality = gastronomyFoodQuality;
        this.gastronomyFoodPrices = gastronomyFoodPrices;
        this.gastronomyDrinkVariety = gastronomyDrinkVariety;
        this.gastronomyDrinkQuality = gastronomyDrinkQuality;
        this.gastronomyDrinkPrices = gastronomyDrinkPrices;
        this.gastronomyStaffEfficiency = gastronomyStaffEfficiency;
        this.gastronomyStaffFriendliness = gastronomyStaffFriendliness;
        /* this.gastronomyRatingComments = gastronomyRatingComments; */
}

    // getters and setters

    /* public Long getGastronomyRatingId() {
        return gastronomyRatingId;
    }
    public void setGastronomyRatingId(Long gastronomyRatingId) {
        this.gastronomyRatingId = gastronomyRatingId;
    }
    public Old_PersonalEventRating getPersonalEventRating() {
        return personalEventRating;
    }
    public void setPersonalEventRating(Old_PersonalEventRating personalEventRating) {
        this.personalEventRating = personalEventRating;
    }
    public BigDecimal getGastronomyAverageRating() {
        return gastronomyAverageRating;
    }
    public void setGastronomyAverageRating(BigDecimal gastronomyAverageRating) {
        this.gastronomyAverageRating = gastronomyAverageRating;
    } */
    public BigDecimal getGastronomyFoodVariety() {
        return gastronomyFoodVariety;
    }
    public void setGastronomyFoodVariety(BigDecimal gastronomyFoodVariety) {
        this.gastronomyFoodVariety = gastronomyFoodVariety;
    }
    public BigDecimal getGastronomyFoodQuality() {
        return gastronomyFoodQuality;
    }
    public void setGastronomyFoodQuality(BigDecimal gastronomyFoodQuality) {
        this.gastronomyFoodQuality = gastronomyFoodQuality;
    }
    public BigDecimal getGastronomyFoodPrices() {
        return gastronomyFoodPrices;
    }
    public void setGastronomyFoodPrices(BigDecimal gastronomyFoodPrices) {
        this.gastronomyFoodPrices = gastronomyFoodPrices;
    }
    public BigDecimal getGastronomyDrinkVariety() {
        return gastronomyDrinkVariety;
    }
    public void setGastronomyDrinkVariety(BigDecimal gastronomyDrinkVariety) {
        this.gastronomyDrinkVariety = gastronomyDrinkVariety;
    }
    public BigDecimal getGastronomyDrinkQuality() {
        return gastronomyDrinkQuality;
    }
    public void setGastronomyDrinkQuality(BigDecimal gastronomyDrinkQuality) {
        this.gastronomyDrinkQuality = gastronomyDrinkQuality;
    }
    public BigDecimal getGastronomyDrinkPrices() {
        return gastronomyDrinkPrices;
    }
    public void setGastronomyDrinkPrices(BigDecimal gastronomyDrinkPrices) {
        this.gastronomyDrinkPrices = gastronomyDrinkPrices;
    }
    public BigDecimal getGastronomyStaffEfficiency() {
        return gastronomyStaffEfficiency;
    }
    public void setGastronomyStaffEfficiency(BigDecimal gastronomyStaffEfficiency) {
        this.gastronomyStaffEfficiency = gastronomyStaffEfficiency;
    }
    public BigDecimal getGastronomyStaffFriendliness() {
        return gastronomyStaffFriendliness;
    }
    public void setGastronomyStaffFriendliness(BigDecimal gastronomyStaffFriendliness) {
        this.gastronomyStaffFriendliness = gastronomyStaffFriendliness;
    }
    /* public String getGastronomyRatingComments() {
        return gastronomyRatingComments;
    }
    public void setGastronomyRatingComments(String gastronomyRatingComments) {
        this.gastronomyRatingComments = gastronomyRatingComments;
    } */

    // domain-logic methods
    public BigDecimal getAverage() {
        return RatingUtils.average(
            gastronomyFoodVariety,
            gastronomyFoodQuality,
            gastronomyFoodPrices,
            gastronomyDrinkVariety,
            gastronomyDrinkQuality,
            gastronomyDrinkPrices,
            gastronomyStaffEfficiency,
            gastronomyStaffFriendliness
        );
    }
    //public BigDecimal getAverage() {
    
        // Check if any of the ratings are null to avoid NullPointerException
        /* if (gastronomyFoodVariety == null || gastronomyFoodQuality == null || gastronomyFoodPrices == null ||
            gastronomyDrinkVariety == null || gastronomyDrinkQuality == null || gastronomyDrinkPrices == null ||
            gastronomyStaffEfficiency == null || gastronomyStaffFriendliness == null) 
            {
                return BigDecimal.ZERO;
            } */

        /* BigDecimal sum = BigDecimal.ZERO;
        int count = 0;

        if (gastronomyFoodVariety != null) {
            sum = sum.add(gastronomyFoodVariety);
            count++;
        }
        if (gastronomyFoodQuality != null) {
            sum = sum.add(gastronomyFoodQuality);
            count++;
        }
        if (gastronomyFoodPrices != null) {
            sum = sum.add(gastronomyFoodPrices);
            count++;
        }
        if (gastronomyDrinkVariety != null) {
            sum = sum.add(gastronomyDrinkVariety);
            count++;
        }
        if (gastronomyDrinkQuality != null) {
            sum = sum.add(gastronomyDrinkQuality);
            count++;
        }
        if (gastronomyDrinkPrices != null) {
            sum = sum.add(gastronomyDrinkPrices);
            count++;
        }
        if (gastronomyStaffEfficiency != null) {
            sum = sum.add(gastronomyStaffEfficiency);
            count++;
        }
        if (gastronomyStaffFriendliness != null) {
            sum = sum.add(gastronomyStaffFriendliness);
            count++;
        }
        return count > 0 ? sum.divide(BigDecimal.valueOf(count), 1, RoundingMode.HALF_UP) : BigDecimal.ZERO;
    } */
}

    