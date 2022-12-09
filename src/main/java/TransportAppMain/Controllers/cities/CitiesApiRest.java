package TransportAppMain.Controllers.cities;

import TransportAppMain.model.common.Response;
import TransportAppMain.usecases.CitiesUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/api")
@AllArgsConstructor
public class CitiesApiRest {

    private final CitiesUseCase citiesUseCase;

    @GetMapping("/cities/getAllCities")
    public Response getAllCities() {
        return citiesUseCase.getAllCities();
    }
}
