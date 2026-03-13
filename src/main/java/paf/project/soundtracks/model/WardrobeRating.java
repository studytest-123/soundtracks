package paf.project.soundtracks.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import jakarta.persistence.*;
import paf.project.soundtracks.model.PersonalEventRating;

/* @Entity
@Table(name = "wardrobe_rating") */
@Embeddable
public class WardrobeRating {
    /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wardrobe_rating_id")
    private Long wardrobeRatingId;

    @OneToOne
    @JoinColumn(name = "personal_event_rating_id_personal_event_rating")
    private Old_PersonalEventRating personalEventRating;

    @Column(name = "wardrobe_average_rating")
    private BigDecimal wardrobeAverageRating;
    
    @Column(name = "wardrobe_price") */
    private BigDecimal wardrobePrice;
    //@Column(name = "wardrobe_staff_efficiency")
    private BigDecimal wardrobeStaffEfficiency;
    //@Column(name = "wardrobe_staff_friendliness")
    private BigDecimal wardrobeStaffFriendliness;
    //@Column(name = "wardrobe_quality")
    private BigDecimal wardrobeQuality;
    //@Column(name = "wardrobe_rating_comments")
    //private String wardrobeRatingComments;

    // constructors
    public WardrobeRating() {
    }

    public WardrobeRating(BigDecimal wardrobePrice,
                          BigDecimal wardrobeStaffEfficiency, BigDecimal wardrobeStaffFriendliness, BigDecimal wardrobeQuality) {
        /* this.wardrobeRatingId = wardrobeRatingId;
        this.personalEventRating = personalEventRating;
        this.wardrobeAverageRating = wardrobeAverageRating; */
        this.wardrobePrice = wardrobePrice;
        this.wardrobeStaffEfficiency = wardrobeStaffEfficiency;
        this.wardrobeStaffFriendliness = wardrobeStaffFriendliness;
        this.wardrobeQuality = wardrobeQuality;
        /* this.wardrobeRatingComments = wardrobeRatingComments; */
    }

    // getters and setters
    
    /* public Long getWardrobeRatingId() {
        return wardrobeRatingId;
    }
    public void setWardrobeRatingId(Long wardrobeRatingId) {
        this.wardrobeRatingId = wardrobeRatingId;
    }
    public Old_PersonalEventRating getPersonalEventRating() {
        return personalEventRating;
    }
    public void setPersonalEventRating(Old_PersonalEventRating personalEventRating) {
        this.personalEventRating = personalEventRating;
    }
    public BigDecimal getWardrobeAverageRating() {
        return wardrobeAverageRating;
    }
    public void setWardrobeAverageRating(BigDecimal wardrobeAverageRating) {
        this.wardrobeAverageRating = wardrobeAverageRating;
    } */
    public BigDecimal getWardrobePrice() {
        return wardrobePrice;
    }
    public void setWardrobePrice(BigDecimal wardrobePrice) {
        this.wardrobePrice = wardrobePrice;
    }
    public BigDecimal getWardrobeStaffEfficiency() {
        return wardrobeStaffEfficiency;
    }
    public void setWardrobeStaffEfficiency(BigDecimal wardrobeStaffEfficiency) {
        this.wardrobeStaffEfficiency = wardrobeStaffEfficiency;
    }
    public BigDecimal getWardrobeStaffFriendliness() {
        return wardrobeStaffFriendliness;
    }
    public void setWardrobeStaffFriendliness(BigDecimal wardrobeStaffFriendliness) {
        this.wardrobeStaffFriendliness = wardrobeStaffFriendliness;
    }
    public BigDecimal getWardrobeQuality() {
        return wardrobeQuality;
    }
    public void setWardrobeQuality(BigDecimal wardrobeQuality) {
        this.wardrobeQuality = wardrobeQuality;
    }
    /* public String getWardrobeRatingComments() {
        return wardrobeRatingComments;
    }
    public void setWardrobeRatingComments(String wardrobeRatingComments) {
        this.wardrobeRatingComments = wardrobeRatingComments;
    } */

        // method to calculate average rating
        public BigDecimal getAverage() {
        BigDecimal sum = BigDecimal.ZERO;
        int count = 0;
        if (wardrobePrice != null) {
            sum = sum.add(wardrobePrice);
            count++;
        }
        if (wardrobeStaffEfficiency != null) {
            sum = sum.add(wardrobeStaffEfficiency);
            count++;
        }
        if (wardrobeStaffFriendliness != null) {
            sum = sum.add(wardrobeStaffFriendliness);
            count++;
        }
        if (wardrobeQuality != null) {
            sum = sum.add(wardrobeQuality);
            count++;
        }
        return count > 0 ? sum.divide(BigDecimal.valueOf(count), 1, RoundingMode.HALF_UP) : BigDecimal.ZERO;
    }
}