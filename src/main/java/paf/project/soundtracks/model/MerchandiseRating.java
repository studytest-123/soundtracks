package paf.project.soundtracks.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import jakarta.persistence.*;
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.util.RatingUtils;

/* @Entity
@Table(name = "sound_rating") */
@Embeddable
public class MerchandiseRating {
   /*  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sound_rating_id")
    private Long soundRatingId;

    @OneToOne
    @JoinColumn(name = "personal_event_rating_id_personal_event_rating")
    private Old_PersonalEventRating personalEventRating;

    @Column(name = "sound_average_rating")
    private BigDecimal soundAverageRating; */
    //@Column(name = "sound_overall_quality")
    private BigDecimal merchandiseOverallQuality;
    //@Column(name = "sound_loudness")
    private BigDecimal merchandiseVariety;
    //@Column(name = "sound_technical_issues")
    private BigDecimal merchandisePrices;
    //@Column(name = "sound_room_acoustics")
    private BigDecimal merchandiseStaffEfficiency;

    private BigDecimal merchandisePaymentMethods;
    private BigDecimal merchandiseAvailability;
    //@Column(name = "sound_rating_comments")
    //private String soundRatingComments;

    // constructors
    public MerchandiseRating() {
    }

    public MerchandiseRating(BigDecimal merchandiseOverallQuality,
                       BigDecimal merchandiseVariety, BigDecimal merchandisePrices, BigDecimal merchandiseStaffEfficiency, BigDecimal merchandisePaymentMethods, BigDecimal merchandiseAvailability) {
        /* this.merchandiseRatingId = merchandiseRatingId;
        this.personalEventRating = personalEventRating;
        this.merchandiseAverageRating = merchandiseAverageRating; */
        this.merchandiseOverallQuality = merchandiseOverallQuality;
        this.merchandiseVariety = merchandiseVariety;
        this.merchandisePrices = merchandisePrices;
        this.merchandiseStaffEfficiency = merchandiseStaffEfficiency;
        this.merchandisePaymentMethods = merchandisePaymentMethods;
        this.merchandiseAvailability = merchandiseAvailability;

        /* this.merchandiseRatingComments = merchandiseRatingComments; */
    }

    // getters and setters
    
    /* public Long getSoundRatingId() {
        return soundRatingId;
    }
    public void setSoundRatingId(Long soundRatingId) {
        this.soundRatingId = soundRatingId;
    }
    public Old_PersonalEventRating getPersonalEventRating() {
        return personalEventRating;
    }
    public void setPersonalEventRating(Old_PersonalEventRating personalEventRating) {
        this.personalEventRating = personalEventRating;
    }
    public BigDecimal getSoundAverageRating() {
        return soundAverageRating;
    }
    public void setSoundAverageRating(BigDecimal soundAverageRating) {
        this.soundAverageRating = soundAverageRating;
    } */
    public BigDecimal getMerchandiseOverallQuality() {
        return merchandiseOverallQuality;
    }
    public void setMerchandiseOverallQuality(BigDecimal merchandiseOverallQuality) {
        this.merchandiseOverallQuality = merchandiseOverallQuality;
    }
    public BigDecimal getMerchandiseVariety() {
        return merchandiseVariety;
    }
    public void setMerchandiseVariety(BigDecimal merchandiseVariety) {
        this.merchandiseVariety = merchandiseVariety;
    }
    public BigDecimal getMerchandisePrices() {
        return merchandisePrices;
    }
    public void setMerchandisePrices(BigDecimal merchandisePrices) {
        this.merchandisePrices = merchandisePrices;
    }
    public BigDecimal getMerchandiseStaffEfficiency() {
        return merchandiseStaffEfficiency;
    }
    public void setMerchandiseStaffEfficiency(BigDecimal merchandiseStaffEfficiency) {
        this.merchandiseStaffEfficiency = merchandiseStaffEfficiency;
    }
    public BigDecimal getMerchandisePaymentMethods() {
        return merchandisePaymentMethods;
    }
    public void setMerchandisePaymentMethods(BigDecimal merchandisePaymentMethods) {
        this.merchandisePaymentMethods = merchandisePaymentMethods;
    }
    public BigDecimal getMerchandiseAvailability() {
        return merchandiseAvailability;
    }
    public void setMerchandiseAvailability(BigDecimal merchandiseAvailability) {
        this.merchandiseAvailability = merchandiseAvailability;
    }
    /* public String getSoundRatingComments() {
        return soundRatingComments;
    }
    public void setSoundRatingComments(String soundRatingComments) {
        this.soundRatingComments = soundRatingComments;
    } */


    // domain-logic methods
    public BigDecimal getAverage() {
        return RatingUtils.average(
            merchandiseOverallQuality,
            merchandiseVariety,
            merchandisePrices,
            merchandiseStaffEfficiency,
            merchandisePaymentMethods,
            merchandiseAvailability
        );
    }
    
    /* public BigDecimal getAverage() {
        BigDecimal sum = BigDecimal.ZERO;
        int count = 0;

        if (soundOverallQuality != null) {
            sum = sum.add(soundOverallQuality);
            count++;
        }
        if (soundLoudness != null) {
            sum = sum.add(soundLoudness);
            count++;
        }
        if (soundTechnicalIssues != null) {
            sum = sum.add(soundTechnicalIssues);
            count++;
        }
        if (soundRoomAcoustics != null) {
            sum = sum.add(soundRoomAcoustics);
            count++;
        }

        return count > 0 ? sum.divide(BigDecimal.valueOf(count), 1, RoundingMode.HALF_UP) : BigDecimal.ZERO;
    } */    
}
