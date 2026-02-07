package paf.project.soundtracks.model;

public class SetlistItem {
    private Long setlistItemId;
    private int setlistItemOrder;
    private String trackTitle;
    private double trackDuration;
    private String trackComments;

    // constructors
    public SetlistItem() {
    }

    public SetlistItem(Long setlistItemId, int setlistItemOrder, String trackTitle,
                       double trackDuration, String trackComments) {
        this.setlistItemId = setlistItemId;
        this.setlistItemOrder = setlistItemOrder;
        this.trackTitle = trackTitle;
        this.trackDuration = trackDuration;
        this.trackComments = trackComments;
    }

    //getters and setters
    public Long getSetlistItemId() {
        return setlistItemId;
    }
    public void setSetlistItemId(Long setlistItemId) {
        this.setlistItemId = setlistItemId;
    }
    public int getSetlistItemOrder() {
        return setlistItemOrder;
    }
    public void setSetlistItemOrder(int setlistItemOrder) {
        this.setlistItemOrder = setlistItemOrder;
    }
    public String getTrackTitle() {
        return trackTitle;
    }
    public void setTrackTitle(String trackTitle) {
        this.trackTitle = trackTitle;
    }
    public double getTrackDuration() {
        return trackDuration;
    }
    public void setTrackDuration(double trackDuration) {
        this.trackDuration = trackDuration;
    }
    public String getTrackComments() {
        return trackComments;
    }
    public void setTrackComments(String trackComments) {
        this.trackComments = trackComments;
    }

}