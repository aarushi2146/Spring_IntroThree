//package com.example.Spring_IntroThree.controller;
//
//
//import com.example.Spring_IntroThree.model.AuthUser;
//import com.example.Spring_IntroThree.Service.AuthenticationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Map;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthUserController {
//
//    @Autowired
//    private AuthenticationService authenticationService;
//
//    // Register User
//    @PostMapping("/register")
//    public ResponseEntity<String> registerUser(@RequestBody AuthUser authUser) {
//        String response = authenticationService.registerUser(authUser);
//        return ResponseEntity.ok(response);
//    }
//
//    // Login User and Generate JWT Token
//    @PostMapping("/login")
//    public ResponseEntity<?> loginUser(@RequestBody Map<String, String> request) {
//        String token = authenticationService.authenticateUser(
//                request.get("email"),
//                request.get("password")
//        );
//
//        if (token.equals("User not found!") || token.equals("Invalid email or password!")) {
//            return ResponseEntity.status(401).body(Map.of("error", token));
//        }
//
//        return ResponseEntity.ok(Map.of("message", "Login successful!", "token", token));
//    }
//}


package com.example.Spring_IntroThree.controller;

import com.example.Spring_IntroThree.model.AuthUser;
import com.example.Spring_IntroThree.Service.AuthenticationService;
import com.example.Spring_IntroThree.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthUserController {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private EmailService emailService;

    // Register User
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody AuthUser authUser) {
        String response = authenticationService.registerUser(authUser);
        return ResponseEntity.ok(response);
    }

    // Login User and Generate JWT Token
    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> loginUser(@RequestBody Map<String, String> request) {
        String token = authenticationService.authenticateUser(
                request.get("email"),
                request.get("password")
        );

        if (token.equals("User not found!") || token.equals("Invalid email or password!")) {
            return ResponseEntity.status(401).body(Map.of("error", token));
        }

        return ResponseEntity.ok(Map.of("message", "Login successful!", "token", token));
    }

    // Forgot Password
    @PutMapping("/forgotPassword/{email}")
    public ResponseEntity<Map<String, String>> forgotPassword(@PathVariable String email, @RequestBody Map<String, String> request) {
        String newPassword = request.get("password");
        String response = authenticationService.forgotPassword(email, newPassword);

        if (response.equals("User not found!")) {
            return ResponseEntity.status(404).body(Map.of("error", response));
        }

        return ResponseEntity.ok(Map.of("message", response));
    }

    // Reset Password
    @PutMapping("/resetPassword/{email}")
    public ResponseEntity<Map<String, String>> resetPassword(@PathVariable String email,
                                                             @RequestParam String currentPassword,
                                                             @RequestParam String newPassword) {
        String response = authenticationService.resetPassword(email, currentPassword, newPassword);

        if (response.equals("User not found!") || response.equals("Current password is incorrect!")) {
            return ResponseEntity.status(400).body(Map.of("error", response));
        }

        return ResponseEntity.ok(Map.of("message", response));
    }
}


