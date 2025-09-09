package lanz.global.companyservice.util.converter;

import lanz.global.companyservice.api.request.CreateCompanyRequest;
import lanz.global.companyservice.model.Company;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CreateCompanyRequestConverter implements Converter<CreateCompanyRequest, Company> {

    @Override
    public Company convert(CreateCompanyRequest source) {
        Company company = new Company();
        company.setName(source.name());
        company.setCountry(source.country());
        return company;
    }
}

