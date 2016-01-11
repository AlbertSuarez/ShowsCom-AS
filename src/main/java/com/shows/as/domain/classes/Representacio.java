package com.shows.as.domain.classes;

import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class Representacio {

    public static final String seientsNoDisp = "seientsNoDisp";

    private Float preu;
    private Date data;
    private Integer nombreSeientsLliures;
    private Sessio sessio;
    private Local local;
    private Set<SeientEnRepresentacio> seients;


    public Date getDate() {
        return data;
    }

    // TODO getInfo

    public TupleTypeRepresentacio getInfoCompleta() {
        TupleTypeRepresentacio infoC = new TupleTypeRepresentacio();
        infoC.nomLocal = local.getNom();
        infoC.sessio = sessio.getSessio();
        infoC.estrena = esEstrena();
        infoC.data = this.data;
        infoC.nombreSeientsLliures = this.nombreSeientsLliures;
        infoC.preu = this.preu;
        return infoC;
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
