package paf.project.soundtracks.model;

public class SecurityRating {
    private Long securityRatingId;
    private double securityAverageRating;
    private double staffFriendliness;
    private double staffCompetence;
    private double senseOfSecurity;
    private String securityRatingComments;

    // constructors
    public SecurityRating() {
    }
    public SecurityRating(Long securityRatingId, double securityAverageRating, double staffFriendliness,
            double staffCompetence, double senseOfSecurity, String securityRatingComments) {
        this.securityRatingId = securityRatingId;
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
    public double getSecurityAverageRating() {
        return securityAverageRating;
    }
    public void setSecurityAverageRating(double securityAverageRating) {
        this.securityAverageRating = securityAverageRating;
    }
    public double getStaffFriendliness() {
        return staffFriendliness;
    }
    public void setStaffFriendliness(double staffFriendliness) {
        this.staffFriendliness = staffFriendliness;
    }
    public double getStaffCompetence() {
        return staffCompetence;
    }
    public void setStaffCompetence(double staffCompetence) {
        this.staffCompetence = staffCompetence;
    }
    public double getSenseOfSecurity() {
        return senseOfSecurity;
    }
    public void setSenseOfSecurity(double senseOfSecurity) {
        this.senseOfSecurity = senseOfSecurity;
    }
    public String getSecurityRatingComments() {
        return securityRatingComments;
    }
    public void setSecurityRatingComments(String securityRatingComments) {
        this.securityRatingComments = securityRatingComments;
    }
}