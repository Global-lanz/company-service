package lanz.global.companyservice.util.converter;

import lanz.global.companyservice.api.request.CreateCompanyRequest;
import lanz.global.companyservice.model.Company;
import org.springframework.stereotype.Component;

@Component
public class CreateCompanyRequestConverter implements BaseConverter<CreateCompanyRequest, Company> {
    @Override
    public Company convertToDto(CreateCompanyRequest request) {
        Company company = new Company();
        company.setName(request.name());
        company.setCountry(request.country());
        return company;
    }
}

