package TransportAppMain.jpa.companies;

import TransportAppMain.jpa.helper.AdapterOperations;
import TransportAppMain.model.companies.Companies;
import TransportAppMain.model.companies.CompaniesRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompaniesRAdapter extends AdapterOperations<Companies, CompaniesEntity, Long, CompaniesERepository> implements CompaniesRepository {

    public CompaniesRAdapter(CompaniesERepository repository, ObjectMapper mapper){
        super(repository, mapper, d -> mapper.mapBuilder(d, Companies.CompaniesBuilder.class).build(),3600);
    }

    @Override
    public List<Companies> getAllCompanies(){
        return toList(repository.getAllCompanies());
    }

    @Override
    public Companies getCompanyById(Long idCompany){
        return toEntity(repository.getCompanyById(idCompany));
    }

    @Override
    public Companies getCompanyByUserId(Long idUser){
        return toEntity(repository.getCompanyByUserId(idUser));
    }

    @Override
    public int updateCompany(Companies company){
        return repository.updateCompany(company.getIdCompany(), company.getName(), company.getAddress(), company.getCity(),
                company.getCreditScore(), company.getDaysToPay(), company.getPickUpDate(), company.getEmail(),
                company.getUserId());
    }

    @Override
    public int deleteCompany(Long idCompany){
        return repository.deleteCompany(idCompany);
    }

    @Override
    public int createCompany(Companies company){
        return repository.createCompany(company.getName(), company.getAddress(), company.getCity(),
                company.getCreditScore(), company.getDaysToPay(), company.getPickUpDate(), company.getEmail(),
                company.getUserId());
    }


}
