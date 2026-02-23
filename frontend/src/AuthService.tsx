const API_URL = "http://localhost:8080/api/auth/";

class AuthService {

  login(username: string, password: string) {
    return fetch(API_URL + "signin", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ username, password }),
    })
      .then((response) => {
        if (!response.ok) {
            throw new Error("Λάθος στοιχεία σύνδεσης");
        }
        return response.json();
      })
      .then((data) => {

        if (data.token) {
          localStorage.setItem("user", JSON.stringify(data));
        }
        return data;
      });
  }


  register(username: string, email: string, password: string) {
    return fetch(API_URL + "signup", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ username, email, password }),
    }).then(response => {
        if (!response.ok) {
            throw new Error("Αποτυχία εγγραφής!! ");
        }
        return response.text();
    });
  }


  logout() {
    localStorage.removeItem("user");
  }


  getCurrentUser() {
    const userStr = localStorage.getItem("user");
    if (userStr) return JSON.parse(userStr);
    return null;
  }
}

export default new AuthService();