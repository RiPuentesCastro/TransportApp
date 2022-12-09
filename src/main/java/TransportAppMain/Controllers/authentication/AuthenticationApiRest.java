package TransportAppMain.Controllers.authentication;

import TransportAppMain.model.common.Authentication;
import TransportAppMain.model.common.Response;
import TransportAppMain.usecases.UsersUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
@AllArgsConstructor
public class AuthenticationApiRest {

    private final UsersUseCase usersUseCase;

    @PostMapping("/login")
    public Response login(@RequestBody Authentication authentication) {
        return usersUseCase.validateUser(authentication);
    }

}
