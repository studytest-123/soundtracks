package paf.project.soundtracks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.Person;
import paf.project.soundtracks.model.PersonalEventRating;

public interface PersonalEventRatingRepository extends JpaRepository<PersonalEventRating, Long> {
    // Custom query method to find reviews by event
    List<PersonalEventRating> findByEvent(Event event);

    long countByPerson(Person person);

    // for latest reviewed event card
    PersonalEventRating findTopByOrderByPersonalEventRatingIdDesc();

}
