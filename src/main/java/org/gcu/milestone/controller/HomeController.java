import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "forward:/index.html";
    }

    // Fallback for all other routes to allow React to handle client-side routing
    @GetMapping("/**/{path:[^\\.]*}")
    public String forwardToReact() {
        return "forward:/index.html";
    }
}

