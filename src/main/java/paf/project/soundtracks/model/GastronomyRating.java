package paf.project.soundtracks.model;

import java.math.BigDecimal;
import jakarta.persistence.*;
import paf.project.soundtracks.util.RatingUtils;

@Embeddable
public class GastronomyRating {
    
    private BigDecimal gastronomyFoodVariety;
    private BigDecimal gastronomyFoodQuality;
    private BigDecimal gastronomyFoodPrices;
    private BigDecimal gastronomyDrinkVariety;
    private BigDecimal gastronomyDrinkQuality;
    private BigDecimal gastronomyDrinkPrices;
    private BigDecimal gastronomyStaffEfficiency;
    private BigDecimal gastronomyStaffFriendliness;

    // constructors
    public GastronomyRating() {
    }

    public GastronomyRating(BigDecimal gastronomyFoodVariety,
            BigDecimal gastronomyFoodQuality, BigDecimal gastronomyFoodPrices, BigDecimal gastronomyDrinkVariety,
            BigDecimal gastronomyDrinkQuality, BigDecimal gastronomyDrinkPrices, BigDecimal gastronomyStaffEfficiency,
            BigDecimal gastronomyStaffFriendliness) {
        this.gastronomyFoodVariety = gastronomyFoodVariety;
        this.gastronomyFoodQuality = gastronomyFoodQuality;
        this.gastronomyFoodPrices = gastronomyFoodPrices;
        this.gastronomyDrinkVariety = gastronomyDrinkVariety;
        this.gastronomyDrinkQuality = gastronomyDrinkQuality;
        this.gastronomyDrinkPrices = gastronomyDrinkPrices;
        this.gastronomyStaffEfficiency = gastronomyStaffEfficiency;
        this.gastronomyStaffFriendliness = gastronomyStaffFriendliness;
}

    // getters and setters
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
    
}

    