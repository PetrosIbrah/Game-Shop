package web.app.Controllers.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import web.app.Identification.User;
import web.app.Repositories.UserRepository;
import web.app.Security.JwtUtil;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtUtil jwtUtil;


    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@RequestBody Map<String, String> loginRequest) {


        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.get("username"), loginRequest.get("password")));

        SecurityContextHolder.getContext().setAuthentication(authentication);


        String jwt = jwtUtil.generateJwtToken(authentication);


        Map<String, String> response = new HashMap<>();
        response.put("token", jwt);
        response.put("username", loginRequest.get("username"));
        return ResponseEntity.ok(response);
    }


    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody Map<String, String> signUpRequest) {


        if (userRepository.existsByUsername(signUpRequest.get("username"))) {
            return ResponseEntity.badRequest().body("Error: Το Username υπάρχει ήδη!");
        }

        if (userRepository.existsByEmail(signUpRequest.get("email"))) {
            return ResponseEntity.badRequest().body("Error: Το Email υπάρχει ήδη!");
        }


        User user = new User(
                signUpRequest.get("username"),
                signUpRequest.get("email"),
                encoder.encode(signUpRequest.get("password")),
                "ROLE_USER"
        );

        userRepository.save(user);

        return ResponseEntity.ok("Ο χρήστης εγγράφηκε επιτυχώς!");
    }
}