package web.app.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import web.app.Identification.Game;
import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findByPlatform(String platform);
    List<Game> findByGameTag(String gameTag);
}