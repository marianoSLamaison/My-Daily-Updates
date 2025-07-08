package daily.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * Controller encargado de antender pedidos de usuario
 * Un usuario se define como una persona que se conecta desde un navegador
 * 
 */
@Controller
public class UserController {
    @GetMapping("/")
    String WelcomePage() 
    {
        return "index.html";
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
