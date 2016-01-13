package com.shows.as.domain.classes;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class EstrenaPK implements Serializable {

    private String sessio;
    private String nomlocal;

    // -----------------------------------------------------------------------------------------------------------------


    @Column(name = "sessio", nullable = false, length = 255)
    @Id
    public String getSessio() {
        return sessio;
    }

    public void setSessio(String sessio) {
        this.sessio = sessio;
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

        EstrenaPK that = (EstrenaPK) o;

        if (sessio != null ? !sessio.equals(that.sessio) : that.sessio != null) return false;
        if (nomlocal != null ? !nomlocal.equals(that.nomlocal) : that.nomlocal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sessio != null ? sessio.hashCode() : 0;
        result = 31 * result + (nomlocal != null ? nomlocal.hashCode() : 0);
        return result;
    }

}
