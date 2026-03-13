package paf.project.soundtracks.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import jakarta.persistence.*;
//import paf.project.soundtracks.model.backup.Old_PersonalEventRating;

/* @Entity
@Table(name = "restroom_rating") */
@Embeddable
public class RestroomRating {
    /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restroom_rating_id")
    private Long restroomRatingId;

    @OneToOne
    @JoinColumn(name = "personal_event_rating_id_personal_event_rating")
    private Old_PersonalEventRating personalEventRating;

    @Column(name = "restroom_average_rating")
    private BigDecimal restroomAverageRating; */

    //@Column(name = "restroom_cleanliness")
    private BigDecimal restroomCleanliness;
    //@Column(name = "restroom_accessibility")
    private BigDecimal restroomAccessibility;
    //@Column(name = "restroom_supplies")
    private BigDecimal restroomSupplies;
    //@Column(name = "restroom_size")
    private BigDecimal restroomSize;
    //@Column(name = "restroom_rating_comments")
    //private String restroomRatingComments;

    // constructors
    public RestroomRating() {
    }

    public RestroomRating(BigDecimal restroomCleanliness,
                          BigDecimal restroomAccessibility, BigDecimal restroomSupplies, BigDecimal restroomSize) {
        /* this.restroomRatingId = restroomRatingId;
        this.personalEventRating = personalEventRating;
        this.restroomAverageRating = restroomAverageRating; */
        this.restroomCleanliness = restroomCleanliness;
        this.restroomAccessibility = restroomAccessibility;
        this.restroomSupplies = restroomSupplies;
        this.restroomSize = restroomSize;
        /* this.restroomRatingComments = restroomRatingComments; */
    }

    // getters and setters
    /* public Long getRestroomRatingId() {
        return restroomRatingId;
    }
    public void setRestroomRatingId(Long restroomRatingId) {
        this.restroomRatingId = restroomRatingId;
    }
    public Old_PersonalEventRating getPersonalEventRating() {
        return personalEventRating;
    }
    public void setPersonalEventRating(Old_PersonalEventRating personalEventRating) {
        this.personalEventRating = personalEventRating;
    }
    public BigDecimal getRestroomAverageRating() {
        return restroomAverageRating;
    }
    public void setRestroomAverageRating(BigDecimal restroomAverageRating) {
        this.restroomAverageRating = restroomAverageRating;
    } */

    public BigDecimal getRestroomCleanliness() {
        return restroomCleanliness;
    }
    public void setRestroomCleanliness(BigDecimal restroomCleanliness) {
        this.restroomCleanliness = restroomCleanliness;
    }
    public BigDecimal getRestroomAccessibility() {
        return restroomAccessibility;
    }
    public void setRestroomAccessibility(BigDecimal restroomAccessibility) {
        this.restroomAccessibility = restroomAccessibility;
    }
    public BigDecimal getRestroomSupplies() {
        return restroomSupplies;
    }
    public void setRestroomSupplies(BigDecimal restroomSupplies) {
        this.restroomSupplies = restroomSupplies;
    }
    public BigDecimal getRestroomSize() {
        return restroomSize;
    }
    public void setRestroomSize(BigDecimal restroomSize) {
        this.restroomSize = restroomSize;
    }
    /* public String getRestroomRatingComments() {
        return restroomRatingComments;
    }
    public void setRestroomRatingComments(String restroomRatingComments) {
        this.restroomRatingComments = restroomRatingComments;
    } */
    public BigDecimal getAverage() {
        BigDecimal sum = BigDecimal.ZERO;
        int count = 0;

        if (restroomCleanliness != null) {
            sum = sum.add(restroomCleanliness);
            count++;
        }
        if (restroomAccessibility != null) {
            sum = sum.add(restroomAccessibility);
            count++;
        }
        if (restroomSupplies != null) {
            sum = sum.add(restroomSupplies);
            count++;
        }
        if (restroomSize != null) {
            sum = sum.add(restroomSize);
            count++;
        }

        return count > 0 ? sum.divide(BigDecimal.valueOf(count), 1, RoundingMode.HALF_UP) : BigDecimal.ZERO;
    }
}
