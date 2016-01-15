package com.shows.as.domain.tupleTypes;

import com.shows.as.domain.enums.Moneda;

import java.util.LinkedHashSet;
import java.util.Set;

//Entitat que representa una tupla
public class TupleTypeSeleccioSeients {

    public Double preu;
    public Set<Moneda> canvis;

    public TupleTypeSeleccioSeients() {
        canvis = new LinkedHashSet<Moneda>();
    }

}
