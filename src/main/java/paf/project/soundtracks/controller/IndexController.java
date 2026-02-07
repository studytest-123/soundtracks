package paf.project.soundtracks.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

import paf.project.soundtracks.model.Event;
import paf.project.soundtracks.model.Person;
import paf.project.soundtracks.model.Location;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        // Mock user (you can later load this from database or session)
        Person user = new Person();
        user.setPersonId(1L);
        user.setUserName("john_doe");
        //user.setDisplayName("John Doe");

        // Mock latest event
        Event latestEvent = new Event();
        latestEvent.setEventId(47L);
        latestEvent.setEventName("Event47 (Latest Contributed)");
        latestEvent.setEventDate(LocalDate.now().minusDays(1));
        latestEvent.setEventDescription("A high-energy night featuring top DJs and amazing visuals.");

        // Upcoming events
        List<Event> upcomingEvents = List.of(
                new Event(75L, "Event75 (Today)", LocalDate.now(), LocalTime.of(19, 10), LocalTime.of(20, 10), new Location(1L), 25.0, "Concert", "Today's top electronic beats.")
                //new Event(76L, "Event76 (Tomorrow)", LocalDate.now().plusDays(1), LocalTime.of(21, 0), LocalTime.of(21, 0), new Location(2L, "Tomorrow's main stage", "456 Stage Ave", 10002, "New York", "USA", 300, "Main stage for tomorrow's events"), 0.0, "Concert", "Tomorrow's main stage."),
                //new Event(77L, "Event77 (Tomorrow)", LocalDate.now().plusDays(1), LocalTime.of(22, 30), LocalTime.of(22, 30), new Location(3L, "House & techno fusion night", "789 Fusion Blvd", 10003, "New York", "USA", 400, "House and techno fusion night"), 0.0, "Concert", "House & techno fusion night.")
        );

        // Past events
        List<Event> pastEvents = List.of(
                new Event(74L, "Event74 (Yesterday)", LocalDate.now().minusDays(1), LocalTime.of(18, 0), LocalTime.of(18, 0), new Location(4L), 0.0, "Concert", "Open-air chillout set."),
                new Event(72L, "Event72 (Yesterday)", LocalDate.now().minusDays(1), LocalTime.of(22, 30), LocalTime.of(22, 30), new Location(5L), 0.0, "Concert",    "DJ Awesome’s afterparty.")
        );

        // Pass everything to Thymeleaf
        model.addAttribute("user", user);
        model.addAttribute("latestEvent", latestEvent);
        model.addAttribute("upcomingEvents", upcomingEvents);
        model.addAttribute("pastEvents", pastEvents);

        return "index"; // corresponds to templates/index.html
    }
}
