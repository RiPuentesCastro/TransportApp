package TransportAppMain.jpa.trucks;

import TransportAppMain.jpa.helper.AdapterOperations;
import TransportAppMain.model.trucks.Trucks;
import TransportAppMain.model.trucks.TrucksRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrucksRAdapter extends AdapterOperations<Trucks, TrucksEntity, Long, TrucksERepository> implements TrucksRepository {

    public TrucksRAdapter(TrucksERepository repository, ObjectMapper mapper){
        super(repository, mapper, d -> mapper.mapBuilder(d, Trucks.TrucksBuilder.class).build(), 3600);
    }

    @Override
    public List<Trucks> getAllTrucks(){
        return toList(repository.getAllTrucks());
    }

    @Override
    public Trucks getTruckById(Long idTruck){
        return toEntity(repository.getTruckById(idTruck));
    }

    @Override
    public int createTruck(Trucks truck){
        return repository.createTruck(truck.getUserId(),truck.getImageTruck(),truck.getTruckType(),truck.getFullPartial(),
                truck.getLength(),truck.getWeight(),truck.getOrigin(),truck.getDestination(), truck.getDateFrom(),truck.getDateTo(),
                truck.getNumbersContact(),truck.getComments(),truck.getLatOrigin(),truck.getLngOrigin(), truck.getAddressComponentsOrigin(),
                truck.getLatDestination(),truck.getLngDestination(),truck.getAddressComponentDestination());
    }

    @Override
    public int updateTruck(Trucks truck){
        return repository.updateTruck(truck.getIdTruck(),truck.getUserId(),truck.getImageTruck(),truck.getTruckType(),truck.getFullPartial(),
                truck.getLength(),truck.getWeight(),truck.getOrigin(),truck.getDestination(), truck.getDateFrom(),truck.getDateTo(),
                truck.getNumbersContact(),truck.getComments(),truck.getLatOrigin(),truck.getLngOrigin(), truck.getAddressComponentsOrigin(),
                truck.getLatDestination(),truck.getLngDestination(),truck.getAddressComponentDestination());
    }

    @Override
    public int deleteTruck(Long idTruck){
        return repository.deleteTruck(idTruck);
    }
}