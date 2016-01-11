package com.shows.as.domain.factories;

public class FactoriaServeis {

    private static FactoriaServeis instance = new FactoriaServeis();

    public static FactoriaServeis getInstance() {
        return instance;
    }

    private FactoriaServeis() {

    }

    //TODO getICurrencyConvertorAdapter, getIBankServiceAdapter

}
