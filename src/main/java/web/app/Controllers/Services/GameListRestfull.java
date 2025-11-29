package web.app.Controllers.Services;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import web.app.Identification.Game;
import web.app.Identification.Images;
import web.app.Repositories.GameRepository;
import web.app.Repositories.ImagesRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Games")
public class GameListRestfull {

    @Autowired
    private GameRepository GameRepo;

    @Autowired
    private ImagesRepository ImgsRepo;

    @GetMapping("/all")
    public List<Game> getAllGames() {
        return GameRepo.findAll();
    }

    @GetMapping("/all/Images")
    public List<Images> getAllImages() {
        return ImgsRepo.findAll();
    }

    @GetMapping("/Platform/{p}")
    public List<Game> getGamePlatform(@PathVariable String p) {
        return GameRepo.findByPlatform(p);
    }

    @GetMapping("/Platform/Images/{p}")
    public List<Images> getGameImagesByPlatform(@PathVariable String p) {
        List<Game> games = GameRepo.findByPlatform(p);
        List<Images> allImages = new ArrayList<>();

        for (Game game : games) {
            Long gameIdLong = Long.valueOf(game.getId());
            Optional<Images> optionalImage = ImgsRepo.findById(gameIdLong);
            optionalImage.ifPresent(allImages::add);
        }

        return allImages;
    }

    @GetMapping("/GameTag/{GT}")
    public List<Game> getGameByTag(@PathVariable String GT) {
        return GameRepo.findByGameTag(GT);
    }

    @GetMapping("/GameTag/Images/{GT}")
    public List<Images> getGameImagesByTag(@PathVariable String GT) {
        List<Game> games = GameRepo.findByGameTag(GT);
        List<Images> allImages = new ArrayList<>();

        for (Game game : games) {
            Long gameIdLong = Long.valueOf(game.getId());
            Optional<Images> optionalImage = ImgsRepo.findById(gameIdLong);
            optionalImage.ifPresent(allImages::add);
        }

        return allImages;
    }
}