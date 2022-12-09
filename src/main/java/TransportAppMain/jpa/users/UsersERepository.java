package TransportAppMain.jpa.users;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;


@Repository
public interface UsersERepository extends CrudRepository<UsersEntity, Long>, QueryByExampleExecutor<UsersEntity> {

    @Query(value = "SELECT * FROM `users` WHERE type != 'PUBLIC' ORDER BY id_user ;", nativeQuery = true)
    List<UsersEntity> getAllUsers();

    @Query(value = "SELECT * FROM `users` WHERE `users`.`id_user` = :idUser ORDER BY id_user ;", nativeQuery = true)
    UsersEntity getUserById(@Param("idUser") Long idUser);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO `users` (`username`, `password`, `type`, `name`, `lastname`, `register_date`, `profile_image`, `country`, `way_to_pay`, `stat`, `token`) " +
            "VALUES ( :username , :password , :type , :name , :lastname , :registerDate , :profileImage , :country , :wayToPay , :stat , :token );", nativeQuery = true)
    int createUser(@Param("username") String username, @Param("password") String password, @Param("type") String type, @Param("name") String name, @Param("lastname")String lastname,
                   @Param("registerDate") LocalDate registerDate, @Param("profileImage") String profileImage, @Param("country")String country, @Param("wayToPay") String wayToPay,
                   @Param("stat") Long stat, @Param("token")String token);

    @Transactional
    @Modifying
    @Query(value = "UPDATE `users` SET `username` = :username , `password` = :password , `type` = :type , `name` = :name , `lastname` = :lastname , `register_date` = :registerDate , " +
            "`profile_image` = :profileImage , `country` = :country , `way_to_pay` = :wayToPay , `stat` = :stat , `token` = :token  WHERE `users`.`id_user` = :idUser ;", nativeQuery = true)
    int updateUser(@Param("idUser") Long idUser, @Param("username") String username, @Param("password") String password, @Param("type") String type, @Param("name") String name, @Param("lastname")String lastname,
                   @Param("registerDate") LocalDate registerDate, @Param("profileImage") String profileImage, @Param("country")String country, @Param("wayToPay") String wayToPay,
                   @Param("stat") Long stat, @Param("token")String token);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM `users` WHERE id_user = :idUser ;", nativeQuery = true)
    int deleteUser(@Param("idUser") Long idUser);

    @Query(value = "SELECT * FROM `users` WHERE username = :username AND password = :password ;", nativeQuery = true)
    UsersEntity validateUser(@Param("username") String username, @Param("password") String password);
}