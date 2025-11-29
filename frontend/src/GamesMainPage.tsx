import React, { useEffect, useState } from "react";
import "./GamesMainPage.css";

type GameListItem = {
  id: number;
  gameName: string;
  price: number;
  developer: string;
  gameTag: string;
  cover: string;
};

const GamesMainPage: React.FC = () => {
  const [games, setGames] = useState<GameListItem[]>([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);

  // --- Fetch Data ---
  useEffect(() => {
    fetch("/api/GamePage/allgames")
      .then((res) => {
        if (!res.ok) throw new Error("Failed to load games");
        return res.json();
      })
      .then((data) => {
        setGames(data);
        setLoading(false);
      })
      .catch((err) => {
        setError(err.message);
        setLoading(false);
      });
  }, []);

  // --- Navigation ---
  const handleGameClick = (gameId: number) => {
    localStorage.setItem("gameId", gameId.toString());
    window.location.href = "/GameShop";
  };

  const goToHome = () => {
    window.location.href = "/";
  };

  // --- Loading States ---
  if (loading) return <div className="status-msg">Loading Library...</div>;
  if (error) return <div className="status-msg error">Error: {error}</div>;

  return (
    <div className="gameshop-main">
      {/* --- HEADER (Copied from your design) --- */}
      <header className="header">
        <button
          className="logo"
          onClick={goToHome}
        >
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

      {/* --- PLATFORMS --- */}
      <div className="platforms">
        <img className="platform-icon" src="images/icons/steam.png" alt="Steam" />
        <img className="platform-icon" src="images/icons/playstation.png" alt="PlayStation" />
        <img className="platform-icon" src="images/icons/xbox.png" alt="Xbox" />
        <img className="platform-icon" src="images/icons/nintendo.png" alt="Nintendo" />
      </div>

      {/* --- MAIN GRID SECTION --- */}
      <div className="main-content">
        <h2 className="section-title">ALL GAMES</h2>

        <div className="games-grid">
          {games.map((game) => (
            <div
              key={game.id}
              className="game-card"
              onClick={() => handleGameClick(game.id)}
            >
              <div className="image-container">
                <img
                  src={game.cover || "/Images/Notfound.jpg"}
                  alt={game.gameName}
                  className="card-cover"
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
          ))}
        </div>
      </div>
    </div>
  );
};

export default GamesMainPage;