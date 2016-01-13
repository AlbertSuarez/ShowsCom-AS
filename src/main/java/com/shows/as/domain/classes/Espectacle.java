package com.shows.as.domain.classes;


import javax.persistence.Entity;

    import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;
import com.shows.as.domain.utils.Utils;

import javax.persistence.*;
    import java.util.Date;
    import java.util.LinkedHashSet;
    import java.util.Set;

@Entity
@Table(name = "espectacle", schema = "public", catalog = "postgres")
public class Espectacle {

    private String títol;
    private Integer participants;
    @Transient
    private Set<Representacio> representacions;

    // -----------------------------------------------------------------------------------------------------------------


    @Id
    @Column(name = "títol", nullable = false, length = 255)
    public String getTitol() {
        return títol;
    }

    public void setTitol(String títol) {
        this.títol = títol;
    }

    @Basic
    @Column(name = "participants", nullable = true)
    public Integer getParticipants() {
        return participants;
    }

    public void setParticipants(Integer participants) {
        this.participants = participants;
    }

    public Set<TupleTypeRepresentacio> obteRepresentacions(Date data){
        Set<TupleTypeRepresentacio> result = new LinkedHashSet<TupleTypeRepresentacio>();

        for (Representacio  r : representacions){
            if (Utils.sameDay(data, r.getData())) result.add(r.getInfo());
        }
        return result;
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


}
