package paf.project.soundtracks.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import paf.project.soundtracks.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

    Event findTopByOrderByEventIdDesc(); // latest event by ID (sql query parsing)

    List<Event> findByEventDateGreaterThanEqualOrderByEventDateAsc(LocalDate date); // upcoming events (sql query parsing)

    List<Event> findByEventDateBeforeOrderByEventDateDesc(LocalDate date); // past events (sql query parsing)
}
