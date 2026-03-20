package paf.project.soundtracks.observer;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import paf.project.soundtracks.model.Person;
import paf.project.soundtracks.model.PersonalEventRating;
//import paf.project.soundtracks.repository.PersonalEventRatingRepository;

@Component
@Order(4)
public class UserStatisticsObserver implements RatingObserver {

    //private final PersonalEventRatingRepository reviewRepository;

    public UserStatisticsObserver(/* PersonalEventRatingRepository reviewRepository */) {
        /* this.reviewRepository = reviewRepository; */
    }

    @Override
    public void update(PersonalEventRating review) {

        Person person = review.getPerson();

        person.setReviewCount(person.getReviewCount() + 1);


    }
}