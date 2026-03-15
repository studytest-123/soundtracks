package paf.project.soundtracks.observer;

import paf.project.soundtracks.model.PersonalEventRating;

public interface RatingObserver {

    void update(PersonalEventRating review);

}