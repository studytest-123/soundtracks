package paf.project.soundtracks.model;

import java.math.BigDecimal;
import jakarta.persistence.*;
import paf.project.soundtracks.util.RatingUtils;

@Embeddable
public class LocationRating {
   
    private BigDecimal locationSize;
    private BigDecimal locationArea;
    private BigDecimal locationAccessibility;
    private BigDecimal locationEquipment;
    private BigDecimal locationAmbience;
    private BigDecimal locationCleanliness;
    private BigDecimal locationStaff;

    // constructors
    public LocationRating() {
    }

    public LocationRating(BigDecimal locationSize,
            BigDecimal locationArea, BigDecimal locationAccessibility, BigDecimal locationEquipment, BigDecimal locationAmbience,
            BigDecimal locationCleanliness, BigDecimal locationStaff) {
        this.locationSize = locationSize;
        this.locationArea = locationArea;
        this.locationAccessibility = locationAccessibility;
        this.locationEquipment = locationEquipment;
        this.locationAmbience = locationAmbience;
        this.locationCleanliness = locationCleanliness;
        this.locationStaff = locationStaff;
    }

    // getters and setters
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
}
