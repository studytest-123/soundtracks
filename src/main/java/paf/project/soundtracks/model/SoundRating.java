package paf.project.soundtracks.model;

public class SoundRating {
    private Long soundRatingId;
    private double soundAverageRating;
    private double soundOverallQuality;
    private double soundLoudness;
    private double soundTechnicalIssues;
    private double soundRoomAcoustics;
    private String soundRatingComments;

    // constructors
    public SoundRating() {
    }

    public SoundRating(Long soundRatingId, double soundAverageRating, double soundOverallQuality,
                       double soundLoudness, double soundTechnicalIssues, double soundRoomAcoustics,
                       String soundRatingComments) {
        this.soundRatingId = soundRatingId;
        this.soundAverageRating = soundAverageRating;
        this.soundOverallQuality = soundOverallQuality;
        this.soundLoudness = soundLoudness;
        this.soundTechnicalIssues = soundTechnicalIssues;
        this.soundRoomAcoustics = soundRoomAcoustics;
        this.soundRatingComments = soundRatingComments;
    }

    // getters and setters
    public Long getSoundRatingId() {
        return soundRatingId;
    }
    public void setSoundRatingId(Long soundRatingId) {
        this.soundRatingId = soundRatingId;
    }
    public double getSoundAverageRating() {
        return soundAverageRating;
    }
    public void setSoundAverageRating(double soundAverageRating) {
        this.soundAverageRating = soundAverageRating;
    }
    public double getSoundOverallQuality() {
        return soundOverallQuality;
    }
    public void setSoundOverallQuality(double soundOverallQuality) {
        this.soundOverallQuality = soundOverallQuality;
    }
    public double getSoundLoudness() {
        return soundLoudness;
    }
    public void setSoundLoudness(double soundLoudness) {
        this.soundLoudness = soundLoudness;
    }
    public double getSoundTechnicalIssues() {
        return soundTechnicalIssues;
    }
    public void setSoundTechnicalIssues(double soundTechnicalIssues) {
        this.soundTechnicalIssues = soundTechnicalIssues;
    }
    public double getSoundRoomAcoustics() {
        return soundRoomAcoustics;
    }
    public void setSoundRoomAcoustics(double soundRoomAcoustics) {
        this.soundRoomAcoustics = soundRoomAcoustics;
    }
    public String getSoundRatingComments() {
        return soundRatingComments;
    }
    public void setSoundRatingComments(String soundRatingComments) {
        this.soundRatingComments = soundRatingComments;
    }
}
