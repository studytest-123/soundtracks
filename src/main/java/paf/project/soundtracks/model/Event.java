package paf.project.soundtracks.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;


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
    private Location location;

    @Transient
    private Long locationId;

    @Column(name = "event_price")
    private BigDecimal eventPrice;
    @Column(name = "event_type")
    private String eventType;
    @Column(name = "event_description")
    private String eventDescription;

    // image path for event (persistance)    
    @Column(name = "image_path")
    private String imagePath;

    // resolved image for display (not persisted)
    @Transient
    private String resolvedImage;

    
    // constructors
    public Event() {
    }
    public Event(Long eventId, String eventName, LocalDate eventDate, LocalTime eventStart, LocalTime eventEntry,
            Location location, BigDecimal eventPrice, String eventType, String eventDescription, String imagePath) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventStart = eventStart;
        this.eventEntry = eventEntry;
        this.location = location;
        this.eventPrice = eventPrice;
        this.eventType = eventType;
        this.eventDescription = eventDescription;
        this.imagePath = imagePath;
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
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public Long getLocationId() {
        return locationId;
    }
    public void setLocationId(Long locationId) {
        this.locationId = locationId;
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
    public String getImagePath() {
        return imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    public String getResolvedImage() {
    return resolvedImage;
    }
    public void setResolvedImage(String resolvedImage) {
        this.resolvedImage = resolvedImage;
    }
    
    // helper methods 
    public boolean isPast() {
        return eventDate != null && eventDate.isBefore(LocalDate.now());
    }

    public boolean isFuture() {
        return eventDate != null && !eventDate.isBefore(LocalDate.now());
    }
}