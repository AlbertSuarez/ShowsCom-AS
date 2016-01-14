package com.shows.as.domain.tupleTypes;

import com.shows.as.domain.enums.Moneda;

import java.util.LinkedHashSet;
import java.util.Set;

public class TupleTypeSeleccioSeients {

    public Double preu;
    public Set<Moneda> canvis;

    public TupleTypeSeleccioSeients() {
        canvis = new LinkedHashSet<Moneda>();
    }

}
