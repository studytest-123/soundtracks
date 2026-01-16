package paf.project.soundtracks.model;

public class GastronomyRating {
    private Long gastronomyRatingId;
    private double gastronomyAverageRating;
    private double gastronomyFoodVariety;
    private double gastronomyFoodQuality;
    private double gastronomyFoodPrices;
    private double gastronomyDrinkVariety;
    private double gastronomyDrinkQuality;
    private double gastronomyDrinkPrices;
    private double gastronomyStaffEfficiency;
    private double gastronomyStaffFriendliness;
    private String gastronomyRatingComments;

    // constructors
    public GastronomyRating() {
    }

    public GastronomyRating(Long gastronomyRatingId, double gastronomyAverageRating, double gastronomyFoodVariety,
            double gastronomyFoodQuality, double gastronomyFoodPrices, double gastronomyDrinkVariety,
            double gastronomyDrinkQuality, double gastronomyDrinkPrices, double gastronomyStaffEfficiency,
            double gastronomyStaffFriendliness, String gastronomyRatingComments) {
        this.gastronomyRatingId = gastronomyRatingId;
        this.gastronomyAverageRating = gastronomyAverageRating;
        this.gastronomyFoodVariety = gastronomyFoodVariety;
        this.gastronomyFoodQuality = gastronomyFoodQuality;
        this.gastronomyFoodPrices = gastronomyFoodPrices;
        this.gastronomyDrinkVariety = gastronomyDrinkVariety;
        this.gastronomyDrinkQuality = gastronomyDrinkQuality;
        this.gastronomyDrinkPrices = gastronomyDrinkPrices;
        this.gastronomyStaffEfficiency = gastronomyStaffEfficiency;
        this.gastronomyStaffFriendliness = gastronomyStaffFriendliness;
        this.gastronomyRatingComments = gastronomyRatingComments;
}

    // getters and setters
    public Long getGastronomyRatingId() {
        return gastronomyRatingId;
    }
    public void setGastronomyRatingId(Long gastronomyRatingId) {
        this.gastronomyRatingId = gastronomyRatingId;
    }
    public double getGastronomyAverageRating() {
        return gastronomyAverageRating;
    }
    public void setGastronomyAverageRating(double gastronomyAverageRating) {
        this.gastronomyAverageRating = gastronomyAverageRating;
    }
    public double getGastronomyFoodVariety() {
        return gastronomyFoodVariety;
    }
    public void setGastronomyFoodVariety(double gastronomyFoodVariety) {
        this.gastronomyFoodVariety = gastronomyFoodVariety;
    }
    public double getGastronomyFoodQuality() {
        return gastronomyFoodQuality;
    }
    public void setGastronomyFoodQuality(double gastronomyFoodQuality) {
        this.gastronomyFoodQuality = gastronomyFoodQuality;
    }
    public double getGastronomyFoodPrices() {
        return gastronomyFoodPrices;
    }
    public void setGastronomyFoodPrices(double gastronomyFoodPrices) {
        this.gastronomyFoodPrices = gastronomyFoodPrices;
    }
    public double getGastronomyDrinkVariety() {
        return gastronomyDrinkVariety;
    }
    public void setGastronomyDrinkVariety(double gastronomyDrinkVariety) {
        this.gastronomyDrinkVariety = gastronomyDrinkVariety;
    }
    public double getGastronomyDrinkQuality() {
        return gastronomyDrinkQuality;
    }
    public void setGastronomyDrinkQuality(double gastronomyDrinkQuality) {
        this.gastronomyDrinkQuality = gastronomyDrinkQuality;
    }
    public double getGastronomyDrinkPrices() {
        return gastronomyDrinkPrices;
    }
    public void setGastronomyDrinkPrices(double gastronomyDrinkPrices) {
        this.gastronomyDrinkPrices = gastronomyDrinkPrices;
    }
    public double getGastronomyStaffEfficiency() {
        return gastronomyStaffEfficiency;
    }
    public void setGastronomyStaffEfficiency(double gastronomyStaffEfficiency) {
        this.gastronomyStaffEfficiency = gastronomyStaffEfficiency;
    }
    public double getGastronomyStaffFriendliness() {
        return gastronomyStaffFriendliness;
    }
    public void setGastronomyStaffFriendliness(double gastronomyStaffFriendliness) {
        this.gastronomyStaffFriendliness = gastronomyStaffFriendliness;
    }
    public String getGastronomyRatingComments() {
        return gastronomyRatingComments;
    }
    public void setGastronomyRatingComments(String gastronomyRatingComments) {
        this.gastronomyRatingComments = gastronomyRatingComments;
    }
}

    