package paf.project.soundtracks.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.EventRating;
import paf.project.soundtracks.model.PersonalEventRating;
import paf.project.soundtracks.repository.EventRatingRepository;
import paf.project.soundtracks.repository.PersonalEventRatingRepository;

@Service
@Transactional
public class EventRatingService {

    private final PersonalEventRatingRepository reviewRepository;
    private final EventRatingRepository eventRatingRepository;

    public EventRatingService(PersonalEventRatingRepository reviewRepository,
                              EventRatingRepository eventRatingRepository) {
        this.reviewRepository = reviewRepository;
        this.eventRatingRepository = eventRatingRepository;
    }

    /* ==========================
       GENERIC AVERAGE HELPER
       ========================== */

    private BigDecimal average(
            List<PersonalEventRating> reviews,
            Function<PersonalEventRating, BigDecimal> extractor) {

        List<BigDecimal> values = reviews.stream()
                .map(extractor)
                .filter(Objects::nonNull)
                .toList();

        if (values.isEmpty()) {
            return BigDecimal.ZERO;
        }

        BigDecimal sum = values.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return sum.divide(
                BigDecimal.valueOf(values.size()),
                2,
                RoundingMode.HALF_UP
        );
    }

    /* ==========================
       EVENT RATING RECALCULATION
       ========================== */

    public void recalculateEventRating(Event event) {

        List<PersonalEventRating> reviews =
                reviewRepository.findByEvent(event);

        if (reviews.isEmpty()) {
            return;
        }

        /* -------- Segment averages -------- */

        BigDecimal soundAvg = average(
                reviews,
                r -> r.getSound().getAverage()
        );

        BigDecimal wardrobeAvg = average(
                reviews,
                r -> r.getWardrobe().getAverage()
        );

        BigDecimal atmosphereAvg = average(
                reviews,
                r -> r.getAtmosphere().getAverage()
        );

        BigDecimal gastronomyAvg = average(
                reviews,
                r -> r.getGastronomy().getAverage()
        );

        BigDecimal securityAvg = average(
                reviews,
                r -> r.getSecurity().getAverage()
        );

        /* -------- Overall average -------- */

        BigDecimal overallAvg = average(
                reviews,
                PersonalEventRating::getPersonalEventAverageRating
        );

        /* -------- Find or create EventRating -------- */

        EventRating eventRating = eventRatingRepository
                .findByEvent(event)
                .orElseGet(() -> {
                    EventRating newRating = new EventRating();
                    newRating.setEvent(event);
                    return newRating;
                });

        /* -------- Store results -------- */

        eventRating.setSoundAverageRating(soundAvg);
        eventRating.setWardrobeAverageRating(wardrobeAvg);
        eventRating.setAtmosphereAverageRating(atmosphereAvg);
        eventRating.setGastronomyAverageRating(gastronomyAvg);
        eventRating.setSecurityAverageRating(securityAvg);
        eventRating.setEventAverageRating(overallAvg);

        eventRatingRepository.save(eventRating);
    }
}
