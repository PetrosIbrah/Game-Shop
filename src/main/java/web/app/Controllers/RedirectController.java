package web.app.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedirectController {

    @GetMapping("/api/redirect-to-games")
    public ResponseEntity<Void> redirectToGames() {
        return ResponseEntity.status(302)
                .header("Location", "/games")
                .build();
    }

    @GetMapping("/api/redirect-to-gamelist")
    public ResponseEntity<Void> redirectToGameList() {
        return ResponseEntity.status(302)
                .header("Location", "/GameList")
                .build();
    }


}
