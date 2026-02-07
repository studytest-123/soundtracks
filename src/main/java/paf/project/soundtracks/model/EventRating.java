package paf.project.soundtracks.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "event_rating")
public class EventRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_rating_id")
    private Long eventRatingId;
    @OneToOne
    @JoinColumn(name = "event_id_event")
    private Event event;

    private BigDecimal eventAverageRating;
    private BigDecimal atmosphereAverageRating;
    private BigDecimal gastronomyAverageRating;
    private BigDecimal locationAverageRating;
    private BigDecimal performanceAverageRating;
    private BigDecimal restroomAverageRating;
    private BigDecimal securityAverageRating;
    private BigDecimal soundAverageRating;
    private BigDecimal wardrobeAverageRating;

    

    // constructors
    public EventRating() {
    }  
    public EventRating(Long eventRatingId, Event event, BigDecimal atmosphereAverageRating,
            BigDecimal gastronomyAverageRating, BigDecimal locationAverageRating, BigDecimal performanceAverageRating,
            BigDecimal restroomAverageRating, BigDecimal securityAverageRating, BigDecimal soundAverageRating,
            BigDecimal wardrobeAverageRating, BigDecimal eventAverageRating) {
        this.eventRatingId = eventRatingId;
        this.event = event;
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
    public Event getEvent() {
        return event;
    }
    public void setEvent(Event event) {
        this.event = event;
    }
    public BigDecimal getAtmosphereAverageRating() {
        return atmosphereAverageRating;
    }
    public void setAtmosphereAverageRating(BigDecimal atmosphereAverageRating) {
        this.atmosphereAverageRating = atmosphereAverageRating;
    }
    public BigDecimal getGastronomyAverageRating() {
        return gastronomyAverageRating;
    }
    public void setGastronomyAverageRating(BigDecimal gastronomyAverageRating) {
        this.gastronomyAverageRating = gastronomyAverageRating;
    }
    public BigDecimal getLocationAverageRating() {
        return locationAverageRating;
    }
    public void setLocationAverageRating(BigDecimal locationAverageRating) {
        this.locationAverageRating = locationAverageRating;
    }
    public BigDecimal getPerformanceAverageRating() {
        return performanceAverageRating;
    }
    public void setPerformanceAverageRating(BigDecimal performanceAverageRating) {
        this.performanceAverageRating = performanceAverageRating;
    }
    public BigDecimal getRestroomAverageRating() {
        return restroomAverageRating;
    }
    public void setRestroomAverageRating(BigDecimal restroomAverageRating) {
        this.restroomAverageRating = restroomAverageRating;
    }
    public BigDecimal getSecurityAverageRating() {
        return securityAverageRating;
    }
    public void setSecurityAverageRating(BigDecimal securityAverageRating) {
        this.securityAverageRating = securityAverageRating;
    }
    public BigDecimal getSoundAverageRating() {
        return soundAverageRating;
    }
    public void setSoundAverageRating(BigDecimal soundAverageRating) {
        this.soundAverageRating = soundAverageRating;
    }
    public BigDecimal getWardrobeAverageRating() {
        return wardrobeAverageRating;
    }
    public void setWardrobeAverageRating(BigDecimal wardrobeAverageRating) {
        this.wardrobeAverageRating = wardrobeAverageRating;
    }
    public BigDecimal getEventAverageRating() {
        return eventAverageRating;
    }
    public void setEventAverageRating(BigDecimal eventAverageRating) {
        this.eventAverageRating = eventAverageRating;
    }
}