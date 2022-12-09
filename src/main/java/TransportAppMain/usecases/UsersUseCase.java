package TransportAppMain.usecases;

import TransportAppMain.model.common.Authentication;
import TransportAppMain.model.common.HttpStatusEnum;
import TransportAppMain.model.common.Response;
import TransportAppMain.model.users.Users;
import TransportAppMain.model.users.UsersRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.time.LocalDate;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@RequiredArgsConstructor
public class UsersUseCase {

    private final UsersRepository usersRepository;

    public Response getAllUsers(){
        try{
            return Response.builder().data(usersRepository.getAllUsers()).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("List of users").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error getting list of users").build();
        }
    }

    public Response getUserById(Long idUser){
        try{
            return Response.builder().data(usersRepository.getUserById(idUser)).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("User found successfully").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error locating the user").build();
        }
    }

    public Response createUser(Users user){
        try {
            LocalDate date = LocalDate.now();
            user.setType("PUBLIC");
            user.setStat(1L);
            user.setRegisterDate(date);
            user.setPassword(new String(Base64.getDecoder().decode(user.getPassword())));
            usersRepository.createUser(user);
            return Response.builder().data(Boolean.TRUE).status(Boolean.TRUE)
                    .message("User Registered Correctly.").code(HttpStatusEnum.OK.getCode()).build();
        } catch (Exception e) {
            return Response.builder().data(null).status(Boolean.FALSE)
                    .message("Error registering user, please try again later.").code(HttpStatusEnum.OK.getCode()).build();
        }
    }

    public Response updateUser(Users user){
        try{
            int update = usersRepository.updateUser(user);
            if(update == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("User successfully updated").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("It was not possible to update the user information").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error updating user information").build();
        }
    }

    public Response deleteUser(Long idUser){
        try{
            int delete = usersRepository.deleteUser(idUser);
            if(delete == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("User deleted successfully").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("It was not possible to delete the selected user").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error deleting the user").build();
        }
    }


    public Response validateUser(Authentication authentication){
        try {
            String decodePass = new String(Base64.getDecoder().decode(authentication.getPassword()));
            Users userValidate = usersRepository.validateUser(authentication, decodePass);
            if(userValidate != null) {
                return Response.builder().data(userValidate).status(Boolean.TRUE)
                        .message("Username and password validated correctly").code(HttpStatusEnum.OK.getCode()).build();
            }
            return Response.builder().data(null).status(Boolean.FALSE)
                    .message("Invalid username or password, please confirm and try again.")
                    .code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).build();
        } catch (Exception e) {
            return Response.builder().data(null).status(Boolean.FALSE)
                    .message("An error occurred when validating the user, please try again later.")
                    .code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).build();
        }
    }

}
