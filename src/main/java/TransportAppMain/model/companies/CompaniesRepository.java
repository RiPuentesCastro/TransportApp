package TransportAppMain.model.companies;

import java.util.List;

public interface CompaniesRepository {
    List<Companies> getAllCompanies();
    Companies getCompanyById(Long idCompany);
    Companies getCompanyByUserId(Long idCompany);
    int createCompany(Companies company);
    int updateCompany(Companies company);
    int deleteCompany(Long idCompany);
}
