package com.shows.as.domain.classes;

import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Espectacle {

    @Id
    private String titol;
    private Integer participants;
    @Transient
    private Set<Representacio> representacions;

    public Espectacle(){

    }

    public Espectacle(String titol, int participants){
        this.titol = titol;
        this.participants = participants;
    }

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

    public Integer getParticipants() {
        return participants;
    }

    public void setParticipants(Integer participants) {
        this.participants = participants;
    }

    public void setRepresentacions(Set<Representacio> representacions) {
        this.representacions = representacions;
    }

    public Set<Representacio> getRepresentacions(){
        return this.representacions;
    }
}
