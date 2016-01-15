package com.shows.as.domain.useCases;

import com.shows.as.domain.classes.Representació;
import com.shows.as.domain.controllers.CtrlRepresentacio;
import com.shows.as.domain.enums.TipusSessio;
import com.shows.as.domain.factories.FactoriaCtrl;
import com.shows.as.domain.tupleTypes.TupleTypeFilaColumna;

import java.util.Set;
/*
Implementació del cas d'ús consultarOcupació
 */
//Entitat que representa el cas d'ús consultar Ocupació
public class ConsultarOcupacio {

    /**
     * @pre representacioExisteix: la representacio existeix.
     * @pre nombEspectadorsOK: el nombEspectadors es mes gran que 0.
     * @exception IllegalStateException seientsNoDisp: El nombre d'espectadors es mes gran que el nombre de seients lliures.
     * @param nomLocal El nom del local.
     * @param sessio El tipus de la sessio.
     * @param nombEspectadors El nombre d'espectadors.
     * @return result = fila i columna de tots els seients disponibles per a aquella representacio.
     */
    public Set<TupleTypeFilaColumna> consultaOcupacio(String nomLocal, String sessio, Integer nombEspectadors) {
        FactoriaCtrl factoriaCtrl = FactoriaCtrl.getInstance();
        CtrlRepresentacio ctrlRepresentacio = factoriaCtrl.getCtrlRepresentacio();

        Representació r = ctrlRepresentacio.getRepresentacio(nomLocal, sessio);
        return r.getSeients(nombEspectadors);
    }

}
