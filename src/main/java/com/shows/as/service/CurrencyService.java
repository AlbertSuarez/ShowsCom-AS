package com.shows.as.service;

import com.shows.as.domain.enums.Moneda;

//Entitat que simula el comportament d'un servei web de canvi de divisa
public class CurrencyService {

    private static final Double eurTOusd = 1.08;
    private static final Double usdTOeur = 0.92;
    private static final Double eurTOgbp = 0.75;
    private static final Double gbpTOeur = 1.33;
    private static final Double usdTOgbp = 0.69;
    private static final Double gbpTOusd = 1.44;

    public Double getConversionRate(Moneda fromCurrency, Moneda toCurrency) {
        if (fromCurrency == Moneda.EUR && toCurrency == Moneda.USD) return eurTOusd;
        if (toCurrency == Moneda.EUR && fromCurrency == Moneda.USD) return usdTOeur;
        if (fromCurrency == Moneda.EUR && toCurrency == Moneda.GBP) return eurTOgbp;
        if (toCurrency == Moneda.EUR && fromCurrency == Moneda.GBP) return gbpTOeur;
        if (fromCurrency == Moneda.USD && toCurrency == Moneda.GBP) return usdTOgbp;
        if (toCurrency == Moneda.USD && fromCurrency == Moneda.GBP) return gbpTOusd;
        return 1.0;
    }
}
