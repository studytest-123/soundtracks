package paf.project.soundtracks.model;

public class AtmosphereRating {
    private Long atmosphereRatingId;
    private double atmosphereAverageRating;
    private double eventVibe;
    private double crowdEngagement;
    private double lightAndVisuals;
    private double eventDecorations;
    private double staffFriendliness;
    private String atmosphereRatingComments;

    // constructors
    public AtmosphereRating() {
    }

    public AtmosphereRating(Long atmosphereRatingId, double atmosphereAverageRating, double eventVibe,
                            double crowdEngagement, double lightAndVisuals, double eventDecorations,
                            double staffFriendliness, String atmosphereRatingComments) {
        this.atmosphereRatingId = atmosphereRatingId;
        this.atmosphereAverageRating = atmosphereAverageRating;
        this.eventVibe = eventVibe;
        this.crowdEngagement = crowdEngagement;
        this.lightAndVisuals = lightAndVisuals;
        this.eventDecorations = eventDecorations;
        this.staffFriendliness = staffFriendliness;
        this.atmosphereRatingComments = atmosphereRatingComments;
    }

    // getters and setters
    public Long getAtmosphereRatingId() {
        return atmosphereRatingId;
    }
    public void setAtmosphereRatingId(Long atmosphereRatingId) {
        this.atmosphereRatingId = atmosphereRatingId;
    }
    public double getAtmosphereAverageRating() {
        return atmosphereAverageRating;
    }
    public void setAtmosphereAverageRating(double atmosphereAverageRating) {
        this.atmosphereAverageRating = atmosphereAverageRating;
    }
    public double getEventVibe() {
        return eventVibe;
    }
    public void setEventVibe(double eventVibe) {
        this.eventVibe = eventVibe;
    }
    public double getCrowdEngagement() {
        return crowdEngagement;
    }
    public void setCrowdEngagement(double crowdEngagement) {
        this.crowdEngagement = crowdEngagement;
    }
    public double getLightAndVisuals() {
        return lightAndVisuals;
    }
    public void setLightAndVisuals(double lightAndVisuals) {
        this.lightAndVisuals = lightAndVisuals;
    }
    public double getEventDecorations() {
        return eventDecorations;
    }
    public void setEventDecorations(double eventDecorations) {
        this.eventDecorations = eventDecorations;
    }
    public double getStaffFriendliness() {
        return staffFriendliness;
    }
    public void setStaffFriendliness(double staffFriendliness) {
        this.staffFriendliness = staffFriendliness;
    }
    public String getAtmosphereRatingComments() {
        return atmosphereRatingComments;
    }
    public void setAtmosphereRatingComments(String atmosphereRatingComments) {
        this.atmosphereRatingComments = atmosphereRatingComments;
    }
}