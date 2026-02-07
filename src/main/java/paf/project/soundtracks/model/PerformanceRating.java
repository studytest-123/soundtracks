package paf.project.soundtracks.model;

public class PerformanceRating {
    private Long performanceRatingId;
    private Long performanceId;
    private double performanceAverageRating;
    private double performanceQuality;
    private double soundQuality;
    private double setLength;
    private double trackSelection;
    private double visualShow;
    private String performanceRatingComments;

    
    // constructors
    public PerformanceRating() {
    }
    public PerformanceRating(Long performanceRatingId, Long performanceId, double performanceAverageRating, double performanceQuality, double soundQuality,
                             double setLength, double trackSelection, double visualShow, String performanceRatingComments) {
        this.performanceRatingId = performanceRatingId;
        this.performanceId = performanceId;
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
    public Long getPerformanceId() {
        return performanceId;
    }

    public void setPerformanceId(Long performanceId) {
        this.performanceId = performanceId;
    }

    public double getPerformanceAverageRating() {
        return performanceAverageRating;
    }
    
    public void setPerformanceAverageRating(double performanceAverageRating) {
        this.performanceAverageRating = performanceAverageRating;
    }

    public double getPerformanceQuality() {
        return performanceQuality;
    }

    public void setPerformanceQuality(double performanceQuality) {
        this.performanceQuality = performanceQuality;
    }

    public double getSoundQuality() {
        return soundQuality;
    }

    public void setSoundQuality(double soundQuality) {
        this.soundQuality = soundQuality;
    }

    public double getSetLength() {
        return setLength;
    }

    public void setSetLength(double setLength) {
        this.setLength = setLength;
    }

    public double getTrackSelection() {
        return trackSelection;
    }

    public void setTrackSelection(double trackSelection) {
        this.trackSelection = trackSelection;
    }

    public double getVisualShow() {
        return visualShow;
    }

    public void setVisualShow(double visualShow) {
        this.visualShow = visualShow;
    }
    public String getPerformanceRatingComments() {
        return performanceRatingComments;
    }
    public void setPerformanceRatingComments(String performanceRatingComments) {
        this.performanceRatingComments = performanceRatingComments;
    }
}