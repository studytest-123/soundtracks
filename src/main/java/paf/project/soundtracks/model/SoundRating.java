package paf.project.soundtracks.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import jakarta.persistence.*;
import paf.project.soundtracks.model.PersonalEventRating;

/* @Entity
@Table(name = "sound_rating") */
@Embeddable
public class SoundRating {
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
    private BigDecimal soundOverallQuality;
    //@Column(name = "sound_loudness")
    private BigDecimal soundLoudness;
    //@Column(name = "sound_technical_issues")
    private BigDecimal soundTechnicalIssues;
    //@Column(name = "sound_room_acoustics")
    private BigDecimal soundRoomAcoustics;
    //@Column(name = "sound_rating_comments")
    //private String soundRatingComments;

    // constructors
    public SoundRating() {
    }

    public SoundRating(BigDecimal soundOverallQuality,
                       BigDecimal soundLoudness, BigDecimal soundTechnicalIssues, BigDecimal soundRoomAcoustics) {
        /* this.soundRatingId = soundRatingId;
        this.personalEventRating = personalEventRating;
        this.soundAverageRating = soundAverageRating; */
        this.soundOverallQuality = soundOverallQuality;
        this.soundLoudness = soundLoudness;
        this.soundTechnicalIssues = soundTechnicalIssues;
        this.soundRoomAcoustics = soundRoomAcoustics;
        /* this.soundRatingComments = soundRatingComments; */
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
    public BigDecimal getSoundOverallQuality() {
        return soundOverallQuality;
    }
    public void setSoundOverallQuality(BigDecimal soundOverallQuality) {
        this.soundOverallQuality = soundOverallQuality;
    }
    public BigDecimal getSoundLoudness() {
        return soundLoudness;
    }
    public void setSoundLoudness(BigDecimal soundLoudness) {
        this.soundLoudness = soundLoudness;
    }
    public BigDecimal getSoundTechnicalIssues() {
        return soundTechnicalIssues;
    }
    public void setSoundTechnicalIssues(BigDecimal soundTechnicalIssues) {
        this.soundTechnicalIssues = soundTechnicalIssues;
    }
    public BigDecimal getSoundRoomAcoustics() {
        return soundRoomAcoustics;
    }
    public void setSoundRoomAcoustics(BigDecimal soundRoomAcoustics) {
        this.soundRoomAcoustics = soundRoomAcoustics;
    }
    /* public String getSoundRatingComments() {
        return soundRatingComments;
    }
    public void setSoundRatingComments(String soundRatingComments) {
        this.soundRatingComments = soundRatingComments;
    } */

    public BigDecimal getAverage() {
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
    }    
}
