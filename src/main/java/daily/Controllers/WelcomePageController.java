package daily.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

/*
 * Controller encargado de antender pedidos de usuario
 * Un usuario se define como una persona que se conecta desde un navegador
 * 
 */
@Controller
public class WelcomePageController {
    @GetMapping("/")
    public String Welcome(Model model) 
    {
        model.addAttribute("title", "Welcome to my page from thymeleaf");
        return "welcome/index";
    }
    /* 
    Esto no fuciono debido a que spring ya resuelve esas request por si solo
    @GetMapping("/style.css")
    String WelcomePageStyle()
    {
        return "style";
    }
    */
}
