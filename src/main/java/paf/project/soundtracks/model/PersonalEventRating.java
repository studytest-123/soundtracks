package paf.project.soundtracks.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import paf.project.soundtracks.model.GastronomyRating;
import paf.project.soundtracks.model.LocationRating;
import paf.project.soundtracks.model.PerformanceRating;
import paf.project.soundtracks.model.RestroomRating;
import paf.project.soundtracks.model.SecurityRating;
import paf.project.soundtracks.model.SoundRating;
import paf.project.soundtracks.model.WardrobeRating;

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
    @ManyToOne
    @JoinColumn(name = "event_id_event")
    private Event event;

    @Embedded
    private AtmosphereRating atmosphere = new AtmosphereRating();

    @Embedded
    private GastronomyRating gastronomy = new GastronomyRating();

    @Embedded
    private LocationRating location = new LocationRating();

    @OneToMany(mappedBy = "personalEventRating", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PerformanceRating> performanceRatings = new ArrayList<>();
    //private BigDecimal performanceRating;

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

    /* this.wardrobePrice = wardrobePrice;
        this.wardrobeStaffEfficiency = wardrobeStaffEfficiency;
        this.wardrobeStaffFriendliness = wardrobeStaffFriendliness;
        this.wardrobeQuality = wardrobeQuality; */
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

    // constructors
    public PersonalEventRating() {
    }  

    public PersonalEventRating(Long personalEventRatingId, Person person, EventRating eventRating, Event event, AtmosphereRating atmosphere, GastronomyRating gastronomy, LocationRating location, List<PerformanceRating> performanceRatings, RestroomRating restroom, SecurityRating security, SoundRating sound, WardrobeRating wardrobe, BigDecimal personalEventAverageRating, String personalEventRatingComments) {
        this.personalEventRatingId = personalEventRatingId;
        this.person = person;
        this.eventRating = eventRating;
        this.event = event;
        this.atmosphere = atmosphere;
        this.gastronomy = gastronomy;
        this.location = location;
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
    public EventRating getEventRating() {
        return eventRating;
    }
    public void setEventRating(EventRating eventRating) {
        this.eventRating = eventRating;
    }
    public Event getEvent() {
        return event;
    }
    public void setEvent(Event event) {
        this.event = event;
    }
    public AtmosphereRating getAtmosphere() {
        return atmosphere;
    }
    public void setAtmosphere(AtmosphereRating atmosphere) {
        this.atmosphere = atmosphere;
    }
    public GastronomyRating getGastronomy() {
        return gastronomy;
    }
    public void setGastronomy(GastronomyRating gastronomy) {
        this.gastronomy = gastronomy;
    }
    public LocationRating getLocation() {
        return location;
    }
    public void setLocation(LocationRating location) {
        this.location = location;
    }
    public List<PerformanceRating> getPerformanceRatings() {
        return performanceRatings;
    }
    public void setPerformanceRatings(List<PerformanceRating> performanceRatings) {
        this.performanceRatings = performanceRatings;
    }
    public RestroomRating getRestroom() {
        return restroom;
    }
    public void setRestroom(RestroomRating restroom) {
        this.restroom = restroom;
    }
    public SecurityRating getSecurity() {
        return security;
    }
    public void setSecurity(SecurityRating security) {
        this.security = security;
    }
    public SoundRating getSound() {
        return sound;
    }
    public void setSound(SoundRating sound) {
        this.sound = sound;
    }
    public WardrobeRating getWardrobe() {
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


    // method to calculate average rating based on individual ratings
   /*  public void calculateOverallRating() {
        BigDecimal sum =
                atmosphere.getAverage()
                .add(gastronomy.getAverage())
                .add(location.getAverage())
                .add(restroom.getAverage())
                .add(security.getAverage())
                .add(sound.getAverage())
                .add(wardrobe.getAverage());

                int divisor = 7; // Start with 7 for the fixed ratings

                // Include performance average if present
        if (performanceRatings != null && !performanceRatings.isEmpty()) {
            BigDecimal performanceAvg = performanceRatings.stream()
                    .map(PerformanceRating::getAverage)
                    .reduce(BigDecimal.ZERO, BigDecimal::add)
                    .divide(BigDecimal.valueOf(performanceRatings.size()),
                            2,
                            RoundingMode.HALF_UP);

            sum = sum.add(performanceAvg);
            divisor++; // Increment divisor for the performance rating
        }

            this.personalEventAverageRating =
                    sum.divide(BigDecimal.valueOf(divisor), 2, RoundingMode.HALF_UP);
        } */ /* else {
            this.personalEventAverageRating =
                    sum.divide(BigDecimal.valueOf(5), 2, RoundingMode.HALF_UP);
        }

        this.personalEventAverageRating = sum.divide(BigDecimal.valueOf(8), 1, RoundingMode.HALF_UP);
    }
 */
    /* public void calculatePersonalEventAverageRating() {
        BigDecimal totalRating = BigDecimal.ZERO;
        int ratingCount = 0;

        if (atmosphereRating != null) {
            totalRating = totalRating.add(atmosphereRating);
            ratingCount++;
        }
        if (gastronomyRating != null) {
            totalRating = totalRating.add(gastronomyRating);
            ratingCount++;
        }
        if (locationRating != null) {
            totalRating = totalRating.add(locationRating);
            ratingCount++;
        }
        if (performanceRating != null) {
            totalRating = totalRating.add(performanceRating);
            ratingCount++;
        }
        if (restroomRating != null) {
            totalRating = totalRating.add(restroomRating);
            ratingCount++;
        }
        if (securityRating != null) {
            totalRating = totalRating.add(securityRating);
            ratingCount++;
        }
        if (soundRating != null) {
            totalRating = totalRating.add(soundRating);
            ratingCount++;
        }
        if (wardrobeRating != null) {
            totalRating = totalRating.add(wardrobeRating);
            ratingCount++;
        }

        if (ratingCount > 0) {
            this.personalEventAverageRating = totalRating.divide(BigDecimal.valueOf(ratingCount), 2, RoundingMode.HALF_UP);
        } else {
            this.personalEventAverageRating = BigDecimal.ZERO;
        }
    } */

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
    
}