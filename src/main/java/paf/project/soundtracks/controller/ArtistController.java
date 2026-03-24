package paf.project.soundtracks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import paf.project.soundtracks.model.Artist;
import paf.project.soundtracks.repository.ArtistRepository;

@Controller
@RequestMapping("/artist")
public class ArtistController {

    private final ArtistRepository artistRepository;

    // constructor
    public ArtistController(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    /* show create artist form */
    @GetMapping("/new")
    public String showCreateArtistForm(Model model) {

        model.addAttribute("artist", new Artist());

        return "artist-create";
    }

    /* submit form */
    @PostMapping("/new")
    public String createArtist(@ModelAttribute Artist artist) {

        artistRepository.save(artist);

        return "redirect:/";
    }
}
