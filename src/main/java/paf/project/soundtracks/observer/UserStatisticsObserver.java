package paf.project.soundtracks.observer;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import paf.project.soundtracks.model.Person;
import paf.project.soundtracks.model.PersonalEventRating;

@Component
@Order(4)
public class UserStatisticsObserver implements RatingObserver {

    // constructors
    public UserStatisticsObserver() {
    }

    @Override
    public void update(PersonalEventRating review) {

        Person person = review.getPerson();

        person.setReviewCount(person.getReviewCount() + 1);


    }
}