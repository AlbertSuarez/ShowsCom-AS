package com.shows.as.domain.classes;

import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class Espectacle {

    private String titol;
    private Integer participants;
    private Set<Representacio> representacions;

    public String getTitol() {
        return titol;
    }

    public Set<TupleTypeRepresentacio> obteRepresentacions(Date data){
        Set<TupleTypeRepresentacio> result = new LinkedHashSet<TupleTypeRepresentacio>();

        for (Representacio  r: representacions){
            if (data == r.getDate()) result.add(r.getInfo());
        }
        return result;
    }
}
