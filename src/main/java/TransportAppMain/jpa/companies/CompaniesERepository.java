package TransportAppMain.jpa.companies;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CompaniesERepository extends CrudRepository<CompaniesEntity, Long>, QueryByExampleExecutor<CompaniesEntity> {

    @Query(value = "SELECT * FROM `companies` ORDER BY id_company ;", nativeQuery = true)
    List<CompaniesEntity> getAllCompanies();

    @Query(value = "SELECT * FROM `companies` WHERE `companies`.`id_company` = :idCompany ORDER BY id_company ;", nativeQuery = true)
    CompaniesEntity getCompanyById(@Param("idCompany") Long idCompany);

    @Query(value = "SELECT * FROM `companies` WHERE `companies`.`user_id` = :userId ORDER BY id_company ;", nativeQuery = true)
    CompaniesEntity getCompanyByUserId(@Param("userId") Long userId);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO `companies` (`name`, `address`, `city`, `credit_score`, `days_to_pay`, `pick_up_date`, `email`, `user_id`) " +
            "VALUES ( :name , :address , :city , :creditScore , :daysToPay , :pickUpDate , :email , :userId );", nativeQuery = true)
    int createCompany(@Param("name") String name, @Param("address") String address, @Param("city") String city,
                      @Param("creditScore") int creditScore, @Param("daysToPay") int daysToPay, @Param("pickUpDate") int pickUpDate,
                      @Param("email") String email, @Param("userId") Long userId);

    @Transactional
    @Modifying
    @Query(value = "UPDATE `companies` SET `name` = :name , `address` = :address , `city` = :city " +
            ", `credit_score` = :creditScore , `days_to_pay` = :daysToPay , `pick_up_date` = :pickUpDate " +
            ", `email` = :email , `user_id` = :userId WHERE `companies`.`id_company` = :idCompany ;", nativeQuery = true)
    int updateCompany(@Param("idCompany") Long idCompany, @Param("name") String name, @Param("address") String address,
                      @Param("city") String city, @Param("creditScore") int creditScore, @Param("daysToPay") int daysToPay,
                      @Param("pickUpDate") int pickUpDate, @Param("email") String email, @Param("userId") Long userId);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM `companies` WHERE id_company = :idCompany ;", nativeQuery = true)
    int deleteCompany(@Param("idCompany") Long idCompany);

}
