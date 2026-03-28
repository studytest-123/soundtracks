package paf.project.soundtracks.service;

import java.util.List;

import org.springframework.stereotype.Service;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.Performance;
import paf.project.soundtracks.model.PersonalEventRating;

@Service
public class ImageResolver {

    public String resolveEventImage(Event event,
                                    List<PersonalEventRating> reviews,
                                    List<Performance> performances) {

        // 1. review images
        for (PersonalEventRating r : reviews) {
            if (r.getImagePath() != null) {
                return r.getImagePath();
            }
        }

        // 2. event image
        if (event.getImagePath() != null) {
            return event.getImagePath();
        }

        // 3. artist fallback
        for (Performance p : performances) {
            if (p.getArtist() != null && p.getArtist().getImagePath() != null) {
                return p.getArtist().getImagePath();
            }
        }

        // 4. default
        return "/uploads/images/default.jpg";
    }
}
