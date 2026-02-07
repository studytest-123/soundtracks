package paf.project.soundtracks.model;

public class LocationRating {
    // future database primary key
    private Long locationRatingId;

    private Long locationId;
    //private Location ratedLocation;
    private double locationAverageRating;
    private double locationSize;
    private double locationArea;
    private double locationAccessibility;
    private double locationEquipment;
    private double locationAmbience;
    private double locationCleanliness;
    private double locationStaff;
    private String locationRatingComments;

    // constructors
    public LocationRating() {
    }

    public LocationRating(Long locationRatingId, Long locationId, double locationAverageRating, double locationSize,
            double locationArea, double locationAccessibility, double locationEquipment, double locationAmbience,
            double locationCleanliness, double locationStaff, String locationRatingComments) {
        this.locationRatingId = locationRatingId;
        this.locationId = locationId;
        this.locationAverageRating = locationAverageRating;
        this.locationSize = locationSize;
        this.locationArea = locationArea;
        this.locationAccessibility = locationAccessibility;
        this.locationEquipment = locationEquipment;
        this.locationAmbience = locationAmbience;
        this.locationCleanliness = locationCleanliness;
        this.locationStaff = locationStaff;
        this.locationRatingComments = locationRatingComments;
    }

    // getters and setters
    public Long getLocationRatingId() {
        return locationRatingId;
    }
    public void setLocationRatingId(Long locationRatingId) {
        this.locationRatingId = locationRatingId;
    }
    public Long getLocationId(){
        return locationId;
    }
    public void setLocationId(Long locationId){
        this.locationId = locationId;
    }
    public double getLocationAverageRating() {
        return locationAverageRating;
    }
    public void setLocationAverageRating(double locationAverageRating) {
        this.locationAverageRating = locationAverageRating;
    }
    public double getLocationSize() {
        return locationSize;
    }
    public void setLocationSize(double locationSize) {
        this.locationSize = locationSize;
    }
    public double getLocationArea() {
        return locationArea;
    }
    public void setLocationArea(double locationArea) {
        this.locationArea = locationArea;
    }
    public double getLocationAccessibility() {
        return locationAccessibility;
    }
    public void setLocationAccessibility(double locationAccessibility) {
        this.locationAccessibility = locationAccessibility;
    }
    public double getLocationEquipment() {
        return locationEquipment;
    }
    public void setLocationEquipment(double locationEquipment) {
        this.locationEquipment = locationEquipment;
    }
    public double getLocationAmbience() {
        return locationAmbience;
    }
    public void setLocationAmbience(double locationAmbience) {
        this.locationAmbience = locationAmbience;
    }
    public double getLocationCleanliness() {
        return locationCleanliness;
    }
    public void setLocationCleanliness(double locationCleanliness) {
        this.locationCleanliness = locationCleanliness;
    }
    public double getLocationStaff() {
        return locationStaff;
    }
    public void setLocationStaff(double locationStaff) {
        this.locationStaff = locationStaff;
    }
    public String getLocationRatingComments() {
        return locationRatingComments;
    }
    public void setLocationRatingComments(String locationRatingComments) {
        this.locationRatingComments = locationRatingComments;
    }
    }
