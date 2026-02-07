package paf.project.soundtracks.model;

public class Location {
    private Long locationId;
    private String locationName;
    private String locationAddress;
    private String locationPostalCode;
    private String locationCity;
    private String locationCountry;
    private int locationCapacity;
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