package paf.project.soundtracks.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import jakarta.persistence.*;
//import paf.project.soundtracks.model.backup.Old_PersonalEventRating;
import paf.project.soundtracks.util.RatingUtils;

/* @Entity
@Table(name = "location_rating") */
@Embeddable
public class LocationRating {
   /*  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_rating_id")
    private Long locationRatingId;

    @ManyToOne
    @JoinColumn(name = "location_id_location")
    private Location location;    
    
    @ManyToOne
    @JoinColumn(name = "personal_event_rating_id_personal_event_rating")
    private Old_PersonalEventRating personalEventRating; */


    //private BigDecimal locationAverageRating;
    //@Column(name = "location_size")
    private BigDecimal locationSize;
    //@Column(name = "location_area")
    private BigDecimal locationArea;
    //@Column(name = "location_accessibility")
    private BigDecimal locationAccessibility;
    //@Column(name = "location_equipment")
    private BigDecimal locationEquipment;
    //@Column(name = "location_ambience")
    private BigDecimal locationAmbience;
    //@Column(name = "location_cleanliness")
    private BigDecimal locationCleanliness;
    //@Column(name = "location_staff")
    private BigDecimal locationStaff;
    //private String locationRatingComments;

    // constructors
    public LocationRating() {
    }

    public LocationRating(BigDecimal locationSize,
            BigDecimal locationArea, BigDecimal locationAccessibility, BigDecimal locationEquipment, BigDecimal locationAmbience,
            BigDecimal locationCleanliness, BigDecimal locationStaff) {
        /* this.locationRatingId = locationRatingId;
        this.location = location; */
        /* this.locationAverageRating = locationAverageRating; */
        this.locationSize = locationSize;
        this.locationArea = locationArea;
        this.locationAccessibility = locationAccessibility;
        this.locationEquipment = locationEquipment;
        this.locationAmbience = locationAmbience;
        this.locationCleanliness = locationCleanliness;
        this.locationStaff = locationStaff;
        /* this.locationRatingComments = locationRatingComments; */
    }

    // getters and setters

    /* public Long getLocationRatingId() {
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
    } */

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
    /* public String getLocationRatingComments() {
        return locationRatingComments;
    }
    public void setLocationRatingComments(String locationRatingComments) {
        this.locationRatingComments = locationRatingComments;
    } */
    
    // domain-logic methods
    public BigDecimal getAverage() {
        return RatingUtils.average(
            locationSize,
            locationArea,
            locationAccessibility,
            locationEquipment,
            locationAmbience,
            locationCleanliness,
            locationStaff
        );
    }
        //public BigDecimal getAverage() {
        /* if (locationSize == null || locationArea == null || locationAccessibility == null || locationEquipment == null ||
            locationAmbience == null || locationCleanliness == null || locationStaff == null) 
            {
                return BigDecimal.ZERO;
            } */
        /* BigDecimal sum = BigDecimal.ZERO;
        int count = 0;

        if (locationSize != null) {
            sum = sum.add(locationSize);
            count++;
        }
        if (locationArea != null) {
            sum = sum.add(locationArea);
            count++;
        }
        if (locationAccessibility != null) {
            sum = sum.add(locationAccessibility);
            count++;
        }
        if (locationEquipment != null) {
            sum = sum.add(locationEquipment);
            count++;
        }
        if (locationAmbience != null) {
            sum = sum.add(locationAmbience);
            count++;
        }
        if (locationCleanliness != null) {
            sum = sum.add(locationCleanliness);
            count++;
        }
        if (locationStaff != null) {
            sum = sum.add(locationStaff);
            count++;
        }
        return count > 0 ? sum.divide(BigDecimal.valueOf(count), 1, RoundingMode.HALF_UP) : BigDecimal.ZERO;
    } */
}
