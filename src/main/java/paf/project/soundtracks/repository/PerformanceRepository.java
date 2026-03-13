package paf.project.soundtracks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import paf.project.soundtracks.model.Performance;

public interface PerformanceRepository extends JpaRepository<Performance, Long> {
}
