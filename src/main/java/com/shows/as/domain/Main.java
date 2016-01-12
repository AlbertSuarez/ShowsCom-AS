package com.shows.as.domain;

import com.shows.as.domain.adapters.CurrencyConvertorAdapter;
import com.shows.as.domain.enums.Moneda;

public class Main {

    public static void main(String[] args) {
        CurrencyConvertorAdapter converter = new CurrencyConvertorAdapter();
        System.out.println(converter.conversionRate(Moneda.EUR, Moneda.GBP));
    }
}
