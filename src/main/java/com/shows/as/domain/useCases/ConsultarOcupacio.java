package com.shows.as.domain.useCases;

import com.shows.as.domain.classes.Representacio;
import com.shows.as.domain.classes.Seient;
import com.shows.as.domain.controllers.CtrlRepresentacio;
import com.shows.as.domain.enums.TipusSessio;
import com.shows.as.domain.factories.FactoriaCtrl;
import java.util.Set;

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
    public Set<Seient> consultaOcupacio(String nomLocal, TipusSessio sessio, Integer nombEspectadors) {
        FactoriaCtrl factoriaCtrl = FactoriaCtrl.getInstance();
        CtrlRepresentacio ctrlRepresentacio = factoriaCtrl.getCtrlRepresentacio();

        Representacio r = ctrlRepresentacio.getRepresentacio(nomLocal, sessio);
        return r.getSeients(nombEspectadors);
    }

}
