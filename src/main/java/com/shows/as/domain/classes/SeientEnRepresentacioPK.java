package com.shows.as.domain.classes;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Usuari on 12/01/2016.
 */
public class SeientEnRepresentacioPK implements Serializable {

    private int idEntrada;
    private int fila;
    private int columna;
    private String nomLocal;
   //private Sessio sessio;



    /*public Sessio getSessio() {
        return sessio;
    }

    public void setSessio(Sessio sessio) {
        this.sessio = sessio;
    }*/

    public String getNomLocal() {
        return nomLocal;
    }

    public void setNomLocal(String nomLocal) {
        this.nomLocal = nomLocal;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

/*    public Representacio getRepresentacio() {
        return representacio;
    }

    public void setRepresentacio(Representacio representacio) {
        this.representacio = representacio;
    }
*/
}
