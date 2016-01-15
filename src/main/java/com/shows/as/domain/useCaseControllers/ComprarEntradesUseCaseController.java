package com.shows.as.domain.useCaseControllers;

import com.shows.as.domain.classes.Seient;
import com.shows.as.domain.enums.Moneda;
import com.shows.as.domain.enums.TipusSessio;
import com.shows.as.domain.factories.FactoriaUseCase;
import com.shows.as.domain.tupleTypes.TupleTypeFilaColumna;
import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;
import com.shows.as.domain.tupleTypes.TupleTypeSeleccioSeients;
import com.shows.as.domain.useCases.ComprarEntrada;
import java.sql.Date;
import java.util.Set;

/*
Implementació de la classe ComprarEntradesUseCaseController. Controlador del cas d'ús comprarEntrades
 */
//Entitat que representa un controlador del cas d'ús comprar entrades
public class ComprarEntradesUseCaseController {

    private ComprarEntrada comprarEntrada;

    public ComprarEntradesUseCaseController() {
        FactoriaUseCase factoriaUseCase = factoriaUseCase = FactoriaUseCase.getInstance();
        comprarEntrada = factoriaUseCase.getComprarEntrada();
    }

    public Set<String> obteEspectacles() {
        return comprarEntrada.obteEspectacles();
    }

    public Set<TupleTypeRepresentacio> obteRepresentacions(String titol, Date data) throws Exception{
        return comprarEntrada.obteRepresentacions(titol, data);
    }

    public Set<TupleTypeFilaColumna> obteOcupacio(String nomLocal, String sessio, Integer nombEspectadors) {
        return comprarEntrada.obteOcupacio(nomLocal, sessio, nombEspectadors);
    }

    public TupleTypeSeleccioSeients seleccionarSeients(Set<Seient> seients) {
        return comprarEntrada.seleccionarSeients(seients);
    }

    public Double obtePreuMoneda(Moneda moneda) {
        return comprarEntrada.obtePreuMoneda(moneda);
    }

    public void pagament(String dni, Integer codiB, String numCompte) throws Exception {
        comprarEntrada.pagament(dni, codiB, numCompte);
    }

}
