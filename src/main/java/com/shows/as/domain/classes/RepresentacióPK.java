package com.shows.as.domain.classes;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/*
Implementació de la classe RepresentacioPK, primary key de la classe Representacio.
 */
//Entitat de Hibernate que representa la primary key de la classe Representació
public class RepresentacióPK implements Serializable {
    private String sessió;
    private String nomlocal;

    public RepresentacióPK() {

    }

    public RepresentacióPK(String nomlocal, String sessió) {
        this.sessió = sessió;
        this.nomlocal = nomlocal;
    }

    @Column(name = "sessió", nullable = false, insertable = true, updatable = true, length = 255)
    @Id
    public String getSessió() {
        return sessió;
    }

    public void setSessió(String sessió) {
        this.sessió = sessió;
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

        RepresentacióPK that = (RepresentacióPK) o;

        if (sessió != null ? !sessió.equals(that.sessió) : that.sessió != null) return false;
        if (nomlocal != null ? !nomlocal.equals(that.nomlocal) : that.nomlocal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sessió != null ? sessió.hashCode() : 0;
        result = 31 * result + (nomlocal != null ? nomlocal.hashCode() : 0);
        return result;
    }
}
