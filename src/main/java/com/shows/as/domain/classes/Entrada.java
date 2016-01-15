package com.shows.as.domain.classes;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Set;
/*
Implementació de la classe Entrada del paquet domain.classes
 */
//entitat que representa una entrada a una representació
@Entity
@Table(name = "entrada", schema = "public", catalog = "postgres")
public class Entrada {

    private String identificador;
    private String dniclient;
    private Integer nombreespectadors;
    private Date data;
    private Double preu;
    //private String sessió;
    //private String nomlocal;
    private Representació representació;
    private Collection<Seientenrepresentació> seients;



    public Entrada() {

    }

    public Entrada(String identificador, String dniClient, Integer nombreEspectadors, Date data, Double preu) {
        this.identificador = identificador;
        this.dniclient = dniClient;
        this.nombreespectadors = nombreEspectadors;
        this.data = data;
        this.preu = preu;
    }

    public void associa(Representació r, Set<Seientenrepresentació> seientRep) {
        this.representació = r;
        r.associaEntrada(this);
        this.seients = seientRep;
    }

    @Id
    @Column(name = "identificador", nullable = false, insertable = true, updatable = true, length = 255)
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @Basic
    @Column(name = "dniclient", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDniclient() {
        return dniclient;
    }

    public void setDniclient(String dniclient) {
        this.dniclient = dniclient;
    }

    @Basic
    @Column(name = "nombreespectadors", nullable = true, insertable = true, updatable = true)
    public Integer getNombreespectadors() {
        return nombreespectadors;
    }

    public void setNombreespectadors(Integer nombreespectadors) {
        this.nombreespectadors = nombreespectadors;
    }

    @Basic
    @Column(name = "data", nullable = true, insertable = true, updatable = true)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Basic
    @Column(name = "preu", nullable = true, insertable = true, updatable = true, precision = 17)
    public Double getPreu() {
        return preu;
    }

    public void setPreu(Double preu) {
        this.preu = preu;
    }

    /*public String getSessió() {
        return sessió;
    }

    public void setSessió(String sessió) {
        this.sessió = sessió;
    }

    public String getNomlocal() {
        return nomlocal;
    }

    public void setNomlocal(String nomlocal) {
        this.nomlocal = nomlocal;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entrada that = (Entrada) o;

        if (identificador != null ? !identificador.equals(that.identificador) : that.identificador != null)
            return false;
        if (dniclient != null ? !dniclient.equals(that.dniclient) : that.dniclient != null) return false;
        if (nombreespectadors != null ? !nombreespectadors.equals(that.nombreespectadors) : that.nombreespectadors != null)
            return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (preu != null ? !preu.equals(that.preu) : that.preu != null) return false;
        //if (sessió != null ? !sessió.equals(that.sessió) : that.sessió != null) return false;
        //if (nomlocal != null ? !nomlocal.equals(that.nomlocal) : that.nomlocal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = identificador != null ? identificador.hashCode() : 0;
        result = 31 * result + (dniclient != null ? dniclient.hashCode() : 0);
        result = 31 * result + (nombreespectadors != null ? nombreespectadors.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (preu != null ? preu.hashCode() : 0);
        //result = 31 * result + (sessió != null ? sessió.hashCode() : 0);
        //result = 31 * result + (nomlocal != null ? nomlocal.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "sessió", referencedColumnName = "sessió"), @JoinColumn(name = "nomlocal", referencedColumnName = "nomlocal")})
    public Representació getRepresentació() {
        return representació;
    }

    public void setRepresentació(Representació representació) {
        this.representació = representació;
    }

    @OneToMany(mappedBy = "entradaByIdentrada")
    public Collection<Seientenrepresentació> getSeients() {
        return seients;
    }

    public void setSeients(Collection<Seientenrepresentació> seientenrepresentaciósByIdentificador) {
        this.seients = seientenrepresentaciósByIdentificador;
    }

}
