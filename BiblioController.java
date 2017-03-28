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
    
    @RequestMapping("/addEntry")
    public String addEntry(@RequestParam(value="author", required=true) String a, 
    @RequestParam(value="title", required=true) String t,
    @RequestParam(value="year", required=true) String y,
    @RequestParam(value="journal", required=true) String j,Model model) {
         model.addAttribute("author", a);
         model.addAttribute("title", t);
         model.addAttribute("year", y);
         model.addAttribute("journal", j);
         System.out.println("adding new entry with author "+a);
         System.out.println("adding new entry with title "+t);
         System.out.println("adding new entry with year "+y);
         System.out.println("adding new entry with jornal "+j);
         return "biblio"; /    
}
