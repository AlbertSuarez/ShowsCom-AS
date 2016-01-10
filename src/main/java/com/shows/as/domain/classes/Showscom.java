package com.shows.as.domain.classes;

import com.shows.as.domain.enums.Moneda;

public class Showscom {

    private static Showscom instance = new Showscom();
    private Integer codiBanc;
    private String numeroCompte;
    private Float comissio;
    private Moneda divisa;
    private Moneda[] canvis  = new Moneda[2];

    public static Showscom getInstance() {
        return instance;
    }

    private Showscom() {

    }

    public Float getComissio() {
        return comissio;
    }

    public Moneda[] getCanvis() {
        return canvis;
    }

    public Integer getCodiBanc() {
        return codiBanc;
    }

    public Moneda getDivisa() {
        return divisa;
    }

}
