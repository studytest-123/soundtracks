package paf.project.soundtracks.model;

import java.math.BigDecimal;

import org.checkerframework.checker.units.qual.C;

import jakarta.persistence.*;

@Entity
@Table(name = "gastronomy_rating")
public class GastronomyRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gastronomy_rating_id")
    private Long gastronomyRatingId;
    @OneToOne
    @JoinColumn(name = "personal_event_rating_id_personal_event_rating")
    private PersonalEventRating personalEventRating;
    @Column(name = "gastronomy_average_rating")
    private BigDecimal gastronomyAverageRating;
    @Column(name = "gastronomy_food_variety")
    private BigDecimal gastronomyFoodVariety;
    @Column(name = "gastronomy_food_quality")
    private BigDecimal gastronomyFoodQuality;
    @Column(name = "gastronomy_food_prices")
    private BigDecimal gastronomyFoodPrices;
    @Column(name = "gastronomy_drink_variety")
    private BigDecimal gastronomyDrinkVariety;
    @Column(name = "gastronomy_drink_quality")
    private BigDecimal gastronomyDrinkQuality;
    @Column(name = "gastronomy_drink_prices")
    private BigDecimal gastronomyDrinkPrices;
    @Column(name = "gastronomy_staff_efficiency")
    private BigDecimal gastronomyStaffEfficiency;
    @Column(name = "gastronomy_staff_friendliness")
    private BigDecimal gastronomyStaffFriendliness;
    @Column(name = "gastronomy_rating_comments")
    private String gastronomyRatingComments;

    // constructors
    public GastronomyRating() {
    }

    public GastronomyRating(Long gastronomyRatingId, PersonalEventRating personalEventRating, BigDecimal gastronomyAverageRating, BigDecimal gastronomyFoodVariety,
            BigDecimal gastronomyFoodQuality, BigDecimal gastronomyFoodPrices, BigDecimal gastronomyDrinkVariety,
            BigDecimal gastronomyDrinkQuality, BigDecimal gastronomyDrinkPrices, BigDecimal gastronomyStaffEfficiency,
            BigDecimal gastronomyStaffFriendliness, String gastronomyRatingComments) {
        this.gastronomyRatingId = gastronomyRatingId;
        this.personalEventRating = personalEventRating;
        this.gastronomyAverageRating = gastronomyAverageRating;
        this.gastronomyFoodVariety = gastronomyFoodVariety;
        this.gastronomyFoodQuality = gastronomyFoodQuality;
        this.gastronomyFoodPrices = gastronomyFoodPrices;
        this.gastronomyDrinkVariety = gastronomyDrinkVariety;
        this.gastronomyDrinkQuality = gastronomyDrinkQuality;
        this.gastronomyDrinkPrices = gastronomyDrinkPrices;
        this.gastronomyStaffEfficiency = gastronomyStaffEfficiency;
        this.gastronomyStaffFriendliness = gastronomyStaffFriendliness;
        this.gastronomyRatingComments = gastronomyRatingComments;
}

    // getters and setters
    public Long getGastronomyRatingId() {
        return gastronomyRatingId;
    }
    public void setGastronomyRatingId(Long gastronomyRatingId) {
        this.gastronomyRatingId = gastronomyRatingId;
    }
    public PersonalEventRating getPersonalEventRating() {
        return personalEventRating;
    }
    public void setPersonalEventRating(PersonalEventRating personalEventRating) {
        this.personalEventRating = personalEventRating;
    }
    public BigDecimal getGastronomyAverageRating() {
        return gastronomyAverageRating;
    }
    public void setGastronomyAverageRating(BigDecimal gastronomyAverageRating) {
        this.gastronomyAverageRating = gastronomyAverageRating;
    }
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
    public String getGastronomyRatingComments() {
        return gastronomyRatingComments;
    }
    public void setGastronomyRatingComments(String gastronomyRatingComments) {
        this.gastronomyRatingComments = gastronomyRatingComments;
    }
}

    