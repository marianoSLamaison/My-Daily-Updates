package daily.Controllers.WelcomePage;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import daily.Controllers.WelcomePage.DTOS.PostBlock;

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
   @RequestMapping(value = "/Test", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String TestAnswer() {
    return "Hola! En efecto puedes hacer solicitudes al servidor y recibir respuesta!";
    }

    @RequestMapping(value = "/Post/MostVisited", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<PostBlock> Posts() 
    {
        ArrayList<PostBlock> ret = new ArrayList<PostBlock>();
        PostBlock p1 = new PostBlock(1, "My first Post", "This is my first post ever!");
        PostBlock p2 = new PostBlock(2, "My second Post", "This is my second post ever!!");
        ret.add(p1);
        ret.add(p2);
        return ret;
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
