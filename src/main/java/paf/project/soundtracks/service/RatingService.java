package paf.project.soundtracks.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.Person;
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.observer.RatingSubject;
import paf.project.soundtracks.repository.EventRepository;
import paf.project.soundtracks.repository.PersonRepository;
import paf.project.soundtracks.repository.PersonalEventRatingRepository;

@Service
public class RatingService {

    private final EventRepository eventRepository;
    private final PersonalEventRatingRepository reviewRepository;
    private final PersonRepository personRepository;
    private final RatingSubject ratingSubject;

    public RatingService(EventRepository eventRepository,
                         PersonalEventRatingRepository reviewRepository,
                         PersonRepository personRepository,
                         RatingSubject ratingSubject) {
        this.eventRepository = eventRepository;
        this.reviewRepository = reviewRepository;
        this.personRepository = personRepository;
        this.ratingSubject = ratingSubject;
    }

    @Transactional
    public void saveReview(PersonalEventRating review, Long eventId) {

        // load event
        Event event = eventRepository.findById(eventId)
                .orElseThrow();

        review.setEvent(event);

        // user authentication
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();

        Person person = personRepository.findByUserName(username)
                .orElseThrow();

        review.setPerson(person);

        // null check for embeddeds
        review.initializeEmbeddeds();

        // save initial state
        reviewRepository.save(review);


        // debug
        System.out.println("Before observers");
        
        // run observers (pure logic)
        ratingSubject.notifyObservers(review);

        // save final state (ONE place!)
        reviewRepository.save(review);
    }
}
