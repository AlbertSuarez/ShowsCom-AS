package com.shows.as.domain.classes;

import com.shows.as.domain.tupleTypes.TupleTypeFilaColumna;
import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "representació", schema = "public", catalog = "postgres")
@IdClass(RepresentacioPK.class)
public class Representacio {
    private Double preu;
    private Date data;
    private Integer nombreseientslliures;
    private String sessio;
    private String nomlocal;

    @Transient
    private Set<SeientEnRepresentacio> seients;

    // -----------------------------------------------------------------------------------------------------------------


    public Representacio(){

    }

    @Basic
    @Column(name = "preu", nullable = true, precision = 0)
    public Double getPreu() {
        return preu;
    }

    public void setPreu(Double preu) {
        this.preu = preu;
    }

    @Basic
    @Column(name = "data", nullable = true)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Basic
    @Column(name = "nombreseientslliures", nullable = true)
    public Integer getNombreseientslliures() {
        return nombreseientslliures;
    }

    public void setNombreseientslliures(Integer nombreseientslliures) {
        this.nombreseientslliures = nombreseientslliures;
    }

    @Id
    @Column(name = "sessio", nullable = false, length = 255)
    public String getSessio() {
        return sessio;
    }

    public void setSessio(String sessio) {
        this.sessio = sessio;
    }

    @Id
    @Column(name = "nomlocal", nullable = false, length = 255)
    public String getNomlocal() {
        return nomlocal;
    }

    public void setNomlocal(String nomlocal) {
        this.nomlocal = nomlocal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Representacio that = (Representacio) o;

        if (preu != null ? !preu.equals(that.preu) : that.preu != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (nombreseientslliures != null ? !nombreseientslliures.equals(that.nombreseientslliures) : that.nombreseientslliures != null)
            return false;
        if (sessio != null ? !sessio.equals(that.sessio) : that.sessio != null) return false;
        if (nomlocal != null ? !nomlocal.equals(that.nomlocal) : that.nomlocal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = preu != null ? preu.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (nombreseientslliures != null ? nombreseientslliures.hashCode() : 0);
        result = 31 * result + (sessio != null ? sessio.hashCode() : 0);
        result = 31 * result + (nomlocal != null ? nomlocal.hashCode() : 0);
        return result;
    }

    public boolean esEstrena() {
        return false;
    }

    public void associaEntrada(Entrada entrada) {
        // TODO this.entrada.add(entrada)
    }

    public Set<TupleTypeFilaColumna> getSeients(Integer nombEspectadors) {
        if (this.nombreseientslliures < nombEspectadors) throw new IllegalStateException("seientsNoDisp");
        Set<TupleTypeFilaColumna> seients = new LinkedHashSet<TupleTypeFilaColumna>();
        for (SeientEnRepresentacio sr : this.seients) {
            seients.add(sr.getSeient());
        }
        return seients;
    }

    public TupleTypeRepresentacio getInfo() {
        TupleTypeRepresentacio info = new TupleTypeRepresentacio();
        info.nomLocal = this.nomlocal;
        info.nomSessio = this.sessio;
        info.estrena = esEstrena();
        info.nombreSeientsLliures = this.nombreseientslliures;
        info.preu = this.preu;
        return info;
    }

    public Double getRecarrec() {
        return 0.0;
    }
}
