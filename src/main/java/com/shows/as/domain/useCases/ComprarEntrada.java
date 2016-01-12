package com.shows.as.domain.useCases;

import com.shows.as.domain.classes.Seient;
import com.shows.as.domain.enums.Moneda;
import com.shows.as.domain.enums.TipusSessio;
import com.shows.as.domain.factories.FactoriaUseCase;
import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;
import java.util.Date;
import java.util.Set;

public class ComprarEntrada {

    public static final String noHiHaRepresentacions = "No Hi Ha Representacions per l'espectacle i data";

    private String titolEsp;
    private Date dataRep;
    private String nLocal;
    private TipusSessio tSessio;
    private Integer nEspectadors;
    private Set<Seient> seients;
    private Float preuTotal;

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
    public Set<Seient> obteOcupacio(String nomLocal, TipusSessio sessio, Integer nombEspectadors) {
        FactoriaUseCase factoriaUseCase = FactoriaUseCase.getInstance();
        ConsultarOcupacio consultarOcupacio = factoriaUseCase.getConsultarOcupacio();

        Set<Seient> result = consultarOcupacio.consultaOcupacio(nomLocal, sessio, nombEspectadors);

        this.nLocal = nomLocal;
        this.tSessio = sessio;
        this.nEspectadors = nombEspectadors;

        return result;
    }

    // TODO Seleccionar seients

    public Float obtePreuMoneda(Moneda moneda) {



        return (float) 0.0;
    }

    public void pagament(String dni, Integer codiB, String numCompte) {

    }

}
