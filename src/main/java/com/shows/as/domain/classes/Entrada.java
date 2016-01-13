package com.shows.as.domain.classes;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "entrada", schema = "public", catalog = "postgres")
public class Entrada {

    private String identificador;
    private String dniclient;
    private Integer nombreespectadors;
    private Date data;
    private Double preu;
    @Transient
    private Representacio representacio;
    @Transient
    private Set<SeientEnRepresentacio> seients;

    // -----------------------------------------------------------------------------------------------------------------


    public Entrada(String identificador, String dniClient, Integer nombreEspectadors, Date data, Double preu) {
        this.identificador = identificador;
        this.dniclient = dniClient;
        this.nombreespectadors = nombreEspectadors;
        this.data = data;
        this.preu = preu;
    }

    public Entrada() {

    }

    public void associa(Representacio r, Set<SeientEnRepresentacio> seientRep) {
        this.representacio = r;
        r.associaEntrada(this);
        this.seients = seientRep;
    }

    @Id
    @Column(name = "identificador", nullable = false, length = 255)
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @Basic
    @Column(name = "dniclient", nullable = true, length = 255)
    public String getDniclient() {
        return dniclient;
    }

    public void setDniclient(String dniclient) {
        this.dniclient = dniclient;
    }

    @Basic
    @Column(name = "nombreespectadors", nullable = true)
    public Integer getNombreespectadors() {
        return nombreespectadors;
    }

    public void setNombreespectadors(Integer nombreespectadors) {
        this.nombreespectadors = nombreespectadors;
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
    @Column(name = "preu", nullable = true, precision = 0)
    public Double getPreu() {
        return preu;
    }

    public void setPreu(Double preu) {
        this.preu = preu;
    }

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

        return true;
    }

    @Override
    public int hashCode() {
        int result = identificador != null ? identificador.hashCode() : 0;
        result = 31 * result + (dniclient != null ? dniclient.hashCode() : 0);
        result = 31 * result + (nombreespectadors != null ? nombreespectadors.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (preu != null ? preu.hashCode() : 0);
        return result;
    }

}
