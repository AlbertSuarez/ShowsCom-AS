package com.shows.as.domain.factories;

import com.shows.as.service.BankService;
import com.shows.as.service.CurrencyService;

public class ServiceLocator {

    private static ServiceLocator instance = new ServiceLocator();
    private CurrencyService currencyService;
    private BankService bankService;

    public static ServiceLocator getInstance() {
        return instance;
    }

    private ServiceLocator() {
        currencyService = new CurrencyService();
        bankService = new BankService();
    }


    public CurrencyService getCurrencyService() {
        return currencyService;
    }

    public BankService getBankService() {
        return bankService;
    }
}
