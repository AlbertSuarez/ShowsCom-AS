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
