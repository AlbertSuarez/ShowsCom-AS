package com.shows.as.domain.classes;

import java.io.Serializable;

/**
 * Created by Usuari on 12/01/2016.
 */
public class SeientPK implements Serializable{

    private int fila;
    private int columna;
    private String nomLocal;

    public SeientPK(){

    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getnomLocal() {
        return nomLocal;
    }

    public void setnomLocal(String nomLocal){
        this.nomLocal = nomLocal;
    }
}
