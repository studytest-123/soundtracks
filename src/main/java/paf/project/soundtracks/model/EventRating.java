package paf.project.soundtracks.model;

public class EventRating {
    private Long eventRatingId;
    private Long eventId;

    private double eventAverageRating;
    private double atmosphereAverageRating;
    private double gastronomyAverageRating;
    private double locationAverageRating;
    private double performanceAverageRating;
    private double restroomAverageRating;
    private double securityAverageRating;
    private double soundAverageRating;
    private double wardrobeAverageRating;

    

    // constructors
    public EventRating() {
    }  
    public EventRating(Long eventRatingId, Long eventId, double atmosphereAverageRating,
            double gastronomyAverageRating, double locationAverageRating, double performanceAverageRating,
            double restroomAverageRating, double securityAverageRating, double soundAverageRating,
            double wardrobeAverageRating, double eventAverageRating) {
        this.eventRatingId = eventRatingId;
        this.eventId = eventId;
        this.atmosphereAverageRating = atmosphereAverageRating;
        this.gastronomyAverageRating = gastronomyAverageRating;
        this.locationAverageRating = locationAverageRating;
        this.performanceAverageRating = performanceAverageRating;
        this.restroomAverageRating = restroomAverageRating;
        this.securityAverageRating = securityAverageRating;
        this.soundAverageRating = soundAverageRating;
        this.wardrobeAverageRating = wardrobeAverageRating;
        this.eventAverageRating = eventAverageRating;
    }

    // getters and setters
    public Long getEventRatingId() {
        return eventRatingId;
    }
    public void setEventRatingId(Long eventRatingId) {
        this.eventRatingId = eventRatingId;
    }
    public Long getEventId() {
        return eventId;
    }
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
    public double getAtmosphereAverageRating() {
        return atmosphereAverageRating;
    }
    public void setAtmosphereAverageRating(double atmosphereAverageRating) {
        this.atmosphereAverageRating = atmosphereAverageRating;
    }
    public double getGastronomyAverageRating() {
        return gastronomyAverageRating;
    }
    public void setGastronomyAverageRating(double gastronomyAverageRating) {
        this.gastronomyAverageRating = gastronomyAverageRating;
    }
    public double getLocationAverageRating() {
        return locationAverageRating;
    }
    public void setLocationAverageRating(double locationAverageRating) {
        this.locationAverageRating = locationAverageRating;
    }
    public double getPerformanceAverageRating() {
        return performanceAverageRating;
    }
    public void setPerformanceAverageRating(double performanceAverageRating) {
        this.performanceAverageRating = performanceAverageRating;
    }
    public double getRestroomAverageRating() {
        return restroomAverageRating;
    }
    public void setRestroomAverageRating(double restroomAverageRating) {
        this.restroomAverageRating = restroomAverageRating;
    }
    public double getSecurityAverageRating() {
        return securityAverageRating;
    }
    public void setSecurityAverageRating(double securityAverageRating) {
        this.securityAverageRating = securityAverageRating;
    }
    public double getSoundAverageRating() {
        return soundAverageRating;
    }
    public void setSoundAverageRating(double soundAverageRating) {
        this.soundAverageRating = soundAverageRating;
    }
    public double getWardrobeAverageRating() {
        return wardrobeAverageRating;
    }
    public void setWardrobeAverageRating(double wardrobeAverageRating) {
        this.wardrobeAverageRating = wardrobeAverageRating;
    }
    public double getEventAverageRating() {
        return eventAverageRating;
    }
    public void setEventAverageRating(double eventAverageRating) {
        this.eventAverageRating = eventAverageRating;
    }
}