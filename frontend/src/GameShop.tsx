import React from "react";
import "./GameShop.css";

const GameShop: React.FC = () => {
    // Function to navigate back to the root path ("/")
    const goToHome = () => {
        window.location.href = "/";
    };

    return (
        <div className="gameshop">
            {/* HEADER */}
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

            {/* PLATFORM ICONS */}
            <div className="platforms">
                <img className="platform-icon" src="images/icons/steam.png" alt="Steam" title="Steam" />
                <img className="platform-icon" src="images/icons/playstation.png" alt="PlayStation" title="PlayStation" />
                <img className="platform-icon" src="images/icons/xbox.png" alt="Xbox" title="Xbox" />
                <img className="platform-icon" src="images/icons/nintendo.png" alt="Nintendo" title="Nintendo" />
            </div>

            {/* MAIN GAME SECTION */}
            <section className="game-section">
                {/* GAME COVER (Now an image) */}
                <img
                    className="game-cover"
                    src="/Images/CoverArt/eldenring_ca.jpg"
                    alt="Elden Ring Cover Art"
                />

                <div className="game-info">
                    <h1 className="game-title">Elden Ring</h1>

                    <div className="banner">
                        {/* 1. The actual background image (positioned absolutely in CSS) */}
                        <img
                            className="banner-placeholder"
                            src="/Images/Background/eldenring_bg.jpg"
                            alt="Elden Ring Background"
                        />

                        {/* 2. The gray information overlay (positioned absolutely over the image) */}
                        <div className="banner-info-box">
                            <p>Elden Ring is an action role-playing game developed by FromSoftware and published by Bandai Namco Entertainment. Available Now!</p>

                            <button className="buy-btn">Αγοράστε τώρα</button>
                        </div>
                    </div>
                </div>
            </section>

            {/* SCREENSHOTS */}
            <section className="screenshots">
                {/* SCREENSHOTS (Now images) */}
                <img className="screenshot-placeholder" src="/Images/Screenshots/eldenring_sc1.jpg" alt="Screenshot 1" />
                <img className="screenshot-placeholder" src="/Images/Screenshots/eldenring_sc2.jpg" alt="Screenshot 2" />
                <img className="screenshot-placeholder" src="/Images/Screenshots/eldenring_sc3.jpg" alt="Screenshot 3" />
            </section>

            {/* SYSTEM REQUIREMENTS */}
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