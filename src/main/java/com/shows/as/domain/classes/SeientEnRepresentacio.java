package com.shows.as.domain.classes;

import com.shows.as.domain.enums.Estat;
import com.shows.as.domain.tupleTypes.TupleTypeFilaColumna;

import javax.persistence.*;

@Entity
@Table(name = "seientenrepresentació", schema = "public", catalog = "postgres")
@IdClass(SeientEnRepresentacioPK.class)
public class SeientEnRepresentacio {

    private String estat;
    private Integer fila;
    private Integer columna;
    private String nomlocal;
    private String sessio;
    private String identrada;

    // -----------------------------------------------------------------------------------------------------------------


    public SeientEnRepresentacio() {

    }

    @Basic
    @Column(name = "estat", nullable = true, length = 255)
    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
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

    @Id
    @Column(name = "sessio", nullable = false, length = 255)
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

        SeientEnRepresentacio that = (SeientEnRepresentacio) o;

        if (estat != null ? !estat.equals(that.estat) : that.estat != null) return false;
        if (fila != null ? !fila.equals(that.fila) : that.fila != null) return false;
        if (columna != null ? !columna.equals(that.columna) : that.columna != null) return false;
        if (nomlocal != null ? !nomlocal.equals(that.nomlocal) : that.nomlocal != null) return false;
        if (sessio != null ? !sessio.equals(that.sessio) : that.sessio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = estat != null ? estat.hashCode() : 0;
        result = 31 * result + (fila != null ? fila.hashCode() : 0);
        result = 31 * result + (columna != null ? columna.hashCode() : 0);
        result = 31 * result + (nomlocal != null ? nomlocal.hashCode() : 0);
        result = 31 * result + (sessio != null ? sessio.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "identrada", nullable = true)
    public String getIdentrada() {
        return identrada;
    }

    public void setIdentrada(String identrada) {
        this.identrada = identrada;
    }

    public TupleTypeFilaColumna getSeient() {
        TupleTypeFilaColumna s = new TupleTypeFilaColumna();
        if (estat.equals(Estat.lliure.toString())) {
            s.fila = this.fila;
            s.columna = this.columna;
        }
        return s;
    }

    public void canviarOcupat(Representacio r) {
        if (r.getNomlocal().equals(this.nomlocal) && r.getSessio().equals(this.sessio)) {
            this.estat = Estat.ocupat.toString();
        }
    }

}
