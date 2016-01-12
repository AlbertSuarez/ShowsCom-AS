package com.shows.as.service;

import com.shows.as.wsdl.currency.ConversionRate;
import com.shows.as.wsdl.currency.ConversionRateResponse;
import com.shows.as.wsdl.currency.Currency;
import com.shows.as.wsdl.currency.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

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
