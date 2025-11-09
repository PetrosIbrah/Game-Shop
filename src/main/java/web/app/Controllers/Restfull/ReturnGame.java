package web.app.Controllers.Restfull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.app.Identification.Game;
import web.app.Repository.GameRepository;

import java.util.List;

@RestController
@RequestMapping("/api/GamePage")
public class ReturnGame {
    @Autowired
    private GameRepository repo;


    @GetMapping("/{id}")
    public Game getGameById(@PathVariable Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Game not found with id " + id));
    }
}
