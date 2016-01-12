package com.shows.as.domain.useCaseControllers;

import com.shows.as.domain.classes.Seient;
import com.shows.as.domain.enums.Moneda;
import com.shows.as.domain.enums.TipusSessio;
import com.shows.as.domain.factories.FactoriaUseCase;
import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;
import com.shows.as.domain.tupleTypes.TupleTypeSeleccioSeients;
import com.shows.as.domain.useCases.ComprarEntrada;
import java.util.Date;
import java.util.Set;

public class ComprarEntradesUseCaseController {

    private ComprarEntrada comprarEntrada;

    public ComprarEntradesUseCaseController() {
        FactoriaUseCase factoriaUseCase = factoriaUseCase = FactoriaUseCase.getInstance();
        comprarEntrada = factoriaUseCase.getComprarEntrada();
    }

    public Set<String> obteEspectacles() {
        return comprarEntrada.obteEspectacles();
    }

    public Set<TupleTypeRepresentacio> obteRepresentacions(String titol, Date data) {
        return comprarEntrada.obteRepresentacions(titol, data);
    }

    public Set<Seient> obteOcupacio(String nomLocal, TipusSessio sessio, Integer nombEspectadors) {
        return comprarEntrada.obteOcupacio(nomLocal, sessio, nombEspectadors);
    }

    public TupleTypeSeleccioSeients seleccionarSeients(Set<Seient> seients) {
        return comprarEntrada.seleccionarSeients(seients);
    }

    public Float obtePreuMoneda(Moneda moneda) {
        return comprarEntrada.obtePreuMoneda(moneda);
    }

    public void pagament(String dni, Integer codiB, String numCompte) {
        comprarEntrada.pagament(dni, codiB, numCompte);
    }

}
