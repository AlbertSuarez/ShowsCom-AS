package com.shows.as.domain.classes;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "local", schema = "public", catalog = "postgres")
public class Local {

    private String nom;
    private String adreça;
    @Transient
    private Set<Seient> seients;

    // -----------------------------------------------------------------------------------------------------------------


    public Local(){

    }

    @Id
    @Column(name = "nom", nullable = false, length = 255)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "adreça", nullable = true, length = 255)
    public String getAdreça() {
        return adreça;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public Set<Seient> getSeients() {
        return seients;
    }

    public void setSeients(Set<Seient> seients) {
        this.seients = seients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Local that = (Local) o;

        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (adreça != null ? !adreça.equals(that.adreça) : that.adreça != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nom != null ? nom.hashCode() : 0;
        result = 31 * result + (adreça != null ? adreça.hashCode() : 0);
        return result;
    }

}
