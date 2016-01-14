package com.shows.as.domain.factories;

import com.shows.as.service.BankService;
import com.shows.as.service.CurrencyService;

public class ServiceLocator {

    private static ServiceLocator instance;
    private CurrencyService currencyService;
    private BankService bankService;

    /** Implementació del patró Singleton. **/
    public static ServiceLocator getInstance() {
        if (instance == null) {
            instance = new ServiceLocator();
        }
        return instance;
    }

    private ServiceLocator() {

    }


    public CurrencyService getCurrencyService() {
        if (currencyService == null) {
            currencyService = new CurrencyService();
        }
        return currencyService;
    }

    public BankService getBankService() {
        if (bankService == null) {
            bankService = new BankService();
        }
        return bankService;
    }
}
