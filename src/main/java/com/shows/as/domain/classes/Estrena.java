package com.shows.as.domain.classes;

public class Estrena extends Representacio {

    private Integer recarrec;

    @Override
    public Integer getRecarrec() {
        return recarrec;
    }

    @Override
    public boolean esEstrena() {
        return true;
    }

}
