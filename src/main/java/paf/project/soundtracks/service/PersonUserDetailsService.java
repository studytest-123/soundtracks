package paf.project.soundtracks.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import paf.project.soundtracks.model.Person;
import paf.project.soundtracks.repository.PersonRepository;

@Service
public class PersonUserDetailsService implements UserDetailsService {

    private final PersonRepository personRepository;

    public PersonUserDetailsService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        Person person = personRepository
                .findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException(username));

        return User
                .withUsername(person.getUserName())
                .password(person.getPassword())
                .roles("USER")
                .build();
    }
}