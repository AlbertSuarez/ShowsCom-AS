package com.shows.as.service;

import com.shows.as.domain.enums.Moneda;

public class CurrencyService {

    private static final Float eurTOusd = (float) 1.08;
    private static final Float usdTOeur = (float) 0.92;
    private static final Float eurTOgbp = (float) 0.75;
    private static final Float gbpTOeur = (float) 1.33;
    private static final Float usdTOgbp = (float) 0.69;
    private static final Float gbpTOusd = (float) 1.44;

    public Float getConversionRate(Moneda fromCurrency, Moneda toCurrency) {
        if (fromCurrency == Moneda.EUR && toCurrency == Moneda.USD) return eurTOusd;
        if (toCurrency == Moneda.EUR && fromCurrency == Moneda.USD) return usdTOeur;
        if (fromCurrency == Moneda.EUR && toCurrency == Moneda.GBP) return eurTOgbp;
        if (toCurrency == Moneda.EUR && fromCurrency == Moneda.GBP) return gbpTOeur;
        if (fromCurrency == Moneda.USD && toCurrency == Moneda.GBP) return usdTOgbp;
        if (toCurrency == Moneda.USD && fromCurrency == Moneda.GBP) return gbpTOusd;
        return (float) 1.0;
    }
}
