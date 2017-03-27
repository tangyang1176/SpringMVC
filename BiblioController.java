package biblio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BiblioController {

    @RequestMapping("/input")
    public String biblio(){
           return "biblio";
    }
    
}