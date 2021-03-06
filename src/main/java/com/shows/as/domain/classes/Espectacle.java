package com.shows.as.domain.classes;

import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;
import com.shows.as.domain.utils.Utils;

import javax.persistence.*;
import java.util.Collection;
import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/*
Implementació de la classe Espectacle del paquet domain.classes
 */
//entitat que representa un espectacle
@Entity
@Table(name = "espectacle", schema = "public", catalog = "postgres")
public class Espectacle {

    public static final String TAULA = "Espectacle";

    private String títol;
    private Integer participants;
    private Set<Representació> representacions = new LinkedHashSet<Representació>();

    public Espectacle(){

    }

    public Espectacle(String a, int i) {
        this.títol = a;
        this.participants = i;

    }

    public Set<TupleTypeRepresentacio> obteRepresentacions(Date data){
        Set<TupleTypeRepresentacio> result = new LinkedHashSet<TupleTypeRepresentacio>();
        for (Representació r : getRepresentacions()){
            if (Utils.sameDay(data, r.getData())) result.add(r.obteInfo());
        }
        return result;
    }

    @Id
    @Column(name = "títol", nullable = false, insertable = true, updatable = true, length = 255)
    public String getTítol() {
        return títol;
    }

    public void setTítol(String títol) {
        this.títol = títol;
    }

    @Basic
    @Column(name = "participants", nullable = true, insertable = true, updatable = true)
    public Integer getParticipants() {
        return participants;
    }

    public void setParticipants(Integer participants) {
        this.participants = participants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Espectacle that = (Espectacle) o;

        if (títol != null ? !títol.equals(that.títol) : that.títol != null) return false;
        if (participants != null ? !participants.equals(that.participants) : that.participants != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = títol != null ? títol.hashCode() : 0;
        result = 31 * result + (participants != null ? participants.hashCode() : 0);
        return result;
    }

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "títolesp",referencedColumnName = "títol")
    public Set<Representació> getRepresentacions() {
        return representacions;
    }

    public void setRepresentacions(Set<Representació> representaciósByTítol) {
        this.representacions = representaciósByTítol;
    }
}
