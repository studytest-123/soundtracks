package paf.project.soundtracks.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.EventRating;

public interface EventRatingRepository extends JpaRepository<EventRating, Long> {
    Optional<EventRating> findByEvent(Event event);
}
