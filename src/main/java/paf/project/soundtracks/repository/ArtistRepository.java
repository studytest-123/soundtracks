package paf.project.soundtracks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import paf.project.soundtracks.model.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
