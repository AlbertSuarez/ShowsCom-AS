package com.shows.as.domain.adapters;

import com.shows.as.domain.enums.Moneda;
import com.shows.as.domain.factories.ServiceLocator;
import com.shows.as.service.CurrencyService;

public class CurrencyConvertorAdapter implements ICurrencyConvertorAdapter {

    public Double conversionRate(Moneda divisa, Moneda moneda) {
        ServiceLocator s = ServiceLocator.getInstance();
        CurrencyService currencyService = s.getCurrencyService();
        return currencyService.getConversionRate(divisa, moneda);
    }

}
