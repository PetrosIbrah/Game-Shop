package web.app.Identification;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import web.app.Repository.GameRepository;
import web.app.Repository.ImagesRepository;
import web.app.Repository.RequirementsRepository;

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
            GamesRepo.save(new Game(1, "Elden Ring", 2022, 59, "FromSoftware", "RPG", "PC", 67,
                    "Elden Ring is an expansive and intricately designed open-world RPG that challenges players with its deep lore, strategic combat, and countless exploration opportunities. Set in a vast, beautifully crafted world, the game offers a multitude of environments to traverse, from dark forests and towering castles to treacherous dungeons filled with formidable foes. Players can engage in dynamic battles, master a variety of weapons and magic, and uncover hidden secrets that enrich the overarching narrative. The game emphasizes both player skill and tactical thinking, providing a rewarding experience for those who enjoy immersive storytelling, complex character progression, and the thrill of overcoming challenging encounters. With countless quests, rich character interactions, and a world teeming with life and mystery, Elden Ring delivers an unforgettable journey for RPG enthusiasts and adventurers alike."));

            GamesRepo.save(new Game(2, "God Of War", 2022, 69, "Santa Monica Studio", "Action Adventure", "PC", 420,
                    "God Of War delivers an epic action-adventure experience set in a meticulously crafted mythological world. Players follow the story of Kratos and his son as they traverse breathtaking landscapes, from snowy mountains to hidden realms full of danger and wonder. Combat is dynamic, blending strategic weapon usage, devastating combos, and mythic powers that require skill and precision. The game offers a rich narrative that explores the bonds of family, vengeance, and redemption, alongside challenging puzzles and hidden secrets. With stunning visuals, immersive sound design, and a world full of life, God Of War captivates players who enjoy story-driven adventures and intense action gameplay."));

            GamesRepo.save(new Game(3, "The Legend of Zelda: Tears of the Kingdom", 2023, 69, "Nintendo", "Adventure", "Nintendo Switch", 150,
                    "The Legend of Zelda: Tears of the Kingdom is a sprawling adventure that invites players to explore an enchanting world filled with mysteries, ancient ruins, and dangerous enemies. The game combines intricate puzzles, thrilling combat, and a deep narrative that unfolds through exploration and interaction with the environment. Players can discover hidden treasures, master unique abilities, and interact with a diverse cast of characters that enrich the story. The game emphasizes creativity, freedom, and strategic thinking, allowing players to approach challenges in multiple ways. With its vibrant world, compelling lore, and endless opportunities for discovery, Tears of the Kingdom offers an unforgettable experience for fans of adventure and exploration."));

            GamesRepo.save(new Game(4, "Cyberpunk 2077", 2020, 39, "CD Projekt Red", "RPG", "PC", 230,
                    "Cyberpunk 2077 immerses players in a neon-drenched futuristic city where choices and consequences shape the unfolding narrative. The game combines open-world exploration with deep role-playing mechanics, offering countless ways to develop your character, acquire advanced technology, and engage in high-stakes combat. From the bustling streets to shadowy back alleys, every corner of the city is filled with interactive elements, side quests, and secrets waiting to be discovered. Players can experience a complex story full of moral dilemmas, intriguing characters, and intense action sequences. With its detailed world, layered narrative, and extensive customization options, Cyberpunk 2077 delivers a rich and captivating RPG experience."));

            GamesRepo.save(new Game(5, "Red Dead Redemption 2", 2018, 49, "Rockstar Games", "Action Adventure", "PlayStation 5", 180,
                    "Red Dead Redemption 2 offers an immersive and cinematic action-adventure experience set in a vast, meticulously detailed open world inspired by the American frontier. Players follow the story of Arthur Morgan and the Van der Linde gang, navigating morally complex situations and forging relationships that shape the narrative. The game emphasizes exploration, with dynamic environments, wildlife, and a variety of side activities that bring the world to life. Combat, hunting, and strategy all play crucial roles, while the richly crafted story delves into loyalty, survival, and the consequences of choice. With stunning visuals, realistic mechanics, and a living world, Red Dead Redemption 2 delivers a deeply engaging and unforgettable adventure."));

            GamesRepo.save(new Game(6, "Horizon Forbidden West", 2022, 59, "Guerrilla Games", "Action RPG", "PlayStation 5", 95,
                    "Horizon Forbidden West is an action-packed RPG that transports players to a post-apocalyptic world dominated by colossal mechanical creatures. Players take on the role of Aloy, a skilled hunter and archer, as they explore diverse landscapes from lush forests to arid deserts and uncover a narrative rich with ancient mysteries. Combat blends ranged weaponry, tactical stealth, and strategic traps to challenge players’ skills. The game features complex quests, engaging side stories, and a dynamic ecosystem full of surprises. With breathtaking visuals, an immersive soundtrack, and expansive gameplay mechanics, Horizon Forbidden West offers a thrilling and unforgettable journey through a beautifully crafted world."));

            GamesRepo.save(new Game(7, "The Witcher 3: Wild Hunt", 2015, 29, "CD Projekt Red", "RPG", "PC", 250,
                    "The Witcher 3: Wild Hunt is an epic role-playing adventure that invites players into a richly detailed medieval fantasy world filled with magic, monsters, and political intrigue. Players follow Geralt of Rivia, a skilled monster hunter, as they navigate intricate quests, form alliances, and make impactful choices that shape the world around them. Combat requires strategic thinking, preparation, and mastery of magical signs and weaponry. The game features vast landscapes, a deep narrative, and a diverse cast of characters with compelling storylines. With immersive storytelling, dynamic environments, and countless hours of exploration, The Witcher 3 offers an unforgettable RPG experience for fans of epic adventures."));

            GamesRepo.save(new Game(8, "Resident Evil 4 Remake", 2023, 59, "Capcom", "Survival Horror", "PlayStation 5", 110,
                    "Resident Evil 4 Remake revitalizes the classic survival horror experience, placing players in a suspenseful and terrifying world full of mutated enemies and intense action. Players control Leon S. Kennedy as he navigates eerie villages, infested forests, and ominous castles while uncovering dark conspiracies. The game emphasizes resource management, strategic combat, and problem-solving, blending fast-paced action with atmospheric tension. Stunning visuals, cinematic sequences, and refined gameplay mechanics heighten the immersion. With chilling encounters, complex characters, and a gripping storyline, Resident Evil 4 Remake delivers a modernized and unforgettable horror adventure."));

            GamesRepo.save(new Game(9, "Spider-Man 2", 2023, 69, "Insomniac Games", "Action Adventure", "PlayStation 5", 160,
                    "Spider-Man 2 swings players into the thrilling world of superhero action and exploration, combining fast-paced combat with dynamic traversal across a richly detailed cityscape. Players assume the role of Spider-Man, mastering web-swinging, acrobatics, and advanced combat techniques to thwart villains and protect the city. The game emphasizes engaging storylines, side missions, and iconic characters that expand the universe. With fluid mechanics, stunning graphics, and a living urban environment, Spider-Man 2 provides an exhilarating experience for fans of superhero adventures and action-packed gameplay."));

            GamesRepo.save(new Game(10, "Baldur’s Gate 3", 2023, 69, "Larian Studios", "RPG", "PC", 130,
                    "Baldur’s Gate 3 is a deeply immersive role-playing game that transports players to a rich fantasy world filled with magic, complex characters, and strategic combat. Players create and customize their heroes, making choices that shape the story, relationships, and outcomes of quests. Tactical turn-based combat requires careful planning, use of spells, and positioning, while exploration offers secrets, hidden treasures, and narrative depth. The game features expansive dialogue, branching storylines, and cooperative multiplayer, allowing players to experience adventures alongside friends. With deep lore, intricate mechanics, and an engaging narrative, Baldur’s Gate 3 is a must-play RPG for enthusiasts of fantasy storytelling and strategic gameplay."));

            GamesRepo.save(new Game(11, "Starfield", 2023, 69, "Bethesda Game Studios", "RPG", "Xbox Series X", 145,
                    "Starfield is a vast open-world space RPG that allows players to explore countless star systems, planets, and civilizations. Players can pilot spacecraft, engage in deep role-playing interactions, and shape their character’s story through choices that impact the universe. The game combines exploration, strategic combat, and narrative-driven missions, providing a rich and immersive experience. With stunning visuals, detailed world-building, and complex gameplay mechanics, Starfield invites players to embark on a truly cosmic adventure where every decision can alter the course of their interstellar journey."));

            GamesRepo.save(new Game(12, "Sea of Thieves", 2018, 39, "Rare", "Adventure", "Xbox Series X", 180,
                    "Sea of Thieves offers a cooperative pirate adventure in a vibrant open world filled with treasure, danger, and discovery. Players sail the high seas, battle rival crews, explore mysterious islands, and complete quests while encountering dynamic events and hidden secrets. The game emphasizes teamwork, strategy, and creativity, allowing players to approach challenges in numerous ways. With engaging visuals, lively environments, and a sense of freedom on the open water, Sea of Thieves provides a unique and endlessly replayable adventure for those seeking high-seas thrills."));

            GamesRepo.save(new Game(13, "Halo Infinite", 2021, 49, "343 Industries", "Shooter", "Xbox Series X", 200,
                    "Halo Infinite continues the iconic shooter saga with an epic blend of fast-paced combat, exploration, and storytelling. Players take on the role of Master Chief, battling alien forces across diverse environments, from vast open landscapes to detailed battle arenas. The game features advanced weaponry, vehicles, and tactical combat mechanics, as well as a rich narrative that builds on decades of franchise history. Multiplayer modes offer competitive and cooperative experiences, ensuring endless engagement. With stunning graphics, immersive sound design, and a compelling universe, Halo Infinite delivers a thrilling experience for fans of first-person shooters."));

            GamesRepo.save(new Game(14, "Forza Horizon 5", 2021, 59, "Playground Games", "Racing", "Xbox Series X", 300,
                    "Forza Horizon 5 is an open-world racing game that immerses players in a visually stunning and dynamic world inspired by Mexico. Players can drive hundreds of cars, participate in diverse events, and explore varied landscapes from deserts and jungles to bustling cities. The game combines fast-paced racing, customization, and community-driven challenges, offering both casual and competitive experiences. With attention to detail in vehicle physics, environmental effects, and extensive personalization options, Forza Horizon 5 delivers an exhilarating racing adventure that appeals to both casual players and automotive enthusiasts."));

            GamesRepo.save(new Game(15, "FIFA 24", 2023, 69, "EA Sports", "Sports", "PlayStation 5", 500,
                    "FIFA 24 brings the excitement of world-class football to life with realistic gameplay, updated rosters, and immersive stadium atmospheres. Players can participate in career modes, online competitions, and custom tournaments, mastering tactics, player skills, and team strategies. The game features lifelike player movements, strategic AI, and detailed visuals that capture the thrill of the sport. With deep customization, cooperative play, and competitive modes, FIFA 24 provides an authentic football experience for fans seeking both realism and engaging gameplay."));

            GamesRepo.save(new Game(16, "NBA 2K24", 2023, 69, "Visual Concepts", "Sports", "PlayStation 5", 260,
                    "NBA 2K24 offers a highly realistic basketball simulation experience, combining dynamic gameplay, strategic team management, and engaging story modes. Players can create and develop their own athletes, participate in online leagues, or relive iconic NBA moments. The game emphasizes precise controls, tactical thinking, and authentic player interactions, while the visuals and animations capture the intensity of real-life basketball. With robust customization options, immersive commentary, and competitive multiplayer, NBA 2K24 provides an all-encompassing experience for basketball fans and simulation enthusiasts alike."));

            GamesRepo.save(new Game(17, "Mortal Kombat 1", 2023, 69, "NetherRealm Studios", "Fighting", "PC", 140,
                    "Mortal Kombat 1 revitalizes the legendary fighting franchise with brutal combat, cinematic storytelling, and highly detailed character designs. Players engage in fast-paced battles using unique moves, combos, and special abilities to defeat opponents across dynamic arenas. The game emphasizes skill, strategy, and timing, rewarding mastery of each fighter’s distinct fighting style. With an engaging storyline, immersive visuals, and competitive modes, Mortal Kombat 1 offers an adrenaline-pumping experience that appeals to both longtime fans and newcomers to the series."));

            GamesRepo.save(new Game(18, "Tekken 8", 2024, 69, "Bandai Namco", "Fighting", "PlayStation 5", 120,
                    "Tekken 8 delivers an intense fighting game experience with stunning visuals, fluid combat mechanics, and a diverse roster of characters. Players engage in fast-paced duels, combining skillful combos, strategic moves, and unique abilities to outmaneuver opponents. The game offers a rich story mode that delves into the complex relationships and rivalries of its characters, alongside competitive multiplayer for global battles. With precise controls, cinematic presentation, and continuous gameplay depth, Tekken 8 offers both thrilling single-player and competitive fighting experiences."));

            GamesRepo.save(new Game(19, "Street Fighter 6", 2023, 59, "Capcom", "Fighting", "PC", 150,
                    "Street Fighter 6 revitalizes the classic fighting franchise with innovative mechanics, dynamic combat, and a visually stunning presentation. Players can choose from a diverse roster of characters, each with unique abilities and fighting styles, to engage in fast-paced battles across multiple arenas. The game features a robust story mode, online multiplayer, and training options to enhance skills and strategies. With precise controls, cinematic visuals, and strategic depth, Street Fighter 6 delivers an exhilarating experience for both competitive fighters and casual fans."));

            GamesRepo.save(new Game(20, "Assassin’s Creed Mirage", 2023, 59, "Ubisoft", "Action Adventure", "PlayStation 5", 210,
                    "Assassin’s Creed Mirage immerses players in a rich historical world filled with intrigue, stealth, and adventure. Players control a master assassin navigating bustling cities, ancient ruins, and secret passages to uncover conspiracies and execute precise missions. The game emphasizes parkour, combat, and strategy, allowing multiple approaches to challenges and objectives. With an expansive narrative, detailed environments, and engaging side quests, Assassin’s Creed Mirage provides an unforgettable action-adventure experience where history and stealth collide."));

            GamesRepo.save(new Game(21, "Far Cry 6", 2021, 49, "Ubisoft", "Shooter", "Xbox Series X", 240,
                    "Far Cry 6 plunges players into a vibrant open-world environment dominated by guerrilla warfare, political intrigue, and explosive action. Players assume the role of a resistance fighter aiming to overthrow a tyrannical regime, navigating jungles, urban areas, and coastal landscapes. The game combines tactical combat, vehicle use, and a variety of weapons to create dynamic encounters. With immersive storytelling, rich character development, and a living world filled with challenges and surprises, Far Cry 6 offers a thrilling first-person shooter experience that balances action, strategy, and exploration."));

            GamesRepo.save(new Game(22, "Rainbow Six Siege", 2015, 19, "Ubisoft", "Shooter", "PC", 600,
                    "Rainbow Six Siege is a tactical shooter emphasizing strategy, teamwork, and environmental manipulation. Players take on roles of elite operators, each with unique gadgets and abilities, to engage in intense multiplayer battles. The game focuses on coordinated attacks, defensive strategies, and real-time decision-making, rewarding players who master communication and precise execution. With destructible environments, varied maps, and continuous updates, Rainbow Six Siege provides a highly competitive and dynamic experience for players seeking challenging tactical gameplay."));

            GamesRepo.save(new Game(23, "Overwatch 2", 2022, 0, "Blizzard Entertainment", "Shooter", "PC", 999,
                    "Overwatch 2 is a team-based multiplayer shooter that emphasizes fast-paced action, teamwork, and hero-based gameplay. Players choose from a diverse roster of characters, each with unique abilities, and engage in strategic battles across visually detailed maps. The game focuses on cooperative objectives, dynamic combat, and continuous evolution of content to keep gameplay fresh and engaging. With its vibrant art style, immersive mechanics, and collaborative challenges, Overwatch 2 delivers an exciting experience for players seeking fast, strategic, and rewarding team-based action."));

            GamesRepo.save(new Game(24, "Diablo IV", 2023, 69, "Blizzard Entertainment", "Action RPG", "PC", 180,
                    "Diablo IV immerses players in a dark, gothic world filled with monsters, magic, and epic battles. Players can choose from diverse character classes, customize abilities, and embark on quests that shape the unfolding story. The game emphasizes skillful combat, strategic planning, and exploration of vast environments, including dungeons, forests, and cursed lands. With a rich narrative, cooperative multiplayer, and endless opportunities for loot collection and character progression, Diablo IV offers a deeply engaging and atmospheric action RPG experience."));

            GamesRepo.save(new Game(25, "Call of Duty: Modern Warfare III", 2023, 69, "Infinity Ward", "Shooter", "PlayStation 5", 400,
                    "Call of Duty: Modern Warfare III delivers a high-intensity shooter experience with cinematic storytelling, fast-paced multiplayer, and strategic combat. Players engage in global military operations, navigating realistic environments and employing advanced weaponry and tactics. The game features a gripping single-player campaign alongside competitive multiplayer modes, allowing players to test skills against others online. With immersive graphics, realistic sound design, and complex mission scenarios, Modern Warfare III provides an adrenaline-fueled experience for fans of action-packed military shooters."));

            GamesRepo.save(new Game(26, "Apex Legends", 2019, 0, "Respawn Entertainment", "Battle Royale", "PC", 999,
                    "Apex Legends is a free-to-play battle royale that combines fast-paced shooting, strategic teamwork, and unique character abilities. Players form squads, select Legends with distinctive powers, and compete in a dynamic shrinking map to survive and claim victory. The game emphasizes communication, adaptability, and tactical decision-making, while continuous updates and seasonal events keep gameplay fresh. With fluid mechanics, diverse arenas, and a competitive community, Apex Legends delivers a thrilling, high-energy battle royale experience for casual and hardcore players alike."));

            GamesRepo.save(new Game(27, "Fortnite", 2017, 0, "Epic Games", "Battle Royale", "PC", 999,
                    "Fortnite is a vibrant, fast-paced battle royale game that combines shooting, building, and strategic gameplay. Players compete to be the last one standing in dynamic arenas while constructing defenses, gathering resources, and customizing characters. The game features frequent updates, events, and creative modes, allowing endless replayability and unique experiences. With colorful visuals, engaging mechanics, and a large community, Fortnite provides a fun and competitive experience that appeals to players of all ages."));

            GamesRepo.save(new Game(28, "PUBG: Battlegrounds", 2017, 0, "Krafton", "Battle Royale", "PC", 999,
                    "PUBG: Battlegrounds is a pioneering battle royale game that immerses players in realistic combat scenarios on large, open maps. Players scavenge for weapons, gear, and vehicles while strategically navigating shrinking safe zones. The game emphasizes tactical thinking, precision, and adaptability, rewarding careful planning and skilled execution. With diverse environments, solo and team modes, and competitive gameplay, PUBG offers an intense and immersive survival experience that defined the modern battle royale genre."));

            GamesRepo.save(new Game(29, "Minecraft", 2011, 29, "Mojang Studios", "Sandbox", "PC", 700,
                    "Minecraft is an open-world sandbox game that encourages creativity, exploration, and survival. Players can build intricate structures, mine resources, craft tools, and interact with a dynamic world filled with unique biomes and creatures. The game offers limitless possibilities for construction, adventure, and problem-solving, while multiplayer modes foster collaboration and competition. With its block-based world, procedural generation, and endless customization, Minecraft provides a deeply engaging experience for players of all ages who enjoy creativity and exploration."));

            GamesRepo.save(new Game(30, "Terraria", 2011, 9, "Re-Logic", "Sandbox", "PC", 850,
                    "Terraria is a sandbox adventure game that combines exploration, crafting, combat, and building in a procedurally generated world. Players can dig, build, and battle through diverse environments, encountering enemies, treasures, and hidden secrets. The game offers extensive customization, cooperative multiplayer, and challenging boss battles, providing countless hours of creative and strategic gameplay. With its charming visuals, dynamic environments, and endless possibilities, Terraria delivers a highly engaging experience for fans of sandbox adventures."));

            GamesRepo.save(new Game(31, "Stardew Valley", 2016, 14, "ConcernedApe", "Simulation", "Nintendo Switch", 600,
                    "Stardew Valley is a farming simulation and life management game that allows players to cultivate crops, raise animals, and build relationships with townspeople. Players can explore mines, fish, participate in festivals, and shape their farm and community. The game combines relaxing mechanics with strategic planning, offering a balance between work, exploration, and social interaction. With charming pixel art, immersive sound design, and a rich set of activities, Stardew Valley provides a deeply satisfying and endlessly replayable experience."));

            GamesRepo.save(new Game(32, "Animal Crossing: New Horizons", 2020, 59, "Nintendo", "Simulation", "Nintendo Switch", 450,
                    "Animal Crossing: New Horizons is a life simulation game where players develop and customize a deserted island into a thriving community. Players can design homes, gather resources, interact with villagers, and participate in seasonal events. The game encourages creativity, exploration, and social interaction, offering a relaxing yet engaging experience. With its charming visuals, open-ended gameplay, and continuous content updates, Animal Crossing: New Horizons provides a cozy and immersive world that players can shape at their own pace."));

            GamesRepo.save(new Game(33, "Super Mario Odyssey", 2017, 59, "Nintendo", "Platformer", "Nintendo Switch", 320,
                    "Super Mario Odyssey is a 3D platforming adventure where players journey across diverse worlds to rescue Princess Peach from Bowser. Players utilize Mario's signature jumping skills and the versatile companion, Cappy, to explore environments, solve puzzles, and defeat enemies. The game emphasizes creativity, exploration, and precision platforming, offering countless hidden secrets and collectibles. With vibrant visuals, dynamic gameplay mechanics, and a joyful soundtrack, Super Mario Odyssey delivers a fun, engaging, and memorable platforming experience."));

            GamesRepo.save(new Game(34, "Metroid Dread", 2021, 59, "Nintendo", "Action", "Nintendo Switch", 180,
                    "Metroid Dread is a side-scrolling action-adventure game that combines exploration, combat, and puzzle-solving in a mysterious alien world. Players control Samus Aran as she navigates hostile environments, utilizing advanced weaponry and abilities to overcome challenging enemies and obstacles. The game emphasizes precision, timing, and strategic thinking, with intricate level design and a compelling narrative. With atmospheric visuals, immersive sound, and engaging gameplay, Metroid Dread offers an intense and thrilling experience for fans of action-adventure games."));

            GamesRepo.save(new Game(35, "Splatoon 3", 2022, 59, "Nintendo", "Shooter", "Nintendo Switch", 260,
                    "Splatoon 3 is a fast-paced, colorful third-person shooter that emphasizes team-based combat and strategic territory control. Players use ink-based weapons to cover environments, navigate obstacles, and defeat opponents in vibrant arenas. The game offers multiplayer battles, customizable gear, and a variety of game modes that encourage teamwork and skillful play. With energetic visuals, dynamic environments, and continuous content updates, Splatoon 3 provides a fun, competitive, and engaging shooter experience for players of all skill levels."));

            GamesRepo.save(new Game(36, "Fire Emblem Engage", 2023, 59, "Intelligent Systems", "Strategy RPG", "Nintendo Switch", 140,
                    "Fire Emblem Engage is a tactical RPG that challenges players to command units in turn-based battles across strategically designed maps. Players can develop characters, form bonds, and utilize unique abilities to outmaneuver enemies. The game emphasizes planning, resource management, and strategic positioning, while also delivering a compelling narrative with rich character interactions. With immersive visuals, complex mechanics, and extensive customization, Fire Emblem Engage offers a deeply satisfying experience for fans of strategy and role-playing games."));

            GamesRepo.save(new Game(37, "Dark Souls III", 2016, 29, "FromSoftware", "Action RPG", "PC", 300,
                    "Dark Souls III is a challenging action RPG that immerses players in a dark, interconnected world filled with formidable enemies, hidden secrets, and epic boss encounters. Players must master combat mechanics, timing, and strategy to survive and progress through treacherous environments. The game emphasizes exploration, character progression, and player choice, rewarding skill and perseverance. With its atmospheric design, intricate lore, and punishing difficulty, Dark Souls III delivers a memorable and rewarding experience for fans of action RPGs."));

            GamesRepo.save(new Game(38, "Sekiro: Shadows Die Twice", 2019, 39, "FromSoftware", "Action Adventure", "PC", 250,
                    "Sekiro: Shadows Die Twice is an action-adventure game that blends precise combat, stealth, and exploration in a beautifully realized feudal Japan setting. Players control a skilled shinobi on a mission to rescue his lord and uncover dark secrets. The game emphasizes timing, skillful swordplay, and strategic encounters, rewarding careful planning and adaptability. With intricate level design, intense boss battles, and immersive storytelling, Sekiro offers a challenging and cinematic experience for fans of action and adventure games."));

            GamesRepo.save(new Game(39, "Bloodborne", 2015, 29, "FromSoftware", "Action RPG", "PlayStation 4", 270,
                    "Bloodborne is a gothic action RPG set in a dark, nightmarish world teeming with monstrous enemies and eldritch horrors. Players explore twisted streets, haunted forests, and intricate dungeons, engaging in fast-paced, strategic combat. The game emphasizes risk-reward mechanics, exploration, and mastering diverse weapons and abilities. With atmospheric visuals, haunting sound design, and deep lore, Bloodborne delivers an unforgettable and challenging experience for fans of dark fantasy and action RPGs."));

            GamesRepo.save(new Game(40, "Final Fantasy XVI", 2023, 69, "Square Enix", "RPG", "PlayStation 5", 160,
                    "Final Fantasy XVI immerses players in a vast fantasy world filled with political intrigue, epic battles, and powerful magic. Players control Clive Rosfield and other characters as they navigate a narrative rich with emotional depth, large-scale combat, and cinematic storytelling. The game emphasizes strategic gameplay, character abilities, and environmental interaction, providing both fast-paced action and thoughtful decision-making. With stunning visuals, an epic soundtrack, and a complex story, Final Fantasy XVI delivers a captivating and immersive RPG experience."));

            GamesRepo.save(new Game(41, "Final Fantasy VII Remake", 2020, 59, "Square Enix", "RPG", "PlayStation 4", 210,
                    "Final Fantasy VII Remake reimagines the classic RPG with stunning visuals, cinematic storytelling, and real-time combat. Players follow Cloud Strife and his allies in their struggle against the corrupt Shinra Corporation and uncover deeper mysteries surrounding the planet. The game balances strategic combat, character progression, and narrative-driven exploration, offering both nostalgia for longtime fans and an immersive experience for newcomers. With detailed environments, memorable music, and engaging gameplay, this remake delivers a modern and epic RPG adventure."));

            GamesRepo.save(new Game(42, "Persona 5 Royal", 2022, 49, "Atlus", "RPG", "PC", 200,
                    "Persona 5 Royal is an enhanced version of the critically acclaimed JRPG, combining dungeon crawling, turn-based combat, and deep social simulation. Players take on the role of a high school student by day and a Phantom Thief by night, navigating life, forming relationships, and battling supernatural enemies. The game emphasizes strategic planning, character customization, and choice-driven storytelling, offering hundreds of hours of immersive gameplay. With stylish visuals, a memorable soundtrack, and a complex narrative, Persona 5 Royal provides a rich and engaging RPG experience."));

            GamesRepo.save(new Game(43, "Persona 3 Reload", 2024, 59, "Atlus", "RPG", "Xbox Series X", 150,
                    "Persona 3 Reload revitalizes the beloved JRPG with modern visuals, enhanced mechanics, and expanded storytelling. Players manage daily life as a high school student while exploring the dark, mysterious world of the Dark Hour, battling supernatural forces alongside their Persona companions. The game emphasizes strategic turn-based combat, social interaction, and character development, creating a compelling balance between narrative depth and gameplay. With improved graphics, immersive audio, and enriched content, Persona 3 Reload offers both longtime fans and newcomers a captivating RPG experience."));

            GamesRepo.save(new Game(44, "Nier: Automata", 2017, 39, "PlatinumGames", "Action RPG", "PC", 190,
                    "Nier: Automata is an action RPG that blends fast-paced combat, philosophical storytelling, and exploration in a post-apocalyptic world. Players control androids 2B, 9S, and A2 as they battle machines and uncover secrets about humanity’s past and future. The game features fluid combat, multiple playstyles, and branching narratives that encourage replayability. With a haunting soundtrack, striking visuals, and deep narrative themes, Nier: Automata delivers an emotionally charged and exhilarating gameplay experience."));

            GamesRepo.save(new Game(45, "Death Stranding", 2019, 39, "Kojima Productions", "Adventure", "PC", 170,
                    "Death Stranding is a unique adventure game that combines exploration, delivery missions, and social connection mechanics in a post-apocalyptic United States. Players assume the role of Sam Porter Bridges, connecting isolated cities and individuals while navigating treacherous terrain and supernatural phenomena. The game emphasizes strategic planning, environmental interaction, and story-driven exploration. With breathtaking visuals, an intricate narrative, and innovative gameplay systems, Death Stranding offers a deeply immersive and thought-provoking experience unlike any other."));

            GamesRepo.save(new Game(46, "Ghost of Tsushima", 2020, 59, "Sucker Punch Productions", "Action Adventure", "PlayStation 5", 200,
                    "Ghost of Tsushima is an open-world action-adventure game set in feudal Japan during the Mongol invasion. Players control Jin Sakai, a skilled samurai, as he navigates a beautifully realized world, blending stealth, combat, and exploration. The game emphasizes mastery of swordplay, strategic thinking, and dynamic encounters, allowing multiple approaches to challenges. With breathtaking landscapes, rich cultural detail, and a compelling narrative, Ghost of Tsushima provides an unforgettable journey through honor, sacrifice, and self-discovery."));

            GamesRepo.save(new Game(47, "Returnal", 2021, 49, "Housemarque", "Roguelike", "PlayStation 5", 120,
                    "Returnal is a challenging roguelike action game where players control Selene, a space explorer trapped on an alien planet in a time-loop. Players must navigate procedurally generated environments, combat hostile creatures, and uncover the mysteries of the planet while improving abilities through progression systems. The game emphasizes fast-paced combat, pattern recognition, and strategic adaptation, offering high replayability. With atmospheric visuals, immersive audio, and tense gameplay, Returnal provides a gripping, adrenaline-fueled experience."));

            GamesRepo.save(new Game(48, "Hades", 2020, 24, "Supergiant Games", "Roguelike", "PC", 500,
                    "Hades is a roguelike dungeon crawler where players take on the role of Zagreus, the son of Hades, attempting to escape the Underworld. Each attempt offers procedurally generated challenges, dynamic combat, and a rich narrative that evolves with each run. The game emphasizes skill, strategy, and character progression, offering satisfying combat and deep storytelling. With vibrant visuals, fluid gameplay, and engaging dialogue, Hades provides an addictive and rewarding experience that blends action and narrative seamlessly."));

            GamesRepo.save(new Game(49, "Slay the Spire", 2019, 19, "MegaCrit", "Card Battler", "PC", 300,
                    "Slay the Spire is a strategic deck-building game that challenges players to ascend a procedurally generated tower filled with enemies and bosses. Players choose characters, customize decks, and make tactical decisions to progress through increasingly difficult encounters. The game emphasizes strategy, adaptability, and careful planning, with endless combinations and replayability. With its unique blend of card-based combat, roguelike mechanics, and engaging progression systems, Slay the Spire offers a deeply rewarding experience for fans of strategy and deck-building games."));

            GamesRepo.save(new Game(50, "Celeste", 2018, 19, "Maddy Makes Games", "Platformer", "PC", 400,
                    "Celeste is a challenging 2D platformer that combines precise gameplay, exploration, and an emotionally resonant story. Players guide Madeline as she climbs the titular mountain, overcoming increasingly difficult obstacles and mastering intricate mechanics. The game emphasizes skill, timing, and persistence, while weaving themes of personal growth, mental health, and determination. With tight controls, a beautiful soundtrack, and engaging level design, Celeste provides a rewarding and inspiring platforming experience."));

            GamesRepo.save(new Game(51, "Hollow Knight", 2017, 14, "Team Cherry", "Metroidvania", "PC", 500,
                    "Hollow Knight is a Metroidvania-style action-adventure game set in the mysterious, interconnected world of Hallownest. Players explore vast environments, battle challenging enemies, and uncover hidden secrets while developing abilities and equipment. The game emphasizes exploration, skillful combat, and environmental storytelling, offering a rich and rewarding experience. With hand-drawn visuals, atmospheric audio, and intricate level design, Hollow Knight delivers a captivating journey full of discovery and challenge."));

            GamesRepo.save(new Game(52, "Cuphead", 2017, 19, "Studio MDHR", "Platformer", "Xbox Series X", 380,
                    "Cuphead is a visually striking run-and-gun platformer inspired by 1930s cartoons. Players control Cuphead and Mugman through a series of challenging boss battles and platforming stages. The game emphasizes precision, timing, and pattern recognition, rewarding skillful execution. With its unique art style, jazz-influenced soundtrack, and memorable character design, Cuphead offers a highly engaging and challenging platforming experience unlike any other."));

            GamesRepo.save(new Game(53, "Dead Cells", 2018, 24, "Motion Twin", "Roguelike", "PC", 340,
                    "Dead Cells is a roguelike metroidvania game that combines fast-paced combat, exploration, and procedurally generated levels. Players navigate a hostile world, collect weapons and upgrades, and battle challenging enemies while discovering secrets. The game emphasizes skill, adaptability, and strategy, rewarding players who master its combat mechanics. With fluid movement, diverse weapons, and a vibrant pixel art style, Dead Cells offers a thrilling and replayable action experience."));

            GamesRepo.save(new Game(54, "Among Us", 2018, 5, "Innersloth", "Party", "PC", 999,
                    "Among Us is a social deduction multiplayer game where players work together to complete tasks on a spaceship while identifying impostors among the crew. Communication, observation, and strategy are key to success, whether completing objectives or deceiving others. The game emphasizes social interaction, teamwork, and cunning play, offering endless replayability with friends and online players. With simple mechanics, charming visuals, and engaging gameplay, Among Us provides a fun and suspenseful party experience."));

            GamesRepo.save(new Game(55, "Fall Guys", 2020, 0, "Mediatonic", "Party", "PlayStation 5", 999,
                    "Fall Guys is a whimsical multiplayer party game where players compete in chaotic obstacle courses, mini-games, and challenges to be the last one standing. The game emphasizes fun, unpredictability, and competitive spirit, with colorful visuals and silly physics-based mechanics. Players must adapt quickly, navigate obstacles, and outlast opponents in fast-paced, hilarious rounds. With cooperative and competitive play, Fall Guys delivers a joyous, lighthearted gaming experience for all ages."));

            GamesRepo.save(new Game(56, "The Sims 4", 2014, 0, "Maxis", "Simulation", "PC", 999,
                    "The Sims 4 is a life simulation game that lets players create and manage virtual characters, build homes, and shape unique stories. Players can control every aspect of their Sims’ lives, from careers and relationships to hobbies and personal growth. The game emphasizes creativity, storytelling, and open-ended gameplay, with extensive customization options and expansion packs for added depth. With charming visuals and dynamic AI interactions, The Sims 4 provides a deeply engaging simulation experience."));

            GamesRepo.save(new Game(57, "Cities: Skylines II", 2023, 49, "Colossal Order", "Simulation", "PC", 200,
                    "Cities: Skylines II is a city-building simulation that allows players to plan, manage, and expand their own urban landscapes. Players control zoning, infrastructure, public services, and population growth while balancing economic, environmental, and social factors. The game emphasizes strategic planning, problem-solving, and creativity, offering complex simulation mechanics for both casual and dedicated players. With detailed graphics, dynamic systems, and extensive customization, Cities: Skylines II delivers a deeply satisfying urban planning experience."));

            GamesRepo.save(new Game(58, "No Man’s Sky", 2016, 39, "Hello Games", "Adventure", "PC", 250,
                    "No Man’s Sky is a procedurally generated universe exploration game where players can discover planets, species, and civilizations across countless worlds. Players can engage in trading, combat, base building, and interstellar travel. The game emphasizes exploration, creativity, and survival, with continuous updates expanding the universe, adding missions, and enhancing gameplay mechanics. With infinite possibilities, stunning visuals, and immersive environments, No Man’s Sky offers an expansive and adventurous experience for space explorers."));

            GamesRepo.save(new Game(59, "Subnautica", 2018, 29, "Unknown Worlds", "Survival", "PC", 270,
                    "Subnautica is an underwater survival adventure game set on a mysterious alien ocean planet. Players explore deep-sea environments, gather resources, build underwater bases, and survive against exotic marine creatures. The game emphasizes exploration, resource management, and creative problem-solving while delivering a captivating narrative about survival and discovery. With immersive visuals, atmospheric sound, and diverse biomes, Subnautica provides a thrilling and tense survival experience."));

            GamesRepo.save(new Game(60, "Valheim", 2021, 19, "Iron Gate Studio", "Survival", "PC", 340,
                    "Valheim is a cooperative survival and exploration game set in a procedurally generated Norse-inspired world. Players build shelters, craft weapons and armor, hunt, farm, and battle mythical creatures. The game emphasizes exploration, creativity, and teamwork, allowing players to tackle challenges alone or with friends. With vast biomes, dynamic weather, and immersive combat, Valheim delivers an engaging and replayable survival experience, combining strategy, action, and adventure in a richly detailed world."));
            // =========================================================================================================



            RequirementsRepo.save(new Requirements(1, "Windows 10", "Intel i5-8400", "12 GB", "GTX 1060", "60 GB",
                    "Windows 10", "Intel i7-8700K", "16 GB", "RTX 2060", "60 GB"));

            RequirementsRepo.save(new Requirements(2, "Windows 10", "Intel i5-2500K", "8 GB", "GTX 960", "70 GB",
                    "Windows 10", "Intel i5-6600K", "8 GB", "GTX 1060", "70 GB"));

            RequirementsRepo.save(new Requirements(3, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(4, "Windows 10", "Intel i5-3570K", "8 GB", "GTX 780", "70 GB",
                    "Windows 10", "Intel i7-4770K", "16 GB", "GTX 1070", "70 GB"));

            RequirementsRepo.save(new Requirements(5, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(6, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(7, "Windows 10", "Intel i5-2500K", "8 GB", "GTX 660", "35 GB",
                    "Windows 10", "Intel i7-3770", "12 GB", "GTX 770", "35 GB"));

            RequirementsRepo.save(new Requirements(8, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(9, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(10, "Windows 10", "Intel i5-4690", "8 GB", "GTX 970", "70 GB",
                    "Windows 10", "Intel i7-6700", "16 GB", "GTX 1070", "70 GB"));

            RequirementsRepo.save(new Requirements(11, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(12, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(13, "Windows 10", "Intel i5-4460", "8 GB", "GTX 1050 Ti", "50 GB",
                    "Windows 10", "Intel i7-6700", "16 GB", "GTX 1080", "50 GB"));

            RequirementsRepo.save(new Requirements(14, "Windows 10", "Intel i5-4460", "8 GB", "GTX 970", "80 GB",
                    "Windows 10", "Intel i7-6700", "16 GB", "RTX 2070", "80 GB"));

            RequirementsRepo.save(new Requirements(15, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(16, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(17, "Windows 10", "Intel i5-2300", "8 GB", "GTX 560", "30 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "30 GB"));

            RequirementsRepo.save(new Requirements(18, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(19, "Windows 10", "Intel i5-2400", "8 GB", "GTX 660", "40 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "40 GB"));

            RequirementsRepo.save(new Requirements(20, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(21, "Windows 10", "Intel i5-4440", "8 GB", "GTX 760", "60 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 1060", "60 GB"));

            RequirementsRepo.save(new Requirements(22, "Windows 10", "Intel i5-2300", "6 GB", "GTX 560", "30 GB",
                    "Windows 10", "Intel i7-3770", "8 GB", "GTX 970", "30 GB"));

            RequirementsRepo.save(new Requirements(23, "Windows 10", "Intel i5-4690", "8 GB", "GTX 970", "50 GB",
                    "Windows 10", "Intel i7-6700", "16 GB", "GTX 1070", "50 GB"));

            RequirementsRepo.save(new Requirements(24, "Windows 10", "Intel i5-4460", "8 GB", "GTX 960", "70 GB",
                    "Windows 10", "Intel i7-6700", "16 GB", "GTX 1070", "70 GB"));

            RequirementsRepo.save(new Requirements(25, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(26, "Windows 10", "Intel i5-3570", "8 GB", "GTX 660", "30 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "30 GB"));

            RequirementsRepo.save(new Requirements(27, "Windows 10", "Intel i5-2400", "8 GB", "GTX 660", "30 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "30 GB"));

            RequirementsRepo.save(new Requirements(28, "Windows 10", "Intel i5-2400", "8 GB", "GTX 660", "30 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "30 GB"));

            RequirementsRepo.save(new Requirements(29, "Windows 10", "Intel i5-3330", "8 GB", "GTX 660", "20 GB",
                    "Windows 10", "Intel i7-3770", "16 GB", "GTX 970", "20 GB"));

            RequirementsRepo.save(new Requirements(30, "Windows 10", "Intel i3-2120", "4 GB", "GTX 560", "10 GB",
                    "Windows 10", "Intel i5-4460", "8 GB", "GTX 970", "10 GB"));

            RequirementsRepo.save(new Requirements(31, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(32, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(33, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(34, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(35, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(36, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(37, "Windows 10", "Intel i5-2500K", "8 GB", "GTX 660", "40 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "40 GB"));

            RequirementsRepo.save(new Requirements(38, "Windows 10", "Intel i5-2500K", "8 GB", "GTX 660", "40 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "40 GB"));

            RequirementsRepo.save(new Requirements(39, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(40, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(41, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(42, "Windows 10", "Intel i5-2400", "8 GB", "GTX 660", "40 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "40 GB"));

            RequirementsRepo.save(new Requirements(43, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(44, "Windows 10", "Intel i5-2400", "8 GB", "GTX 660", "50 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "50 GB"));

            RequirementsRepo.save(new Requirements(45, "Windows 10", "Intel i5-2400", "8 GB", "GTX 660", "50 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "50 GB"));

            RequirementsRepo.save(new Requirements(46, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(47, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(48, "Windows 10", "Intel i5-2500K", "8 GB", "GTX 660", "15 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "15 GB"));

            RequirementsRepo.save(new Requirements(49, "Windows 10", "Intel i5-2400", "8 GB", "GTX 660", "10 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "10 GB"));

            RequirementsRepo.save(new Requirements(50, "Windows 10", "Intel i3-2120", "4 GB", "GTX 560", "10 GB",
                    "Windows 10", "Intel i5-4460", "8 GB", "GTX 970", "10 GB"));

            RequirementsRepo.save(new Requirements(51, "Windows 10", "Intel i3-2100", "4 GB", "GTX 560", "10 GB",
                    "Windows 10", "Intel i5-4460", "8 GB", "GTX 970", "10 GB"));

            RequirementsRepo.save(new Requirements(52, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(53, "Windows 10", "Intel i5-2500K", "8 GB", "GTX 660", "20 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "20 GB"));

            RequirementsRepo.save(new Requirements(54, "Windows 10", "Intel i3-2120", "4 GB", "GTX 560", "2 GB",
                    "Windows 10", "Intel i5-4460", "8 GB", "GTX 970", "2 GB"));

            RequirementsRepo.save(new Requirements(55, "N/A", "N/A", "N/A", "N/A", "N/A",
                    "N/A", "N/A", "N/A", "N/A", "N/A"));

            RequirementsRepo.save(new Requirements(56, "Windows 10", "Intel i3-2100", "4 GB", "GTX 560", "10 GB",
                    "Windows 10", "Intel i5-4460", "8 GB", "GTX 970", "10 GB"));

            RequirementsRepo.save(new Requirements(57, "Windows 10", "Intel i5-2400", "8 GB", "GTX 660", "20 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "20 GB"));

            RequirementsRepo.save(new Requirements(58, "Windows 10", "Intel i5-2400", "8 GB", "GTX 660", "15 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "15 GB"));

            RequirementsRepo.save(new Requirements(59, "Windows 10", "Intel i5-2400", "8 GB", "GTX 660", "20 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "20 GB"));

            RequirementsRepo.save(new Requirements(60, "Windows 10", "Intel i5-2400", "8 GB", "GTX 660", "20 GB",
                    "Windows 10", "Intel i7-4770", "16 GB", "GTX 970", "20 GB"));
            // ====================================================================================================================


            ImagesRepo.save(new Images(1, "/Images/CoverArt/eldenring_ca.jpg", "/Images/Background/eldenring_bg.jpg",
                    "/Images/Screenshots/eldenring_sc1.jpg", "/Images/Screenshots/eldenring_sc2.jpg",
                    "/Images/Screenshots/eldenring_sc3.jpg"));

            ImagesRepo.save(new Images(2, "/Images/CoverArt/godofwar_ca.jpg", "/Images/Background/godofwar_bg.jpg",
                    "/Images/Screenshots/godofwar_sc1.jpg", "/Images/Screenshots/godofwar_sc2.jpg",
                    "/Images/Screenshots/godofwar_sc3.jpg"));

            ImagesRepo.save(new Images(3, "/Images/CoverArt/zeldatearsofthekingdom_ca.jpg", "/Images/Background/zeldatearsofthekingdom_bg.jpg",
                    "/Images/Screenshots/zeldatearsofthekingdom_sc1.jpg", "/Images/Screenshots/zeldatearsofthekingdom_sc2.jpg",
                    "/Images/Screenshots/zeldatearsofthekingdom_sc3.jpg"));

            ImagesRepo.save(new Images(4, "/Images/CoverArt/cyberpunk2077_ca.jpg", "/Images/Background/cyberpunk2077_bg.jpg",
                    "/Images/Screenshots/cyberpunk2077_sc1.jpg", "/Images/Screenshots/cyberpunk2077_sc2.jpg",
                    "/Images/Screenshots/cyberpunk2077_sc3.jpg"));

            ImagesRepo.save(new Images(5, "/Images/CoverArt/reddeadredemption2_ca.jpg", "/Images/Background/reddeadredemption2_bg.jpg",
                    "/Images/Screenshots/reddeadredemption2_sc1.jpg", "/Images/Screenshots/reddeadredemption2_sc2.jpg",
                    "/Images/Screenshots/reddeadredemption2_sc3.jpg"));

            ImagesRepo.save(new Images(6, "/Images/CoverArt/horizonforbiddenwest_ca.jpg", "/Images/Background/horizonforbiddenwest_bg.jpg",
                    "/Images/Screenshots/horizonforbiddenwest_sc1.jpg", "/Images/Screenshots/horizonforbiddenwest_sc2.jpg",
                    "/Images/Screenshots/horizonforbiddenwest_sc3.jpg"));

            ImagesRepo.save(new Images(7, "/Images/CoverArt/witcher3wildhunt_ca.jpg", "/Images/Background/witcher3wildhunt_bg.jpg",
                    "/Images/Screenshots/witcher3wildhunt_sc1.jpg", "/Images/Screenshots/witcher3wildhunt_sc2.jpg",
                    "/Images/Screenshots/witcher3wildhunt_sc3.jpg"));

            ImagesRepo.save(new Images(8, "/Images/CoverArt/residentevil4remake_ca.jpg", "/Images/Background/residentevil4remake_bg.jpg",
                    "/Images/Screenshots/residentevil4remake_sc1.jpg", "/Images/Screenshots/residentevil4remake_sc2.jpg",
                    "/Images/Screenshots/residentevil4remake_sc3.jpg"));

            ImagesRepo.save(new Images(9, "/Images/CoverArt/spiderman2_ca.jpg", "/Images/Background/spiderman2_bg.jpg",
                    "/Images/Screenshots/spiderman2_sc1.jpg", "/Images/Screenshots/spiderman2_sc2.jpg",
                    "/Images/Screenshots/spiderman2_sc3.jpg"));

            ImagesRepo.save(new Images(10, "/Images/CoverArt/baldursgate3_ca.jpg", "/Images/Background/baldursgate3_bg.jpg",
                    "/Images/Screenshots/baldursgate3_sc1.jpg", "/Images/Screenshots/baldursgate3_sc2.jpg",
                    "/Images/Screenshots/baldursgate3_sc3.jpg"));

            ImagesRepo.save(new Images(11, "/Images/CoverArt/starfield_ca.jpg", "/Images/Background/starfield_bg.jpg",
                    "/Images/Screenshots/starfield_sc1.jpg", "/Images/Screenshots/starfield_sc2.jpg",
                    "/Images/Screenshots/starfield_sc3.jpg"));

            ImagesRepo.save(new Images(12, "/Images/CoverArt/seaofthieves_ca.jpg", "/Images/Background/seaofthieves_bg.jpg",
                    "/Images/Screenshots/seaofthieves_sc1.jpg", "/Images/Screenshots/seaofthieves_sc2.jpg",
                    "/Images/Screenshots/seaofthieves_sc3.jpg"));

            ImagesRepo.save(new Images(13, "/Images/CoverArt/haloinfinite_ca.jpg", "/Images/Background/haloinfinite_bg.jpg",
                    "/Images/Screenshots/haloinfinite_sc1.jpg", "/Images/Screenshots/haloinfinite_sc2.jpg",
                    "/Images/Screenshots/haloinfinite_sc3.jpg"));

            ImagesRepo.save(new Images(14, "/Images/CoverArt/forzahorizon5_ca.jpg", "/Images/Background/forzahorizon5_bg.jpg",
                    "/Images/Screenshots/forzahorizon5_sc1.jpg", "/Images/Screenshots/forzahorizon5_sc2.jpg",
                    "/Images/Screenshots/forzahorizon5_sc3.jpg"));

            ImagesRepo.save(new Images(15, "/Images/CoverArt/fifa24_ca.jpg", "/Images/Background/fifa24_bg.jpg",
                    "/Images/Screenshots/fifa24_sc1.jpg", "/Images/Screenshots/fifa24_sc2.jpg",
                    "/Images/Screenshots/fifa24_sc3.jpg"));

            ImagesRepo.save(new Images(16, "/Images/CoverArt/nba2k24_ca.jpg", "/Images/Background/nba2k24_bg.jpg",
                    "/Images/Screenshots/nba2k24_sc1.jpg", "/Images/Screenshots/nba2k24_sc2.jpg",
                    "/Images/Screenshots/nba2k24_sc3.jpg"));

            ImagesRepo.save(new Images(17, "/Images/CoverArt/mortalkombat1_ca.jpg", "/Images/Background/mortalkombat1_bg.jpg",
                    "/Images/Screenshots/mortalkombat1_sc1.jpg", "/Images/Screenshots/mortalkombat1_sc2.jpg",
                    "/Images/Screenshots/mortalkombat1_sc3.jpg"));

            ImagesRepo.save(new Images(18, "/Images/CoverArt/tekken8_ca.jpg", "/Images/Background/tekken8_bg.jpg",
                    "/Images/Screenshots/tekken8_sc1.jpg", "/Images/Screenshots/tekken8_sc2.jpg",
                    "/Images/Screenshots/tekken8_sc3.jpg"));

            ImagesRepo.save(new Images(19, "/Images/CoverArt/streetfighter6_ca.jpg", "/Images/Background/streetfighter6_bg.jpg",
                    "/Images/Screenshots/streetfighter6_sc1.jpg", "/Images/Screenshots/streetfighter6_sc2.jpg",
                    "/Images/Screenshots/streetfighter6_sc3.jpg"));

            ImagesRepo.save(new Images(20, "/Images/CoverArt/assassinscreedmirage_ca.jpg", "/Images/Background/assassinscreedmirage_bg.jpg",
                    "/Images/Screenshots/assassinscreedmirage_sc1.jpg", "/Images/Screenshots/assassinscreedmirage_sc2.jpg",
                    "/Images/Screenshots/assassinscreedmirage_sc3.jpg"));

            ImagesRepo.save(new Images(21, "/Images/CoverArt/farcry6_ca.jpg", "/Images/Background/farcry6_bg.jpg",
                    "/Images/Screenshots/farcry6_sc1.jpg", "/Images/Screenshots/farcry6_sc2.jpg",
                    "/Images/Screenshots/farcry6_sc3.jpg"));

            ImagesRepo.save(new Images(22, "/Images/CoverArt/rainbowsixsiege_ca.jpg", "/Images/Background/rainbowsixsiege_bg.jpg",
                    "/Images/Screenshots/rainbowsixsiege_sc1.jpg", "/Images/Screenshots/rainbowsixsiege_sc2.jpg",
                    "/Images/Screenshots/rainbowsixsiege_sc3.jpg"));

            ImagesRepo.save(new Images(23, "/Images/CoverArt/overwatch2_ca.jpg", "/Images/Background/overwatch2_bg.jpg",
                    "/Images/Screenshots/overwatch2_sc1.jpg", "/Images/Screenshots/overwatch2_sc2.jpg",
                    "/Images/Screenshots/overwatch2_sc3.jpg"));

            ImagesRepo.save(new Images(24, "/Images/CoverArt/diablo4_ca.jpg", "/Images/Background/diablo4_bg.jpg",
                    "/Images/Screenshots/diablo4_sc1.jpg", "/Images/Screenshots/diablo4_sc2.jpg",
                    "/Images/Screenshots/diablo4_sc3.jpg"));

            ImagesRepo.save(new Images(25, "/Images/CoverArt/codmodernwarfare3_ca.jpg", "/Images/Background/codmodernwarfare3_bg.jpg",
                    "/Images/Screenshots/codmodernwarfare3_sc1.jpg", "/Images/Screenshots/codmodernwarfare3_sc2.jpg",
                    "/Images/Screenshots/codmodernwarfare3_sc3.jpg"));

            ImagesRepo.save(new Images(26, "/Images/CoverArt/apexlegends_ca.jpg", "/Images/Background/apexlegends_bg.jpg",
                    "/Images/Screenshots/apexlegends_sc1.jpg", "/Images/Screenshots/apexlegends_sc2.jpg",
                    "/Images/Screenshots/apexlegends_sc3.jpg"));

            ImagesRepo.save(new Images(27, "/Images/CoverArt/fortnite_ca.jpg", "/Images/Background/fortnite_bg.jpg",
                    "/Images/Screenshots/fortnite_sc1.jpg", "/Images/Screenshots/fortnite_sc2.jpg",
                    "/Images/Screenshots/fortnite_sc3.jpg"));

            ImagesRepo.save(new Images(28, "/Images/CoverArt/pubg_ca.jpg", "/Images/Background/pubg_bg.jpg",
                    "/Images/Screenshots/pubg_sc1.jpg", "/Images/Screenshots/pubg_sc2.jpg",
                    "/Images/Screenshots/pubg_sc3.jpg"));

            ImagesRepo.save(new Images(29, "/Images/CoverArt/minecraft_ca.jpg", "/Images/Background/minecraft_bg.jpg",
                    "/Images/Screenshots/minecraft_sc1.jpg", "/Images/Screenshots/minecraft_sc2.jpg",
                    "/Images/Screenshots/minecraft_sc3.jpg"));

            ImagesRepo.save(new Images(30, "/Images/CoverArt/terraria_ca.jpg", "/Images/Background/terraria_bg.jpg",
                    "/Images/Screenshots/terraria_sc1.jpg", "/Images/Screenshots/terraria_sc2.jpg",
                    "/Images/Screenshots/terraria_sc3.jpg"));

            ImagesRepo.save(new Images(31, "/Images/CoverArt/stardewvalley_ca.jpg", "/Images/Background/stardewvalley_bg.jpg",
                    "/Images/Screenshots/stardewvalley_sc1.jpg", "/Images/Screenshots/stardewvalley_sc2.jpg",
                    "/Images/Screenshots/stardewvalley_sc3.jpg"));

            ImagesRepo.save(new Images(32, "/Images/CoverArt/animalcrossingnewhorizons_ca.jpg", "/Images/Background/animalcrossingnewhorizons_bg.jpg",
                    "/Images/Screenshots/animalcrossingnewhorizons_sc1.jpg", "/Images/Screenshots/animalcrossingnewhorizons_sc2.jpg",
                    "/Images/Screenshots/animalcrossingnewhorizons_sc3.jpg"));

            ImagesRepo.save(new Images(33, "/Images/CoverArt/supermarioodyssey_ca.jpg", "/Images/Background/supermarioodyssey_bg.jpg",
                    "/Images/Screenshots/supermarioodyssey_sc1.jpg", "/Images/Screenshots/supermarioodyssey_sc2.jpg",
                    "/Images/Screenshots/supermarioodyssey_sc3.jpg"));

            ImagesRepo.save(new Images(34, "/Images/CoverArt/metroiddread_ca.jpg", "/Images/Background/metroiddread_bg.jpg",
                    "/Images/Screenshots/metroiddread_sc1.jpg", "/Images/Screenshots/metroiddread_sc2.jpg",
                    "/Images/Screenshots/metroiddread_sc3.jpg"));

            ImagesRepo.save(new Images(35, "/Images/CoverArt/splatoon3_ca.jpg", "/Images/Background/splatoon3_bg.jpg",
                    "/Images/Screenshots/splatoon3_sc1.jpg", "/Images/Screenshots/splatoon3_sc2.jpg",
                    "/Images/Screenshots/splatoon3_sc3.jpg"));

            ImagesRepo.save(new Images(36, "/Images/CoverArt/fireemblemengage_ca.jpg", "/Images/Background/fireemblemengage_bg.jpg",
                    "/Images/Screenshots/fireemblemengage_sc1.jpg", "/Images/Screenshots/fireemblemengage_sc2.jpg",
                    "/Images/Screenshots/fireemblemengage_sc3.jpg"));

            ImagesRepo.save(new Images(37, "/Images/CoverArt/darksouls3_ca.jpg", "/Images/Background/darksouls3_bg.jpg",
                    "/Images/Screenshots/darksouls3_sc1.jpg", "/Images/Screenshots/darksouls3_sc2.jpg",
                    "/Images/Screenshots/darksouls3_sc3.jpg"));

            ImagesRepo.save(new Images(38, "/Images/CoverArt/sekiro_ca.jpg", "/Images/Background/sekiro_bg.jpg",
                    "/Images/Screenshots/sekiro_sc1.jpg", "/Images/Screenshots/sekiro_sc2.jpg",
                    "/Images/Screenshots/sekiro_sc3.jpg"));

            ImagesRepo.save(new Images(39, "/Images/CoverArt/bloodborne_ca.jpg", "/Images/Background/bloodborne_bg.jpg",
                    "/Images/Screenshots/bloodborne_sc1.jpg", "/Images/Screenshots/bloodborne_sc2.jpg",
                    "/Images/Screenshots/bloodborne_sc3.jpg"));

            ImagesRepo.save(new Images(40, "/Images/CoverArt/finalfantasy16_ca.jpg", "/Images/Background/finalfantasy16_bg.jpg",
                    "/Images/Screenshots/finalfantasy16_sc1.jpg", "/Images/Screenshots/finalfantasy16_sc2.jpg",
                    "/Images/Screenshots/finalfantasy16_sc3.jpg"));

            ImagesRepo.save(new Images(41, "/Images/CoverArt/finalfantasy7remake_ca.jpg", "/Images/Background/finalfantasy7remake_bg.jpg",
                    "/Images/Screenshots/finalfantasy7remake_sc1.jpg", "/Images/Screenshots/finalfantasy7remake_sc2.jpg",
                    "/Images/Screenshots/finalfantasy7remake_sc3.jpg"));

            ImagesRepo.save(new Images(42, "/Images/CoverArt/persona5royal_ca.jpg", "/Images/Background/persona5royal_bg.jpg",
                    "/Images/Screenshots/persona5royal_sc1.jpg", "/Images/Screenshots/persona5royal_sc2.jpg",
                    "/Images/Screenshots/persona5royal_sc3.jpg"));

            ImagesRepo.save(new Images(43, "/Images/CoverArt/persona3reload_ca.jpg", "/Images/Background/persona3reload_bg.jpg",
                    "/Images/Screenshots/persona3reload_sc1.jpg", "/Images/Screenshots/persona3reload_sc2.jpg",
                    "/Images/Screenshots/persona3reload_sc3.jpg"));

            ImagesRepo.save(new Images(44, "/Images/CoverArt/nierautomata_ca.jpg", "/Images/Background/nierautomata_bg.jpg",
                    "/Images/Screenshots/nierautomata_sc1.jpg", "/Images/Screenshots/nierautomata_sc2.jpg",
                    "/Images/Screenshots/nierautomata_sc3.jpg"));

            ImagesRepo.save(new Images(45, "/Images/CoverArt/deathstranding_ca.jpg", "/Images/Background/deathstranding_bg.jpg",
                    "/Images/Screenshots/deathstranding_sc1.jpg", "/Images/Screenshots/deathstranding_sc2.jpg",
                    "/Images/Screenshots/deathstranding_sc3.jpg"));

            ImagesRepo.save(new Images(46, "/Images/CoverArt/ghostoftsushima_ca.jpg", "/Images/Background/ghostoftsushima_bg.jpg",
                    "/Images/Screenshots/ghostoftsushima_sc1.jpg", "/Images/Screenshots/ghostoftsushima_sc2.jpg",
                    "/Images/Screenshots/ghostoftsushima_sc3.jpg"));

            ImagesRepo.save(new Images(47, "/Images/CoverArt/returnal_ca.jpg", "/Images/Background/returnal_bg.jpg",
                    "/Images/Screenshots/returnal_sc1.jpg", "/Images/Screenshots/returnal_sc2.jpg",
                    "/Images/Screenshots/returnal_sc3.jpg"));

            ImagesRepo.save(new Images(48, "/Images/CoverArt/hades_ca.jpg", "/Images/Background/hades_bg.jpg",
                    "/Images/Screenshots/hades_sc1.jpg", "/Images/Screenshots/hades_sc2.jpg",
                    "/Images/Screenshots/hades_sc3.jpg"));

            ImagesRepo.save(new Images(49, "/Images/CoverArt/slaythespire_ca.jpg", "/Images/Background/slaythespire_bg.jpg",
                    "/Images/Screenshots/slaythespire_sc1.jpg", "/Images/Screenshots/slaythespire_sc2.jpg",
                    "/Images/Screenshots/slaythespire_sc3.jpg"));

            ImagesRepo.save(new Images(50, "/Images/CoverArt/celeste_ca.jpg", "/Images/Background/celeste_bg.jpg",
                    "/Images/Screenshots/celeste_sc1.jpg", "/Images/Screenshots/celeste_sc2.jpg",
                    "/Images/Screenshots/celeste_sc3.jpg"));

            ImagesRepo.save(new Images(51, "/Images/CoverArt/hollowknight_ca.jpg", "/Images/Background/hollowknight_bg.jpg",
                    "/Images/Screenshots/hollowknight_sc1.jpg", "/Images/Screenshots/hollowknight_sc2.jpg",
                    "/Images/Screenshots/hollowknight_sc3.jpg"));

            ImagesRepo.save(new Images(52, "/Images/CoverArt/cuphead_ca.jpg", "/Images/Background/cuphead_bg.jpg",
                    "/Images/Screenshots/cuphead_sc1.jpg", "/Images/Screenshots/cuphead_sc2.jpg",
                    "/Images/Screenshots/cuphead_sc3.jpg"));

            ImagesRepo.save(new Images(53, "/Images/CoverArt/deadcells_ca.jpg", "/Images/Background/deadcells_bg.jpg",
                    "/Images/Screenshots/deadcells_sc1.jpg", "/Images/Screenshots/deadcells_sc2.jpg",
                    "/Images/Screenshots/deadcells_sc3.jpg"));

            ImagesRepo.save(new Images(54, "/Images/CoverArt/amongus_ca.jpg", "/Images/Background/amongus_bg.jpg",
                    "/Images/Screenshots/amongus_sc1.jpg", "/Images/Screenshots/amongus_sc2.jpg",
                    "/Images/Screenshots/amongus_sc3.jpg"));

            ImagesRepo.save(new Images(55, "/Images/CoverArt/fallguys_ca.jpg", "/Images/Background/fallguys_bg.jpg",
                    "/Images/Screenshots/fallguys_sc1.jpg", "/Images/Screenshots/fallguys_sc2.jpg",
                    "/Images/Screenshots/fallguys_sc3.jpg"));

            ImagesRepo.save(new Images(56, "/Images/CoverArt/thesims4_ca.jpg", "/Images/Background/thesims4_bg.jpg",
                    "/Images/Screenshots/thesims4_sc1.jpg", "/Images/Screenshots/thesims4_sc2.jpg",
                    "/Images/Screenshots/thesims4_sc3.jpg"));

            ImagesRepo.save(new Images(57, "/Images/CoverArt/citiesskylines2_ca.jpg", "/Images/Background/citiesskylines2_bg.jpg",
                    "/Images/Screenshots/citiesskylines2_sc1.jpg", "/Images/Screenshots/citiesskylines2_sc2.jpg",
                    "/Images/Screenshots/citiesskylines2_sc3.jpg"));

            ImagesRepo.save(new Images(58, "/Images/CoverArt/nomanssky_ca.jpg", "/Images/Background/nomanssky_bg.jpg",
                    "/Images/Screenshots/nomanssky_sc1.jpg", "/Images/Screenshots/nomanssky_sc2.jpg",
                    "/Images/Screenshots/nomanssky_sc3.jpg"));

            ImagesRepo.save(new Images(59, "/Images/CoverArt/subnautica_ca.jpg", "/Images/Background/subnautica_bg.jpg",
                    "/Images/Screenshots/subnautica_sc1.jpg", "/Images/Screenshots/subnautica_sc2.jpg",
                    "/Images/Screenshots/subnautica_sc3.jpg"));

            ImagesRepo.save(new Images(60, "/Images/CoverArt/valheim_ca.jpg", "/Images/Background/valheim_bg.jpg",
                    "/Images/Screenshots/valheim_sc1.jpg", "/Images/Screenshots/valheim_sc2.jpg",
                    "/Images/Screenshots/valheim_sc3.jpg"));


        }

    }
}
