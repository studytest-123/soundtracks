package paf.project.soundtracks.model;

import java.math.BigDecimal;

import org.checkerframework.checker.units.qual.C;

import jakarta.persistence.*;

@Entity
@Table(name = "atmosphere_rating")
public class AtmosphereRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atmosphere_rating_id")
    private Long atmosphereRatingId;

    @OneToOne
    @JoinColumn(name = "personal_event_rating_id_personal_event_rating")
    private PersonalEventRating personalEventRating;
    @Column(name = "atmosphere_average_rating")
    private BigDecimal atmosphereAverageRating;
    @Column(name = "event_vibe")
    private BigDecimal eventVibe;
    @Column(name = "crowd_engagement")
    private BigDecimal crowdEngagement;
    @Column(name = "light_and_visuals")
    private BigDecimal lightAndVisuals;
    @Column(name = "event_decorations")
    private BigDecimal eventDecorations;
    @Column(name = "staff_friendliness")
    private BigDecimal staffFriendliness;
    @Column(name = "atmosphere_rating_comments")
    private String atmosphereRatingComments;

    // constructors
    public AtmosphereRating() {
    }

    public AtmosphereRating(Long atmosphereRatingId, PersonalEventRating personalEventRating, BigDecimal atmosphereAverageRating, BigDecimal eventVibe,
                            BigDecimal crowdEngagement, BigDecimal lightAndVisuals, BigDecimal eventDecorations,
                            BigDecimal staffFriendliness, String atmosphereRatingComments) {
        this.atmosphereRatingId = atmosphereRatingId;
        this.personalEventRating = personalEventRating;
        this.atmosphereAverageRating = atmosphereAverageRating;
        this.eventVibe = eventVibe;
        this.crowdEngagement = crowdEngagement;
        this.lightAndVisuals = lightAndVisuals;
        this.eventDecorations = eventDecorations;
        this.staffFriendliness = staffFriendliness;
        this.atmosphereRatingComments = atmosphereRatingComments;
    }

    // getters and setters
    public Long getAtmosphereRatingId() {
        return atmosphereRatingId;
    }
    public void setAtmosphereRatingId(Long atmosphereRatingId) {
        this.atmosphereRatingId = atmosphereRatingId;
    }
    public PersonalEventRating getPersonalEventRating() {
        return personalEventRating;
    }
    public void setPersonalEventRating(PersonalEventRating personalEventRating) {
        this.personalEventRating = personalEventRating;
    }
    public BigDecimal getAtmosphereAverageRating() {
        return atmosphereAverageRating;
    }
    public void setAtmosphereAverageRating(BigDecimal atmosphereAverageRating) {
        this.atmosphereAverageRating = atmosphereAverageRating;
    }
    public BigDecimal getEventVibe() {
        return eventVibe;
    }
    public void setEventVibe(BigDecimal eventVibe) {
        this.eventVibe = eventVibe;
    }
    public BigDecimal getCrowdEngagement() {
        return crowdEngagement;
    }
    public void setCrowdEngagement(BigDecimal crowdEngagement) {
        this.crowdEngagement = crowdEngagement;
    }
    public BigDecimal getLightAndVisuals() {
        return lightAndVisuals;
    }
    public void setLightAndVisuals(BigDecimal lightAndVisuals) {
        this.lightAndVisuals = lightAndVisuals;
    }
    public BigDecimal getEventDecorations() {
        return eventDecorations;
    }
    public void setEventDecorations(BigDecimal eventDecorations) {
        this.eventDecorations = eventDecorations;
    }
    public BigDecimal getStaffFriendliness() {
        return staffFriendliness;
    }
    public void setStaffFriendliness(BigDecimal staffFriendliness) {
        this.staffFriendliness = staffFriendliness;
    }
    public String getAtmosphereRatingComments() {
        return atmosphereRatingComments;
    }
    public void setAtmosphereRatingComments(String atmosphereRatingComments) {
        this.atmosphereRatingComments = atmosphereRatingComments;
    }
}