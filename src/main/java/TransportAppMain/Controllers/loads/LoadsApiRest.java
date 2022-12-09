package TransportAppMain.Controllers.loads;

import TransportAppMain.model.common.Response;
import TransportAppMain.model.loads.Loads;
import TransportAppMain.usecases.LoadsUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
@AllArgsConstructor
public class LoadsApiRest {

    private final LoadsUseCase loadsUseCase;

        @GetMapping("/loads/getAllLoads")
    public Response getAllLoads() {
        return loadsUseCase.getAllLoads();
    }

    @GetMapping("/loads/getLoadById/{idLoad}")
    public Response getLoadById(@PathVariable Long idLoad) {
        return loadsUseCase.getLoadById(idLoad);
    }

    @GetMapping("/loads/getLoadByUserId/{userId}")
    public Response getLoadByUserId(@PathVariable Long userId) {
        return loadsUseCase.getLoadByUserId(userId);
    }

    @PostMapping("/loads/postLoad")
    public Response createLoad(@RequestBody Loads load) {
        return loadsUseCase.createLoad(load);
    }

    @PostMapping("/loads/updateLoad")
    public Response updateLoad(@RequestBody Loads load) {
        return loadsUseCase.updateLoad(load);
    }

    @DeleteMapping("/loads/deleteLoad/{idLoad}")
    public Response deleteLoad(@PathVariable Long idLoad) {
        return loadsUseCase.deleteLoad(idLoad);
    }

}
