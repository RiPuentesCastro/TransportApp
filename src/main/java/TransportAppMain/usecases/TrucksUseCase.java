package TransportAppMain.usecases;

import TransportAppMain.model.common.HttpStatusEnum;
import TransportAppMain.model.common.Response;
import TransportAppMain.model.trucks.Trucks;
import TransportAppMain.model.trucks.TrucksRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
public class TrucksUseCase {

    private final TrucksRepository trucksRepository;

    public Response getAllTrucks(){
        try{
            return Response.builder().data(trucksRepository.getAllTrucks()).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("List of trucks").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error getting list of trucks").build();
        }
    }

    public Response getTruckById(Long idTruck){
        try{
            return Response.builder().data(trucksRepository.getTruckById(idTruck)).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("Truck found successfully").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error locating the truck").build();
        }
    }

    public Response createTruck(Trucks truck){
        try{
            int create = trucksRepository.createTruck(truck);
            if(create == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Truck created successfully").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("An error occurred creating the truck").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error creating the truck").build();
        }
    }

    public Response updateTruck(Trucks truck){
        try{
            int update = trucksRepository.updateTruck(truck);
            if(update == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Truck successfully updated").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("It was not possible to update the truck information").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error updating truck information").build();
        }
    }

    public Response deleteTruck(Long idTruck){
        try{
            int delete = trucksRepository.deleteTruck(idTruck);
            if(delete == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Truck deleted successfully").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("It was not possible to delete the selected truck").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error deleting the truck").build();
        }
    }
}
