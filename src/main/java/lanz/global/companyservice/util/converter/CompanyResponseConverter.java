package lanz.global.companyservice.util.converter;

import lanz.global.companyservice.api.response.CompanyResponse;
import lanz.global.companyservice.model.Company;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CompanyResponseConverter implements Converter<Company, CompanyResponse> {

    @Override
    public CompanyResponse convert(Company source) {
        return new CompanyResponse(
                source.getCompanyId(),
                source.getName(),
                source.getCountry(),
                source.getCurrencyId()
        );
    }
}

