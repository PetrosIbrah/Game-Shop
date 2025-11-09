package web.app.Controllers.Restfull;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import web.app.Identification.Game;
import web.app.Repository.GameRepository;

import java.util.List;

@RestController
@RequestMapping("/api/GameList")
public class GameListRestfull {

    @Autowired
    private GameRepository repo;

    @GetMapping
    public List<Game> getAllGames() {
        return repo.findAll();
    }
}