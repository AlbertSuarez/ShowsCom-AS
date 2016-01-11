package com.shows.as.domain.useCases;

import com.shows.as.domain.classes.Representacio;
import com.shows.as.domain.classes.Seient;
import com.shows.as.domain.enums.TipusSessio;
import com.shows.as.domain.factories.FactoriaUseCase;

import java.util.Date;
import java.util.Set;

public class ComprarEntrada {

    public static final String noHiHaRepresentacions = "noHiHaRepresentacions";

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

    public Set<Representacio> obteRepresentacions(String titol, Date data) throws Exception {
        FactoriaUseCase factoriaUseCase = FactoriaUseCase.getInstance();
        ConsultarRepresentacions consultarRepresentacions = factoriaUseCase.getConsultarRepresentacions();

        Set<Representacio> result = consultarRepresentacions.consultaRepresentacions(titol, data);

        if (result.isEmpty()) throw new Exception(noHiHaRepresentacions);

        this.titolEsp = titol;
        this.dataRep = data;

        return result;
    }

}
