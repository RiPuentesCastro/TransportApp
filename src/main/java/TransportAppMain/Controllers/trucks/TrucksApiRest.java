package TransportAppMain.Controllers.trucks;

import TransportAppMain.model.common.Response;
import TransportAppMain.model.trucks.Trucks;
import TransportAppMain.usecases.TrucksUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
@AllArgsConstructor
public class TrucksApiRest {

    private final TrucksUseCase trucksUseCase;

    @GetMapping("/trucks/getAllTrucks")
    public Response getAllTrucks() {
        return trucksUseCase.getAllTrucks();
    }

    @GetMapping("/trucks/getTruckById/{idTruck}")
    public Response getTruckById(@PathVariable Long idTruck) {
        return trucksUseCase.getTruckById(idTruck);
    }

    @PostMapping("/trucks/postTruck")
    public Response createTruck(@RequestBody Trucks truck) {
        return trucksUseCase.createTruck(truck);
    }

    @PostMapping("/trucks/updateTruck")
    public Response updateTruck(@RequestBody Trucks truck) {
        return trucksUseCase.updateTruck(truck);
    }

    @DeleteMapping("/trucks/deleteTruck/{idTruck}")
    public Response deleteTruck(@PathVariable Long idTruck) {
        return trucksUseCase.deleteTruck(idTruck);
    }
}
