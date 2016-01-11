package com.shows.as.domain.factories;

import com.shows.as.domain.useCases.ComprarEntrada;
import com.shows.as.domain.useCases.ConsultarOcupacio;
import com.shows.as.domain.useCases.ConsultarRepresentacions;

public class FactoriaUseCase {

    private static FactoriaUseCase instance = new FactoriaUseCase();
    private ConsultarRepresentacions consultarRepresentacions;
    private ConsultarOcupacio consultarOcupacio;
    private ComprarEntrada comprarEntrada;

    public static FactoriaUseCase getInstance() {
        return instance;
    }

    private FactoriaUseCase() {

    }

    public ConsultarRepresentacions getConsultarRepresentacions() {
        return consultarRepresentacions;
    }

    public ConsultarOcupacio getConsultarOcupacio() {
        return consultarOcupacio;
    }

    public ComprarEntrada getComprarEntrada() {
        return comprarEntrada;
    }

}
