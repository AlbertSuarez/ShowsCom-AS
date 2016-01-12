package com.shows.as.domain;

//import com.shows.as.domain.adapters.CurrencyConvertorAdapter;
//import com.shows.as.domain.enums.Moneda;
import com.shows.as.domain.adapters.BankServiceAdapter;
import com.shows.as.domain.adapters.IBankServiceAdapter;
import com.shows.as.service.BankService;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //CurrencyConvertorAdapter converter = new CurrencyConvertorAdapter();
        //System.out.println(converter.conversionRate(Moneda.EUR, Moneda.GBP));
        IBankServiceAdapter adapter = new BankServiceAdapter();
        System.out.println(adapter.autoritza("s",1,"n",(float) 4, 3,"df",new Date()).toString());
    }
}
