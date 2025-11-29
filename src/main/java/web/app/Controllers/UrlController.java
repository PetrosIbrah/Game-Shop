package web.app.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UrlController {

    @GetMapping("/games")
    public String gamesPage() {
        return "forward:/index.html";
    }

    @GetMapping("/GameShop")
    public String GameShopPage() {
        return "forward:/index.html";
    }

    @GetMapping("/GameList")
    public String GameListPage() {
        return "forward:/index.html";
    }

    @GetMapping("/GamesMainPage")
    public String GamesMainPage() {
        return "forward:/index.html";
    }

    @RequestMapping(value = "/{path:[^\\.]*}")
    public String forward() {
        return "redirect:/";
    }

}
