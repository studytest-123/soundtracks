package paf.project.soundtracks.model;

import java.math.BigDecimal;

import org.checkerframework.checker.units.qual.C;

import jakarta.persistence.*;

@Entity
@Table(name = "restroom_rating")
public class RestroomRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restroom_rating_id")
    private Long restroomRatingId;

    @OneToOne
    @JoinColumn(name = "personal_event_rating_id_personal_event_rating")
    private PersonalEventRating personalEventRating;

    @Column(name = "restroom_average_rating")
    private BigDecimal restroomAverageRating;
    @Column(name = "restroom_cleanliness")
    private BigDecimal restroomCleanliness;
    @Column(name = "restroom_accessibility")
    private BigDecimal restroomAccessibility;
    @Column(name = "restroom_supplies")
    private BigDecimal restroomSupplies;
    @Column(name = "restroom_size")
    private BigDecimal restroomSize;
    @Column(name = "restroom_rating_comments")
    private String restroomRatingComments;

    // constructors
    public RestroomRating() {
    }

    public RestroomRating(Long restroomRatingId, PersonalEventRating personalEventRating, BigDecimal restroomAverageRating, BigDecimal restroomCleanliness,
                          BigDecimal restroomAccessibility, BigDecimal restroomSupplies, BigDecimal restroomSize,
                          String restroomRatingComments) {
        this.restroomRatingId = restroomRatingId;
        this.personalEventRating = personalEventRating;
        this.restroomAverageRating = restroomAverageRating;
        this.restroomCleanliness = restroomCleanliness;
        this.restroomAccessibility = restroomAccessibility;
        this.restroomSupplies = restroomSupplies;
        this.restroomSize = restroomSize;
        this.restroomRatingComments = restroomRatingComments;
    }

    // getters and setters
    public Long getRestroomRatingId() {
        return restroomRatingId;
    }
    public void setRestroomRatingId(Long restroomRatingId) {
        this.restroomRatingId = restroomRatingId;
    }
    public PersonalEventRating getPersonalEventRating() {
        return personalEventRating;
    }
    public void setPersonalEventRating(PersonalEventRating personalEventRating) {
        this.personalEventRating = personalEventRating;
    }
    public BigDecimal getRestroomAverageRating() {
        return restroomAverageRating;
    }
    public void setRestroomAverageRating(BigDecimal restroomAverageRating) {
        this.restroomAverageRating = restroomAverageRating;
    }
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
    public String getRestroomRatingComments() {
        return restroomRatingComments;
    }
    public void setRestroomRatingComments(String restroomRatingComments) {
        this.restroomRatingComments = restroomRatingComments;
    }
}
