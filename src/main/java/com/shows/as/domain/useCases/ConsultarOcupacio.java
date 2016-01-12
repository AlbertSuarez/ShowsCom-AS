package com.shows.as.domain.useCases;

import com.shows.as.domain.classes.Representacio;
import com.shows.as.domain.classes.Seient;
import com.shows.as.domain.controllers.CtrlRepresentacio;
import com.shows.as.domain.enums.TipusSessio;
import com.shows.as.domain.factories.FactoriaCtrl;
import java.util.Set;

public class ConsultarOcupacio {

    public Set<Seient> consultaOcupacio(String nomLocal, TipusSessio sessio, Integer nombEspectadors) {
        FactoriaCtrl factoriaCtrl = FactoriaCtrl.getInstance();
        CtrlRepresentacio ctrlRepresentacio = factoriaCtrl.getCtrlRepresentacio();

        Representacio r = ctrlRepresentacio.getRepresentacio(nomLocal, sessio);
        return r.getSeients(nombEspectadors);
    }

}
