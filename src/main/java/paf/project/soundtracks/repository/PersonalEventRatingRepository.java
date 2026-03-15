package paf.project.soundtracks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.PersonalEventRating;

public interface PersonalEventRatingRepository extends JpaRepository<PersonalEventRating, Long> {
    // Custom query method to find reviews by event
    List<PersonalEventRating> findByEvent(Event event);

    List<PersonalEventRating> findByEvent_EventId(Long eventId);
}
