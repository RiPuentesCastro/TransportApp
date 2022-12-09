package TransportAppMain.jpa.users;

import TransportAppMain.jpa.helper.AdapterOperations;
import TransportAppMain.model.common.Authentication;
import TransportAppMain.model.users.Users;
import TransportAppMain.model.users.UsersRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersRAdapter extends AdapterOperations<Users, UsersEntity, Long, UsersERepository> implements UsersRepository {

    public UsersRAdapter(UsersERepository repository, ObjectMapper mapper){
        super(repository, mapper, d -> mapper.mapBuilder(d, Users.UsersBuilder.class).build(), 3600);
    }

    @Override
    public List<Users> getAllUsers(){
        return toList(repository.getAllUsers());
    }

    @Override
    public Users getUserById(Long idUser){
        return toEntity(repository.getUserById(idUser));
    }

    @Override
    public int createUser(Users user) {
        return repository.createUser(user.getUsername(), user.getPassword(), user.getType(), user.getName(), user.getLastname(), user.getRegisterDate(),
                user.getProfileImage(), user.getCountry(), user.getWayToPay(), user.getStat(), user.getToken());
    }

    @Override
    public int updateUser(Users user){
        return repository.updateUser(user.getIdUser(), user.getUsername(), user.getPassword(), user.getType(), user.getName(), user.getLastname(), user.getRegisterDate(),
                user.getProfileImage(), user.getCountry(), user.getWayToPay(), user.getStat(), user.getToken());
    }

    @Override
    public int deleteUser(Long idUser){
        return repository.deleteUser(idUser);
    }

    @Override
    public Users validateUser(Authentication authentication, String decodePass){
        return super.toEntity(repository.validateUser(authentication.getUsername(), decodePass));
    }
}