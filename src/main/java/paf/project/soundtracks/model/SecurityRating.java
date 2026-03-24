package paf.project.soundtracks.model;

import java.math.BigDecimal;
import jakarta.persistence.*;
import paf.project.soundtracks.util.RatingUtils;

@Embeddable
public class SecurityRating {
    
    private BigDecimal securityStaffFriendliness;
    private BigDecimal securityStaffCompetence;
    private BigDecimal securitySenseOfSecurity;

    // constructors
    public SecurityRating() {
    }
    public SecurityRating(BigDecimal staffFriendliness, BigDecimal staffCompetence, BigDecimal senseOfSecurity) {
        this.securityStaffFriendliness = staffFriendliness;
        this.securityStaffCompetence = staffCompetence;
        this.securitySenseOfSecurity = senseOfSecurity;
    }

    // getters and setters
    public BigDecimal getSecurityStaffFriendliness() {
        return securityStaffFriendliness;
    }
    public void setSecurityStaffFriendliness(BigDecimal staffFriendliness) {
        this.securityStaffFriendliness = staffFriendliness;
    }
    public BigDecimal getSecurityStaffCompetence() {
        return securityStaffCompetence;
    }
    public void setSecurityStaffCompetence(BigDecimal staffCompetence) {
        this.securityStaffCompetence = staffCompetence;
    }
    public BigDecimal getSecuritySenseOfSecurity() {
        return securitySenseOfSecurity;
    }
    public void setSecuritySenseOfSecurity(BigDecimal senseOfSecurity) {
        this.securitySenseOfSecurity = senseOfSecurity;
    }

    // domain-logic methods
    public BigDecimal getAverage() {
        return RatingUtils.average(
            securityStaffFriendliness,
            securityStaffCompetence,
            securitySenseOfSecurity
        );
    }
}