package com.shows.as.domain.factories;

import com.shows.as.domain.useCases.ComprarEntrada;
import com.shows.as.domain.useCases.ConsultarOcupacio;
import com.shows.as.domain.useCases.ConsultarRepresentacions;

/*
Implementació de la classe FactoriaUseCase
 */
public class FactoriaUseCase {

    private static FactoriaUseCase instance;
    private ConsultarRepresentacions consultarRepresentacions;
    private ConsultarOcupacio consultarOcupacio;
    private ComprarEntrada comprarEntrada;

    public static FactoriaUseCase getInstance() {
        if (instance == null) {
            instance = new FactoriaUseCase();
        }
        return instance;
    }

    private FactoriaUseCase() {

    }

    public ConsultarRepresentacions getConsultarRepresentacions() {
        if (consultarRepresentacions == null) {
            consultarRepresentacions = new ConsultarRepresentacions();
        }
        return consultarRepresentacions;
    }

    public ConsultarOcupacio getConsultarOcupacio() {
        if (consultarOcupacio == null) {
            consultarOcupacio = new ConsultarOcupacio();
        }
        return consultarOcupacio;
    }

    public ComprarEntrada getComprarEntrada() {
        if (comprarEntrada == null) {
            comprarEntrada = new ComprarEntrada();
        }
        return comprarEntrada;
    }

}
