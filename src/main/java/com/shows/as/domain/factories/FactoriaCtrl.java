package com.shows.as.domain.factories;

public class FactoriaCtrl {

    private static FactoriaCtrl instance = new FactoriaCtrl();

    public static FactoriaCtrl getInstance() {
        return instance;
    }

    private FactoriaCtrl() {

    }

    // TODO getCtrlRepresentacio, getCtrlEspectacle, getCtrlSeientEnRepresentacio
}
