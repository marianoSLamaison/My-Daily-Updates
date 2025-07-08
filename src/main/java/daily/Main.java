package daily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//Rest controller aclara que la app es el controler
//en otras palabras es lo que spring tomara en cuenta cuando maneje
//requests
//@RestController
//@Controller

//Ok Rest ontroler al inclur ResponceBody
//Hara que todo lo que tomes para enviar, se tome de manera litaral
//Por tanto produciendo el problem de que no puedes enviar HTMLs, 
//para solucionar eso usa Controller, y luego si necesitas usa Responce body
//en tus otros metodos
//esto es equivalente a usar 
/*
 * SpringBootConfiguration
 * y SpringAutoConfiguration
 * y ComponentScan
 * La segunda lo que hace es que le dara configuraciones a spring
 * basandose en las dependencias disponibles
 * 
 */
@SpringBootApplication
public class Main {
    //Le dice a spring que mapee este metodo a la ruta dada
    //@RequestMapping("/")
    //@GetMapping("/")
    //String home() {
    //    return "index.html";
    //}
    
    public static void main(String[] args) {
        /*
         * Esto es para decirle a spring que en base a su configuracion, 
         * corra nuestra aplicacion
         * al psarle args solo estas exponiendo los argumentos con los cuales podrias iniciarla
         * por consola
         */
        SpringApplication.run(Main.class, args);
    }
}