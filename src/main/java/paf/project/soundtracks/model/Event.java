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
    private String eventLocation;
    private Double eventPrice;
    private String eventType;
    private List<Artist> eventArtists;
    private List<Person> eventParticipants;


    // constructors, getters, and setters
}
