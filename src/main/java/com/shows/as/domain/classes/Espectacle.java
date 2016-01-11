package com.shows.as.domain.classes;

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

    // TODO obteRepresentacions --> result ha de ser un set de tuples --> r.getInfo();
    public Set<Representacio> obteRepresentacions(Date data){
        Set<Representacio> result = new LinkedHashSet<Representacio>();
        for(Representacio  r: representacions){
            if(data == r.getDate())result.add(r);
        }
        return result;
    }
}
