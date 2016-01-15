package com.shows.as.domain.classes;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

/*
Implementació de la classe Seient del paquet domain.classes
 */
@Entity
@Table(name = "seient", schema = "public", catalog = "postgres")
@IdClass(SeientPK.class)
public class Seient {

    private int fila;
    private int columna;
    private String nomlocal;
    private Local localByNomlocal;
    private Set<Seientenrepresentació> seientenrepresentaciós;


    public Seient() {

    }

    public Seient(int fila, int columna, String nomlocal) {
        this.fila = fila;
        this.columna = columna;
        this.nomlocal = nomlocal;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seient that = (Seient) o;

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

    @ManyToOne
    @JoinColumn(name = "nomlocal", referencedColumnName = "nom", nullable = false,insertable = false, updatable = false)
    public Local getLocalByNomlocal() {
        return localByNomlocal;
    }

    public void setLocalByNomlocal(Local localByNomlocal) {
        this.localByNomlocal = localByNomlocal;
    }

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumns({@JoinColumn(name = "nomlocal", referencedColumnName = "nomlocal"), @JoinColumn(name = "fila", referencedColumnName = "fila"), @JoinColumn(name = "columna", referencedColumnName = "columna")})
    public Set<Seientenrepresentació> getSeientenrepresentaciós() {
        return seientenrepresentaciós;
    }

    public void setSeientenrepresentaciós(Set<Seientenrepresentació> seientenrepresentaciós) {
        this.seientenrepresentaciós = seientenrepresentaciós;
    }

    public void canviarEstat(Representació r) {
        for (Seientenrepresentació sr : getSeientenrepresentaciós()) {
            sr.canviarOcupat(r);
        }
    }

}
