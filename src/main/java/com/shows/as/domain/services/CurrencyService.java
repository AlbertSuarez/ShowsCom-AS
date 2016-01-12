package com.shows.as.domain.services;

import myproject.wsdl.currency.ConversionRate;
import myproject.wsdl.currency.ConversionRateResponse;
import myproject.wsdl.currency.Currency;
import myproject.wsdl.currency.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

/** http://myshittycode.com/2013/10/01/using-spring-web-services-and-jaxb-to-invoke-web-service-based-on-wsdl/ */

@Service
public class CurrencyService {
    @Autowired
    private WebServiceTemplate webServiceTemplate;

    public Double getConversionRate(Currency fromCurrency, Currency toCurrency) {
        ConversionRate conversionRate = new ObjectFactory().createConversionRate();
        conversionRate.setFromCurrency(fromCurrency);
        conversionRate.setToCurrency(toCurrency);

        ConversionRateResponse response = (ConversionRateResponse) webServiceTemplate.marshalSendAndReceive(
                conversionRate);

        return response.getConversionRateResult();
    }
}
