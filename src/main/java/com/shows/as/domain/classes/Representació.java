package com.shows.as.domain.classes;

import com.shows.as.domain.tupleTypes.TupleTypeFilaColumna;
import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "representació", schema = "public", catalog = "postgres")
@IdClass(RepresentacióPK.class)
@Inheritance(strategy=InheritanceType.JOINED)
public class Representació {

    public static final String TAULA = "Representació";

    private Double preu;
    private Date data;
    private Integer nombreseientslliures;
    private String sessió;
    private String nomlocal;
    private String títolesp;
    private Collection<Entrada> entradas;
    private Estrena estrena;
    private Espectacle espectacleByTítolesp;
    private Local localByNomlocal;
    private Sessió sessióBySessió;
    private Collection<Seientenrepresentació> seients;




    public Representació() {

    }

    public Representació(Double preu, Date data, Integer nombreseientslliures, String sessió, String nomlocal, String títolesp) {
        this.preu = preu;
        this.data = data;
        this.nombreseientslliures = nombreseientslliures;
        this.sessió = sessió;
        this.nomlocal = nomlocal;
        this.títolesp = títolesp;
    }

    @Basic
    @Column(name = "preu", nullable = true, insertable = true, updatable = true, precision = 17)
    public Double getPreu() {
        return preu;
    }

    public void setPreu(Double preu) {
        this.preu = preu;
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
    @Column(name = "nombreseientslliures", nullable = true, insertable = true, updatable = true)
    public Integer getNombreseientslliures() {
        return nombreseientslliures;
    }

    public void setNombreseientslliures(Integer nombreseientslliures) {
        this.nombreseientslliures = nombreseientslliures;
    }

    @Id
    //@Column(name = "sessió", nullable = false, insertable = true, updatable = true, length = 255)
    public String getSessió() {
        return sessió;
    }

    public void setSessió(String sessió) {
        this.sessió = sessió;
    }

    @Id
    //@Column(name = "nomlocal", nullable = false, insertable = true, updatable = true, length = 255)
    public String getNomlocal() {
        return nomlocal;
    }

    public void setNomlocal(String nomlocal) {
        this.nomlocal = nomlocal;
    }

    @Basic
    //@Column(name = "títolesp", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTítolesp() {
        return títolesp;
    }

    public void setTítolesp(String títolesp) {
        this.títolesp = títolesp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Representació that = (Representació) o;

        if (preu != null ? !preu.equals(that.preu) : that.preu != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (nombreseientslliures != null ? !nombreseientslliures.equals(that.nombreseientslliures) : that.nombreseientslliures != null)
            return false;
        //if (sessió != null ? !sessió.equals(that.sessió) : that.sessió != null) return false;
        //if (nomlocal != null ? !nomlocal.equals(that.nomlocal) : that.nomlocal != null) return false;
        //if (títolesp != null ? !títolesp.equals(that.títolesp) : that.títolesp != null) return false;

        return true;
    }

    /*@Override
    public int hashCode() {
        int result = preu != null ? preu.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (nombreseientslliures != null ? nombreseientslliures.hashCode() : 0);
        result = 31 * result + (sessió != null ? sessió.hashCode() : 0);
        result = 31 * result + (nomlocal != null ? nomlocal.hashCode() : 0);
        result = 31 * result + (títolesp != null ? títolesp.hashCode() : 0);
        return result;
    }*/

    /*@Override
    public int hashCode() {
        return hashCode(this.nomlocal, this.sessió);
    }*/

    public static int hashCode(String nomlocal, String sessió){
        String sSurrogate =   String.format("%60s", nomlocal)           // 60 chars
                            + String.format("%60s", sessió);           // 60 chars

        return sSurrogate.hashCode();
    }

    @OneToMany(mappedBy = "representació")
    public Collection<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(Collection<Entrada> entradas) {
        this.entradas = entradas;
    }

    @OneToOne(mappedBy = "representació")
    public Estrena getEstrena() {
        return estrena;
    }

    public void setEstrena(Estrena estrena) {
        this.estrena = estrena;
    }

    @ManyToOne
    @JoinColumn(name = "títolesp", referencedColumnName = "títol",insertable = false, updatable = false)
    public Espectacle getEspectacleByTítolesp() {
        return espectacleByTítolesp;
    }

    public void setEspectacleByTítolesp(Espectacle espectacleByTítolesp) {
        this.espectacleByTítolesp = espectacleByTítolesp;
    }

    @ManyToOne
    @JoinColumn(name = "nomlocal", referencedColumnName = "nom", nullable = false,insertable = false, updatable = false)
    public Local getLocalByNomlocal() {
        return localByNomlocal;
    }

    public void setLocalByNomlocal(Local localByNomlocal) {
        this.localByNomlocal = localByNomlocal;
    }

    @ManyToOne
    @JoinColumn(name = "sessió", referencedColumnName = "sessió", nullable = false,insertable = false, updatable = false)
    public Sessió getSessióBySessió() {
        return sessióBySessió;
    }

    public void setSessióBySessió(Sessió sessióBySessió) {
        this.sessióBySessió = sessióBySessió;
    }

    @OneToMany(mappedBy = "representació")
    public Collection<Seientenrepresentació> getSeients() {
        return seients;
    }

    public void setSeients(Collection<Seientenrepresentació> seientenrepresentaciós) {
        this.seients = seientenrepresentaciós;
    }

    public boolean esEstrena() {
        return false;
    }

    public void associaEntrada(Entrada entrada) {
        this.entradas.add(entrada);
    }

    public Set<TupleTypeFilaColumna> getSeients(Integer nombEspectadors) {
        if (this.nombreseientslliures < nombEspectadors) throw new IllegalStateException("seientsNoDisp");
        Set<TupleTypeFilaColumna> seients = new LinkedHashSet<TupleTypeFilaColumna>();
        for (Seientenrepresentació sr : this.seients) {
            seients.add(sr.obteSeientFilaColumna());
        }
        return seients;
    }

    public TupleTypeRepresentacio obteInfo() {
        TupleTypeRepresentacio info = new TupleTypeRepresentacio();
        info.nomLocal = this.nomlocal;
        info.nomSessio = this.sessió;
        info.estrena = esEstrena();
        info.nombreSeientsLliures = this.nombreseientslliures;
        info.preu = this.preu;
        return info;
    }

    public Integer obteRecarrec() {
        return 0;
    }

}
