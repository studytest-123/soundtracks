package paf.project.soundtracks.model;

import java.util.List;

public class Performance {
    private Long performanceId;
    // eventually future database links 
    private Long eventId;
    private Artist artistId;

    // JSON linking
    private Artist artistObject;

    // Setlist
    private List<SetlistItem> performanceSetlist;

    // Rating
    private PerformanceRating performanceRating;

    // constructors
    public Performance() {
    }

    public Performance(Long performanceId, Long eventId, Artist artistId, Artist artistObject,
                       List<SetlistItem> performanceSetlist, PerformanceRating performanceRating) {
        this.performanceId = performanceId;
        this.eventId = eventId;
        this.artistId = artistId;
        this.artistObject = artistObject;
        this.performanceSetlist = performanceSetlist;
        this.performanceRating = performanceRating;
    }

    // getters and setters
    public Long getPerformanceId() {
        return performanceId;
    }

    public void setPerformanceId(Long performanceId) {
        this.performanceId = performanceId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Artist getArtistId() {
        return artistId;
    }

    public void setArtistId(Artist artistId) {
        this.artistId = artistId;
    }

    public Artist getArtistObject() {
        return artistObject;
    }

    public void setArtistObject(Artist artistObject) {
        this.artistObject = artistObject;
    }

    public List<SetlistItem> getPerformanceSetlist() {
        return performanceSetlist;
    }

    public void setPerformanceSetlist(List<SetlistItem> performanceSetlist) {
        this.performanceSetlist = performanceSetlist;
    }

    public PerformanceRating getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(PerformanceRating performanceRating) {
        this.performanceRating = performanceRating;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "performanceId=" + performanceId +
                ", eventId=" + eventId +
                ", artistId=" + artistId +          
                ", artist=" + artistObject.getArtistName() +
                ", performanceSetlist=" + performanceSetlist +
                ", performanceRating=" + performanceRating +
                '}';
    }
}
