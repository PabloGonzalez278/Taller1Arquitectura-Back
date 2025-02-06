import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class RestController {

    public static class Location {
        private double latitude;
        private double longitude;

        // Getters y Setters
        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }
    }

    @PostMapping("/location")
    public String receiveLocation(@RequestBody Location location) {
        // Procesar la ubicación
        System.out.println("REST: Latitud: " + location.getLatitude() + 
                           ", Longitud: " + location.getLongitude());
        return "REST data received";
    }
}