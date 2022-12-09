package TransportAppMain.model.users;

import TransportAppMain.model.common.Authentication;

import java.util.List;

public interface UsersRepository {

    Users validateUser(Authentication authentication, String decodePass);
    List<Users> getAllUsers();
    Users getUserById(Long idUser);
    int createUser(Users user);
    int updateUser(Users user);
    int deleteUser(Long idUser);
}
