package paf.project.soundtracks.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService {

    private final String BASE_PATH = "uploads/";

    public String saveImage(MultipartFile file, String folder) {

        if (file == null || file.isEmpty()) {
            return null;
        }

        try {
            String filename = UUID.randomUUID() + "_" + file.getOriginalFilename();
            Path path = Paths.get(BASE_PATH + folder + "/" + filename);

            Files.createDirectories(path.getParent());
            Files.copy(file.getInputStream(), path);

            return "/uploads/" + folder + "/" + filename;

        } catch (IOException e) {
            throw new RuntimeException("Image upload failed", e);
        }
    }
}
