package TransportAppMain.Controllers.companies;

import TransportAppMain.model.common.Response;
import TransportAppMain.model.companies.Companies;
import TransportAppMain.usecases.CompaniesUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
@AllArgsConstructor
public class CompaniesApiRest {

    private final CompaniesUseCase companiesUseCase;

    @GetMapping("/companies/getAllCompanies")
    public Response getAllCompanies() {
        return companiesUseCase.getAllCompanies();
    }

    @GetMapping("/companies/getCompanyById/{idCompany}")
    public Response getCompanyById(@PathVariable Long idCompany) {
        return companiesUseCase.getCompanyById(idCompany);
    }

    @GetMapping("/companies/getCompanyByUserId/{userId}")
    public Response getCompanyByUserId(@PathVariable Long userId) {
        return companiesUseCase.getCompanyByUserId(userId);
    }

    @PostMapping("/companies/updateCompany")
    public Response updateCompany(@RequestBody Companies company) {
        return companiesUseCase.updateCompany(company);
    }

    @DeleteMapping("/companies/deleteCompany/{idCompany}")
    public Response deleteCompany(@PathVariable Long idCompany) {
        return companiesUseCase.deleteCompany(idCompany);
    }

    @PostMapping("/companies/postCompany")
    public Response createCompany(@RequestBody Companies company) {
        return companiesUseCase.createCompany(company);
    }
}
