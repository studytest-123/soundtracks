package paf.project.soundtracks.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import jakarta.persistence.*;
import paf.project.soundtracks.model.PersonalEventRating;

@Embeddable
public class AtmosphereRating {
    /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atmosphere_rating_id")
    private Long atmosphereRatingId; */

    /* @OneToOne
    @JoinColumn(name = "personal_event_rating_id_personal_event_rating")
    private Old_PersonalEventRating personalEventRating;
    @Column(name = "atmosphere_average_rating")
    private BigDecimal atmosphereAverageRating; */
    //@Column(name = "atmosphere_event_vibe")
    private BigDecimal atmosphereEventVibe;
    //@Column(name = "atmosphere_crowd_engagement")
    private BigDecimal atmosphereCrowdEngagement;
    //@Column(name = "atmosphere_light_and_visuals")
    private BigDecimal atmosphereLightAndVisuals;
    //@Column(name = "atmosphere_event_decorations")
    private BigDecimal atmosphereEventDecorations;
    //@Column(name = "atmosphere_staff_friendliness")
    private BigDecimal atmosphereStaffFriendliness;
   /*  @Column(name = "atmosphere_rating_comments")
    private String atmosphereRatingComments; */

    // constructors
    public AtmosphereRating() {
    }

    public AtmosphereRating(BigDecimal atmosphereEventVibe, BigDecimal atmosphereCrowdEngagement, BigDecimal atmosphereLightAndVisuals, BigDecimal atmosphereEventDecorations, BigDecimal atmosphereStaffFriendliness) {
        this.atmosphereEventVibe = atmosphereEventVibe;
        this.atmosphereCrowdEngagement = atmosphereCrowdEngagement;
        this.atmosphereLightAndVisuals = atmosphereLightAndVisuals;
        this.atmosphereEventDecorations = atmosphereEventDecorations;
        this.atmosphereStaffFriendliness = atmosphereStaffFriendliness;
    }
        

    // getters and setters

    /* public Long getAtmosphereRatingId() {
        return atmosphereRatingId;
    }
    public void setAtmosphereRatingId(Long atmosphereRatingId) {
        this.atmosphereRatingId = atmosphereRatingId;
    }
    public Old_PersonalEventRating getPersonalEventRating() {
        return personalEventRating;
    }
    public void setPersonalEventRating(Old_PersonalEventRating personalEventRating) {
        this.personalEventRating = personalEventRating;
    }
    public BigDecimal getAtmosphereAverageRating() {
        return atmosphereAverageRating;
    }
    public void setAtmosphereAverageRating(BigDecimal atmosphereAverageRating) {
        this.atmosphereAverageRating = atmosphereAverageRating;
    } */
    public BigDecimal getAtmosphereEventVibe() {
        return atmosphereEventVibe;
    }
    public void setAtmosphereEventVibe(BigDecimal atmosphereEventVibe) {
        this.atmosphereEventVibe = atmosphereEventVibe;
    }
    public BigDecimal getAtmosphereCrowdEngagement() {
        return atmosphereCrowdEngagement;
    }
    public void setAtmosphereCrowdEngagement(BigDecimal atmosphereCrowdEngagement) {
        this.atmosphereCrowdEngagement = atmosphereCrowdEngagement;
    }
    public BigDecimal getAtmosphereLightAndVisuals() {
        return atmosphereLightAndVisuals;
    }
    public void setAtmosphereLightAndVisuals(BigDecimal atmosphereLightAndVisuals) {
        this.atmosphereLightAndVisuals = atmosphereLightAndVisuals;
    }
    public BigDecimal getAtmosphereEventDecorations() {
        return atmosphereEventDecorations;
    }
    public void setAtmosphereEventDecorations(BigDecimal atmosphereEventDecorations) {
        this.atmosphereEventDecorations = atmosphereEventDecorations;
    }
    public BigDecimal getAtmosphereStaffFriendliness() {
        return atmosphereStaffFriendliness;
    }
    public void setAtmosphereStaffFriendliness(BigDecimal atmosphereStaffFriendliness) {
        this.atmosphereStaffFriendliness = atmosphereStaffFriendliness;
    }
   /*  public String getAtmosphereRatingComments() {
        return atmosphereRatingComments;
    }
    public void setAtmosphereRatingComments(String atmosphereRatingComments) {
        this.atmosphereRatingComments = atmosphereRatingComments;
    } */

    // domain-logic methods
    public BigDecimal getAverage() {
        BigDecimal sum = BigDecimal.ZERO;
        int count = 0;

        if (atmosphereEventVibe != null) {
            sum = sum.add(atmosphereEventVibe);
            count++;
        }
        if (atmosphereCrowdEngagement != null) {
            sum = sum.add(atmosphereCrowdEngagement);
            count++;
        }
        if (atmosphereLightAndVisuals != null) {
            sum = sum.add(atmosphereLightAndVisuals);
            count++;
        }
        if (atmosphereEventDecorations != null) {
            sum = sum.add(atmosphereEventDecorations);
            count++;
        }
        if (atmosphereStaffFriendliness != null) {
            sum = sum.add(atmosphereStaffFriendliness);
            count++;
        }
        return count > 0 ? sum.divide(BigDecimal.valueOf(count), 1, RoundingMode.HALF_UP) : BigDecimal.ZERO;
    }
}