package paf.project.soundtracks.model;

import java.math.BigDecimal;

import org.checkerframework.checker.units.qual.C;

import jakarta.persistence.*;

@Entity
@Table(name = "security_rating")
public class SecurityRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "security_rating_id")
    private Long securityRatingId;

    @OneToOne
    @JoinColumn(name = "personal_event_rating_id_personal_event_rating")
    private PersonalEventRating personalEventRating;
    
    @Column(name = "security_average_rating")
    private BigDecimal securityAverageRating;
    @Column(name = "staff_friendliness")
    private BigDecimal staffFriendliness;
    @Column(name = "staff_competence")
    private BigDecimal staffCompetence;
    @Column(name = "sense_of_security")
    private BigDecimal senseOfSecurity;
    @Column(name = "security_rating_comments")
    private String securityRatingComments;

    // constructors
    public SecurityRating() {
    }
    public SecurityRating(Long securityRatingId, PersonalEventRating personalEventRating, BigDecimal securityAverageRating, BigDecimal staffFriendliness,
            BigDecimal staffCompetence, BigDecimal senseOfSecurity, String securityRatingComments) {
        this.securityRatingId = securityRatingId;
        this.personalEventRating = personalEventRating;
        this.securityAverageRating = securityAverageRating;
        this.staffFriendliness = staffFriendliness;
        this.staffCompetence = staffCompetence;
        this.senseOfSecurity = senseOfSecurity;
        this.securityRatingComments = securityRatingComments;
    }

    // getters and setters
    public Long getSecurityRatingId() {
        return securityRatingId;
    }
    public void setSecurityRatingId(Long securityRatingId) {
        this.securityRatingId = securityRatingId;
    }
    public PersonalEventRating getPersonalEventRating() {
        return personalEventRating;
    }
    public void setPersonalEventRating(PersonalEventRating personalEventRating) {
        this.personalEventRating = personalEventRating;
    }
    public BigDecimal getSecurityAverageRating() {
        return securityAverageRating;
    }
    public void setSecurityAverageRating(BigDecimal securityAverageRating) {
        this.securityAverageRating = securityAverageRating;
    }
    public BigDecimal getStaffFriendliness() {
        return staffFriendliness;
    }
    public void setStaffFriendliness(BigDecimal staffFriendliness) {
        this.staffFriendliness = staffFriendliness;
    }
    public BigDecimal getStaffCompetence() {
        return staffCompetence;
    }
    public void setStaffCompetence(BigDecimal staffCompetence) {
        this.staffCompetence = staffCompetence;
    }
    public BigDecimal getSenseOfSecurity() {
        return senseOfSecurity;
    }
    public void setSenseOfSecurity(BigDecimal senseOfSecurity) {
        this.senseOfSecurity = senseOfSecurity;
    }
    public String getSecurityRatingComments() {
        return securityRatingComments;
    }
    public void setSecurityRatingComments(String securityRatingComments) {
        this.securityRatingComments = securityRatingComments;
    }
}