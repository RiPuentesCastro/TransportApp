package TransportAppMain.jpa.loads;

import TransportAppMain.jpa.helper.AdapterOperations;
import TransportAppMain.model.loads.Loads;
import TransportAppMain.model.loads.LoadsRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadsRAdapter extends AdapterOperations<Loads, LoadsEntity, Long, LoadsERepository> implements LoadsRepository {

    public LoadsRAdapter(LoadsERepository repository, ObjectMapper mapper){
        super(repository, mapper, d -> mapper.mapBuilder(d, Loads.LoadsBuilder.class).build(),3600);    }

    @Override
    public List<Loads> getAllLoads(){
        return toList(repository.getAllLoads());
    }

    @Override
    public Loads getLoadById(Long idLoad){
        return toEntity(repository.getLoadById(idLoad));
    }

    @Override
    public List<Loads> getLoadByUserId(Long userId){
        return toList(repository.getLoadByUserId(userId));
    }

    @Override
    public int createLoad(Loads load){
        return repository.createLoad(load.getOrigin(),load.getDestination(),load.getDateFrom(),load.getDateTo(),
                load.getFullPartial(),load.getTruckType(),load.getLength(),load.getWeight(),load.getNumberContact(),
                load.getComments(),load.getTypeLoads(),load.getValueKilogram(),load.getRating(),load.getStatus(),load.getUserId(),
                load.getLatOrigin(),load.getLngOrigin(),load.getAddressComponentsOrigin(),load.getLatDestination(),
                load.getLngDestination(),load.getAddressComponentDestination());
    }

    @Override
    public int updateLoad(Loads load){
        return repository.updateLoad(load.getIdLoad(),load.getOrigin(),load.getDestination(),load.getDateFrom(),load.getDateTo(),
                load.getFullPartial(),load.getTruckType(),load.getLength(),load.getWeight(),load.getNumberContact(),
                load.getComments(),load.getTypeLoads(),load.getValueKilogram(),load.getRating(),load.getStatus(),load.getUserId(),
                load.getLatOrigin(),load.getLngOrigin(),load.getAddressComponentsOrigin(),load.getLatDestination(),
                load.getLngDestination(),load.getAddressComponentDestination());
    }

    @Override
    public int deleteLoad(Long idLoad){
        return repository.deleteLoad(idLoad);
    }
}
