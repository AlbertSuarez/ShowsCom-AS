package com.shows.as.domain.classes;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
/*
Implementació de la classe SeientPK, primary key de la classe Seient.
 */
public class SeientPK implements Serializable {

    private int fila;
    private int columna;
    private String nomlocal;

    @Column(name = "fila", nullable = false, insertable = true, updatable = true)
    @Id
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    @Column(name = "columna", nullable = false, insertable = true, updatable = true)
    @Id
    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Column(name = "nomlocal", nullable = false, insertable = true, updatable = true, length = 255)
    @Id
    public String getNomlocal() {
        return nomlocal;
    }

    public void setNomlocal(String nomlocal) {
        this.nomlocal = nomlocal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeientPK that = (SeientPK) o;

        if (fila != that.fila) return false;
        if (columna != that.columna) return false;
        if (nomlocal != null ? !nomlocal.equals(that.nomlocal) : that.nomlocal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fila;
        result = 31 * result + columna;
        result = 31 * result + (nomlocal != null ? nomlocal.hashCode() : 0);
        return result;
    }
}
