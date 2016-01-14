package com.shows.as.domain.classes;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class EstrenaPK implements Serializable {

    private String sessió;
    private String nomlocal;

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

        EstrenaPK that = (EstrenaPK) o;

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
