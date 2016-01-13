package com.shows.as.domain.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sessio", schema = "public", catalog = "postgres")
public class Sessio {

    /** TipusSessio */
    private String sessio;

    // -----------------------------------------------------------------------------------------------------------------

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

        Sessio that = (Sessio) o;

        if (sessio != null ? !sessio.equals(that.sessio) : that.sessio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return sessio != null ? sessio.hashCode() : 0;
    }
}
