package paf.project.soundtracks.model;

import java.math.BigDecimal;
import jakarta.persistence.*;
import paf.project.soundtracks.util.RatingUtils;

@Embeddable
public class SoundRating {
   
    private BigDecimal soundOverallQuality;
    private BigDecimal soundLoudness;
    private BigDecimal soundTechnicalIssues;
    private BigDecimal soundRoomAcoustics;

    // constructors
    public SoundRating() {
    }

    public SoundRating(BigDecimal soundOverallQuality,
                       BigDecimal soundLoudness, BigDecimal soundTechnicalIssues, BigDecimal soundRoomAcoustics) {
        this.soundOverallQuality = soundOverallQuality;
        this.soundLoudness = soundLoudness;
        this.soundTechnicalIssues = soundTechnicalIssues;
        this.soundRoomAcoustics = soundRoomAcoustics;
    }

    // getters and setters
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

    // domain-logic methods
    public BigDecimal getAverage() {
        return RatingUtils.average(
            soundOverallQuality,
            soundLoudness,
            soundTechnicalIssues,
            soundRoomAcoustics
        );
    }
}
