package edu.farmingdale.csc311.lostfound.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    // Shows the sign-in page. Spring Security itself handles the POST to /login.
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}