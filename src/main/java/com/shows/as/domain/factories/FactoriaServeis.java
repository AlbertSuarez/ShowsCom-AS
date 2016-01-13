package com.shows.as.domain.factories;

import com.shows.as.domain.adapters.BankServiceAdapter;
import com.shows.as.domain.adapters.CurrencyConvertorAdapter;
import com.shows.as.domain.adapters.IBankServiceAdapter;
import com.shows.as.domain.adapters.ICurrencyConvertorAdapter;

public class FactoriaServeis {

    private static FactoriaServeis instance = new FactoriaServeis();
    private ICurrencyConvertorAdapter iCurrencyConvertorAdapter;
    private IBankServiceAdapter iBankServiceAdapter;

    public static FactoriaServeis getInstance() {
        return instance;
    }

    private FactoriaServeis() {
        iCurrencyConvertorAdapter = new CurrencyConvertorAdapter();
        iBankServiceAdapter = new BankServiceAdapter();
    }

    public ICurrencyConvertorAdapter getiCurrencyConvertorAdapter() {
        return iCurrencyConvertorAdapter;
    }

    public IBankServiceAdapter getiBankServiceAdapter() {
        return iBankServiceAdapter;
    }

}
