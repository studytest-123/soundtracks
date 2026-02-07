package paf.project.soundtracks.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "performance_rating")
public class PerformanceRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "performance_rating_id")
    private Long performanceRatingId;
    
    @ManyToOne
    @JoinColumn(name = "personal_event_rating_id_personal_event_rating") 
    private PersonalEventRating personalEventRating;

    private BigDecimal performanceAverageRating;
    private BigDecimal performanceQuality;
    private BigDecimal soundQuality;
    private BigDecimal setLength;
    private BigDecimal trackSelection;
    private BigDecimal visualShow;
    private String performanceRatingComments;

    
    // constructors
    public PerformanceRating() {
    }
    public PerformanceRating(Long performanceRatingId, PersonalEventRating personalEventRating, BigDecimal performanceAverageRating, BigDecimal performanceQuality, BigDecimal soundQuality,
                             BigDecimal setLength, BigDecimal trackSelection, BigDecimal visualShow, String performanceRatingComments) {
        this.performanceRatingId = performanceRatingId;
        this.personalEventRating = personalEventRating;
        this.performanceAverageRating = performanceAverageRating;
        this.performanceQuality = performanceQuality;
        this.soundQuality = soundQuality;
        this.setLength = setLength;
        this.trackSelection = trackSelection;
        this.visualShow = visualShow;
        this.performanceRatingComments = performanceRatingComments;
    }

    // getters and setters
    public Long getPerformanceRatingId() {
        return performanceRatingId;
    }

    public void setPerformanceRatingId(Long performanceRatingId) {
        this.performanceRatingId = performanceRatingId;
    }
    public PersonalEventRating getPersonalEventRating() {
        return personalEventRating;
    }

    public void setPersonalEventRating(PersonalEventRating personalEventRating) {
        this.personalEventRating = personalEventRating;
    }

    public BigDecimal getPerformanceAverageRating() {
        return performanceAverageRating;
    }
    
    public void setPerformanceAverageRating(BigDecimal performanceAverageRating) {
        this.performanceAverageRating = performanceAverageRating;
    }

    public BigDecimal getPerformanceQuality() {
        return performanceQuality;
    }

    public void setPerformanceQuality(BigDecimal performanceQuality) {
        this.performanceQuality = performanceQuality;
    }

    public BigDecimal getSoundQuality() {
        return soundQuality;
    }

    public void setSoundQuality(BigDecimal soundQuality) {
        this.soundQuality = soundQuality;
    }

    public BigDecimal getSetLength() {
        return setLength;
    }

    public void setSetLength(BigDecimal setLength) {
        this.setLength = setLength;
    }

    public BigDecimal getTrackSelection() {
        return trackSelection;
    }

    public void setTrackSelection(BigDecimal trackSelection) {
        this.trackSelection = trackSelection;
    }

    public BigDecimal getVisualShow() {
        return visualShow;
    }

    public void setVisualShow(BigDecimal visualShow) {
        this.visualShow = visualShow;
    }
    public String getPerformanceRatingComments() {
        return performanceRatingComments;
    }
    public void setPerformanceRatingComments(String performanceRatingComments) {
        this.performanceRatingComments = performanceRatingComments;
    }
}