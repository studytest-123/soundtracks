package paf.project.soundtracks.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Event {
    private Long eventId;
    private String eventName;
    private LocalDate eventDate;
    private LocalTime eventStart;
    private LocalTime eventEntry;
    private Location eventLocation;
    private Double eventPrice;
    private String eventType;
    private String eventDescription;
    //private List<Performance> eventPerformances;
    //private List<EventParticipation> eventParticipations;
    
    // constructors
    public Event() {
    }
    public Event(Long eventId, String eventName, LocalDate eventDate, LocalTime eventStart, LocalTime eventEntry,
            Location eventLocation, Double eventPrice, String eventType, String eventDescription) {
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
    public Double getEventPrice() {
        return eventPrice;
    }
    public void setEventPrice(Double eventPrice) {
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