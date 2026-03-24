package paf.project.soundtracks.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
    @JoinColumn(name = "event_id_event")
    private Event event;

    @Embedded
    private AtmosphereRating atmosphere = new AtmosphereRating();

    @Embedded
    private GastronomyRating gastronomy = new GastronomyRating();

    @Embedded
    private LocationRating location = new LocationRating();

    @OneToMany(mappedBy = "personalEventRating", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<PerformanceRating> performanceRatings = new ArrayList<>();

    @Embedded
    private MerchandiseRating merchandise = new MerchandiseRating();

    @Embedded
    private RestroomRating restroom = new RestroomRating();

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "staffCompetence", column = @Column(name = "security_staff_competence")),
        @AttributeOverride(name = "staffFriendliness", column = @Column(name = "security_staff_friendliness")),
        @AttributeOverride(name = "senseOfSecurity", column = @Column(name = "security_sense_of_security"))        
    })
    private SecurityRating security = new SecurityRating();

    @Embedded
    private SoundRating sound = new SoundRating();

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "wardrobePrice", column = @Column(name = "wardrobe_price")),
        @AttributeOverride(name = "wardrobeStaffEfficiency", column = @Column(name = "wardrobe_staff_efficiency")),
        @AttributeOverride(name = "wardrobeStaffFriendliness", column = @Column(name = "wardrobe_staff_friendliness")),
        @AttributeOverride(name = "wardrobeQuality", column = @Column(name = "wardrobe_quality"))
    })
    private WardrobeRating wardrobe = new WardrobeRating();

    private BigDecimal personalEventAverageRating;

    private String personalEventRatingComments;

    @Column(name = "atmosphere_average_rating")
    private BigDecimal atmosphereAverage;

    @Column(name = "gastronomy_average_rating")
    private BigDecimal gastronomyAverage;

    @Column(name = "location_average_rating")
    private BigDecimal locationAverage;

    @Column(name = "restroom_average_rating")
    private BigDecimal restroomAverage;

    @Column(name = "security_average_rating")
    private BigDecimal securityAverage;

    @Column(name = "sound_average_rating")
    private BigDecimal soundAverage;

    @Column(name = "wardrobe_average_rating")
    private BigDecimal wardrobeAverage;

    @Column(name = "merchandise_average_rating")
    private BigDecimal merchandiseAverage;

    // constructors
    public PersonalEventRating() {
    }  

    public PersonalEventRating(Long personalEventRatingId, Person person, Event event, AtmosphereRating atmosphere, GastronomyRating gastronomy, LocationRating location, MerchandiseRating merchandise, List<PerformanceRating> performanceRatings, RestroomRating restroom, SecurityRating security, SoundRating sound, WardrobeRating wardrobe, BigDecimal personalEventAverageRating, String personalEventRatingComments) {
        this.personalEventRatingId = personalEventRatingId;
        this.person = person;
        this.event = event;
        this.atmosphere = atmosphere;
        this.gastronomy = gastronomy;
        this.location = location;
        this.merchandise = merchandise;
        this.performanceRatings = performanceRatings;
        this.restroom = restroom;
        this.security = security;
        this.sound = sound;
        this.wardrobe = wardrobe;
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
    public Event getEvent() {
        return event;
    }
    public void setEvent(Event event) {
        this.event = event;
    }
    public AtmosphereRating getAtmosphere() {
        if(atmosphere == null) {
            atmosphere = new AtmosphereRating();
        }
        return atmosphere;
    }
    public void setAtmosphere(AtmosphereRating atmosphere) {
        this.atmosphere = atmosphere;
    }
    public GastronomyRating getGastronomy() {
        if(gastronomy == null) {
            gastronomy = new GastronomyRating();
        }
        return gastronomy;
    }
    public void setGastronomy(GastronomyRating gastronomy) {
        this.gastronomy = gastronomy;
    }
    public LocationRating getLocation() {
        if(location == null) {
            location = new LocationRating();
        }
        return location;
    }
    public void setLocation(LocationRating location) {
        this.location = location;
    }
    public MerchandiseRating getMerchandise() {
        if (merchandise == null) {
            merchandise = new MerchandiseRating();
        }
        return merchandise;
    }
    public void setMerchandise(MerchandiseRating merchandise) {
        this.merchandise = merchandise;
    }
    public List<PerformanceRating> getPerformanceRatings() {
        return performanceRatings;
    }
    public void setPerformanceRatings(List<PerformanceRating> performanceRatings) {
        this.performanceRatings = performanceRatings;
    }
    public RestroomRating getRestroom() {
        if(restroom == null) {
            restroom = new RestroomRating();
        }
        return restroom;
    }
    public void setRestroom(RestroomRating restroom) {
        this.restroom = restroom;
    }
    public SecurityRating getSecurity() {
        if(security == null) {
            security = new SecurityRating();
        }
        return security;
    }
    public void setSecurity(SecurityRating security) {
        this.security = security;
    }
    public SoundRating getSound() {
        if(sound == null) {
            sound = new SoundRating();
        }
        return sound;
    }
    public void setSound(SoundRating sound) {
        this.sound = sound;
    }
    public WardrobeRating getWardrobe() {
        if (wardrobe == null) {
            wardrobe = new WardrobeRating();
        }
        return wardrobe;
    }
    public void setWardrobe(WardrobeRating wardrobe) {
        this.wardrobe = wardrobe;
    }
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

    public BigDecimal getAtmosphereAverage() {
        return atmosphereAverage;
    }
    public void setAtmosphereAverage(BigDecimal atmosphereAverage) {
        this.atmosphereAverage = atmosphereAverage;
    }
    public BigDecimal getGastronomyAverage() {
        return gastronomyAverage;
    }
    public void setGastronomyAverage(BigDecimal gastronomyAverage) {
        this.gastronomyAverage = gastronomyAverage;
    }
    public BigDecimal getLocationAverage() {
        return locationAverage;
    }
    public void setLocationAverage(BigDecimal locationAverage) {
        this.locationAverage = locationAverage;
    }
    public BigDecimal getRestroomAverage() {
        return restroomAverage;
    }
    public void setRestroomAverage(BigDecimal restroomAverage) {
        this.restroomAverage = restroomAverage;
    }
    public BigDecimal getSecurityAverage() {
        return securityAverage;
    }
    public void setSecurityAverage(BigDecimal securityAverage) {
        this.securityAverage = securityAverage;
    }
    public BigDecimal getSoundAverage() {
        return soundAverage;
    }
    public void setSoundAverage(BigDecimal soundAverage) {
        this.soundAverage = soundAverage;
    }
    public BigDecimal getWardrobeAverage() {
        return wardrobeAverage;
    }
    public void setWardrobeAverage(BigDecimal wardrobeAverage) {
        this.wardrobeAverage = wardrobeAverage;
    }
    public BigDecimal getMerchandiseAverage() {
        return merchandiseAverage;
    }
    public void setMerchandiseAverage(BigDecimal merchandiseAverage) {
        this.merchandiseAverage = merchandiseAverage;
    }


    // getters for calculated averages (used in observer)
    public BigDecimal getAtmosphereCalculated() {
    return atmosphere != null ? atmosphere.getAverage() : BigDecimal.ZERO;
    }

    public BigDecimal getGastronomyCalculated() {
        return gastronomy != null ? gastronomy.getAverage() : BigDecimal.ZERO;
    }

    public BigDecimal getLocationCalculated() {
        return location != null ? location.getAverage() : BigDecimal.ZERO;
    }

    public BigDecimal getMerchandiseCalculated() {
        return merchandise != null ? merchandise.getAverage() : BigDecimal.ZERO;
    }

    public BigDecimal getRestroomCalculated() {
        return restroom != null ? restroom.getAverage() : BigDecimal.ZERO;
    }

    public BigDecimal getSecurityCalculated() {
        return security != null ? security.getAverage() : BigDecimal.ZERO;
    }

    public BigDecimal getSoundCalculated() {
        return sound != null ? sound.getAverage() : BigDecimal.ZERO;
    }

    public BigDecimal getWardrobeCalculated() {
        return wardrobe != null ? wardrobe.getAverage() : BigDecimal.ZERO;
    }


    // helper method (null handling)
    public void initializeEmbeddeds() {
    //System.out.println("PersonalEventRatingModel CALLED");   
    if (atmosphere == null) atmosphere = new AtmosphereRating();
    if (gastronomy == null) gastronomy = new GastronomyRating();
    if (location == null) location = new LocationRating();
    if (merchandise == null) merchandise = new MerchandiseRating();
    if (restroom == null) restroom = new RestroomRating();
    if (security == null) security = new SecurityRating();
    if (sound == null) sound = new SoundRating();
    if (wardrobe == null) wardrobe = new WardrobeRating();
}

    
}