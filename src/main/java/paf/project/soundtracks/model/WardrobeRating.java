package paf.project.soundtracks.model;

public class WardrobeRating {
    private Long wardrobeRatingId;
    private double wardrobeAverageRating;
    private double wardrobePrice;
    private double wardrobeStaffEfficiency;
    private double wardrobeStaffFriendliness;
    private double wardrobeQuality;
    private String wardrobeRatingComments;

    // constructors
    public WardrobeRating() {
    }

    public WardrobeRating(Long wardrobeRatingId, double wardrobeAverageRating, double wardrobePrice,
                          double wardrobeStaffEfficiency, double wardrobeStaffFriendliness, double wardrobeQuality,
                          String wardrobeRatingComments) {
        this.wardrobeRatingId = wardrobeRatingId;
        this.wardrobeAverageRating = wardrobeAverageRating;
        this.wardrobePrice = wardrobePrice;
        this.wardrobeStaffEfficiency = wardrobeStaffEfficiency;
        this.wardrobeStaffFriendliness = wardrobeStaffFriendliness;
        this.wardrobeQuality = wardrobeQuality;
        this.wardrobeRatingComments = wardrobeRatingComments;
    }

    // getters and setters
    public Long getWardrobeRatingId() {
        return wardrobeRatingId;
    }
    public void setWardrobeRatingId(Long wardrobeRatingId) {
        this.wardrobeRatingId = wardrobeRatingId;
    }
    public double getWardrobeAverageRating() {
        return wardrobeAverageRating;
    }
    public void setWardrobeAverageRating(double wardrobeAverageRating) {
        this.wardrobeAverageRating = wardrobeAverageRating;
    }
    public double getWardrobePrice() {
        return wardrobePrice;
    }
    public void setWardrobePrice(double wardrobePrice) {
        this.wardrobePrice = wardrobePrice;
    }
    public double getWardrobeStaffEfficiency() {
        return wardrobeStaffEfficiency;
    }
    public void setWardrobeStaffEfficiency(double wardrobeStaffEfficiency) {
        this.wardrobeStaffEfficiency = wardrobeStaffEfficiency;
    }
    public double getWardrobeStaffFriendliness() {
        return wardrobeStaffFriendliness;
    }
    public void setWardrobeStaffFriendliness(double wardrobeStaffFriendliness) {
        this.wardrobeStaffFriendliness = wardrobeStaffFriendliness;
    }
    public double getWardrobeQuality() {
        return wardrobeQuality;
    }
    public void setWardrobeQuality(double wardrobeQuality) {
        this.wardrobeQuality = wardrobeQuality;
    }
    public String getWardrobeRatingComments() {
        return wardrobeRatingComments;
    }
    public void setWardrobeRatingComments(String wardrobeRatingComments) {
        this.wardrobeRatingComments = wardrobeRatingComments;
    }
}