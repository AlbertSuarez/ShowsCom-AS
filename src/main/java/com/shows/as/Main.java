package com.shows.as;

import com.shows.as.domain.adapters.BankServiceAdapter;
import com.shows.as.domain.adapters.IBankServiceAdapter;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        IBankServiceAdapter adapter = new BankServiceAdapter();
        System.out.println(adapter.autoritza("s",1,"n",(float) 4, 3,"df",new Date()).toString());
    }
}
