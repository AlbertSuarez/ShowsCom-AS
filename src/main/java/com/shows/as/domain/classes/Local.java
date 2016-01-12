package com.shows.as.domain.classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Set;

@Entity
public class Local {

    @Id
    private String nom;
    private String adreca;
    @Transient
    private Set<Seient> seients;

    public Local(){

    }

    public Local(String nom, String adreca){
        this.nom = nom;
        this.adreca = adreca;
    }

    public String getNom() {
        return nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public Set<Seient> getSeients() {
        return seients;
    }

    public void setSeients(Set<Seient> seients) {
        this.seients = seients;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
