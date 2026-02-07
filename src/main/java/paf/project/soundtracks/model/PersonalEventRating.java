package paf.project.soundtracks.model;

import java.math.BigDecimal;

import org.checkerframework.checker.units.qual.C;

import jakarta.persistence.*;

@Entity
@Table(name = "personal_event_rating")
public class PersonalEventRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personal_event_rating_id")
    private Long personalEventRatingId;
    @ManyToOne
    @JoinColumn(name = "person_id_person")
    private Person person;
    @ManyToOne
    @JoinColumn(name = "event_rating_id_event_rating")
    private EventRating eventRating;
    /* 
    @Column(name = "atmosphere_rating_id_atmosphere_rating")
    private AtmosphereRating atmosphereRating;
    @Column(name = "gastronomy_rating_id_gastronomy_rating")
    private GastronomyRating gastronomyRating;
    @Column(name = "location_rating_id_location_rating")
    private LocationRating locationRating;
    @Column(name = "performance_rating_id_performance_rating")
    private PerformanceRating performanceRating;
    @Column(name = "restroom_rating_id_restroom_rating")
    private RestroomRating restroomRating;
    @Column(name = "security_rating_id_security_rating")
    private SecurityRating securityRating;
    @Column(name = "sound_rating_id_sound_rating")
    private SoundRating soundRating;
    @Column(name = "wardrobe_rating_id_wardrobe_rating")
    private WardrobeRating wardrobeRating;
 */
    /* private AtmosphereRating atmosphereRating;
    private GastronomyRating gastronomyRating;
    private LocationRating locationRating;
    private PerformanceRating performanceRating;
    private RestroomRating restroomRating;
    private SecurityRating securityRating;
    private SoundRating soundRating;
    private WardrobeRating wardrobeRating; */

    private BigDecimal personalEventAverageRating;
    private String personalEventRatingComments;

    // constructors
    public PersonalEventRating() {
    }  
/*     public PersonalEventRating(Long personalEventRatingId, Person person, EventRating eventRating, AtmosphereRating atmosphereRating,
            GastronomyRating gastronomyRating, LocationRating locationRating, PerformanceRating performanceRating,
            RestroomRating restroomRating, SecurityRating securityRating, SoundRating soundRating,
            WardrobeRating wardrobeRating, BigDecimal personalEventAverageRating, String personalEventRatingComments) { */
    public PersonalEventRating(Long personalEventRatingId, Person person, EventRating eventRating, BigDecimal personalEventAverageRating, String personalEventRatingComments) {
        this.personalEventRatingId = personalEventRatingId;
        this.person = person;
        this.eventRating = eventRating;
        /* this.atmosphereRating = atmosphereRating;
        this.gastronomyRating = gastronomyRating;
        this.locationRating = locationRating;
        this.performanceRating = performanceRating;
        this.restroomRating = restroomRating;
        this.securityRating = securityRating;
        this.soundRating = soundRating;
        this.wardrobeRating = wardrobeRating; */
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
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public EventRating getEventRating() {
        return eventRating;
    }
    public void setEventRating(EventRating eventRating) {
        this.eventRating = eventRating;
    }
    /* 
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
        this.locationRatingId = locationRatingId;
    } */
    public BigDecimal getPersonalEventAverageRating() {
        return personalEventAverageRating;
    }
    public void setPersonalEventAverageRating(BigDecimal personalEventAverageRating) {
        this.personalEventAverageRating = personalEventAverageRating;
    }
    public String getPersonalEventRatingComments() {
        return personalEventRatingComments;
    }
    public void setPersonalEventRatingComments(String personalEventRatingComments) {
        this.personalEventRatingComments = personalEventRatingComments;
    }
}