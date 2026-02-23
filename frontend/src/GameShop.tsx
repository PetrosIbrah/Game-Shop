import React, { useEffect, useState } from "react";
import "./GameShop.css";
import AuthService from "./AuthService";

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
};

const GameShop: React.FC = () => {
    const gameId = localStorage.getItem("gameId");

    const [game, setGame] = useState<Game | null>(null);
    const [requirements, setRequirements] = useState<Requirements | null>(null);
    const [images, setImages] = useState<Images | null>(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState<string | null>(null);
    const [code, setCode] = useState<string | null>(null);

    //Authentication
    const [currentUser, setCurrentUser] = useState<any>(AuthService.getCurrentUser());
    const [showLogin, setShowLogin] = useState(false);
    const [showRegister, setShowRegister] = useState(false);
    const [authMessage, setAuthMessage] = useState("");

    //Login
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");

    //Register
    const [regUsername, setRegUsername] = useState("");
    const [regEmail, setRegEmail] = useState("");
    const [regPassword, setRegPassword] = useState("");

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
        window.location.href = "/GamesMainPage";
    };

    const handlePlatformClick = (platformName: string) => {
        localStorage.setItem("platform", platformName);
        window.location.href = "/GamesMainPage";
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
        if (!currentUser) {
            alert("Πρέπει να συνδεθείτε για να κάνετε αγορά!");
            setShowLogin(true);
            return;
        }
        setCode(generateCode());
    };


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
            setAuthMessage("Η εγγραφή πέτυχε! Τώρα μπορείτε να συνδεθείτε.");
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
                <div className="tag-item" onClick={goToHome}>
                    <img className="tags-icon" src="images/tagicons/FIGHTING.png" alt="Fighting" />
                    <span className="tag-name">Fighting</span>
                </div>
                <div className="tag-item" onClick={goToHome}>
                    <img className="tags-icon" src="images/tagicons/RACING.png" alt="Racing" />
                    <span className="tag-name">Racing</span>
                </div>
                <div className="tag-item" onClick={goToHome}>
                    <img className="tags-icon" src="images/tagicons/RPG.png" alt="RPG" />
                    <span className="tag-name">RPG</span>
                </div>
                <div className="tag-item" onClick={goToHome}>
                    <img className="tags-icon" src="images/tagicons/SHOOTER.png" alt="Shooter" />
                    <span className="tag-name">Shooter</span>
                </div>
                <div className="tag-item" onClick={goToHome}>
                    <img className="tags-icon" src="images/tagicons/SPORTS.png" alt="Sports" />
                    <span className="tag-name">Sports</span>
                </div>
                <div className="tag-item" onClick={goToHome}>
                    <img className="tags-icon" src="images/tagicons/SURVIVAL.png" alt="Survival" />
                    <span className="tag-name">Survival</span>
                </div>
            </div>

            <section className="game-section">
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
                                <div className="price-box">{game?.price === 0 ? "FREE" : `${game?.price}$`}</div>

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

            <section className="screenshots">
                <img className="screenshot-placeholder" src={images?.screenshot1 ?? "/Images/Notfound.jpg"} onError={(e) => (e.currentTarget.src = "/Images/Notfound.jpg")} />
                <img className="screenshot-placeholder" src={images?.screenshot2 ?? "/Images/Notfound.jpg"} onError={(e) => (e.currentTarget.src = "/Images/Notfound.jpg")} />
                <img className="screenshot-placeholder" src={images?.screenshot3 ?? "/Images/Notfound.jpg"} onError={(e) => (e.currentTarget.src = "/Images/Notfound.jpg")} />
            </section>

            <section className="requirements">
                <h2>SYSTEM REQUIREMENTS</h2>
                <div className="req-columns">
                    <div className="req-block">
                        <h3>MINIMUM:</h3>
                        <ul>
                            <li>OS: {requirements?.minos ?? "N/A"}</li>
                            <li>Processor: {requirements?.minprocessor ?? "N/A"}</li>
                            <li>Memory: {requirements?.minmemory ?? "N/A"}</li>
                            <li>Graphics: {requirements?.mingraphics ?? "N/A"}</li>
                            <li>Storage: {requirements?.minstorage ?? "N/A"}</li>
                        </ul>
                    </div>
                    <div className="req-block">
                        <h3>RECOMMENDED:</h3>
                        <ul>
                            <li>OS: {requirements?.recos ?? "N/A"}</li>
                            <li>Processor: {requirements?.recprocessor ?? "N/A"}</li>
                            <li>Memory: {requirements?.recmemory ?? "N/A"}</li>
                            <li>Graphics: {requirements?.recgraphics ?? "N/A"}</li>
                            <li>Storage: {requirements?.recstorage ?? "N/A"}</li>
                        </ul>
                    </div>
                </div>
            </section>


            {showLogin && (
                <div className="popup-overlay">
                    <div className="popup-box">
                        <div className="popup-title">Sign In</div>
                        <form onSubmit={handleLogin} style={{ display: "flex", flexDirection: "column", gap: "10px", margin: "20px 0" }}>
                            <input type="text" placeholder="Username" required value={username} onChange={e => setUsername(e.target.value)} className="auth-input" />
                            <input type="password" placeholder="Password" required value={password} onChange={e => setPassword(e.target.value)} className="auth-input" />
                            {authMessage && <p style={{ color: "red", fontSize: "14px", margin: 0 }}>{authMessage}</p>}
                            <button type="submit" className="buy-btn" style={{ marginTop: "10px" }}>Login</button>
                        </form>
                        <button className="popup-close-btn" onClick={() => setShowLogin(false)}>Close</button>
                    </div>
                </div>
            )}

            {showRegister && (
                <div className="popup-overlay">
                    <div className="popup-box">
                        <div className="popup-title">Sign Up</div>
                        <form onSubmit={handleRegister} style={{ display: "flex", flexDirection: "column", gap: "10px", margin: "20px 0" }}>
                            <input type="text" placeholder="Username" required value={regUsername} onChange={e => setRegUsername(e.target.value)} className="auth-input" />
                            <input type="email" placeholder="Email" required value={regEmail} onChange={e => setRegEmail(e.target.value)} className="auth-input" />
                            <input type="password" placeholder="Password" required value={regPassword} onChange={e => setRegPassword(e.target.value)} className="auth-input" />
                            {authMessage && <p style={{ color: authMessage.includes("πέτυχε") ? "green" : "red", fontSize: "14px", margin: 0 }}>{authMessage}</p>}
                            <button type="submit" className="buy-btn" style={{ marginTop: "10px" }}>Register</button>
                        </form>
                        <button className="popup-close-btn" onClick={() => setShowRegister(false)}>Close</button>
                    </div>
                </div>
            )}
        </div>
    );
};

export default GameShop;