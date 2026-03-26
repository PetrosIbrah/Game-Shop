# 🎮 Game Shop
A full-stack web application for browsing a game store, built with **Spring Boot**, **React** (TypeScript), **Hibernate**, and **MySQL**, packaged with **Docker**. The full website is available at [GameShop](https://game-shop-x6xt.onrender.com). The website is hosted on a free version of Render.

## 🚀 How to Use
### Preconditions
- [Node.js] (for the frontend)
  - Install npm
    ```bash
     npm install
    ```
- [Java JDK 21(recommended)] (for the backend)
- [MySQL] (running locally or via Docker)

### Database Setup
Open your MySQL client and run:
 
```sql
Create Database GameShop;
Use GameShop;
```
> Hibernate will auto-create the tables on first run.

### Running the Frontend
 
Navigate to the frontend directory:
```bash
cd frontend
```

To start the development server:

```bash
npm start
```
To build for production:
```bash
npm run build
```

After building, copy the contents of `frontend/build` into the backend's static folder:
<pre>
frontend/build  →  src/main/resources/static
</pre>

## 🤝 Contributing
Contributions and suggestions are welcome.
1. Fork the repo
2. Create a branch: `git checkout -b feature/your-idea`
3. Commit your changes: `git commit -m "Add your idea"`
4. Push and open a pull request

## 📝 Already Planned
List of additions: 
1. PostgreSQL usage for docker images
2. Add Admin roles for accounts.
3. Add UI for admin accounts to use CRUD operations on games (Insert, Edit, Delete)
