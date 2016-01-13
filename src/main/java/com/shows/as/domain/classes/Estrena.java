package com.shows.as.domain.classes;

import javax.persistence.*;

@Entity
@Table(name = "estrena", schema = "public", catalog = "postgres")
@IdClass(EstrenaPK.class)
public class Estrena {
// TODO Cal extends de Representacio

    private Integer recàrrec;
    private String sessio;
    private String nomlocal;

    // -----------------------------------------------------------------------------------------------------------------


    public Estrena(){
    }

    @Basic
    @Column(name = "recàrrec", nullable = true)
    public Integer getRecàrrec() {
        return recàrrec;
    }

    public void setRecàrrec(Integer recàrrec) {
        this.recàrrec = recàrrec;
    }

    @Id
    @Column(name = "sessio", nullable = false, length = 255)
    public String getSessio() {
        return sessio;
    }

    public void setSessio(String sessio) {
        this.sessio = sessio;
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

        Estrena that = (Estrena) o;

        if (recàrrec != null ? !recàrrec.equals(that.recàrrec) : that.recàrrec != null) return false;
        if (sessio != null ? !sessio.equals(that.sessio) : that.sessio != null) return false;
        if (nomlocal != null ? !nomlocal.equals(that.nomlocal) : that.nomlocal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recàrrec != null ? recàrrec.hashCode() : 0;
        result = 31 * result + (sessio != null ? sessio.hashCode() : 0);
        result = 31 * result + (nomlocal != null ? nomlocal.hashCode() : 0);
        return result;
    }

    /** @Override */
    public boolean esEstrena() {
        return true;
    }
}
