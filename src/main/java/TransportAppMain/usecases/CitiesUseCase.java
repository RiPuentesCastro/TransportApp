package TransportAppMain.usecases;

import TransportAppMain.model.cities.CitiesRepository;
import TransportAppMain.model.common.HttpStatusEnum;
import TransportAppMain.model.common.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
public class CitiesUseCase {

    private final CitiesRepository citiesRepository;

    public Response getAllCities(){
        try{
            return Response.builder().data(citiesRepository.getAllCities()).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("List of cities generated correctly").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error generating list of cities").build();
        }
    }

}
