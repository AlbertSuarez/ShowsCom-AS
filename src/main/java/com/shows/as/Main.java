package com.shows.as;

import com.shows.as.domain.adapters.BankServiceAdapter;
import com.shows.as.domain.adapters.IBankServiceAdapter;
import com.shows.as.presentation.controllers.ComprarEntradesController;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ComprarEntradesController comprarEntradesController = new ComprarEntradesController();
        comprarEntradesController.run();
    }
}
