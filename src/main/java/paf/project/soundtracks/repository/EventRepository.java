package paf.project.soundtracks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import paf.project.soundtracks.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
