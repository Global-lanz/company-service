package lanz.global.companyservice.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import lanz.global.companyservice.api.config.Rules;
import lanz.global.companyservice.api.request.CreateCompanyRequest;
import lanz.global.companyservice.api.response.CompanyResponse;
import lanz.global.companyservice.api.response.CurrencyResponse;
import lanz.global.companyservice.model.Company;
import lanz.global.companyservice.model.Currency;
import lanz.global.companyservice.service.CompanyService;
import lanz.global.companyservice.util.converter.ServiceConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CompanyApi {

    private final CompanyService companyService;
    private final ServiceConverter serviceConverter;

    @PermitAll
    @PostMapping
    @ApiResponse(responseCode = "200", description = "Company has been created")
    @ApiResponse(responseCode = "400", description = "Bad request")
    public ResponseEntity<CompanyResponse> create(@Valid @RequestBody CreateCompanyRequest request) throws Exception {
        Company createdCompany = companyService.createCompany(request);

        return ResponseEntity.ok(serviceConverter.convert(createdCompany));
    }

    @RolesAllowed(Rules.USER)
    @GetMapping("/{companyId}")
    @Operation(summary = "Find company by ID", description = "The endpoint for retrieving the company")
    @ApiResponse(responseCode = "200")
    @ApiResponse(responseCode = "404", description = "Currency not found")
    public ResponseEntity<CompanyResponse> findCompanyById(@PathVariable("companyId") UUID companyId) {
        Company company = companyService.findCompanyById(companyId);

        return ResponseEntity.ok(serviceConverter.convert(company));
    }

    @PermitAll
    @GetMapping("/currency")
    @Operation(summary = "Find currencies", description = "The endpoint for retrieving the list of currencies")
    @ApiResponse(responseCode = "200")
    public ResponseEntity<List<CurrencyResponse>> findCurrencies() {
        List<Currency> currencies = companyService.findAllCurrencies();

        return ResponseEntity.ok(serviceConverter.convertList(currencies));
    }

    @PermitAll
    @GetMapping("/currency/{currencyId}")
    @Operation(summary = "Find currency by ID", description = "The endpoint for retrieving the currency")
    @ApiResponse(responseCode = "200")
    @ApiResponse(responseCode = "404", description = "Currency not found")
    public ResponseEntity<CurrencyResponse> findCurrencyById(@PathVariable("currencyId") UUID currencyId) {
        Currency currency = companyService.findCurrencyById(currencyId);

        return ResponseEntity.ok(serviceConverter.convert(currency));
    }


}
