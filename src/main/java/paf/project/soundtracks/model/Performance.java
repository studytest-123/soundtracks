package paf.project.soundtracks.model;

import java.time.Duration;
import java.util.List;

import org.checkerframework.checker.units.qual.C;
import org.checkerframework.checker.units.qual.m;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.*;

@Entity
@Table(name = "performance")
public class Performance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "performance_id")
    private Long performanceId;
    
    @ManyToOne
    @JoinColumn(name = "event_id_event")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "artist_id_artist")
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "performance_rating_id_performance_rating")
    private PerformanceRating performanceRating;
    @Column(name = "performance_duration")
    @JdbcTypeCode(SqlTypes.INTERVAL_SECOND)
    private Duration performanceDuration;
    @Column(name = "performance_type")
    private String performanceType;
    @Column(name = "performance_genre")
    private String performanceGenre;
    

    // JSON linking
    //private Artist artistObject;

    // Setlist
    //private List<SetlistItem> performanceSetlist;

    // Rating
    // private PerformanceRating performanceRating;

    // constructors
    public Performance() {
    }

    public Performance(Long performanceId, Event event, Artist artist, Duration performanceDuration, String performanceType, String performanceGenre) {
        this.performanceId = performanceId;
        this.event = event;
        this.artist = artist;
        this.performanceDuration = performanceDuration;
        this.performanceType = performanceType;
        this.performanceGenre = performanceGenre;
        /* this.artistObject = artistObject;
        this.performanceSetlist = performanceSetlist; */
        //this.performanceRating = performanceRating;
    }

    // getters and setters
    public Long getPerformanceId() {
        return performanceId;
    }

    public void setPerformanceId(Long performanceId) {
        this.performanceId = performanceId;
    }
    
    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
    public Duration getPerformanceDuration() {
        return performanceDuration;
    }
    public void setPerformanceDuration(Duration performanceDuration) {
        this.performanceDuration = performanceDuration;
    }
    public String getPerformanceType() {
        return performanceType;
    }
    public void setPerformanceType(String performanceType) {
        this.performanceType = performanceType;
    }
    public String getPerformanceGenre() {
        return performanceGenre;
    }
    public void setPerformanceGenre(String performanceGenre) {
        this.performanceGenre = performanceGenre;
    }

    /* public Artist getArtistObject() {
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
    } */

    @Override
    public String toString() {
        return "Performance{" +
                "performanceId=" + performanceId +
                ", event=" + event +
                ", artist=" + artist +
                ", performanceDuration=" + performanceDuration +
                ", performanceType='" + performanceType + '\'' +
                ", performanceGenre='" + performanceGenre + '\'' +
                /* ", artistObject=" + artistObject.getArtistName() +
                ", performanceSetlist=" + performanceSetlist +
                ", performanceRating=" + performanceRating + */
                '}';
    }
}
