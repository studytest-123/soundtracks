package paf.project.soundtracks.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "location_rating")
public class LocationRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_rating_id")
    private Long locationRatingId;

    @ManyToOne
    @JoinColumn(name = "location_id_location")
    private Location location;    
    
    @ManyToOne
    @JoinColumn(name = "personal_event_rating_id_personal_event_rating")
    private PersonalEventRating personalEventRating;


    private BigDecimal locationAverageRating;
    private BigDecimal locationSize;
    private BigDecimal locationArea;
    private BigDecimal locationAccessibility;
    private BigDecimal locationEquipment;
    private BigDecimal locationAmbience;
    private BigDecimal locationCleanliness;
    private BigDecimal locationStaff;
    private String locationRatingComments;

    // constructors
    public LocationRating() {
    }

    public LocationRating(Long locationRatingId, Location location, BigDecimal locationAverageRating, BigDecimal locationSize,
            BigDecimal locationArea, BigDecimal locationAccessibility, BigDecimal locationEquipment, BigDecimal locationAmbience,
            BigDecimal locationCleanliness, BigDecimal locationStaff, String locationRatingComments) {
        this.locationRatingId = locationRatingId;
        this.location = location;
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
    public Location getLocation(){
        return location;
    }
    public void setLocation(Location location){
        this.location = location;
    }
    public BigDecimal getLocationAverageRating() {
        return locationAverageRating;
    }
    public void setLocationAverageRating(BigDecimal locationAverageRating) {
        this.locationAverageRating = locationAverageRating;
    }
    public BigDecimal getLocationSize() {
        return locationSize;
    }
    public void setLocationSize(BigDecimal locationSize) {
        this.locationSize = locationSize;
    }
    public BigDecimal getLocationArea() {
        return locationArea;
    }
    public void setLocationArea(BigDecimal locationArea) {
        this.locationArea = locationArea;
    }
    public BigDecimal getLocationAccessibility() {
        return locationAccessibility;
    }
    public void setLocationAccessibility(BigDecimal locationAccessibility) {
        this.locationAccessibility = locationAccessibility;
    }
    public BigDecimal getLocationEquipment() {
        return locationEquipment;
    }
    public void setLocationEquipment(BigDecimal locationEquipment) {
        this.locationEquipment = locationEquipment;
    }
    public BigDecimal getLocationAmbience() {
        return locationAmbience;
    }
    public void setLocationAmbience(BigDecimal locationAmbience) {
        this.locationAmbience = locationAmbience;
    }
    public BigDecimal getLocationCleanliness() {
        return locationCleanliness;
    }
    public void setLocationCleanliness(BigDecimal locationCleanliness) {
        this.locationCleanliness = locationCleanliness;
    }
    public BigDecimal getLocationStaff() {
        return locationStaff;
    }
    public void setLocationStaff(BigDecimal locationStaff) {
        this.locationStaff = locationStaff;
    }
    public String getLocationRatingComments() {
        return locationRatingComments;
    }
    public void setLocationRatingComments(String locationRatingComments) {
        this.locationRatingComments = locationRatingComments;
    }
    }
