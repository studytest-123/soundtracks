package paf.project.soundtracks.controller;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.Performance;
import paf.project.soundtracks.model.PerformanceRating;
import paf.project.soundtracks.model.Artist;
import paf.project.soundtracks.model.SetlistItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import paf.project.soundtracks.model.Location;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Controller
public class EventController {

    @GetMapping("/event/{id}")
    public String eventDetails(@PathVariable Long id, Model model) {
        // Mock event details (replace with data loading later)
        Event event = new Event(
            id,
            "Event " + id,
            LocalDate.now(),
            LocalTime.of(20, 00),
            LocalTime.of(21, 00),
            new Location(3L),
            40.0,
            "Concert",
            "This event features multiple artists and an amazing atmosphere."
        );

        // Mock performances
        List<Performance> performances = List.of(
            new Performance(1L, id, 2L,
                new Artist(2L, "DJ Awesome", "Electronic", "Germany", "Berlin-based DJ"),
                List.of(
                    new SetlistItem(1L, 1, "Intro Beat", 210, "Opening track"),
                    new SetlistItem(2L, 2, "Summer Drop", 180, "Crowd favorite")
                ),
                new PerformanceRating()
            ),
            new Performance(2L, id, 3L,
                new Artist(3L, "The Rockers", "Rock", "Germany", "Classic rock band"),
                List.of(
                    new SetlistItem(3L, 1, "Firestorm", 240, ""),
                    new SetlistItem(4L, 2, "Encore Anthem", 230, "")
                ),
                null
            )
        );

        performances.forEach(p ->
        System.out.println("Performance " + p.getPerformanceId() +
                " artist = " + p.getArtistObject().getArtistName()));


        model.addAttribute("event", event);
        model.addAttribute("performances", performances);
        

        return "event-details";
    }
}
