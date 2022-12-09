package TransportAppMain.usecases;

import TransportAppMain.model.common.HttpStatusEnum;
import TransportAppMain.model.common.Response;
import TransportAppMain.model.companies.Companies;
import TransportAppMain.model.companies.CompaniesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
public class CompaniesUseCase {

    private final CompaniesRepository companiesRepository;

    public Response getAllCompanies(){
        try{
            return Response.builder().data(companiesRepository.getAllCompanies()).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("List of companies").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error getting list of companies").build();
        }
    }

    public Response getCompanyById(Long idCompany){
        try{
            return Response.builder().data(companiesRepository.getCompanyById(idCompany)).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("Company found successfully").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error locating the company").build();
        }
    }

    public Response getCompanyByUserId(Long userId){
        try{
            return Response.builder().data(companiesRepository.getCompanyByUserId(userId)).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("Company found successfully").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error locating the company").build();
        }
    }

    public Response createCompany(Companies company){
        try{
            int create = companiesRepository.createCompany(company);
            if(create == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Company created successfully").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("An error occurred creating the company").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error creating the company").build();
        }
    }

    public Response updateCompany(Companies company){
        try{
            int update = companiesRepository.updateCompany(company);
            if(update == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Company successfully updated").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("It was not possible to update the company information").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error updating company information").build();
        }
    }

    public Response deleteCompany(Long idCompany){
        try{
            int delete = companiesRepository.deleteCompany(idCompany);
            if(delete == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Company deleted successfully").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("It was not possible to delete the selected company").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error deleting the company").build();
        }
    }

}