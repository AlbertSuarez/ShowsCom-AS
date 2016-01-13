package com.shows.as.domain.classes;

import javax.persistence.*;

@Entity
@Table(name = "seient", schema = "public", catalog = "postgres")
@IdClass(SeientPK.class)
public class Seient {

    private Integer fila;
    private Integer columna;
    private String nomlocal;

    // -----------------------------------------------------------------------------------------------------------------


    public Seient(){

    }

    @Id
    @Column(name = "fila", nullable = false)
    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    @Id
    @Column(name = "columna", nullable = false)
    public Integer getColumna() {
        return columna;
    }

    public void setColumna(Integer columna) {
        this.columna = columna;
    }

    @Id
    @Column(name = "nomlocal", nullable = false, length = 255)
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

        Seient that = (Seient) o;

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

    public void canviarEstat(Representacio r) {
        // TODO this.SeientEnRepresentacio.canviaOcupat(r)
    }
}
