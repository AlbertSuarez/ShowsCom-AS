package com.shows.as.domain.classes;

import java.awt.geom.RectangularShape;
import java.util.Date;
import java.util.Set;

public class Entrada {

    private String identificador;
    private String dniClient;
    private Integer nombreEspectadors;
    private Date data;
    private Float preu;
    private Representacio representacio;
    private Set<SeientEnRepresentacio> seients;

    public Entrada(String identificador, String dniClient, Integer nombreEspectadors, Date data, Float preu) {
        this.identificador = identificador;
        this.dniClient = dniClient;
        this.nombreEspectadors = nombreEspectadors;
        this.data = data;
        this.preu = preu;
    }

    public void associa(Representacio r, Set<SeientEnRepresentacio> seientRep) {
        this.representacio = r;
        r.associaEntrada(this);
        this.seients = seientRep;
    }

}
