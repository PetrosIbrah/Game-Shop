import React, { useEffect, useState } from "react";
import "./App.css";

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

const GameList: React.FC = () => {
  const [games, setGames] = useState<Game[]>([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    fetch("/api/GameList")
      .then((res) => {
        if (!res.ok) throw new Error("Failed to fetch games");
        return res.json();
      })
      .then((data) => setGames(data))
      .catch((err) => setError(err.message))
      .finally(() => setLoading(false));
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <h2 style={{ color: "#ffa500" }}>🎮 Game Library</h2>

        {error && <p style={{ color: "#ff4c4c" }}>Error fetching games: {error}</p>}

        <table
          style={{
            borderCollapse: "collapse",
            width: "80%",
            color: "#f5f5f5",
            marginTop: "20px",
          }}
        >
          <thead>
            <tr style={{ backgroundColor: "#333" }}>
              <th style={{ border: "1px solid #555", padding: "8px" }}>Name</th>
              <th style={{ border: "1px solid #555", padding: "8px" }}>Year</th>
              <th style={{ border: "1px solid #555", padding: "8px" }}>Price</th>
              <th style={{ border: "1px solid #555", padding: "8px" }}>Developer</th>
              <th style={{ border: "1px solid #555", padding: "8px" }}>Tag</th>
              <th style={{ border: "1px solid #555", padding: "8px" }}>Platform</th>
              <th style={{ border: "1px solid #555", padding: "8px" }}>Stocks</th>
            </tr>
          </thead>
          <tbody>
            {loading ? (
              <tr>
                <td colSpan={7} style={{ padding: "8px" }}>
                  Loading games...
                </td>
              </tr>
            ) : games.length === 0 ? (
              <tr>
                <td colSpan={7} style={{ padding: "8px" }}>
                  No games available
                </td>
              </tr>
            ) : (
              games.map((game, index) => (
                <tr
                  key={game.id}
                  style={{
                    backgroundColor: index % 2 === 0 ? "#2a2a2a" : "#1e1e1e",
                  }}
                >
                  <td style={{ border: "1px solid #555", padding: "8px" }}>{game.gameName}</td>
                  <td style={{ border: "1px solid #555", padding: "8px" }}>{game.releaseYear}</td>
                  <td style={{ border: "1px solid #555", padding: "8px" }}>${game.price}</td>
                  <td style={{ border: "1px solid #555", padding: "8px" }}>{game.developer}</td>
                  <td style={{ border: "1px solid #555", padding: "8px" }}>{game.gameTag}</td>
                  <td style={{ border: "1px solid #555", padding: "8px" }}>{game.platform}</td>
                  <td style={{ border: "1px solid #555", padding: "8px" }}>{game.stocks}</td>
                </tr>
              ))
            )}
          </tbody>
        </table>
      </header>
    </div>
  );
};

export default GameList;
