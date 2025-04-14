package lanz.global.companyservice.util.converter;

import lanz.global.companyservice.api.response.CompanyResponse;
import lanz.global.companyservice.model.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyResponseConverter implements BaseConverter<Company, CompanyResponse> {


    @Override
    public CompanyResponse convertToDto(Company entity) {
        return new CompanyResponse(
                entity.getCompanyId(),
                entity.getName(),
                entity.getCountry(),
                entity.getCurrencyId()
        );
    }
}

