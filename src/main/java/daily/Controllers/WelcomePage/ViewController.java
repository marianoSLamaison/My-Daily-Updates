package daily.Controllers.WelcomePage;

import java.net.http.HttpRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/*
 * Controller encargado de antender pedidos de usuario
 * Un usuario se define como una persona que se conecta desde un navegador
 * 
 */
@Controller
public class ViewController {
    @GetMapping("/")
    public String Welcome(Model model) 
    {
        model.addAttribute("title", "Welcome to my page from thymeleaf");
        return "welcome/index";
    }
    @RequestMapping(value = "/Post/MostVisited", method = RequestMethod.GET)
    @ResponseBody
    public String Posts(@RequestParam("Amount") int amount) 
    {
        return "";
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
