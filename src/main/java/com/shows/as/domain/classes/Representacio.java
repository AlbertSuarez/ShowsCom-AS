package com.shows.as.domain.classes;

import java.util.Date;
import java.util.Set;

public class Representacio {

    private Float preu;
    private Date data;
    private Integer nombreSeientsLliures;
    private Sessio sessio;
    private Local local;
    private Set<SeientEnRepresentacio> seients;


    public Date getDate() {
        return data;
    }

    // TODO getInfo

    public Float getPreu() {
        return preu;
    }

    public Integer getRecarrec() {
        return 0;
    }

    public boolean esEstrena() {
        return false;
    }

    // TODO getSeients

    // TODO associaEntrada

}
