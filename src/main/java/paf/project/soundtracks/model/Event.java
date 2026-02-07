package paf.project.soundtracks.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.checkerframework.checker.units.qual.C;

import jakarta.persistence.*;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Long eventId;
    @Column(name = "event_name")
    private String eventName;
    @Column(name = "event_date")
    private LocalDate eventDate;
    @Column(name = "event_start")
    private LocalTime eventStart;
    @Column(name = "event_entry")
    private LocalTime eventEntry;
    @ManyToOne
    @JoinColumn(name = "location_id_location")
    private Location eventLocation;
    @Column(name = "event_price")
    private BigDecimal eventPrice;
    @Column(name = "event_type")
    private String eventType;
    @Column(name = "event_description")
    private String eventDescription;
    //private List<Performance> eventPerformances;
    //private List<EventParticipation> eventParticipations;
    
    // constructors
    public Event() {
    }
    public Event(Long eventId, String eventName, LocalDate eventDate, LocalTime eventStart, LocalTime eventEntry,
            Location eventLocation, BigDecimal eventPrice, String eventType, String eventDescription) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventStart = eventStart;
        this.eventEntry = eventEntry;
        this.eventLocation = eventLocation;
        this.eventPrice = eventPrice;
        this.eventType = eventType;
        this.eventDescription = eventDescription;
        //this.eventPerformances = eventPerformances;
        //this.eventParticipations = eventParticipations;
    }
    
    // getters and setters
    public Long getEventId() {
        return eventId;
    }
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public LocalDate getEventDate() {
        return eventDate;
    }
    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }
    public LocalTime getEventStart() {
        return eventStart;
    }
    public void setEventStart(LocalTime eventStart) {
        this.eventStart = eventStart;
    }
    public LocalTime getEventEntry() {
        return eventEntry;
    }
    public void setEventEntry(LocalTime eventEntry) {
        this.eventEntry = eventEntry;
    }
    public Location getEventLocation() {
        return eventLocation;
    }
    public void setEventLocation(Location eventLocation) {
        this.eventLocation = eventLocation;
    }
    public BigDecimal getEventPrice() {
        return eventPrice;
    }
    public void setEventPrice(BigDecimal eventPrice) {
        this.eventPrice = eventPrice;
    }
    public String getEventType() {
        return eventType;
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    public String getEventDescription() {
        return eventDescription;
    }
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }   
    /*
    public List<Performance> getEventPerformances() {
        return eventPerformances;
    }
    public void setEventPerformances(List<Performance> eventPerformances) {
        this.eventPerformances = eventPerformances;
    }
    public List<EventParticipation> getEventParticipations() {
        return eventParticipations;
    }
    public void setEventParticipations(List<EventParticipation> eventParticipations) {
        this.eventParticipations = eventParticipations;
    }
    */
}