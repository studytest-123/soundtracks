package paf.project.soundtracks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.Performance;

public interface PerformanceRepository extends JpaRepository<Performance, Long> {
    List<Performance> findByEvent(Event event); // find performances by event (sql query parsing)
}
