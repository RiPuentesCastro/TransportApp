package TransportAppMain.Controllers.users;

import TransportAppMain.model.common.Response;
import TransportAppMain.model.users.Users;
import TransportAppMain.usecases.UsersUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
@AllArgsConstructor
public class UsersApiRest {

    private final UsersUseCase usersUseCase;

    @GetMapping("/users/getAllUsers")
    public Response getAllUsers() {
        return usersUseCase.getAllUsers();
    }

    @GetMapping("/users/getUserById/{idUser}")
    public Response getUserById(@PathVariable Long idUser) {
        return usersUseCase.getUserById(idUser);
    }

    @PostMapping("/users/postUser")
    public Response createUser(@RequestBody Users user) {
        return usersUseCase.createUser(user);
    }

    @PostMapping("/users/updateUser")
    public Response updateUser(@RequestBody Users user) {
        return usersUseCase.updateUser(user);
    }

    @DeleteMapping("/users/deleteUser/{idUser}")
    public Response deleteUser(@PathVariable Long idUser) {
        return usersUseCase.deleteUser(idUser);
    }

}