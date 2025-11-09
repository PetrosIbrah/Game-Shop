package web.app.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameListController {

    @GetMapping("/GameList")
    public String gamelistPage() {
        return "forward:/index.html";
    }
}
