package web.app.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import web.app.Identification.Game;

public interface GameRepository extends JpaRepository<Game, Integer> {

}