import React, { useState, useEffect } from "react";
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
};

const GameShop: React.FC = () => {

    const [game, setGame] = useState<Game | null>(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState<string | null>(null);

    useEffect(() => {
      fetch("/api/GamePage/2")
        .then((res) => {
          if (!res.ok) throw new Error("Failed to fetch game");
          return res.json();
        })
        .then((data) => setGame(data))
        .catch((err) => setError(err.message))
        .finally(() => setLoading(false));
    }, []);

    const goToHome = () => {
        window.location.href = "/";
    };

    return (
        <div className="gameshop">

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


            <div className="platforms">
                
                <img className="platform-icon" src="/images/icons/steamico.png" alt="Steam" title="Steam" />
                <img className="platform-icon" src="/images/icons/psico.png" alt="PlayStation" title="PlayStation" />
                <img className="platform-icon" src="/images/icons/xboxico.png" alt="Xbox" title="Xbox" />
                <img className="platform-icon" src="/images/icons/nintendoico.png" alt="Nintendo" title="Nintendo" />
            </div>



            <section className="game-section">
                <div className="game-cover"></div>

                <div className="game-info">
                    <h1 className="game-title">{game?.gameName ?? "Some Game"}</h1>

                    <div className="banner">
                        <div className="banner-placeholder"></div>
                        <button className="buy-btn">Αγοράστε τώρα</button>
                    </div>
                </div>
            </section>


            <section className="screenshots">
                <div className="screenshot-placeholder"></div>
                <div className="screenshot-placeholder"></div>
                <div className="screenshot-placeholder"></div>
            </section>


            <section className="requirements">
                <h2>SYSTEM REQUIREMENTS</h2>
                <div className="req-columns">
                    <div className="req-block">
                        <h3>MINIMUM:</h3>
                        <ul>
                            <li>OS: Windows 10</li>
                            <li>Processor: Intel i5-8400 / AMD Ryzen 3 3300X</li>
                            <li>Memory: 12 GB RAM</li>
                            <li>Graphics: NVIDIA GTX 1060 / AMD RX 580</li>
                            <li>Storage: 60 GB available space</li>
                        </ul>
                    </div>
                    <div className="req-block">
                        <h3>RECOMMENDED:</h3>
                        <ul>
                            <li>OS: Windows 10/11</li>
                            <li>Processor: Intel i7-8700K / AMD Ryzen 5 3600X</li>
                            <li>Memory: 16 GB RAM</li>
                            <li>Graphics: NVIDIA RTX 3060 / AMD RX 6700 XT</li>
                            <li>Storage: 60 GB SSD</li>
                        </ul>
                    </div>
                </div>
            </section>
        </div>
    );
};

export default GameShop;