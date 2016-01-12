package com.shows.as.domain.adapters;

import com.shows.as.domain.enums.Moneda;
import com.shows.as.service.CurrencyService;
import com.shows.as.wsdl.currency.Currency;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrencyConvertorAdapter implements ICurrencyConvertorAdapter {

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    public Float conversionRate(Moneda divisa, Moneda moneda) {
        CurrencyService currencyService = context.getBean(CurrencyService.class);

        Currency fromCurrency = Currency.valueOf(divisa.toString());
        Currency toCurrency = Currency.valueOf(moneda.toString());

        return Float.valueOf(Double.toString(currencyService.getConversionRate(fromCurrency, toCurrency)));
    }

}
