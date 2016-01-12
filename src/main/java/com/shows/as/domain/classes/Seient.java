package com.shows.as.domain.classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

@Entity
@IdClass(SeientPK.class)
public class Seient {
    @Id
    private Integer fila;
    @Id
    private Integer columna;
    @Id
    private String nomLocal;
    @Transient
    private Local local;

    public Seient(){

    }

    public Seient(int fila, int columna, Local local){
        this.fila = fila;
        this.columna = columna;
        this.local = local;
        this.nomLocal = local.getNom();
    }

    public Integer getFila() {
        return fila;
    }

    public Integer getColumna() {
        return columna;
    }

    public String getNomLocal() {
        return nomLocal;
    }

    public void setNomLocal(String nomLocal) {
        this.nomLocal = nomLocal;
    }

    public void canviarEstat(Representacio r) {
        // TODO this.SeientEnRepresentacio.canviarOcupat(r)
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
