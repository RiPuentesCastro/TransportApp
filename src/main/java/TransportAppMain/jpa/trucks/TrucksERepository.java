package TransportAppMain.jpa.trucks;

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
public interface TrucksERepository extends CrudRepository<TrucksEntity, Long>, QueryByExampleExecutor<TrucksEntity> {

    @Query(value = "SELECT * FROM `trucks` ORDER BY id_truck ;", nativeQuery = true)
    List<TrucksEntity> getAllTrucks();

    @Query(value = "SELECT * FROM `trucks` WHERE `trucks`.`id_truck` = :idTruck ORDER BY id_truck ;", nativeQuery = true)
    TrucksEntity getTruckById(@Param("idTruck") Long idTruck);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO `trucks` (`user_id`, `image_truck`, `truck_type`, `full_partial`, `length`, `weight`, `origin`, `destination`, `date_from`, " +
            "`date_to`, `numbers_contact`, `comments`, `lat_origin`, `lng_origin`, `address_components_origin`, `lat_destination`, `lng_destination`, `address_components_destination`) " +
            "VALUES ( :userId , :imageTruck , :truckType , :fullPartial , :length , :weight , :origin , :destination , :dateFrom , :dateTo , :numberContact , :comments ," +
            " :latOrigin , :lngOrigin , :addressComponentsOrigin , :latDestination , :lngDestination , :addressComponentDestination);", nativeQuery = true)
    int createTruck(@Param("userId") Long userId, @Param("imageTruck") String imageTruck, @Param("truckType") String truckType, @Param("fullPartial") String fullPartial,
                   @Param("length") int length, @Param("weight") int weight, @Param("origin") String origin, @Param("destination") String destination,
                   @Param("dateFrom") LocalDate dateFrom, @Param("dateTo") LocalDate dateTo, @Param("numberContact") String numberContact,
                   @Param("comments") String comments, @Param("latOrigin") Float latOrigin, @Param("lngOrigin") Float lngOrigin, @Param("addressComponentsOrigin") String addressComponentsOrigin,
                   @Param("latDestination") Float latDestination, @Param("lngDestination") Float lngDestination, @Param("addressComponentDestination") String addressComponentDestination);

    @Transactional
    @Modifying
    @Query(value = "UPDATE `trucks` SET `user_id` = :userId , `image_truck` = :imageTruck , `truck_type` = :truckType , `full_partial` = :fullPartial , `length` = :length , `weight` = :weight , " +
            "`origin` = :origin , `destination` = :destination , `date_from` = :dateFrom , `date_to` = :dateTo , `numbers_contact` = :numberContact , " +
            "`comments` = :comments , `lat_origin` = :latOrigin , `lng_origin` = :lngOrigin , `address_components_origin` = :addressComponentsOrigin , `lat_destination` = :latDestination , " +
            "`lng_destination` = :lngDestination , `address_components_destination` = :addressComponentDestination WHERE `trucks`.`id_truck` = :idTruck ;", nativeQuery = true)
    int updateTruck(@Param("idTruck") Long idTruck, @Param("userId") Long userId, @Param("imageTruck") String imageTruck, @Param("truckType") String truckType, @Param("fullPartial") String fullPartial,
                    @Param("length") int length, @Param("weight") int weight, @Param("origin") String origin, @Param("destination") String destination, @Param("dateFrom") LocalDate dateFrom,
                    @Param("dateTo") LocalDate dateTo, @Param("numberContact") String numberContact, @Param("comments") String comments, @Param("latOrigin") Float latOrigin,
                    @Param("lngOrigin") Float lngOrigin, @Param("addressComponentsOrigin") String addressComponentsOrigin, @Param("latDestination") Float latDestination,
                    @Param("lngDestination") Float lngDestination, @Param("addressComponentDestination") String addressComponentDestination);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM `trucks` WHERE id_truck = :idTruck ;", nativeQuery = true)
    int deleteTruck(@Param("idTruck") Long idTruck);
}