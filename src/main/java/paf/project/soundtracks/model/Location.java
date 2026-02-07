package paf.project.soundtracks.model;

import org.checkerframework.checker.units.qual.C;

import jakarta.persistence.*;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long locationId;
    @Column(name = "location_name")
    private String locationName;
    @Column(name = "location_address")
    private String locationAddress;
    @Column(name = "location_postal_code")
    private String locationPostalCode;
    @Column(name = "location_city")
    private String locationCity;
    @Column(name = "location_country")
    private String locationCountry;
    @Column(name = "location_capacity")
    private int locationCapacity;
    @Column(name = "location_description")
    private String locationDescription;

    // constructors
    public Location() {
    }

    public Location(Long locationId) {
        this.locationId = locationId;
    }

    public Location(Long locationId, String locationName, String locationAddress, String locationPostalCode,
            String locationCity, String locationCountry, int locationCapacity, String locationDescription) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.locationAddress = locationAddress;
        this.locationPostalCode = locationPostalCode;
        this.locationCity = locationCity;
        this.locationCountry = locationCountry;
        this.locationCapacity = locationCapacity;
        this.locationDescription = locationDescription;
    }

    // getters and setters
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getLocationPostalCode() {
        return locationPostalCode;
    }

    public void setLocationPostalCode(String locationPostalCode) {
        this.locationPostalCode = locationPostalCode;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    public int getLocationCapacity() {
        return locationCapacity;
    }

    public void setLocationCapacity(int locationCapacity) {
        this.locationCapacity = locationCapacity;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }
}