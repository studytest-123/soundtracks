package paf.project.soundtracks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import paf.project.soundtracks.model.Performance;

public interface PerformanceRepository extends JpaRepository<Performance, Long> {
    List<Performance> findByEvent_EventId(Long eventId); // find performances by event ID (sql query parsing)
}
