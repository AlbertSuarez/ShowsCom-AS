package com.shows.as.domain.classes;

import javax.persistence.*;
import java.sql.Date;
/*
Implementació de la classe Estrena del paquet domain.classes
 */
//Entitat que representa l'estrena d'un espectacle
@Entity
@Table(name = "estrena", schema = "public", catalog = "postgres")
//@IdClass(EstrenaPK.class)
@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "nomlocal", referencedColumnName = "sessió"), @PrimaryKeyJoinColumn(name = "sessió", referencedColumnName = "nomlocal")})
public class Estrena extends Representació {

    private Integer recàrrec;
    //private String sessió;
    //private String nomlocal;
    private Representació representació;

    public Estrena() {

    }

    public Estrena(Double preu, Date data, Integer nombreseientslliures, String sessió, String nomlocal, String títolesp, Integer recàrrec) {
        super(preu, data, nombreseientslliures, sessió, nomlocal, títolesp);
        this.recàrrec = recàrrec;
    }

    @Basic
    @Column(name = "recàrrec", nullable = true, insertable = true, updatable = true)
    public Integer getRecàrrec() {
        return recàrrec;
    }

    public void setRecàrrec(Integer recàrrec) {
        this.recàrrec = recàrrec;
    }

    /*@Id
    @Column(name = "sessió", nullable = false, insertable = true, updatable = true, length = 255)
    public String getSessió() {
        return sessió;
    }

    public void setSessió(String sessió) {
        this.sessió = sessió;
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

        Estrena that = (Estrena) o;

        if (recàrrec != null ? !recàrrec.equals(that.recàrrec) : that.recàrrec != null) return false;
        if (sessió != null ? !sessió.equals(that.sessió) : that.sessió != null) return false;
        if (nomlocal != null ? !nomlocal.equals(that.nomlocal) : that.nomlocal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recàrrec != null ? recàrrec.hashCode() : 0;
        result = 31 * result + (sessió != null ? sessió.hashCode() : 0);
        result = 31 * result + (nomlocal != null ? nomlocal.hashCode() : 0);
        return result;
    }
*/
    @OneToOne
    @JoinColumns({@JoinColumn(name = "sessió", referencedColumnName = "sessió", nullable = false), @JoinColumn(name = "nomlocal", referencedColumnName = "nomlocal", nullable = false)})
    public Representació getRepresentació() {
        return representació;
    }

    public void setRepresentació(Representació representació) {
        this.representació = representació;
    }

    @Override
    public boolean esEstrena() {
        return true;
    }

    @Override
    public Integer obteRecarrec() {
        return recàrrec;
    }

}
