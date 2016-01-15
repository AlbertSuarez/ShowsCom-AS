package com.shows.as.domain.classes;

import com.shows.as.domain.enums.Estat;
import com.shows.as.domain.tupleTypes.TupleTypeFilaColumna;

import javax.persistence.*;
/*
Implementació de la classe SeientEnRepresentacio del paquet domain.classes
 */
//Entitat que representa un seient durant una representació
@Entity
@Table(name = "seientenrepresentació", schema = "public", catalog = "postgres")
@IdClass(SeientenrepresentacióPK.class)
public class Seientenrepresentació {

    public static final String TAULA = "Seientenrepresentació";

    private String estat;
    private int fila;
    private int columna;
    private String nomlocal;
    private String sessió;
    private String identrada;
    private Entrada entradaByIdentrada;
    private Representació representació;
    private Seient seient;

    public Seientenrepresentació() {

    }

    public Seientenrepresentació(String estat, int fila, int columna, String nomlocal, String sessió, String identrada) {
        this.estat = estat;
        this.fila = fila;
        this.columna = columna;
        this.nomlocal = nomlocal;
        this.sessió = sessió;
        this.identrada = identrada;
    }

    @Basic
    @Column(name = "estat", nullable = true, insertable = true, updatable = true, length = 255)
    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    @Id
    @Column(name = "fila", nullable = false, insertable = true, updatable = true)
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    @Id
    @Column(name = "columna", nullable = false, insertable = true, updatable = true)
    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Id
    @Column(name = "nomlocal", nullable = false, insertable = true, updatable = true, length = 255)
    public String getNomlocal() {
        return nomlocal;
    }

    public void setNomlocal(String nomlocal) {
        this.nomlocal = nomlocal;
    }

    @Id
    @Column(name = "sessió", nullable = false, insertable = true, updatable = true, length = 255)
    public String getSessió() {
        return sessió;
    }

    public void setSessió(String sessió) {
        this.sessió = sessió;
    }

    @Basic
    @Column(name = "identrada", nullable = true, insertable = true, updatable = true, length = 255)
    public String getIdentrada() {
        return identrada;
    }

    public void setIdentrada(String identrada) {
        this.identrada = identrada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seientenrepresentació that = (Seientenrepresentació) o;

        if (fila != that.fila) return false;
        if (columna != that.columna) return false;
        if (estat != null ? !estat.equals(that.estat) : that.estat != null) return false;
        if (nomlocal != null ? !nomlocal.equals(that.nomlocal) : that.nomlocal != null) return false;
        if (sessió != null ? !sessió.equals(that.sessió) : that.sessió != null) return false;
        if (identrada != null ? !identrada.equals(that.identrada) : that.identrada != null) return false;

        return true;
    }

    /*@Override
    public int hashCode() {
        int result = estat != null ? estat.hashCode() : 0;
        result = 31 * result + fila;
        result = 31 * result + columna;
        result = 31 * result + (nomlocal != null ? nomlocal.hashCode() : 0);
        result = 31 * result + (sessió != null ? sessió.hashCode() : 0);
        result = 31 * result + (identrada != null ? identrada.hashCode() : 0);
        return result;
    }*/

    @Override
    public int hashCode() {
        return hashCode(this.nomlocal, this.sessió, this.fila, this.columna);
    }

    public static int hashCode(String nomlocal, String sessió, Integer fila, Integer columna){
        String sSurrogate =   String.format("%60s", nomlocal)           // 60 chars
                            + String.format("%60s", sessió)             // 60 chars
                            + String.format("%60s", fila)               // 60 chars
                            + String.format("%60s", columna);           // 60 chars

        return sSurrogate.hashCode();
    }

    @ManyToOne
    @JoinColumn(name = "identrada", referencedColumnName = "identificador",insertable = false, updatable = false)
    public Entrada getEntradaByIdentrada() {
        return entradaByIdentrada;
    }

    public void setEntradaByIdentrada(Entrada entradaByIdentrada) {
        this.entradaByIdentrada = entradaByIdentrada;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "sessió", referencedColumnName = "sessió", nullable = false,insertable = false, updatable = false), @JoinColumn(name = "nomlocal", referencedColumnName = "nomlocal", nullable = false,insertable = false, updatable = false)})
    public Representació getRepresentació() {
        return representació;
    }

    public void setRepresentació(Representació representació) {
        this.representació = representació;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "nomlocal", referencedColumnName = "nomlocal", nullable = false,insertable = false, updatable = false), @JoinColumn(name = "fila", referencedColumnName = "fila", nullable = false,insertable = false, updatable = false), @JoinColumn(name = "columna", referencedColumnName = "columna", nullable = false,insertable = false, updatable = false)})
    public Seient getSeient() {
        return seient;
    }

    public void setSeient(Seient seient) {
        this.seient = seient;
    }

    public TupleTypeFilaColumna obteSeientFilaColumna() {
        TupleTypeFilaColumna s = new TupleTypeFilaColumna();
        if (estat.equals(Estat.lliure.toString())) {
            s.fila = this.fila;
            s.columna = this.columna;
        }
        return s;
    }

    public void canviarOcupat(Representació r) {
        if (r.getNomlocal().equals(this.nomlocal) && r.getSessió().equals(this.sessió)) {
            this.estat = Estat.ocupat.toString();
        }
    }

}
