package TransportAppMain.model.trucks;

import java.util.List;

public interface TrucksRepository {
    List<Trucks> getAllTrucks();
    Trucks getTruckById(Long idTruck);
    int createTruck(Trucks truck);
    int updateTruck(Trucks truck);
    int deleteTruck(Long idTruck);
}
