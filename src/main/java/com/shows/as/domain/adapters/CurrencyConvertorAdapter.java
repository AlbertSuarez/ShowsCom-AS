package com.shows.as.domain.adapters;

import com.shows.as.domain.enums.Moneda;
import com.shows.as.service.CurrencyService;

public class CurrencyConvertorAdapter implements ICurrencyConvertorAdapter {

    public Float conversionRate(Moneda divisa, Moneda moneda) {
        CurrencyService currencyService = new CurrencyService();
        return currencyService.getConversionRate(divisa, moneda);
    }

}
