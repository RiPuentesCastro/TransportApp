package TransportAppMain.jpa.cities;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitiesERepository extends CrudRepository<CitiesEntity, Long>, QueryByExampleExecutor<CitiesEntity> {

    @Query(value = "SELECT * FROM `cities` ORDER BY id_city ;", nativeQuery = true)
    List<CitiesEntity> getAllCities();

}
