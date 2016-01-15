package com.shows.as.domain.factories;

import com.shows.as.domain.adapters.BankServiceAdapter;
import com.shows.as.domain.adapters.CurrencyConvertorAdapter;
import com.shows.as.domain.adapters.IBankServiceAdapter;
import com.shows.as.domain.adapters.ICurrencyConvertorAdapter;
/*
Implementació de la classe FactoriaServeis
 */
//Entitat que representa una factoria de adaptadors de serveis
public class FactoriaServeis {

    private static FactoriaServeis instance;
    private ICurrencyConvertorAdapter iCurrencyConvertorAdapter;
    private IBankServiceAdapter iBankServiceAdapter;

    public static FactoriaServeis getInstance() {
        if (instance == null) {
            instance = new FactoriaServeis();
        }
        return instance;
    }

    private FactoriaServeis() {

    }

    public ICurrencyConvertorAdapter getiCurrencyConvertorAdapter() {
        if (iCurrencyConvertorAdapter == null) {
            iCurrencyConvertorAdapter = new CurrencyConvertorAdapter();
        }
        return iCurrencyConvertorAdapter;
    }

    public IBankServiceAdapter getiBankServiceAdapter() {
        if (iBankServiceAdapter == null) {
            iBankServiceAdapter = new BankServiceAdapter();
        }
        return iBankServiceAdapter;
    }

}
