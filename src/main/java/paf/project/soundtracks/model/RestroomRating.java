package paf.project.soundtracks.model;

public class RestroomRating {
    private Long restroomRatingId;
    private double restroomAverageRating;
    private double restroomCleanliness;
    private double restroomAccessibility;
    private double restroomSupplies;
    private double restroomSize;
    private String restroomRatingComments;

    // constructors
    public RestroomRating() {
    }

    public RestroomRating(Long restroomRatingId, double restroomAverageRating, double restroomCleanliness,
                          double restroomAccessibility, double restroomSupplies, double restroomSize,
                          String restroomRatingComments) {
        this.restroomRatingId = restroomRatingId;
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
    public double getRestroomAverageRating() {
        return restroomAverageRating;
    }
    public void setRestroomAverageRating(double restroomAverageRating) {
        this.restroomAverageRating = restroomAverageRating;
    }
    public double getRestroomCleanliness() {
        return restroomCleanliness;
    }
    public void setRestroomCleanliness(double restroomCleanliness) {
        this.restroomCleanliness = restroomCleanliness;
    }
    public double getRestroomAccessibility() {
        return restroomAccessibility;
    }
    public void setRestroomAccessibility(double restroomAccessibility) {
        this.restroomAccessibility = restroomAccessibility;
    }
    public double getRestroomSupplies() {
        return restroomSupplies;
    }
    public void setRestroomSupplies(double restroomSupplies) {
        this.restroomSupplies = restroomSupplies;
    }
    public double getRestroomSize() {
        return restroomSize;
    }
    public void setRestroomSize(double restroomSize) {
        this.restroomSize = restroomSize;
    }
    public String getRestroomRatingComments() {
        return restroomRatingComments;
    }
    public void setRestroomRatingComments(String restroomRatingComments) {
        this.restroomRatingComments = restroomRatingComments;
    }
}
