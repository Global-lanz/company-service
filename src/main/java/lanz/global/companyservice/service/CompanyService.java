package lanz.global.companyservice.service;

import lanz.global.companyservice.api.request.CreateCompanyRequest;
import lanz.global.companyservice.exception.BadRequestException;
import lanz.global.companyservice.model.Company;
import lanz.global.companyservice.repository.CompanyRepository;
import lanz.global.companyservice.util.converter.ServiceConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final ServiceConverter serviceConverter;


    public Company createCompany(CreateCompanyRequest request) throws BadRequestException {
//        Currency currency = findCurrencyById(request.currencyId());

        Company company = serviceConverter.convert(request);
        company.setCurrencyId(null);
        return companyRepository.save(company);
    }

//    public Currency findCurrencyById(UUID currencyId) throws BadRequestException {
//        if (currencyId == null) {
//            return null;
//        }
//
//        return currencyRepository.findById(currencyId).orElseThrow(() -> new BadRequestException("exception.not-found.title", "exception.not-found.message", "Currency"));
//    }

    public Company findCompanyById(UUID companyId) {
        if (companyId == null) {
            return null;
        }

        return companyRepository.findById(companyId).orElseThrow(() -> new BadRequestException("exception.not-found.title", "exception.not-found.message", "Company"));
    }
}
