package paf.project.soundtracks.model;

public class PersonalEventRating {
    private Long personalEventRatingId;
    private Long eventId;

    private AtmosphereRating atmosphereRating;
    private GastronomyRating gastronomyRating;
    private LocationRating locationRating;
    private PerformanceRating performanceRating;
    private RestroomRating restroomRating;
    private SecurityRating securityRating;
    private SoundRating soundRating;
    private WardrobeRating wardrobeRating;

    private double eventAverageRating;
    private String personalEventRatingComments;

    // constructors
    public PersonalEventRating() {
    }  
    public PersonalEventRating(Long personalEventRatingId, Long eventId, AtmosphereRating atmosphereRating,
            GastronomyRating gastronomyRating, LocationRating locationRating, PerformanceRating performanceRating,
            RestroomRating restroomRating, SecurityRating securityRating, SoundRating soundRating,
            WardrobeRating wardrobeRating, double eventAverageRating, String personalEventRatingComments) {
        this.personalEventRatingId = personalEventRatingId;
        this.eventId = eventId;
        this.atmosphereRating = atmosphereRating;
        this.gastronomyRating = gastronomyRating;
        this.locationRating = locationRating;
        this.performanceRating = performanceRating;
        this.restroomRating = restroomRating;
        this.securityRating = securityRating;
        this.soundRating = soundRating;
        this.wardrobeRating = wardrobeRating;
        this.eventAverageRating = eventAverageRating;
        this.personalEventRatingComments = personalEventRatingComments;
    }

    // getters and setters
    public Long getPersonalEventRatingId() {
        return personalEventRatingId;
    }
    public void setPersonalEventRatingId(Long personalEventRatingId) {
        this.personalEventRatingId = personalEventRatingId;
    }
    public Long getEventId() {
        return eventId;
    }
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
    public AtmosphereRating getAtmosphereRating() {
        return atmosphereRating;
    }
    public void setAtmosphereRating(AtmosphereRating atmosphereRating) {
        this.atmosphereRating = atmosphereRating;
    }
    public GastronomyRating getGastronomyRating() {
        return gastronomyRating;
    }
    public void setGastronomyRating(GastronomyRating gastronomyRating) {
        this.gastronomyRating = gastronomyRating;
    }
    public LocationRating getLocationRating() {
        return locationRating;
    }
    public void setLocationRating(LocationRating locationRating) {
        this.locationRating = locationRating;
    }
    public PerformanceRating getPerformanceRating() {
        return performanceRating;
    }
    public void setPerformanceRating(PerformanceRating performanceRating) {
        this.performanceRating = performanceRating;
    }
    public RestroomRating getRestroomRating() {
        return restroomRating;
    }
    public void setRestroomRating(RestroomRating restroomRating) {
        this.restroomRating = restroomRating;
    }
    public SecurityRating getSecurityRating() {
        return securityRating;
    }
    public void setSecurityRating(SecurityRating securityRating) {
        this.securityRating = securityRating;
    }
    public SoundRating getSoundRating() {
        return soundRating;
    }
    public void setSoundRating(SoundRating soundRating) {
        this.soundRating = soundRating;
    }
    public WardrobeRating getWardrobeRating() {
        return wardrobeRating;
    }
    public void setWardrobeRating(WardrobeRating wardrobeRating) {
        this.wardrobeRating = wardrobeRating;
    }
    public double getEventAverageRating() {
        return eventAverageRating;
    }
    public void setEventAverageRating(double eventAverageRating) {
        this.eventAverageRating = eventAverageRating;
    }
    public String getPersonalEventRatingComments() {
        return personalEventRatingComments;
    }
    public void setPersonalEventRatingComments(String personalEventRatingComments) {
        this.personalEventRatingComments = personalEventRatingComments;
    }
}