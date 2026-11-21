package edu.farmingdale.csc311.lostfound;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {

    // Serves templates/index.html. Principal is the signed-in user.
    @GetMapping("/")
    public String home(Principal principal, Model model) {
        model.addAttribute("username", principal.getName());
        return "index";
    }
}