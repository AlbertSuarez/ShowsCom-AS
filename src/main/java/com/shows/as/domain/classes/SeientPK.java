package com.shows.as.domain.classes;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SeientPK implements Serializable {
    
    private Integer fila;
    private Integer columna;
    private String nomlocal;

    // -----------------------------------------------------------------------------------------------------------------


    @Column(name = "fila", nullable = false)
    @Id
    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    @Column(name = "columna", nullable = false)
    @Id
    public Integer getColumna() {
        return columna;
    }

    public void setColumna(Integer columna) {
        this.columna = columna;
    }

    @Column(name = "nomlocal", nullable = false, length = 255)
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

        if (fila != null ? !fila.equals(that.fila) : that.fila != null) return false;
        if (columna != null ? !columna.equals(that.columna) : that.columna != null) return false;
        if (nomlocal != null ? !nomlocal.equals(that.nomlocal) : that.nomlocal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fila != null ? fila.hashCode() : 0;
        result = 31 * result + (columna != null ? columna.hashCode() : 0);
        result = 31 * result + (nomlocal != null ? nomlocal.hashCode() : 0);
        return result;
    }

}
