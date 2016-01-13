package com.shows.as.domain.classes;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SeientEnRepresentacioPK implements Serializable {

    private Integer fila;
    private Integer columna;
    private String nomlocal;
    private String sessio;

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

    @Column(name = "sessio", nullable = false, length = 255)
    @Id
    public String getSessio() {
        return sessio;
    }

    public void setSessio(String sessio) {
        this.sessio = sessio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeientEnRepresentacioPK that = (SeientEnRepresentacioPK) o;

        if (fila != null ? !fila.equals(that.fila) : that.fila != null) return false;
        if (columna != null ? !columna.equals(that.columna) : that.columna != null) return false;
        if (nomlocal != null ? !nomlocal.equals(that.nomlocal) : that.nomlocal != null) return false;
        if (sessio != null ? !sessio.equals(that.sessio) : that.sessio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fila != null ? fila.hashCode() : 0;
        result = 31 * result + (columna != null ? columna.hashCode() : 0);
        result = 31 * result + (nomlocal != null ? nomlocal.hashCode() : 0);
        result = 31 * result + (sessio != null ? sessio.hashCode() : 0);
        return result;
    }

}
