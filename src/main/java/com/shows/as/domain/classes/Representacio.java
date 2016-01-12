package com.shows.as.domain.classes;

import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class Representacio {

    public static final String seientsNoDisp = "El nombre d'espectadors es mes gran que el nombre de seients lliures";

    private Float preu;
    private Date data;
    private Integer nombreSeientsLliures;
    private Sessio sessio;
    private Local local;
    private Set<SeientEnRepresentacio> seients;


    public Date getDate() {
        return data;
    }

    public TupleTypeRepresentacio getInfo() {
        TupleTypeRepresentacio info = new TupleTypeRepresentacio();
        info.nomLocal = local.getNom();
        info.sessio = sessio.getSessio();
        info.estrena = esEstrena();
        info.nombreSeientsLliures = this.nombreSeientsLliures;
        info.preu = this.preu;
        return info;
    }

    public Float getPreu() {
        return preu;
    }

    public Integer getRecarrec() {
        return 0;
    }

    public boolean esEstrena() {
        return false;
    }

    public Set<Seient> getSeients(Integer nombEspectadors) {
        if (this.nombreSeientsLliures < nombEspectadors) throw new IllegalStateException(seientsNoDisp);

        Set<Seient> seients = new LinkedHashSet<Seient>();
        for (SeientEnRepresentacio sr : this.seients) {
            seients.add(sr.getSeient());
        }

        return  seients;
    }

    // TODO associaEntrada

}
