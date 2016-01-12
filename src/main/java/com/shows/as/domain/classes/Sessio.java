package com.shows.as.domain.classes;

import com.shows.as.domain.enums.TipusSessio;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Sessio implements Serializable {

    @Id
    private TipusSessio sessio;

    public Sessio(){

    }

    public TipusSessio getSessio() {
        return sessio;
    }

    public void setSessio(TipusSessio sessio) {
        this.sessio = sessio;
    }
}
