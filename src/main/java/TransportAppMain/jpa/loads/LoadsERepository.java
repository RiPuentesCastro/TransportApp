package TransportAppMain.jpa.loads;

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
public interface LoadsERepository extends CrudRepository<LoadsEntity, Long>, QueryByExampleExecutor<LoadsEntity> {

    @Query(value = "SELECT * FROM `loads` ORDER BY id_load ;", nativeQuery = true)
    List<LoadsEntity> getAllLoads();

    @Query(value = "SELECT * FROM `loads` WHERE `loads`.`id_load` = :idLoad ORDER BY id_load ;", nativeQuery = true)
    LoadsEntity getLoadById(@Param("idLoad") Long idLoad);

    @Query(value = "SELECT * FROM `loads` WHERE `loads`.`user_id` = :userId ORDER BY id_load DESC ;", nativeQuery = true)
    List<LoadsEntity> getLoadByUserId(@Param("userId") Long userId);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO `loads` (`origin`, `destination`, `date_from`, `date_to`, `full_partial`, `truck_type`, `length`, `weight`, `number_contact`, " +
            "`comments`, `type_loads`, `value_kilogram`, `rating`, `status`, `user_id`, `lat_origin`, `lng_origin`, `address_components_origin`, `lat_destination`, " +
            "`lng_destination`, `address_components_destination`) " +
            "VALUES ( :origin , :destination , :dateFrom , :dateTo , :fullPartial , :truckType , :length , :weight , :numberContact , :comments , :typeLoads , " +
            " :valueKilogram , :rating , :status , :userId , :latOrigin , :lngOrigin , :addressComponentsOrigin , :latDestination , :lngDestination , :addressComponentDestination);", nativeQuery = true)
    int createLoad(@Param("origin") String origin, @Param("destination") String destination, @Param("dateFrom") LocalDate dateFrom, @Param("dateTo") LocalDate dateTo,
                   @Param("fullPartial") String fullPartial, @Param("truckType") String truckType, @Param("length") int length, @Param("weight") int weight,
                   @Param("numberContact") String numberContact, @Param("comments") String comments, @Param("typeLoads") String typeLoads,
                   @Param("valueKilogram") Double valueKilogram, @Param("rating") Double rating, @Param("status") String status, @Param("userId") Long userId,
                   @Param("latOrigin") Float latOrigin, @Param("lngOrigin") Float lngOrigin, @Param("addressComponentsOrigin") String addressComponentsOrigin,
                   @Param("latDestination") Float latDestination, @Param("lngDestination") Float lngDestination, @Param("addressComponentDestination") String addressComponentDestination);

    @Transactional
    @Modifying
    @Query(value = "UPDATE `loads` SET `origin` = :origin , `destination` = :destination , `date_from` = :dateFrom , `date_to` = :dateTo , `full_partial` = :fullPartial , " +
            "`truck_type` = :truckType , `length` = :length , `weight` = :weight , `number_contact` = :numberContact , `comments` = :comments , `type_loads` = :typeLoads , " +
            "`value_kilogram` = :valueKilogram , `rating` = :rating , `status` = :status , `user_id` = :userId , `lat_origin` = :latOrigin , `lng_origin` = :lngOrigin , " +
            "`address_components_origin` = :addressComponentsOrigin , `lat_destination` = :latDestination , `lng_destination` = :lngDestination , " +
            "`address_components_destination` = :addressComponentDestination WHERE `loads`.`id_load` = :idLoad ;", nativeQuery = true)
    int updateLoad(@Param("idLoad") Long idLoad, @Param("origin") String origin, @Param("destination") String destination, @Param("dateFrom")LocalDate dateFrom, @Param("dateTo") LocalDate dateTo,
                   @Param("fullPartial") String fullPartial, @Param("truckType") String truckType, @Param("length") int length, @Param("weight") int weight,
                   @Param("numberContact") String numberContact, @Param("comments") String comments, @Param("typeLoads") String typeLoads,
                   @Param("valueKilogram") Double valueKilogram, @Param("rating") Double rating, @Param("status") String status, @Param("userId") Long userId,
                   @Param("latOrigin") Float latOrigin, @Param("lngOrigin") Float lngOrigin, @Param("addressComponentsOrigin") String addressComponentsOrigin,
                   @Param("latDestination") Float latDestination, @Param("lngDestination") Float lngDestination, @Param("addressComponentDestination") String addressComponentDestination);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM `loads` WHERE id_load = :idLoad ;", nativeQuery = true)
    int deleteLoad(@Param("idLoad") Long idLoad);
}
