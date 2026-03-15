package paf.project.soundtracks.observer;

import java.util.List;

import org.springframework.stereotype.Service;

import paf.project.soundtracks.model.PersonalEventRating;

@Service
public class RatingSubject {

    private final List<RatingObserver> observers;

    public RatingSubject(List<RatingObserver> observers) {
        this.observers = observers;
    }

    public void notifyObservers(PersonalEventRating review) {

        for (RatingObserver observer : observers) {
            observer.update(review);
        }

    }
}