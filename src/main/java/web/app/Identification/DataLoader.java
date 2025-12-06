package web.app.Identification;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import web.app.Repositories.GameRepository;
import web.app.Repositories.ImagesRepository;
import web.app.Repositories.RequirementsRepository;

@Component
public class DataLoader {
    private final GameRepository GamesRepo;
    private final RequirementsRepository RequirementsRepo;
    private final ImagesRepository ImagesRepo;

    public DataLoader(GameRepository GamesRepo, RequirementsRepository RequirementsRepo, ImagesRepository ImagesRepo) {
        this.GamesRepo = GamesRepo;
        this.RequirementsRepo = RequirementsRepo;
        this.ImagesRepo = ImagesRepo;
    }

    @PostConstruct
    public void loadData() {
        if (GamesRepo.count() == 0) {


            /// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            GamesRepo.save(new Game(1, "Starfield", 2023, 69, "Bethesda Game Studios", "RPG", "Xbox Series X", 145,
                    "Starfield is the first new universe in over 25 years from Bethesda Game Studios. In this next-generation role-playing game set amongst the stars, create any character you want and explore with unparalleled freedom as you embark on an epic journey to answer humanity’s greatest mystery."));

            GamesRepo.save(new Game(2, "God of War", 2018, 49, "Santa Monica Studio", "RPG", "PlayStation 4", 120,
                    "His vengeance against the Gods of Olympus years behind him, Kratos now lives as a man in the realm of Norse Gods and monsters. It is in this harsh, unforgiving world that he must fight to survive… and teach his son to do the same."));

            GamesRepo.save(new Game(3, "Xenoblade Chronicles 3", 2022, 59, "Monolith Soft", "RPG", "Nintendo Switch", 95,
                    "Join Noah and Mio, members of the two opposing nations of Keves and Agnus, on a heartfelt journey through a warring world with a dark secret. Traverse massive, fantastical landscapes and master seamless real-time RPG combat in this sprawling adventure."));

            GamesRepo.save(new Game(4, "Baldur’s Gate 3", 2023, 59, "Larian Studios", "RPG", "PC", 200,
                    "Gather your party and return to the Forgotten Realms in a tale of fellowship and betrayal, sacrifice and survival, and the lure of absolute power. Mysterious abilities are awakening inside you, drawn from a mind flayer parasite planted in your brain. Resist, and turn darkness against itself."));

            GamesRepo.save(new Game(5, "Valheim", 2021, 19, "Iron Gate Studio", "Survival", "PC", 340,
                    "A brutal exploration and survival game for 1-10 players, set in a procedurally-generated purgatory inspired by viking culture. Battle, build, and conquer your way to a saga worthy of Odin’s patronage!"));

            GamesRepo.save(new Game(6, "Grounded", 2022, 39, "Obsidian Entertainment", "Survival", "Xbox Series X", 110,
                    "The world is a vast, beautiful and dangerous place – especially when you have been shrunk to the size of an ant. Explore, build, and survive together in this first-person cooperative survival-adventure."));

            GamesRepo.save(new Game(7, "Subnautica", 2018, 29, "Unknown Worlds", "Survival", "Nintendo Switch", 150,
                    "Descend into the depths of an alien underwater world filled with wonder and peril. Craft equipment, pilot submarines and out-smart wildlife to explore lush coral reefs, volcanoes, cave systems, and more - all while trying to survive."));

            GamesRepo.save(new Game(8, "Sons of the Forest", 2024, 29, "Endnight Games", "Survival", "PC", 180,
                    "Sent to find a missing billionaire on a remote island, you find yourself in a cannibal-infested hellscape. Craft, build, and struggle to survive, alone or with friends, in this terrifying new open-world survival horror simulator."));

            GamesRepo.save(new Game(9, "Nintendo Switch Sports", 2022, 39, "Nintendo", "Sports", "Nintendo Switch", 220,
                    "Swing, kick, and spike your way to victory in this collection of sports games that gets the whole family moving. Play Soccer, Volleyball, Bowling, Tennis, Badminton, and Chambara (Swordplay) using Joy-Con controllers."));

            GamesRepo.save(new Game(10, "NBA 2K24", 2023, 69, "Visual Concepts", "Sports", "PlayStation 5", 260,
                    "Grab your squad and experience the past, present, and future of hoops culture in NBA 2K24. Enjoy pure, authentic action and limitless personalized MyPLAYER options in MyCAREER. Collect an impressive array of legends and build your perfect lineup in MyTEAM."));

            GamesRepo.save(new Game(11, "EA Sports FC 24", 2023, 69, "EA Sports", "Sports", "Xbox Series X", 300,
                    "EA SPORTS FC 24 welcomes you to The World’s Game: the most true-to-football experience ever with HyperMotionV, PlayStyles optimized by Opta, and a revolutionized Frostbite Engine reinventing how 19,000+ authentic players move, play and look in every match."));

            GamesRepo.save(new Game(12, "Football Manager 2024", 2023, 59, "Sports Interactive", "Sports", "PC", 190,
                    "Step into the shoes of a real manager, building a world-class team to challenge for the biggest prizes in football. Progress never stops when you’re pursuing footballing greatness."));

            GamesRepo.save(new Game(13, "Halo Infinite", 2021, 59, "343 Industries", "Shooter", "Xbox Series X", 200,
                    "When all hope is lost and humanity’s fate hangs in the balance, the Master Chief is ready to confront the most ruthless foe he’s ever faced. Step inside the armor of humanity’s greatest hero to experience an epic adventure and explore the massive scale of the Halo ring."));

            GamesRepo.save(new Game(14, "Splatoon 3", 2022, 59, "Nintendo", "Shooter", "Nintendo Switch", 260,
                    "Enter the Splatlands, a sun-scorched desert inhabited by battle-hardened Inklings and Octolings. Ink, swim, and splat your way to the top in this colorful, chaotic, and action-packed team shooter."));

            GamesRepo.save(new Game(15, "Helldivers 2", 2024, 39, "Arrowhead Game Studios", "Shooter", "PlayStation 5", 450,
                    "Join the Helldivers and fight for freedom with friends across a hostile galaxy in this fast, frantic, and ferocious third-person shooter. Unleash massive weaponry and stratagems to defeat alien threats and spread managed democracy."));

            GamesRepo.save(new Game(16, "Counter-Strike 2", 2023, 0, "Valve", "Shooter", "PC", 999,
                    "For over two decades, Counter-Strike has offered an elite competitive experience, one shaped by millions of players from across the globe. And now the next chapter in the CS story is about to begin. This is Counter-Strike 2."));

            GamesRepo.save(new Game(17, "Super Smash Bros. Ultimate", 2018, 59, "Nintendo", "Fighting", "Nintendo Switch", 500,
                    "Gaming icons clash in the ultimate brawl you can play anytime, anywhere! Smash rivals off the stage as new characters Simon Belmont and King K. Rool join Inkling, Ridley, and every fighter in Super Smash Bros. history."));

            GamesRepo.save(new Game(18, "Tekken 8", 2024, 69, "Bandai Namco", "Fighting", "PlayStation 5", 120,
                    "The Mishima saga continues. Tekken 8 brings the fight to the next generation, powered by Unreal Engine 5. destructive environments, stunning character models, and a new aggressive gameplay system make this the most thrilling Tekken yet."));

            GamesRepo.save(new Game(19, "Street Fighter 6", 2023, 59, "Capcom", "Fighting", "PC", 150,
                    "Here comes a new challenger! Street Fighter 6 represents the next evolution of the series. Powered by Capcom’s proprietary RE ENGINE, the Street Fighter 6 experience spans three distinct game modes featuring World Tour, Fighting Ground and Battle Hub."));

            GamesRepo.save(new Game(20, "Killer Instinct", 2013, 0, "Iron Galaxy", "Fighting", "Xbox Series X", 100,
                    "The legendary fighting franchise is back with over-the-top action, a wild cast of combatants, rocking reactive music, and C-C-C-COMBO BREAKERS! Choose your ultimate combatants each with fluid animations, unique tactics, and enthralling special attacks."));

            GamesRepo.save(new Game(21, "Forza Horizon 5", 2021, 59, "Playground Games", "Racing", "Xbox Series X", 300,
                    "Your Ultimate Horizon Adventure awaits! Explore the vibrant and ever-evolving open world landscapes of Mexico with limitless, fun driving action in hundreds of the world’s greatest cars."));

            GamesRepo.save(new Game(22, "Gran Turismo 7", 2022, 69, "Polyphony Digital", "Racing", "PlayStation 5", 210,
                    "Gran Turismo 7 brings together the very best features of the Real Driving Simulator. Whether you’re a competitive or casual racer, collector, tuner, livery designer, or photographer – find your line with a staggering collection of game modes."));

            GamesRepo.save(new Game(23, "Mario Kart 8 Deluxe", 2017, 59, "Nintendo", "Racing", "Nintendo Switch", 600,
                    "Hit the road with the definitive version of Mario Kart 8 and play anytime, anywhere! Race your friends or battle them in a revised battle mode on new and returning battle courses."));

            GamesRepo.save(new Game(24, "Assetto Corsa Competizione", 2019, 39, "Kunos Simulazioni", "Racing", "PC", 130,
                    "The official GT World Challenge videogame. With extraordinary quality of simulation, the game allows you to experience the real atmosphere of the GT3 championship, competing against official drivers, teams, cars and circuits."));

            GamesRepo.save(new Game(25, "Elden Ring", 2022, 59, "FromSoftware", "RPG", "PC", 300,
                    "Elden Ring is an expansive and intricately designed open-world RPG that challenges players with its deep lore, strategic combat, and countless exploration opportunities. Players can engage in dynamic battles, master a variety of weapons and magic, and uncover hidden secrets that enrich the overarching narrative."));


            /// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


            RequirementsRepo.save(new Requirements(1, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(2, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(3, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(4, "Windows 10", "Intel i5-4690", "8 GB", "GTX 970", "150 GB",
                    "Windows 10", "Intel i7-8700K", "16 GB", "RTX 2060 Super", "150 GB"));

            RequirementsRepo.save(new Requirements(5, "Windows 10", "Intel i5-2500K", "8 GB", "GTX 950", "1 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 1060", "1 GB"));

            RequirementsRepo.save(new Requirements(6, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(7, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(8, "Windows 10", "Intel i5-8400", "12 GB", "GTX 1060", "20 GB",
                    "Windows 10", "Intel i7-8700K", "16 GB", "GTX 1080 Ti", "20 GB"));

            RequirementsRepo.save(new Requirements(9, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(10, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(11, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(12, "Windows 10", "Intel Core 2 Duo", "4 GB", "Intel GMA X4500", "7 GB",
                    "Windows 10", "Intel i5-8600", "8 GB", "GTX 960", "7 GB"));

            RequirementsRepo.save(new Requirements(13, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(14, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(15, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(16, "Windows 10", "Intel i5-750", "8 GB", "GTX 660", "85 GB",
                    "Windows 10", "Intel i7-9700K", "16 GB", "RTX 2070", "85 GB"));

            RequirementsRepo.save(new Requirements(17, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(18, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(19, "Windows 10", "Intel i5-7500", "8 GB", "GTX 1060", "60 GB",
                    "Windows 10", "Intel i7-8700", "16 GB", "RTX 2070", "60 GB"));

            RequirementsRepo.save(new Requirements(20, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(21, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(22, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(23, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(24, "Windows 10", "Intel i5-4460", "4 GB", "GTX 460", "50 GB",
                    "Windows 10", "Intel i5-8600K", "16 GB", "GTX 1070", "50 GB"));

            RequirementsRepo.save(new Requirements(25, "Windows 10", "Intel i5-8400", "12 GB", "GTX 1060", "60 GB",
                    "Windows 10", "Intel i7-8700K", "16 GB", "GTX 1070", "60 GB"));


            /// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            ImagesRepo.save(new Images(1, "/Images/CoverArt/starfield_ca.jpg", "/Images/Background/starfield_bg.jpg",
                    "/Images/Screenshots/starfield_sc1.jpg", "/Images/Screenshots/starfield_sc2.jpg", "/Images/Screenshots/starfield_sc3.jpg"));

            ImagesRepo.save(new Images(2, "/Images/CoverArt/godofwar_ca.jpg", "/Images/Background/godofwar_bg.jpg",
                    "/Images/Screenshots/godofwar_sc1.jpg", "/Images/Screenshots/godofwar_sc2.jpg", "/Images/Screenshots/godofwar_sc3.jpg"));

            ImagesRepo.save(new Images(3, "/Images/CoverArt/xenoblade3_ca.jpg", "/Images/Background/xenoblade3_bg.jpg",
                    "/Images/Screenshots/xenoblade3_sc1.jpg", "/Images/Screenshots/xenoblade3_sc2.jpg", "/Images/Screenshots/xenoblade3_sc3.jpg"));

            ImagesRepo.save(new Images(4, "/Images/CoverArt/bg3_ca.jpg", "/Images/Background/bg3_bg.jpg",
                    "/Images/Screenshots/bg3_sc1.jpg", "/Images/Screenshots/bg3_sc2.jpg", "/Images/Screenshots/bg3_sc3.jpg"));

            ImagesRepo.save(new Images(5, "/Images/CoverArt/valheim_ca.jpg", "/Images/Background/valheim_bg.jpg",
                    "/Images/Screenshots/valheim_sc1.jpg", "/Images/Screenshots/valheim_sc2.jpg", "/Images/Screenshots/valheim_sc3.jpg"));

            ImagesRepo.save(new Images(6, "/Images/CoverArt/grounded_ca.jpg", "/Images/Background/grounded_bg.jpg",
                    "/Images/Screenshots/grounded_sc1.jpg", "/Images/Screenshots/grounded_sc2.jpg", "/Images/Screenshots/grounded_sc3.jpg"));

            ImagesRepo.save(new Images(7, "/Images/CoverArt/subnautica_ca.jpg", "/Images/Background/subnautica_bg.jpg",
                    "/Images/Screenshots/subnautica_sc1.jpg", "/Images/Screenshots/subnautica_sc2.jpg", "/Images/Screenshots/subnautica_sc3.jpg"));

            ImagesRepo.save(new Images(8, "/Images/CoverArt/sonsoftheforest_ca.jpg", "/Images/Background/sonsoftheforest_bg.jpg",
                    "/Images/Screenshots/sonsoftheforest_sc1.jpg", "/Images/Screenshots/sonsoftheforest_sc2.jpg", "/Images/Screenshots/sonsoftheforest_sc3.jpg"));

            ImagesRepo.save(new Images(9, "/Images/CoverArt/switchsports_ca.jpg", "/Images/Background/switchsports_bg.jpg",
                    "/Images/Screenshots/switchsports_sc1.jpg", "/Images/Screenshots/switchsports_sc2.jpg", "/Images/Screenshots/switchsports_sc3.jpg"));

            ImagesRepo.save(new Images(10, "/Images/CoverArt/nba2k24_ca.jpg", "/Images/Background/nba2k24_bg.jpg",
                    "/Images/Screenshots/nba2k24_sc1.jpg", "/Images/Screenshots/nba2k24_sc2.jpg", "/Images/Screenshots/nba2k24_sc3.jpg"));

            ImagesRepo.save(new Images(11, "/Images/CoverArt/fc24_ca.jpg", "/Images/Background/fc24_bg.jpg",
                    "/Images/Screenshots/fc24_sc1.jpg", "/Images/Screenshots/fc24_sc2.jpg", "/Images/Screenshots/fc24_sc3.jpg"));

            ImagesRepo.save(new Images(12, "/Images/CoverArt/fm2024_ca.jpg", "/Images/Background/fm2024_bg.jpg",
                    "/Images/Screenshots/fm2024_sc1.jpg", "/Images/Screenshots/fm2024_sc2.jpg", "/Images/Screenshots/fm2024_sc3.jpg"));

            ImagesRepo.save(new Images(13, "/Images/CoverArt/haloinfinite_ca.jpg", "/Images/Background/haloinfinite_bg.jpg",
                    "/Images/Screenshots/haloinfinite_sc1.jpg", "/Images/Screenshots/haloinfinite_sc2.jpg", "/Images/Screenshots/haloinfinite_sc3.jpg"));

            ImagesRepo.save(new Images(14, "/Images/CoverArt/splatoon3_ca.jpg", "/Images/Background/splatoon3_bg.jpg",
                    "/Images/Screenshots/splatoon3_sc1.jpg", "/Images/Screenshots/splatoon3_sc2.jpg", "/Images/Screenshots/splatoon3_sc3.jpg"));

            ImagesRepo.save(new Images(15, "/Images/CoverArt/helldivers2_ca.jpg", "/Images/Background/helldivers2_bg.jpg",
                    "/Images/Screenshots/helldivers2_sc1.jpg", "/Images/Screenshots/helldivers2_sc2.jpg", "/Images/Screenshots/helldivers2_sc3.jpg"));

            ImagesRepo.save(new Images(16, "/Images/CoverArt/cs2_ca.jpg", "/Images/Background/cs2_bg.jpg",
                    "/Images/Screenshots/cs2_sc1.jpg", "/Images/Screenshots/cs2_sc2.jpg", "/Images/Screenshots/cs2_sc3.jpg"));

            ImagesRepo.save(new Images(17, "/Images/CoverArt/smashultimate_ca.jpg", "/Images/Background/smashultimate_bg.jpg",
                    "/Images/Screenshots/smashultimate_sc1.jpg", "/Images/Screenshots/smashultimate_sc2.jpg", "/Images/Screenshots/smashultimate_sc3.jpg"));

            ImagesRepo.save(new Images(18, "/Images/CoverArt/tekken8_ca.jpg", "/Images/Background/tekken8_bg.jpg",
                    "/Images/Screenshots/tekken8_sc1.jpg", "/Images/Screenshots/tekken8_sc2.jpg", "/Images/Screenshots/tekken8_sc3.jpg"));

            ImagesRepo.save(new Images(19, "/Images/CoverArt/sf6_ca.jpg", "/Images/Background/sf6_bg.jpg",
                    "/Images/Screenshots/sf6_sc1.jpg", "/Images/Screenshots/sf6_sc2.jpg", "/Images/Screenshots/sf6_sc3.jpg"));

            ImagesRepo.save(new Images(20, "/Images/CoverArt/killerinstinct_ca.jpg", "/Images/Background/killerinstinct_bg.jpg",
                    "/Images/Screenshots/killerinstinct_sc1.jpg", "/Images/Screenshots/killerinstinct_sc2.jpg", "/Images/Screenshots/killerinstinct_sc3.jpg"));

            ImagesRepo.save(new Images(21, "/Images/CoverArt/fh5_ca.jpg", "/Images/Background/fh5_bg.jpg",
                    "/Images/Screenshots/fh5_sc1.jpg", "/Images/Screenshots/fh5_sc2.jpg", "/Images/Screenshots/fh5_sc3.jpg"));

            ImagesRepo.save(new Images(22, "/Images/CoverArt/gt7_ca.jpg", "/Images/Background/gt7_bg.jpg",
                    "/Images/Screenshots/gt7_sc1.jpg", "/Images/Screenshots/gt7_sc2.jpg", "/Images/Screenshots/gt7_sc3.jpg"));

            ImagesRepo.save(new Images(23, "/Images/CoverArt/mk8dx_ca.jpg", "/Images/Background/mk8dx_bg.jpg",
                    "/Images/Screenshots/mk8dx_sc1.jpg", "/Images/Screenshots/mk8dx_sc2.jpg", "/Images/Screenshots/mk8dx_sc3.jpg"));

            ImagesRepo.save(new Images(24, "/Images/CoverArt/acc_ca.jpg", "/Images/Background/acc_bg.jpg",
                    "/Images/Screenshots/acc_sc1.jpg", "/Images/Screenshots/acc_sc2.jpg", "/Images/Screenshots/acc_sc3.jpg"));

            ImagesRepo.save(new Images(25, "/Images/CoverArt/eldenring_ca.jpg", "/Images/Background/eldenring_bg.jpg",
                    "/Images/Screenshots/eldenring_sc1.jpg", "/Images/Screenshots/eldenring_sc2.jpg", "/Images/Screenshots/eldenring_sc3.jpg"));
        }
    }
}