package TransportAppMain.jpa.cities;

import TransportAppMain.jpa.helper.AdapterOperations;
import TransportAppMain.model.cities.Cities;
import TransportAppMain.model.cities.CitiesRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitiesRAdapter extends AdapterOperations<Cities, CitiesEntity, Long, CitiesERepository> implements CitiesRepository {

    public CitiesRAdapter(CitiesERepository repository, ObjectMapper mapper){
        super(repository, mapper, d -> mapper.mapBuilder(d, Cities.CitiesBuilder.class).build(),3600);
    }

    @Override
    public List<Cities> getAllCities(){
        return toList(repository.getAllCities());
    }

}
