package com.shows.as.domain.classes;

import java.util.Date;

public class Estrena extends Representacio {

    private Integer recarrec;

    public Estrena(Float preu, Date data, Integer nombreSeientsLliures, String sessio, Local local, int recarrec) {
        super(preu, data, nombreSeientsLliures, sessio, local);
        this.recarrec = recarrec;
    }

    @Override
    public Integer getRecarrec() {
        return recarrec;
    }

    @Override
    public boolean esEstrena() {
        return true;
    }

}
