import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    // Fallback for other routes to allow React to handle routing
    @GetMapping("/**")
    public String forwardToReact() {
        return "forward:/index.html";
    }
}

