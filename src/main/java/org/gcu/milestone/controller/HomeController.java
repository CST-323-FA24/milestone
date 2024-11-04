package org.gcu.milestone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index.html";
    }

    // Fallback for all other routes to allow React to handle client-side routing
    @GetMapping("/**/{path:[^.]*}")
    public String forwardToReact(@PathVariable String path) {
        return "forward:/index.html";
    }
}

