package com.shows.as.domain.classes;

import javax.persistence.*;
import java.util.Collection;
/*
Implementació de la classe Sessio del paquet domain.classes
 */
//Entitat que representa una sessió
@Entity
@Table(name = "sessió", schema = "public", catalog = "postgres")
public class Sessió {

    private String sessió;
    private Collection<Representació> representaciósBySessió;


    public Sessió() {

    }

    public Sessió(String sessió) {
        this.sessió = sessió;
    }

    @Id
    @Column(name = "sessió", nullable = false, insertable = true, updatable = true, length = 255)
    public String getSessió() {
        return sessió;
    }

    public void setSessió(String sessió) {
        this.sessió = sessió;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sessió that = (Sessió) o;

        if (sessió != null ? !sessió.equals(that.sessió) : that.sessió != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return sessió != null ? sessió.hashCode() : 0;
    }

    @OneToMany(mappedBy = "sessióBySessió")
    public Collection<Representació> getRepresentaciósBySessió() {
        return representaciósBySessió;
    }

    public void setRepresentaciósBySessió(Collection<Representació> representaciósBySessió) {
        this.representaciósBySessió = representaciósBySessió;
    }
}
