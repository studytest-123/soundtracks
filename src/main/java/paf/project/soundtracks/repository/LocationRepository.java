package paf.project.soundtracks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import paf.project.soundtracks.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
