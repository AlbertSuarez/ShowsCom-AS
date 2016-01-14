package com.shows.as.domain.classes;

import com.shows.as.domain.enums.Moneda;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

public class Showscom {

    private static Showscom instance;
    private Integer codiBanc;
    private String numeroCompte;
    private Double comissio;
    private Moneda divisa;
    private Moneda[] canvis;

    public static Showscom getInstance() {
        if (instance == null) {
            instance = new Showscom();
        }
        return instance;
    }

    private Showscom() {

    }

    public Double getComissio() {
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

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setCodiBanc(Integer codiBanc) {
        this.codiBanc = codiBanc;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void setComissio(Double comissio) {
        this.comissio = comissio;
    }

    public void setDivisa(Moneda divisa) {
        this.divisa = divisa;
    }

    public void setCanvis(Moneda[] canvis) {
        this.canvis = canvis;
    }
}
