import React, { useEffect, useState } from "react";
import "./GamesMainPage.css";
import AuthService from "./AuthService";

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
  const [searchQuery, setSearchQuery] = useState("");
  const [localSearch, setLocalSearch] = useState("");

  const filteredGames = games.filter((game) =>
    game.gameName.toLowerCase().includes(searchQuery.toLowerCase())
  );


  const [selectedPlatform, setSelectedPlatform] = useState<string | null>(
      localStorage.getItem("platform")
  );
  const [selectedTag, setSelectedTag] = useState<string | null>(
      localStorage.getItem("gameTag")
  );

  // Authentication
  const [currentUser, setCurrentUser] = useState<any>(AuthService.getCurrentUser());
  const [showLogin, setShowLogin] = useState(false);
  const [showRegister, setShowRegister] = useState(false);
  const [authMessage, setAuthMessage] = useState("");

  // Login
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  // Register
  const [regUsername, setRegUsername] = useState("");
  const [regEmail, setRegEmail] = useState("");
  const [regPassword, setRegPassword] = useState("");

  const handleLogin = async (e: React.FormEvent) => {
      e.preventDefault();
      try {
          const data = await AuthService.login(username, password);
          setCurrentUser(data);
          setShowLogin(false);
          setAuthMessage("");
      } catch (err: any) {
          setAuthMessage(err.message);
      }
  };

  const handleRegister = async (e: React.FormEvent) => {
      e.preventDefault();
      try {
          await AuthService.register(regUsername, regEmail, regPassword);
          setAuthMessage("Success! Now you can sign in.");
          setTimeout(() => {
              setShowRegister(false);
              setShowLogin(true);
              setAuthMessage("");
          }, 2000);
      } catch (err: any) {
          setAuthMessage(err.message);
      }
  };

  const handleLogout = () => {
      AuthService.logout();
      setCurrentUser(null);
  };


  useEffect(() => {
    setLoading(true);

    let gamesApiUrl = "/api/Games/all";
    if (selectedPlatform) {
        gamesApiUrl = `/api/Games/Platform/${selectedPlatform}`;
    } else if (selectedTag) {
        gamesApiUrl = `/api/Games/GameTag/${selectedTag}`;
    }

    Promise.all([
        fetch(gamesApiUrl).then(r => {
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
  }, [selectedPlatform, selectedTag]);

  const handleGameClick = (gameId: number) => {
    localStorage.setItem("gameId", gameId.toString());
    window.location.href = "/GameShop";
  };

  const goToHome = () => {
    localStorage.removeItem("platform");
    setSelectedPlatform(null);
    localStorage.removeItem("gameTag");
    setSelectedTag(null);
  };

  const handlePlatformClick = (platformName: string) => {
      localStorage.setItem("platform", platformName);
      setSelectedPlatform(platformName);

      localStorage.removeItem("gameTag");
      setSelectedTag(null);
  };

  const handleTagClick = (tagName: string) => {
      localStorage.setItem("gameTag", tagName);
      setSelectedTag(tagName);

      localStorage.removeItem("platform");
      setSelectedPlatform(null);
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
          <input
              type="text"
              placeholder="Search games..."
              value={searchQuery}
              onChange={(e) => setSearchQuery(e.target.value)}
            />
        </div>
        {/*<div className="user-area">
          <button>Sign Up</button>
          <span>|</span>
          <button>Sign In</button>
        </div>*/}
        <div className="user-area">
            {currentUser ? (
                <>
                    <span style={{ color: "white", marginRight: "10px" }}>
                        Welcome, <b>{currentUser.username}</b>!
                    </span>
                    <span>|</span>
                    <button onClick={handleLogout}>Logout</button>
                </>
            ) : (
                <>
                    <button onClick={() => { setShowRegister(true); setAuthMessage(""); }}>Sign Up</button>
                    <span>|</span>
                    <button onClick={() => { setShowLogin(true); setAuthMessage(""); }}>Sign In</button>
                </>
            )}
        </div>
      </header>

      <div className="platforms">
        <img className="platform-icon" src="images/icons/steam.png" alt="PC"
            onClick={() => handlePlatformClick("PC")}
        />
        <img className="platform-icon" src="images/icons/playstation.png" alt="PlayStation 5"
            onClick={() => handlePlatformClick("PlayStation 5")}
        />
        <img className="platform-icon" src="images/icons/xbox.png" alt="Xbox Series X"
            onClick={() => handlePlatformClick("Xbox Series X")}
        />
        <img className="platform-icon" src="images/icons/nintendo.png" alt="Nintendo Switch"
            onClick={() => handlePlatformClick("Nintendo Switch")}
        />
      </div>

     <div className="tags">
         <div className="tag-item" onClick={() => handleTagClick("Fighting")}>
             <img className="tags-icon" src="images/tagicons/FIGHTING.png" alt="Fighting" />
             <span className="tag-name">Fighting</span>
         </div>

         <div className="tag-item" onClick={() => handleTagClick("Racing")}>
             <img className="tags-icon" src="images/tagicons/RACING.png" alt="Racing" />
             <span className="tag-name">Racing</span>
         </div>

         <div className="tag-item" onClick={() => handleTagClick("RPG")}>
             <img className="tags-icon" src="images/tagicons/RPG.png" alt="RPG" />
             <span className="tag-name">RPG</span>
         </div>

         <div className="tag-item" onClick={() => handleTagClick("Shooter")}>
             <img className="tags-icon" src="images/tagicons/SHOOTER.png" alt="Shooter" />
             <span className="tag-name">Shooter</span>
         </div>

         <div className="tag-item" onClick={() => handleTagClick("Sports")}>
             <img className="tags-icon" src="images/tagicons/SPORTS.png" alt="Sports" />
             <span className="tag-name">Sports</span>
         </div>

         <div className="tag-item" onClick={() => handleTagClick("Survival")}>
             <img className="tags-icon" src="images/tagicons/SURVIVAL.png" alt="Survival" />
             <span className="tag-name">Survival</span>
         </div>
     </div>

      <div className="main-content">
        <h2 className="section-title">
            {selectedPlatform
                ? `${selectedPlatform.toUpperCase()} GAMES`
                : selectedTag
                    ? `${selectedTag.toUpperCase()} GAMES`
                    : "ALL GAMES"}
        </h2>

        <div className="games-grid">

          {filteredGames.map((game) => {
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
                      alt={game.gameName}
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

      {showLogin && (
          <div className="popup-overlay">
              <div className="popup-box">
                  <div className="popup-title">Sign In</div>
                  <form onSubmit={handleLogin} className="auth-form">
                      <input type="text" placeholder="Username" required value={username} onChange={e => setUsername(e.target.value)} className="auth-input" />
                      <input type="password" placeholder="Password" required value={password} onChange={e => setPassword(e.target.value)} className="auth-input" />
                      {authMessage && <p className="error-text">{authMessage}</p>}
                      <button type="submit" className="buy-btn">Login</button>
                  </form>
                  <button className="popup-close-btn" onClick={() => setShowLogin(false)}>Close</button>
              </div>
          </div>
      )}

      {showRegister && (
          <div className="popup-overlay">
              <div className="popup-box">
                  <div className="popup-title">Sign Up</div>
                  <form onSubmit={handleRegister} className="auth-form">
                      <input type="text" placeholder="Username" required value={regUsername} onChange={e => setRegUsername(e.target.value)} className="auth-input" />
                      <input type="email" placeholder="Email" required value={regEmail} onChange={e => setRegEmail(e.target.value)} className="auth-input" />
                      <input type="password" placeholder="Password" required value={regPassword} onChange={e => setRegPassword(e.target.value)} className="auth-input" />
                      {authMessage && <p className={authMessage.includes("Success") ? "success-text" : "error-text"}>{authMessage}</p>}
                      <button type="submit" className="buy-btn">Register</button>
                  </form>
                  <button className="popup-close-btn" onClick={() => setShowRegister(false)}>Close</button>
              </div>
          </div>
      )}

    </div>
  );
};

export default GamesMainPage;