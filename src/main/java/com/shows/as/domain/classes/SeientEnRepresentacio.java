package com.shows.as.domain.classes;

import com.shows.as.domain.enums.Estat;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(SeientEnRepresentacioPK.class)
public class SeientEnRepresentacio implements Serializable {

    //@Column(columnDefinition = "enum('lliure','ocupat')") @Enumerated(EnumType.STRING)
    //private Estat estat;
    @Id
    private int idEntrada;
    @Id
    private int fila;
    @Id
    private int columna;
    @Id
    private String nomLocal;
    /*@Id
    @Column(columnDefinition = "enum('mati','tarda','nit')") @Enumerated(EnumType.STRING)
    private Sessio sessio;
*/
    @Transient
    private Seient seient;
    @Transient
    private Representacio representacio;


    public SeientEnRepresentacio(){

    }

    public SeientEnRepresentacio(Seient seient, Representacio representacio, int idEntrada){
        this.seient = seient;
        this.idEntrada = idEntrada;
        this.fila = seient.getFila();
        this.columna = seient.getColumna();
        this.nomLocal = seient.getNomLocal();
        this.seient = seient;

    }

    public Seient getSeient() {
        return seient;
    }

    public void canviarOcupat(Representacio r) {
        // TODO if (this.Representacio == r) then estat = ocupat
    }

   /* public Estat getEstat() {
        return estat;
    }

    public void setEstat(Estat estat) {
        this.estat = estat;
    }*/

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
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

    public String getNomLocal() {
        return nomLocal;
    }

    public void setNomLocal(String nomLocal) {
        this.nomLocal = nomLocal;
    }

   /* public Sessio getSessio() {
        return sessio;
    }

    public void setSessio(Sessio sessio) {
        this.sessio = sessio;
    }*/
}
