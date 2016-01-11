package com.shows.as.domain.useCases;

import com.shows.as.domain.classes.Representacio;
import com.shows.as.domain.classes.Seient;
import com.shows.as.domain.controllers.CtrlRepresentacio;
import com.shows.as.domain.enums.TipusSessio;
import com.shows.as.domain.factories.FactoriaCtrl;
import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConsultarOcupacio {

    public static final String noHiHaRepresentacions = "No Hi Ha Representacions per l'espectacle i data";

    public Set<TupleTypeRepresentacio> totesRepresentacions() {
        Set<TupleTypeRepresentacio> result = new LinkedHashSet<TupleTypeRepresentacio>();
        FactoriaCtrl factoriaCtrl = FactoriaCtrl.getInstance();
        CtrlRepresentacio ctrlRepresentacio = factoriaCtrl.getCtrlRepresentacio();

        Set<Representacio> rep = ctrlRepresentacio.getAll();
        if (rep.isEmpty()) throw new IllegalStateException(noHiHaRepresentacions);

        for (Representacio rr : rep) {
            TupleTypeRepresentacio infoC = rr.getInfoCompleta();
            infoC.titol = "";       // TODO Falta afegir titol de l'espectacle pero no se d'on agafarlo
            result.add(infoC);
        }

        return result;
    }

    public Set<Seient> consultaOcupacio(String nomLocal, TipusSessio sessio, Integer nombEspectadors) {
        FactoriaCtrl factoriaCtrl = FactoriaCtrl.getInstance();
        CtrlRepresentacio ctrlRepresentacio = factoriaCtrl.getCtrlRepresentacio();

        Representacio r = ctrlRepresentacio.getRepresentacio(nomLocal, sessio);
        return r.getSeients(nombEspectadors);
    }

}
