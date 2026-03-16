package paf.project.soundtracks.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import jakarta.persistence.*;
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.util.RatingUtils;

/* @Entity
@Table(name = "security_rating") */
@Embeddable
public class SecurityRating {
    /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "security_rating_id")
    private Long securityRatingId;

    @OneToOne
    @JoinColumn(name = "personal_event_rating_id_personal_event_rating")
    private Old_PersonalEventRating personalEventRating;
    
    @Column(name = "security_average_rating")
    private BigDecimal securityAverageRating; */

    //@Column(name = "security_staff_friendliness")
    private BigDecimal securityStaffFriendliness;
    //@Column(name = "security_staff_competence")
    private BigDecimal securityStaffCompetence;
    //@Column(name = "security_sense_of_security")
    private BigDecimal securitySenseOfSecurity;
    /* @Column(name = "security_rating_comments")
    private String securityRatingComments; */

    // constructors
    public SecurityRating() {
    }
    public SecurityRating(BigDecimal staffFriendliness,
            BigDecimal staffCompetence, BigDecimal senseOfSecurity) {
        /* this.securityRatingId = securityRatingId;
        this.personalEventRating = personalEventRating;
        this.securityAverageRating = securityAverageRating; */
        this.securityStaffFriendliness = staffFriendliness;
        this.securityStaffCompetence = staffCompetence;
        this.securitySenseOfSecurity = senseOfSecurity;
    }

    // getters and setters
    /* public Long getSecurityRatingId() {
        return securityRatingId;
    }
    public void setSecurityRatingId(Long securityRatingId) {
        this.securityRatingId = securityRatingId;
    }
    public Old_PersonalEventRating getPersonalEventRating() {
        return personalEventRating;
    }
    public void setPersonalEventRating(Old_PersonalEventRating personalEventRating) {
        this.personalEventRating = personalEventRating;
    }
    public BigDecimal getSecurityAverageRating() {
        return securityAverageRating;
    }
    public void setSecurityAverageRating(BigDecimal securityAverageRating) {
        this.securityAverageRating = securityAverageRating;
    } */

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
    /* public String getSecurityRatingComments() {
        return securityRatingComments;
    }
    public void setSecurityRatingComments(String securityRatingComments) {
        this.securityRatingComments = securityRatingComments;
    } */

    // domain-logic methods
    public BigDecimal getAverage() {
        return RatingUtils.average(
            securityStaffFriendliness,
            securityStaffCompetence,
            securitySenseOfSecurity
        );
    }
    
    /* public BigDecimal getAverage() {
        BigDecimal sum = BigDecimal.ZERO;
        int count = 0;

        if (securityStaffFriendliness != null) {
            sum = sum.add(securityStaffFriendliness);
            count++;
        }
        if (securityStaffCompetence != null) {
            sum = sum.add(securityStaffCompetence);
            count++;
        }
        if (securitySenseOfSecurity != null) {
            sum = sum.add(securitySenseOfSecurity);
            count++;
        }

        return count > 0 ? sum.divide(BigDecimal.valueOf(count), 1, RoundingMode.HALF_UP) : BigDecimal.ZERO;
    } */
}