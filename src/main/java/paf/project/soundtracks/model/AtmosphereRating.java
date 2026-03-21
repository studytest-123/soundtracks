package paf.project.soundtracks.model;

import java.math.BigDecimal;
import jakarta.persistence.*;
import paf.project.soundtracks.util.RatingUtils;

@Embeddable
public class AtmosphereRating {
   
    private BigDecimal atmosphereEventVibe;
    private BigDecimal atmosphereCrowdEngagement;
    private BigDecimal atmosphereLightAndVisuals;
    private BigDecimal atmosphereEventDecorations;
    private BigDecimal atmosphereStaffFriendliness;

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

    // domain-logic methods
    public BigDecimal getAverage() {
        return RatingUtils.average(
            atmosphereEventVibe,
            atmosphereCrowdEngagement,
            atmosphereLightAndVisuals,
            atmosphereEventDecorations,
            atmosphereStaffFriendliness
        );
    }
}