package web.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class AuthIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSuccessfulSignUp() throws Exception {

        String newUserJson = """
                {
                    "username": "test_user_999",
                    "email": "test999@example.com",
                    "password": "supersecretpassword"
                }
                """;


        mockMvc.perform(post("/api/auth/signup")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(newUserJson))
                .andExpect(status().isOk());
    }

    @Test
    public void testDuplicateUserSignUp() throws Exception {
        String Duplicate1 = """
                {
                    "username": "Testuser1",
                    "email": "oof@example.com",
                    "password": "password"
                }
                """;

        mockMvc.perform(post("/api/auth/signup")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(Duplicate1))
                .andExpect(status().isOk());


        Duplicate1 = """
                {
                    "username": "Testuser1",
                    "email": "oof2@example.com",
                    "password": "password"
                }
                """;

        mockMvc.perform(post("/api/auth/signup")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(Duplicate1))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void testDuplicateEmailSignUp() throws Exception {
        String Duplicate1 = """
                {
                    "username": "Testuser1",
                    "email": "oof@example.com",
                    "password": "password"
                }
                """;

        mockMvc.perform(post("/api/auth/signup")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(Duplicate1))
                .andExpect(status().isOk());


        Duplicate1 = """
                {
                    "username": "Testuser2",
                    "email": "oof@example.com",
                    "password": "password"
                }
                """;

        mockMvc.perform(post("/api/auth/signup")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(Duplicate1))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void testSuccessfulLogIn() throws Exception {
        String User = """
                {
                    "username": "Testuser1",
                    "email": "oof@example.com",
                    "password": "password123"
                }
                """;

        mockMvc.perform(post("/api/auth/signup")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(User))
                .andExpect(status().isOk());


        User = """
                {
                    "username": "Testuser1",
                    "password": "password123"
                }
                """;

        mockMvc.perform(post("/api/auth/signin")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(User))
                .andExpect(status().isOk());
    }

    @Test
    public void testwrongPasswordLogIn() throws Exception {
        String User = """
                {
                    "username": "Testuser1",
                    "email": "oof@example.com",
                    "password": "password123"
                }
                """;

        mockMvc.perform(post("/api/auth/signup")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(User))
                .andExpect(status().isOk());


        User = """
                {
                    "username": "Testuser1",
                    "password": "password12"
                }
                """;

        mockMvc.perform(post("/api/auth/signin")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(User))
                .andExpect(status().isForbidden());
    }

}