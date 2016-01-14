package com.shows.as;


import com.shows.as.presentation.controllers.ComprarEntradesController;


public class Main {

    public static void main(String[] args) {
        carregaBaseDadesCas1();
        ComprarEntradesController comprarEntradesController = new ComprarEntradesController();
        comprarEntradesController.run();
    }

    private static void carregaBaseDadesCas1() {

    }
}
