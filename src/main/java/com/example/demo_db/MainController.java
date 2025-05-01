package com.example.demo_db;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String main() {
        return "main.html";
    }

    @GetMapping("/auth")
    public String home(OAuth2AuthenticationToken authentication) {
        return "Hello, " + authentication.getPrincipal().getAttribute("login");
    }
}