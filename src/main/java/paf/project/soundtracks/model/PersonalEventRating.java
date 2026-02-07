package paf.project.soundtracks.model;

public class PersonalEventRating {
    private Long personalEventRatingId;
    private Long personId;
    private Long eventRatingId;
    private Long atmosphereRatingId;
    private Long gastronomyRatingId;
    private Long locationRatingId;
    private Long performanceRatingId;
    private Long restroomRatingId;
    private Long securityRatingId;
    private Long soundRatingId;
    private Long wardrobeRatingId;

    /* private AtmosphereRating atmosphereRating;
    private GastronomyRating gastronomyRating;
    private LocationRating locationRating;
    private PerformanceRating performanceRating;
    private RestroomRating restroomRating;
    private SecurityRating securityRating;
    private SoundRating soundRating;
    private WardrobeRating wardrobeRating; */

    private double personalEventAverageRating;
    private String personalEventRatingComments;

    // constructors
    public PersonalEventRating() {
    }  
    public PersonalEventRating(Long personalEventRatingId, Long personId, Long eventRatingId, Long atmosphereRatingId,
            Long gastronomyRatingId, Long locationRatingId, Long performanceRatingId,
            Long restroomRatingId, Long securityRatingId, Long soundRatingId,
            Long wardrobeRatingId, double personalEventAverageRating, String personalEventRatingComments) {
        this.personalEventRatingId = personalEventRatingId;
        this.personId = personId;
        this.eventRatingId = eventRatingId;
        this.atmosphereRatingId = atmosphereRatingId;
        this.gastronomyRatingId = gastronomyRatingId;
        this.locationRatingId = locationRatingId;
        this.performanceRatingId = performanceRatingId;
        this.restroomRatingId = restroomRatingId;
        this.securityRatingId = securityRatingId;
        this.soundRatingId = soundRatingId;
        this.wardrobeRatingId = wardrobeRatingId;
        this.personalEventAverageRating = personalEventAverageRating;
        this.personalEventRatingComments = personalEventRatingComments;
    }

    // getters and setters
    public Long getPersonalEventRatingId() {
        return personalEventRatingId;
    }
    public void setPersonalEventRatingId(Long personalEventRatingId) {
        this.personalEventRatingId = personalEventRatingId;
    }
    public Long getPersonId() {
        return personId;
    }
    public void setPersonId(Long personId) {
        this.personId = personId;
    }
    public Long getEventRatingId() {
        return eventRatingId;
    }
    public void setEventRatingId(Long eventRatingId) {
        this.eventRatingId = eventRatingId;
    }
    public Long getAtmosphereRatingId() {
        return atmosphereRatingId;
    }
    public void setAtmosphereRatingId(Long atmosphereRatingId) {
        this.atmosphereRatingId = atmosphereRatingId;
    }
    public Long getGastronomyRatingId() {
        return gastronomyRatingId;
    }
    public void setGastronomyRatingId(Long gastronomyRatingId) {
        this.gastronomyRatingId = gastronomyRatingId;
    }
    public Long getLocationRatingId() {
        return locationRatingId;
    }
    public void setLocationRatingId(Long locationRatingId) {
        this.locationRatingId = locationRatingId;
    }
    public Long getPerformanceRatingId() {
        return performanceRatingId;
    }
    public void setPerformanceRatingId(Long performanceRatingId) {
        this.performanceRatingId = performanceRatingId;
    }
    public Long getRestroomRatingId() {
        return restroomRatingId;
    }
    public void setRestroomRatingId(Long restroomRatingId) {
        this.restroomRatingId = restroomRatingId;
    }
    public Long getSecurityRatingId() {
        return securityRatingId;
    }
    public void setSecurityRatingId(Long securityRatingId) {
        this.securityRatingId = securityRatingId;
    }
    public Long getSoundRatingId() {
        return soundRatingId;
    }
    public void setSoundRatingId(Long soundRatingId) {
        this.soundRatingId = soundRatingId;
    }
    public Long getWardrobeRatingId() {
        return wardrobeRatingId;
    }
    public void setWardrobeRatingId(Long wardrobeRatingId) {
        this.wardrobeRatingId = wardrobeRatingId;
    }
    public double getPersonalEventAverageRating() {
        return personalEventAverageRating;
    }
    public void setPersonalEventAverageRating(double eventAverageRating) {
        this.personalEventAverageRating = eventAverageRating;
    }
    public String getPersonalEventRatingComments() {
        return personalEventRatingComments;
    }
    public void setPersonalEventRatingComments(String personalEventRatingComments) {
        this.personalEventRatingComments = personalEventRatingComments;
    }
}