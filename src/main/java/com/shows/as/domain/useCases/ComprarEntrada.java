package com.shows.as.domain.useCases;

import com.shows.as.domain.classes.Representacio;
import com.shows.as.domain.classes.Seient;
import com.shows.as.domain.enums.Moneda;
import com.shows.as.domain.enums.TipusSessio;
import com.shows.as.domain.factories.FactoriaUseCase;

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

    public Set<String> obteEspectacles() {
        FactoriaUseCase factoriaUseCase = FactoriaUseCase.getInstance();
        ConsultarRepresentacions consultarRepresentacions = factoriaUseCase.getConsultarRepresentacions();

        return consultarRepresentacions.consultaEspectacles();
    }

    public Set<Representacio> obteRepresentacions(String titol, Date data) {
        FactoriaUseCase factoriaUseCase = FactoriaUseCase.getInstance();
        ConsultarRepresentacions consultarRepresentacions = factoriaUseCase.getConsultarRepresentacions();

        Set<Representacio> result = consultarRepresentacions.consultaRepresentacions(titol, data);

        if (result.isEmpty()) throw new IllegalStateException(noHiHaRepresentacions);

        this.titolEsp = titol;
        this.dataRep = data;

        return result;
    }

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
