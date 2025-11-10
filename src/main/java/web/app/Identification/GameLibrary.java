package web.app.Identification;

import java.util.ArrayList;
import java.util.List;

// Can be used later
public class GameLibrary {
    private List<Game> Games;

    public GameLibrary(List<Game> games) {
        Games = games;
    }

    public List<Game> getGames() {
        return Games;
    }

    public void setGames(List<Game> games) {
        Games = games;
    }

    public void addGame(Game game) {
        if (game != null) {
            Games.add(game);
            System.out.println(game.getGameName() + " added to the library.");
        } else {
            System.out.println("Cannot add a null game.");
        }
    }

    public void removeGameById(int id) {
        Game toRemove = null;
        for (Game g : Games) {
            if (g.getId() == id) {
                toRemove = g;
                break;
            }
        }

        if (toRemove != null) {
            Games.remove(toRemove);
            System.out.println("Game with ID " + id + " removed from the library.");
        } else {
            System.out.println("No game found with ID " + id);
        }
    }

    public List<Game> getGamesByTag(String tag) {
        List<Game> filteredGames = new ArrayList<>();

        if (tag == null || tag.isEmpty()) {
            System.out.println("Invalid tag provided.");
            return filteredGames;
        }

        for (Game g : Games) {
            if (g.getGameTag() != null && g.getGameTag().equalsIgnoreCase(tag)) {
                filteredGames.add(g);
            }
        }

        return filteredGames;
    }
}
