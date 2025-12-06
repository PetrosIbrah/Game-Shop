import React, { useEffect, useState } from "react";
import "./GamesMainPage.css";

type GameListItem = {
    id: number;
    gameName: string;
    price: number;
    developer: string;
    gameTag: string;
};

type ImageItem = {
    imageid: number;
    cover: string;
}

const GamesMainPage: React.FC = () => {
  const [games, setGames] = useState<GameListItem[]>([]);
  const [images, setImages] = useState<ImageItem[]>([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    Promise.all([
        fetch("/api/Games/all").then(r => {
            if (!r.ok) throw new Error("Failed to load games");
            return r.json();
        }),
        fetch("/api/Games/all/Images").then(r => {
            if (!r.ok) throw new Error("Failed to load images");
            return r.json();
        })
    ])
    .then(([gamedata, imgdata]) => {
        setGames(gamedata);
        setImages(imgdata);
    })
    .catch(err => setError(err instanceof Error ? err.message : "An error occurred"))
    .finally(() => setLoading(false));
  }, []);

  const handleGameClick = (gameId: number) => {
    localStorage.setItem("gameId", gameId.toString());
    window.location.href = "/GameShop";
  };

  const goToHome = () => {
    window.location.href = "/";
  };

  if (loading) return <div className="status-msg">Loading Library...</div>;
  if (error) return <div className="status-msg error">Error: {error}</div>;

  return (
    <div className="gameshop-main">
      <header className="header">
        <button className="logo" onClick={goToHome}>
          <span className="logo-white">GAME</span>
          <span className="logo-gray">SHOP</span>
        </button>
        <div className="search-bar">
          <input type="text" placeholder="Search games..." />
        </div>
        <div className="user-area">
          <button>Sign Up</button>
          <span>|</span>
          <button>Sign In</button>
        </div>
      </header>

      <div className="platforms">
        <img className="platform-icon" src="images/icons/steam.png" alt="Steam" />
        <img className="platform-icon" src="images/icons/playstation.png" alt="PlayStation" />
        <img className="platform-icon" src="images/icons/xbox.png" alt="Xbox" />
        <img className="platform-icon" src="images/icons/nintendo.png" alt="Nintendo" />
      </div>

     <div className="tags">
         <div className="tag-item">
             <img className="tags-icon" src="images/tagicons/FIGHTING.png" alt="Fighting" />
             <span className="tag-name">Fighting</span>
         </div>

         <div className="tag-item">
             <img className="tags-icon" src="images/tagicons/RACING.png" alt="Racing" />
             <span className="tag-name">Racing</span>
         </div>

         <div className="tag-item">
             <img className="tags-icon" src="images/tagicons/RPG.png" alt="RPG" />
             <span className="tag-name">RPG</span>
         </div>

         <div className="tag-item">
             <img className="tags-icon" src="images/tagicons/SHOOTER.png" alt="Shooter" />
             <span className="tag-name">Shooter</span>
         </div>

         <div className="tag-item">
             <img className="tags-icon" src="images/tagicons/SPORTS.png" alt="Sports" />
             <span className="tag-name">Sports</span>
         </div>

         <div className="tag-item">
             <img className="tags-icon" src="images/tagicons/SURVIVAL.png" alt="Survival" />
             <span className="tag-name">Survival</span>
         </div>
     </div>

      <div className="main-content">
        <h2 className="section-title">ALL GAMES</h2>

        <div className="games-grid">
          {games.map((game) => {
            const matchingImage = images.find(img => img.imageid === game.id);
            return (
                <div
                key={game.id}
                className="game-card"
                onClick={() => handleGameClick(game.id)}
                >
                <div className="image-container">
                    <img
                      className="card-cover"
                      src={matchingImage?.cover ?? "/Images/Notfound.jpg"}
                      onError={(e) => (e.currentTarget.src = "/Images/Notfound.jpg")}
                    />
                </div>

                <div className="card-info">
                    <h3 className="card-title">{game.gameName}</h3>
                    <p className="card-tag">{game.gameTag}</p>

                    <div className="card-footer">
                    <span className="card-dev">{game.developer}</span>
                    <div className="card-price-box">
                        {game.price === 0 ? "FREE" : `$${game.price}`}
                    </div>
                    </div>
                </div>
                </div>
            );
          })}
        </div>
      </div>
    </div>
  );
};

export default GamesMainPage;