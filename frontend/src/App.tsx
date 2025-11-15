import React from "react";
import "./App.css";
import Games from "./Games";
import GameList from "./GameList";
import GameShop from "./GameShop";

function App() {
    const path = window.location.pathname;

    if (path === "/games") return <Games />;
    if (path === "/GameList") return <GameList />;
    if (path === "/GameShop") return <GameShop />;

    return (
        <div className="App">
            <header className="App-header">
                <h1>Hello, World!</h1>
                <h2>Τα κλαυτερα παιχνιδια του καταβλησμου Μπιρμπιτας</h2>
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
                        Button 2 (Playstastion)
                    </button>
                </div>
            </header>
        </div>
    );
}

export default App;
