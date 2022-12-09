package TransportAppMain.usecases;

import TransportAppMain.model.common.HttpStatusEnum;
import TransportAppMain.model.common.Response;
import TransportAppMain.model.loads.Loads;
import TransportAppMain.model.loads.LoadsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
public class LoadsUseCase {

    private final LoadsRepository loadsRepository;

    public Response getAllLoads(){
        try{
            return Response.builder().data(loadsRepository.getAllLoads()).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("List of loads").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error getting list of loads").build();
        }
    }

    public Response getLoadById(Long idLoad){
        try{
            return Response.builder().data(loadsRepository.getLoadById(idLoad)).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("Load found successfully").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error locating the load").build();
        }
    }

    public Response getLoadByUserId(Long userId){
        try{
            return Response.builder().data(loadsRepository.getLoadByUserId(userId)).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("List loads found successfully").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error locating the list loads").build();
        }
    }

    public Response createLoad(Loads load){
        try{
            int create = loadsRepository.createLoad(load);
            if(create == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Load created successfully").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("An error occurred creating the load").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error creating the load").build();
        }
    }

    public Response updateLoad(Loads load){
        try{
            int update = loadsRepository.updateLoad(load);
            if(update == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Load successfully updated").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("It was not possible to update the load information").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error updating load information").build();
        }
    }

    public Response deleteLoad(Long idLoad){
        try{
            int delete = loadsRepository.deleteLoad(idLoad);
            if(delete == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Load deleted successfully").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("It was not possible to delete the selected load").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error deleting the load").build();
        }
    }
}
