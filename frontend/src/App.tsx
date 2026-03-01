/* import React from "react";
import "./App.css";
import Games from "./Games";
import GameList from "./GameList";
import GameShop from "./GameShop";
import GamesMainPage from "./GamesMainPage";

function App() {
    const path = window.location.pathname;

    if (path === "/games") return <Games />;
    if (path === "/GameList") return <GameList />;
    if (path === "/GameShop") return <GameShop />;
    if (path === "/GamesMainPage") return <GamesMainPage />;

    return (
        <div className="App">
            <header className="App-header">
                <h1>Hello, World!</h1>
                <h2>Τα κλαυτερα παιχνιδια του καταβλησμου</h2>
                <div className="button-container">
                    <button
                        onClick={() => {
                            window.location.href = "http://localhost:8080/api/redirect-to-games";
                        }}
                    >
                        Button 1 (Go to Games)
                    </button>

                    <button
                        onClick={() => {
                            window.location.href = "http://localhost:8080/games";
                        }}
                    >
                        Button Test (Go to Games)
                    </button>

                    <button
                        onClick={() => {
                            localStorage.setItem("gameId", String(1));
                            window.location.href = "/GameShop";
                        }}
                        >
                        Button Test (Go to elden ring)
                    </button>
                    <button
                        onClick={() => {
                            localStorage.setItem("gameId", String(2));
                            window.location.href = "/GameShop";
                        }}
                        >
                        Button Test (Go to God Of War)
                    </button>

                    <button
                        onClick={() => {
                            localStorage.setItem("gameId", String(0));
                            window.location.href = "/GameShop";
                        }}
                        >
                        Button Test (Go to No game)
                    </button>

                    <button
                        onClick={() => {
                            localStorage.setItem("platform", "PC");
                            window.location.href = "/api/redirect-to-gamelist";
                        }}
                    >
                        Button 2 (PC)
                    </button>

                    <button
                        onClick={() => {
                            localStorage.setItem("platform", "PlayStation 5");
                            window.location.href = "/GameList";
                        }}
                    >
                        Button 2 (Playstastion5)
                    </button>

                    <button
                        onClick={() => {
                            window.location.href = "/GamesMainPage";
                        }}
                    >
                        Button 3 (GoToMainPage)
                    </button>



                </div>
            </header>
        </div>
    );
}*/
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import "./App.css";
import GameShop from "./GameShop";
import GamesMainPage from "./GamesMainPage";


function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<GamesMainPage />} />
        <Route path="/GameShop" element={<GameShop />} />
      </Routes>
    </Router>
  );
}

export default App;
