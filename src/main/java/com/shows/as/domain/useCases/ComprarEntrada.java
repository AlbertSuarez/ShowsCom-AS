package com.shows.as.domain.useCases;

import com.shows.as.domain.adapters.IBankServiceAdapter;
import com.shows.as.domain.adapters.ICurrencyConvertorAdapter;
import com.shows.as.domain.classes.*;
import com.shows.as.domain.controllers.CtrlRepresentacio;
import com.shows.as.domain.controllers.CtrlSeientEnRepresentacio;
import com.shows.as.domain.enums.Moneda;
import com.shows.as.domain.enums.TipusSessio;
import com.shows.as.domain.factories.FactoriaCtrl;
import com.shows.as.domain.factories.FactoriaServeis;
import com.shows.as.domain.factories.FactoriaUseCase;
import com.shows.as.domain.tupleTypes.TupleTypeFilaColumna;
import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;
import com.shows.as.domain.tupleTypes.TupleTypeSeleccioSeients;
import com.shows.as.domain.utils.Utils;

import java.sql.Date;
import java.util.*;

public class ComprarEntrada {

    public static final String noHiHaRepresentacions = "No Hi Ha Representacions per l'espectacle i data";
    public static final String pagamentNoAutoritzat = "El pagament no s'autoritza";

    private String titolEsp;
    private Date dataRep;
    private String nLocal;
    private String tSessio;
    private Integer nEspectadors;
    private Set<Seient> seients;
    private Double preuTotal;

    /**
     * @exception IllegalStateException noHiHaEspectacles: No hi ha espectacles enregistrats al sistema.
     * @return result = obte el titol de tots els espectacles existents al sistema.
     */
    public Set<String> obteEspectacles() {
        FactoriaUseCase factoriaUseCase = FactoriaUseCase.getInstance();
        ConsultarRepresentacions consultarRepresentacions = factoriaUseCase.getConsultarRepresentacions();

        return consultarRepresentacions.consultaEspectacles();
    }

    /**
     * @pre exiseixEspecacle: L'espectacle amb titol existeix.
     * @pre dataCorrecta: La data es correcta.
     * @exception IllegalStateException noHiHaRepresentacions: No Hi Ha Representacions per l'espectacle i data.
     * @param titol Titol de l'espectacle.
     * @param data Data de l'espectacle.
     * @return result = obte els locals, sessions, el nombre de seients lliures, la indicacio de si es estrena i el preu de totes les representacions.
     * @post emmagatzemaDades: s'emmagatzema a la capa de domini el titol i la data.
     */
    public Set<TupleTypeRepresentacio> obteRepresentacions(String titol, Date data) {
        FactoriaUseCase factoriaUseCase = FactoriaUseCase.getInstance();
        ConsultarRepresentacions consultarRepresentacions = factoriaUseCase.getConsultarRepresentacions();

        Set<TupleTypeRepresentacio> result = consultarRepresentacions.consultaRepresentacions(titol, data);

        if (result.isEmpty()) throw new IllegalStateException(noHiHaRepresentacions);

        this.titolEsp = titol;
        this.dataRep = data;

        return result;
    }

    /**
     * @pre representacioExisteix: la representacio existeix.
     * @pre nombEspectadorsOK: el nombEspectadors es mes gran que 0.
     * @exception IllegalStateException seientsNoDisp: El nombre d'espectadors es mes gran que el nombre de seients lliures.
     * @param nomLocal El nom del local.
     * @param sessio El tipus de la sessio.
     * @param nombEspectadors El nombre d'espectadors.
     * @return result = fila i columna de tots els seients disponibles per a aquella representacio.
     * @post emmagatzemaDades: s'emmagatzema a la capa de domini el nomLocal, sessio i nombEspectadors.
     */
    public Set<TupleTypeFilaColumna> obteOcupacio(String nomLocal, String sessio, Integer nombEspectadors) {
        FactoriaUseCase factoriaUseCase = FactoriaUseCase.getInstance();
        ConsultarOcupacio consultarOcupacio = factoriaUseCase.getConsultarOcupacio();

        Set<TupleTypeFilaColumna> result = consultarOcupacio.consultaOcupacio(nomLocal, sessio, nombEspectadors);

        this.nLocal = nomLocal;
        this.tSessio = sessio;
        this.nEspectadors = nombEspectadors;

        return result;
    }

    /**
     * @pre seientsLliures: els seients estan lliures per la representacio.
     * @param seients Els seients de la representacio.
     * @return result = preu total de l'entrada i les monedes en les que pot demanar la conversio.
     * @post emmagatzemaDades: s'emmagatzema a la capa de domini els seients i el preu total de l'entrada.
     */
    public TupleTypeSeleccioSeients seleccionarSeients(Set<Seient> seients) {
        TupleTypeSeleccioSeients result = new TupleTypeSeleccioSeients();
        FactoriaCtrl factoriaCtrl = FactoriaCtrl.getInstance();
        CtrlRepresentacio ctrlRepresentacio = factoriaCtrl.getCtrlRepresentacio();

        Representació r = ctrlRepresentacio.getRepresentacio(this.nLocal, this.tSessio);

        Double p = r.getPreu();
        p += r.obteRecarrec();

        for (Seient s : seients) {
            s.canviarEstat(r);
        }

        Showscom showscom = Showscom.getInstance();
        result.preu = (this.nEspectadors * p) + showscom.getComissio();
        result.canvis = new LinkedHashSet<Moneda>(Arrays.asList(showscom.getCanvis()));

        this.seients = seients;
        this.preuTotal = result.preu;

        return result;
    }

    /**
     * @pre monedaExisteix: la moneda es un dels canvis permesos.
     * @exception IllegalStateException serveiNoDisponible: el servei no esta disponible.
     * @param moneda La moneda a realitzar la conversio.
     * @post el sistema crida a l'operacio <code>conversionRate(divisa, moneda):Float</code> del servei currency convertor per obtenir el canvi entre l'euro i la moneda.
     * @return result = preu (emmagatzemat a la capa de domini) * canvi obtingut al servei anterior.
     */
    public Double obtePreuMoneda(Moneda moneda) {
        FactoriaServeis factoriaServeis = FactoriaServeis.getInstance();
        ICurrencyConvertorAdapter iCurrencyConvertorAdapter = factoriaServeis.getiCurrencyConvertorAdapter();

        Showscom showscom = Showscom.getInstance();
        Moneda divisa = showscom.getDivisa();

        Double conversio = iCurrencyConvertorAdapter.conversionRate(divisa, moneda);

        return this.preuTotal * conversio;
    }

    /**
     * @exception IllegalStateException serveiNoDisponible: el servei no esta disponible o no autoritza el pagament.
     * @exception IllegalStateException pagamentNoAutoritzat: El pagament no s'autoritza.
     * @param dni El dni de la persona que paga.
     * @param codiB El codi bancari de la persona que paga.
     * @param numCompte El numero de compte de la persona que paga.
     * @post pagament: el sistema crida a l'operacio <code>autoritza(dni, codiB, numCompte, import, codiBancShows, numCompteShows, dAvui):Boolean</code>
     *                  del servei Bank Service amb les dades dels comptes per fer la transferència i el preu total de l'entrada.
     * @post creacioEntrada: si el pagament s'ha produït amb èxit, es crea una instància de entrada i de les seves associacions amb la representació i els seients de la representació.
     */
    public void pagament(String dni, Integer codiB, String numCompte) {
        Showscom showscom = Showscom.getInstance();
        Integer cb = showscom.getCodiBanc();
        String nc = showscom.getNumeroCompte();

        FactoriaServeis factoriaServeis = FactoriaServeis.getInstance();
        IBankServiceAdapter iBankServiceAdapter = factoriaServeis.getiBankServiceAdapter();

        Date dt = (java.sql.Date) Calendar.getInstance().getTime();

        Boolean b = iBankServiceAdapter.autoritza(dni, codiB, numCompte, this.preuTotal, cb, nc, dt);

        if (!b) throw new IllegalStateException(pagamentNoAutoritzat);

        String id = Utils.random();

        FactoriaCtrl factoriaCtrl = FactoriaCtrl.getInstance();
        CtrlRepresentacio ctrlRepresentacio = factoriaCtrl.getCtrlRepresentacio();
        CtrlSeientEnRepresentacio ctrlSeientEnRepresentacio = factoriaCtrl.getCtrlSeientEnRepresentacio();

        Representació r = ctrlRepresentacio.getRepresentacio(this.nLocal, this.tSessio);

        Set<Seientenrepresentació> seientRep = new LinkedHashSet<Seientenrepresentació>();
        for (Seient seient : this.seients) {
            seientRep.add(ctrlSeientEnRepresentacio.getSeientEnRepresentacio(this.nLocal, this.tSessio, seient.getFila(), seient.getColumna()));
        }

        Entrada e = new Entrada(id, dni, this.nEspectadors, dt, this.preuTotal);
        e.associa(r, seientRep);
        // TODO insert e
    }

}
