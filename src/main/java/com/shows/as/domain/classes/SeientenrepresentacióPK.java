package com.shows.as.domain.classes;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/*
Implementació de la classe SeientenrepresentacioPK, primary key de la classe SeientEnRepresentacio.
 */
public class SeientenrepresentacióPK implements Serializable {

    private int fila;

    @Column(name = "fila", nullable = false, insertable = true, updatable = true)
    @Id
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    private int columna;

    @Column(name = "columna", nullable = false, insertable = true, updatable = true)
    @Id
    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    private String nomlocal;

    @Column(name = "nomlocal", nullable = false, insertable = true, updatable = true, length = 255)
    @Id
    public String getNomlocal() {
        return nomlocal;
    }

    public void setNomlocal(String nomlocal) {
        this.nomlocal = nomlocal;
    }

    private String sessió;

    @Column(name = "sessió", nullable = false, insertable = true, updatable = true, length = 255)
    @Id
    public String getSessió() {
        return sessió;
    }

    public void setSessió(String sessió) {
        this.sessió = sessió;
    }


    public SeientenrepresentacióPK() {

    }

    public SeientenrepresentacióPK(int fila, int columna, String nomlocal, String sessió) {
        this.fila = fila;
        this.columna = columna;
        this.nomlocal = nomlocal;
        this.sessió = sessió;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeientenrepresentacióPK that = (SeientenrepresentacióPK) o;

        if (fila != that.fila) return false;
        if (columna != that.columna) return false;
        if (nomlocal != null ? !nomlocal.equals(that.nomlocal) : that.nomlocal != null) return false;
        if (sessió != null ? !sessió.equals(that.sessió) : that.sessió != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fila;
        result = 31 * result + columna;
        result = 31 * result + (nomlocal != null ? nomlocal.hashCode() : 0);
        result = 31 * result + (sessió != null ? sessió.hashCode() : 0);
        return result;
    }
}
