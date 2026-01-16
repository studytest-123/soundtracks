package paf.project.soundtracks.model;

public class SetlistItem {
    private Long setlistItemId;
    private int setlistItemOrder;
    private String trackTitle;
    private String trackDuration;
    private String trackNotes;

    // constructors
    public SetlistItem() {
    }

    public SetlistItem(Long setlistItemId, int setlistItemOrder, String trackTitle,
                       String trackDuration, String trackNotes) {
        this.setlistItemId = setlistItemId;
        this.setlistItemOrder = setlistItemOrder;
        this.trackTitle = trackTitle;
        this.trackDuration = trackDuration;
        this.trackNotes = trackNotes;
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
    public String getTrackDuration() {
        return trackDuration;
    }
    public void setTrackDuration(String trackDuration) {
        this.trackDuration = trackDuration;
    }
    public String getTrackNotes() {
        return trackNotes;
    }
    public void setTrackNotes(String trackNotes) {
        this.trackNotes = trackNotes;
    }

}