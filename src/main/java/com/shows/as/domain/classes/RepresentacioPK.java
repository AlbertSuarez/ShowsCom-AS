package com.shows.as.domain.classes;

import java.io.Serializable;

/**
 * Created by Usuari on 12/01/2016.
 */
public class RepresentacioPK implements Serializable {

    private String nomSessio;
    private String nomLocal;


    public String getNomSessio() {
        return nomSessio;
    }

    public void setNomSessio(String nomSessio) {
        this.nomSessio = nomSessio;
    }

    public String getNomLocal() {
        return nomLocal;
    }

    public void setNomLocal(String nomLocal) {
        this.nomLocal = nomLocal;
    }
}
