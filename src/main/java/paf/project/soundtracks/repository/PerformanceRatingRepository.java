package paf.project.soundtracks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import paf.project.soundtracks.model.PerformanceRating;

@Repository
public interface PerformanceRatingRepository extends JpaRepository<PerformanceRating, Long> {
}
