package lanz.global.companyservice.util.converter;

import lanz.global.companyservice.api.response.CurrencyResponse;
import lanz.global.companyservice.model.Currency;
import org.springframework.stereotype.Component;

@Component
public class CurrencyResponseConverter implements BaseConverter<Currency, CurrencyResponse>{
    @Override
    public CurrencyResponse convertToDto(Currency entity) {

        return new CurrencyResponse(
                entity.getCurrencyId(),
                entity.getName(),
                entity.getCode(),
                entity.getSymbol()
        );
    }
}
