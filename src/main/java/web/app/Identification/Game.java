package web.app.Identification;

import jakarta.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    private Integer id;

    private String gameName;
    private Integer releaseYear;
    private Integer price;
    private String developer;
    private String gameTag;
    private String platform;
    private Integer stocks;

    public Game() {}

    public Game(Integer id, String gameName, Integer releaseYear, Integer price, String developer, String gameTag, String platform, Integer stocks) {
        this.id = id;
        this.gameName = gameName;
        this.releaseYear = releaseYear;
        this.price = price;
        this.developer = developer;
        this.gameTag = gameTag;
        this.platform = platform;
        this.stocks = stocks;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getGameName() { return gameName; }
    public void setGameName(String gameName) { this.gameName = gameName; }

    public Integer getReleaseYear() { return releaseYear; }
    public void setReleaseYear(Integer releaseYear) { this.releaseYear = releaseYear; }

    public Integer getPrice() { return price; }
    public void setPrice(Integer price) { this.price = price; }

    public String getDeveloper() { return developer; }
    public void setDeveloper(String developer) { this.developer = developer; }

    public String getGameTag() { return gameTag; }
    public void setGameTag(String gameTag) { this.gameTag = gameTag; }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    public Integer getStocks() { return stocks; }
    public void setStocks(Integer stocks) { this.stocks = stocks; }
}
