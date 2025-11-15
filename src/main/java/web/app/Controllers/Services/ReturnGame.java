package web.app.Controllers.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.app.Identification.Game;
import web.app.Identification.Images;
import web.app.Identification.Requirements;
import web.app.Repositories.GameRepository;
import web.app.Repositories.ImagesRepository;
import web.app.Repositories.RequirementsRepository;

@RestController
@RequestMapping("/api/GamePage")
public class ReturnGame {
    @Autowired
    private GameRepository GameRepo;

    @Autowired
    private RequirementsRepository ReqRepo;

    @Autowired
    private ImagesRepository ImgsRepo;


    @GetMapping("/gameinfo/{id}")
    public Game getGameById(@PathVariable Long id) {
        return GameRepo.findById(id).orElseThrow(() -> new RuntimeException("Game not found with id " + id));
    }

    @GetMapping("/gamereq/{id}")
    public Requirements getRequirementsById(@PathVariable Long id) {
        return ReqRepo.findById(id).orElseThrow(() -> new RuntimeException("Game not found with id " + id));
    }

    @GetMapping("/gameimgs/{id}")
    public Images getImagesById(@PathVariable Long id) {
        return ImgsRepo.findById(id).orElseThrow(() -> new RuntimeException("Game not found with id " + id));
    }
}
