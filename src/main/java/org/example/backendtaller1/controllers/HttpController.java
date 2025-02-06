import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/http")
public class HttpController {

    @GetMapping("/location")
    public String receiveLocation(
            @RequestParam("latitude") double latitude,
            @RequestParam("longitude") double longitude) {
        // Procesar la ubicación
        System.out.println("HTTP: Latitud: " + latitude + ", Longitud: " + longitude);
        return "HTTP data received";
    }
}