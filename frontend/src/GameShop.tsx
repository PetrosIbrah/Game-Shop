import React, { useEffect, useState } from "react";
import "./GameShop.css";

type Game = {
  id: number;
  gameName: string;
  releaseYear: number;
  price: number;
  developer: string;
  gameTag: string;
  platform: string;
  stocks: number;
  description: string;
};

type Requirements = {
  reqid: number;
  minos: string;
  minprocessor: string;
  minmemory: string;
  mingraphics: string;
  minstorage: string;
  recos: string;
  recprocessor: string;
  recmemory: string;
  recgraphics: string;
  recstorage: string;
};

type Images = {
  cover: string;
  background: string;
  screenshot1: string;
  screenshot2: string;
  screenshot3: string;
}

const GameShop: React.FC = () => {
    const gameId = localStorage.getItem("gameId");

    const [game, setGame] = useState<Game | null>(null);
    const [requirements, setRequirements] = useState<Requirements | null>(null);
    const [images, setImages] = useState<Images | null>(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState<string | null>(null);
    const [code, setCode] = useState<string | null>(null);

    useEffect(() => {
        Promise.all([
            fetch(`/api/GamePage/gameinfo/${gameId}`).then(r => r.json()),
            fetch(`/api/GamePage/gamereq/${gameId}`).then(r => r.json()),
            fetch(`/api/GamePage/gameimgs/${gameId}`).then(r => r.json())
        ])
            .then(([gamedata, reqdata, imgdata]) => {
                setGame(gamedata);
                setRequirements(reqdata);
                setImages(imgdata);
            })
            .catch(err => setError(err.message))
            .finally(() => setLoading(false));
    }, []);

    const goToHome = () => {
        window.location.href = "/";
    };

    const generateCode = () => {
        const chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        const segment = () =>
          Array.from({ length: 5 }, () =>
            chars[Math.floor(Math.random() * chars.length)]
          ).join("");

        return `${segment()}-${segment()}-${segment()}`;
    };

    const handleBuyButton = () => {
        setCode(generateCode());
    };

    return (
        <div className="gameshop">
            {/* MENU */}
            {/* =================== */}
            <header className="header">
                <button
                    className="logo"
                    onClick={goToHome}
                    style={{ background: 'none', border: 'none', padding: 0, cursor: 'pointer' }}
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

            {/* Platform icons */}
            <div className="platforms">
                <img className="platform-icon" src="images/icons/steam.png" alt="Steam" title="Steam" />
                <img className="platform-icon" src="images/icons/playstation.png" alt="PlayStation" title="PlayStation" />
                <img className="platform-icon" src="images/icons/xbox.png" alt="Xbox" title="Xbox" />
                <img className="platform-icon" src="images/icons/nintendo.png" alt="Nintendo" title="Nintendo" />
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
            {/* END MENU =================== */}


            {/* MAIN GAME SECTION */}
            <section className="game-section">
                {/* Game cover */}
                <img
                    className="game-cover"
                    src={images?.cover ?? "/Images/Notfound.jpg"}
                    onError={(e) => (e.currentTarget.src = "/Images/Notfound.jpg")}
                />

                <div className="game-info">
                    <h1 className="game-title">{game?.gameName ?? "Some Game"}</h1>

                    <div className="banner">
                        <img
                            className="banner-placeholder"
                            src={images?.background ?? "/Images/Notfound.jpg"}
                            onError={(e) => (e.currentTarget.src = "/Images/Notfound.jpg")}
                        />

                        <div className="banner-info-box">
                            <p>{game?.description ?? "Description not found"}</p>


                            <div className="purchase-row">
                                <div className="price-box">{game?.price ?? "NULL"}$</div>

                                <button className="buy-btn" onClick={handleBuyButton}>
                                    Αγοράστε τώρα
                                </button>
                                    {code && (
                                        <div className="popup-overlay">
                                          <div className="popup-box">
                                            <div className="popup-title">Your Activation Code</div>
                                            <div className="popup-code">{code}</div>
                                            <button className="popup-close-btn" onClick={() => setCode(null)}>
                                              Close
                                            </button>
                                          </div>
                                        </div>
                                    )}
                            </div>
                        </div>
                    </div>
                </div>
            </section>

            {/* In Game Screen shots */}
            <section className="screenshots">
                <img className="screenshot-placeholder" src={images?.screenshot1 ?? "/Images/Notfound.jpg"} onError={(e) => (e.currentTarget.src = "/Images/Notfound.jpg")}
                />
                <img className="screenshot-placeholder" src={images?.screenshot2 ?? "/Images/Notfound.jpg"} onError={(e) => (e.currentTarget.src = "/Images/Notfound.jpg")}
                />

                <img className="screenshot-placeholder" src={images?.screenshot3 ?? "/Images/Notfound.jpg"} onError={(e) => (e.currentTarget.src = "/Images/Notfound.jpg")}
                />
            </section>

            {/* System Requirements */}
            <section className="requirements">
                <h2>SYSTEM REQUIREMENTS</h2>
                <div className="req-columns">
                    <div className="req-block">
                        <h3>MINIMUM:</h3>
                        <ul>
                            <li>OS: {requirements?.minos ?? "N/AA"}</li>
                            <li>Processor: {requirements?.minprocessor ?? "N/AA"}</li>
                            <li>Memory: {requirements?.minmemory ?? "N/AA"}</li>
                            <li>Graphics: {requirements?.mingraphics ?? "N/AA"}</li>
                            <li>Storage: {requirements?.minstorage ?? "N/AA"}</li>
                        </ul>
                    </div>
                    <div className="req-block">
                        <h3>RECOMMENDED:</h3>
                        <ul>
                            <li>OS: {requirements?.recos ?? "N/AA"}</li>
                            <li>Processor: {requirements?.recprocessor ?? "N/AA"}</li>
                            <li>Memory: {requirements?.recmemory ?? "N/AA"}</li>
                            <li>Graphics: {requirements?.recgraphics ?? "N/AA"}</li>
                            <li>Storage: {requirements?.recstorage ?? "N/AA"}</li>
                        </ul>
                    </div>
                </div>
            </section>
        </div>
    );
};

export default GameShop;