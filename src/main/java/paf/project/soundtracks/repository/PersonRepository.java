package paf.project.soundtracks.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import paf.project.soundtracks.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByUserName(String userName);

}
