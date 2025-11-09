package web.app.Identification;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import web.app.Identification.Game;
import web.app.Repository.GameRepository;

@Component
public class DataLoader {

    private final GameRepository repo;

    public DataLoader(GameRepository repo) {
        this.repo = repo;
    }

    @PostConstruct
    public void loadData() {
        if (repo.count() == 0) {
            repo.save(new Game(1, "Elden Ring", 2022, 59, "FromSoftware", "RPG", "PC", 67));
            repo.save(new Game(2, "God Of War", 2022, 69, "Santa Monica Studio", "Action Adventure", "PC", 420));
            repo.save(new Game(3, "The Legend of Zelda: Tears of the Kingdom", 2023, 69, "Nintendo", "Adventure", "Nintendo Switch", 150));
            repo.save(new Game(4, "Cyberpunk 2077", 2020, 39, "CD Projekt Red", "RPG", "PC", 230));
            repo.save(new Game(5, "Red Dead Redemption 2", 2018, 49, "Rockstar Games", "Action Adventure", "PlayStation 5", 180));
            repo.save(new Game(6, "Horizon Forbidden West", 2022, 59, "Guerrilla Games", "Action RPG", "PlayStation 5", 95));
            repo.save(new Game(7, "The Witcher 3: Wild Hunt", 2015, 29, "CD Projekt Red", "RPG", "PC", 250));
            repo.save(new Game(8, "Resident Evil 4 Remake", 2023, 59, "Capcom", "Survival Horror", "PlayStation 5", 110));
            repo.save(new Game(9, "Spider-Man 2", 2023, 69, "Insomniac Games", "Action Adventure", "PlayStation 5", 160));
            repo.save(new Game(10, "Baldur’s Gate 3", 2023, 69, "Larian Studios", "RPG", "PC", 130));
            repo.save(new Game(11, "Starfield", 2023, 69, "Bethesda Game Studios", "RPG", "Xbox Series X", 145));
            repo.save(new Game(12, "Sea of Thieves", 2018, 39, "Rare", "Adventure", "Xbox Series X", 180));
            repo.save(new Game(13, "Halo Infinite", 2021, 49, "343 Industries", "Shooter", "Xbox Series X", 200));
            repo.save(new Game(14, "Forza Horizon 5", 2021, 59, "Playground Games", "Racing", "Xbox Series X", 300));
            repo.save(new Game(15, "FIFA 24", 2023, 69, "EA Sports", "Sports", "PlayStation 5", 500));
            repo.save(new Game(16, "NBA 2K24", 2023, 69, "Visual Concepts", "Sports", "PlayStation 5", 260));
            repo.save(new Game(17, "Mortal Kombat 1", 2023, 69, "NetherRealm Studios", "Fighting", "PC", 140));
            repo.save(new Game(18, "Tekken 8", 2024, 69, "Bandai Namco", "Fighting", "PlayStation 5", 120));
            repo.save(new Game(19, "Street Fighter 6", 2023, 59, "Capcom", "Fighting", "PC", 150));
            repo.save(new Game(20, "Assassin’s Creed Mirage", 2023, 59, "Ubisoft", "Action Adventure", "PlayStation 5", 210));
            repo.save(new Game(21, "Far Cry 6", 2021, 49, "Ubisoft", "Shooter", "Xbox Series X", 240));
            repo.save(new Game(22, "Rainbow Six Siege", 2015, 19, "Ubisoft", "Shooter", "PC", 600));
            repo.save(new Game(23, "Overwatch 2", 2022, 0, "Blizzard Entertainment", "Shooter", "PC", 999));
            repo.save(new Game(24, "Diablo IV", 2023, 69, "Blizzard Entertainment", "Action RPG", "PC", 180));
            repo.save(new Game(25, "Call of Duty: Modern Warfare III", 2023, 69, "Infinity Ward", "Shooter", "PlayStation 5", 400));
            repo.save(new Game(26, "Apex Legends", 2019, 0, "Respawn Entertainment", "Battle Royale", "PC", 999));
            repo.save(new Game(27, "Fortnite", 2017, 0, "Epic Games", "Battle Royale", "PC", 999));
            repo.save(new Game(28, "PUBG: Battlegrounds", 2017, 0, "Krafton", "Battle Royale", "PC", 999));
            repo.save(new Game(29, "Minecraft", 2011, 29, "Mojang Studios", "Sandbox", "PC", 700));
            repo.save(new Game(30, "Terraria", 2011, 9, "Re-Logic", "Sandbox", "PC", 850));
            repo.save(new Game(31, "Stardew Valley", 2016, 14, "ConcernedApe", "Simulation", "Nintendo Switch", 600));
            repo.save(new Game(32, "Animal Crossing: New Horizons", 2020, 59, "Nintendo", "Simulation", "Nintendo Switch", 450));
            repo.save(new Game(33, "Super Mario Odyssey", 2017, 59, "Nintendo", "Platformer", "Nintendo Switch", 320));
            repo.save(new Game(34, "Metroid Dread", 2021, 59, "Nintendo", "Action", "Nintendo Switch", 180));
            repo.save(new Game(35, "Splatoon 3", 2022, 59, "Nintendo", "Shooter", "Nintendo Switch", 260));
            repo.save(new Game(36, "Fire Emblem Engage", 2023, 59, "Intelligent Systems", "Strategy RPG", "Nintendo Switch", 140));
            repo.save(new Game(37, "Dark Souls III", 2016, 29, "FromSoftware", "Action RPG", "PC", 300));
            repo.save(new Game(38, "Sekiro: Shadows Die Twice", 2019, 39, "FromSoftware", "Action Adventure", "PC", 250));
            repo.save(new Game(39, "Bloodborne", 2015, 29, "FromSoftware", "Action RPG", "PlayStation 4", 270));
            repo.save(new Game(40, "Final Fantasy XVI", 2023, 69, "Square Enix", "RPG", "PlayStation 5", 160));
            repo.save(new Game(41, "Final Fantasy VII Remake", 2020, 59, "Square Enix", "RPG", "PlayStation 4", 210));
            repo.save(new Game(42, "Persona 5 Royal", 2022, 49, "Atlus", "RPG", "PC", 200));
            repo.save(new Game(43, "Persona 3 Reload", 2024, 59, "Atlus", "RPG", "Xbox Series X", 150));
            repo.save(new Game(44, "Nier: Automata", 2017, 39, "PlatinumGames", "Action RPG", "PC", 190));
            repo.save(new Game(45, "Death Stranding", 2019, 39, "Kojima Productions", "Adventure", "PC", 170));
            repo.save(new Game(46, "Ghost of Tsushima", 2020, 59, "Sucker Punch Productions", "Action Adventure", "PlayStation 5", 200));
            repo.save(new Game(47, "Returnal", 2021, 49, "Housemarque", "Roguelike", "PlayStation 5", 120));
            repo.save(new Game(48, "Hades", 2020, 24, "Supergiant Games", "Roguelike", "PC", 500));
            repo.save(new Game(49, "Slay the Spire", 2019, 19, "MegaCrit", "Card Battler", "PC", 300));
            repo.save(new Game(50, "Celeste", 2018, 19, "Maddy Makes Games", "Platformer", "PC", 400));
            repo.save(new Game(51, "Hollow Knight", 2017, 14, "Team Cherry", "Metroidvania", "PC", 500));
            repo.save(new Game(52, "Cuphead", 2017, 19, "Studio MDHR", "Platformer", "Xbox Series X", 380));
            repo.save(new Game(53, "Dead Cells", 2018, 24, "Motion Twin", "Roguelike", "PC", 340));
            repo.save(new Game(54, "Among Us", 2018, 5, "Innersloth", "Party", "PC", 999));
            repo.save(new Game(55, "Fall Guys", 2020, 0, "Mediatonic", "Party", "PlayStation 5", 999));
            repo.save(new Game(56, "The Sims 4", 2014, 0, "Maxis", "Simulation", "PC", 999));
            repo.save(new Game(57, "Cities: Skylines II", 2023, 49, "Colossal Order", "Simulation", "PC", 200));
            repo.save(new Game(58, "No Man’s Sky", 2016, 39, "Hello Games", "Adventure", "PC", 250));
            repo.save(new Game(59, "Subnautica", 2018, 29, "Unknown Worlds", "Survival", "PC", 270));
            repo.save(new Game(60, "Valheim", 2021, 19, "Iron Gate Studio", "Survival", "PC", 340));
        }

    }
}
