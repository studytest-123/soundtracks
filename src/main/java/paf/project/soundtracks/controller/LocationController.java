package paf.project.soundtracks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import paf.project.soundtracks.model.Location;
import paf.project.soundtracks.repository.LocationRepository;

@Controller
@RequestMapping("/location")
public class LocationController {

    private final LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    /* create location form */
    @GetMapping("/new")
    public String showCreateLocationForm(Model model) {

        model.addAttribute("location", new Location());

        return "location-create";
    }

    /* submit form */
    @PostMapping("/new")
    public String createLocation(@ModelAttribute Location location) {

        locationRepository.save(location);

        return "redirect:/";
    }
}
