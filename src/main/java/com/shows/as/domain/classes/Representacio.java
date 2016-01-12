package com.shows.as.domain.classes;

import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@IdClass(RepresentacioPK.class)
public class Representacio  {

    public static final String seientsNoDisp = "El nombre d'espectadors es mes gran que el nombre de seients lliures";

    private Float preu;
    private Date data;
    private Integer nombreSeientsLliures;
    @Id
    private String nomSessio;
    @Id
    private String nomLocal;
    @Transient
    private Set<SeientEnRepresentacio> seients;


    public Representacio(Float preu, Date data, Integer nombreSeientsLliures, String sessio, Local local){
        this.preu = preu;
        this.data = data;
        this.nombreSeientsLliures = nombreSeientsLliures;
        this.nomSessio = sessio;
        this.nomLocal = local.getNom();
    }

    public Date getDate() {
        return data;
    }

    public TupleTypeRepresentacio getInfo() {
        TupleTypeRepresentacio info = new TupleTypeRepresentacio();
        info.nomLocal = nomLocal;
        info.nomSessio = nomSessio;
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

        return seients;
    }

    public void associaEntrada(Entrada entrada) {
        // TODO this.entrada.add(entrada)
    }

}
