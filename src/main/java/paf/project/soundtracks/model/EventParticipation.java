package paf.project.soundtracks.model;

public class EventParticipation {
    private Long eventParticipationId;
    private Long eventId;
    private Long personId;
    private ParticipationType eventParticipationType;
    private String eventDescription;

    // constructors
    public EventParticipation() {
    }

    public EventParticipation(Long eventParticipationId, Long eventId, Long personId,
                              ParticipationType eventParticipationType, String eventDescription) {
        this.eventParticipationId = eventParticipationId;
        this.eventId = eventId;
        this.personId = personId;
        this.eventParticipationType = eventParticipationType;
        this.eventDescription = eventDescription;
    }

    // getters and setters
    public Long getEventParticipationId() {
        return eventParticipationId;
    }

    public void setEventParticipationId(Long eventParticipationId) {
        this.eventParticipationId = eventParticipationId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public ParticipationType getEventParticipationType() {
        return eventParticipationType;
    }

    public void setEventParticipationType(ParticipationType eventParticipationType) {
        this.eventParticipationType = eventParticipationType;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
}