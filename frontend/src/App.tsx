import React from "react";
import "./App.css";
import Games from "./Games";
import GameList from "./GameList";

function App() {
  const path = window.location.pathname;

  if (path === "/games") return <Games />;
  if (path === "/GameList") return <GameList />;

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
              window.location.href = "/GameList";
            }}
          >
            Button 2
          </button>
        </div>
      </header>
    </div>
  );
}

export default App;
