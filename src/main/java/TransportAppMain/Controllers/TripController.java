package TransportAppMain.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripController {

    @RequestMapping("/")
    public String home() {
        return "Hello Spring Boot with Docker";
    }

}