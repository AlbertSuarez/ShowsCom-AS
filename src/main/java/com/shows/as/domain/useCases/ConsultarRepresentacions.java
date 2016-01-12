package com.shows.as.domain.useCases;

import com.shows.as.domain.classes.Espectacle;
import com.shows.as.domain.controllers.CtrlEspectacle;
import com.shows.as.domain.factories.FactoriaCtrl;
import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class ConsultarRepresentacions {

    public static final String noHiHaEspectacles = "No hi ha espectacles enregistrats al sistema";

    /**
     * @exception IllegalStateException: noHiHaEspectacles: No hi ha espectacles enregistrats al sistema.
     * @return result = obte el titol de tots els espectacles existents al sistema.
     */
    public Set<String> consultaEspectacles() {
        FactoriaCtrl factoriaCtrl = FactoriaCtrl.getInstance();
        CtrlEspectacle ctrlEspectacle = factoriaCtrl.getCtrlEspectacle();
        Set<Espectacle> espectacles = ctrlEspectacle.getAll();

        if (espectacles.size() == 0) throw new IllegalStateException(noHiHaEspectacles);

        Set<String> result = new LinkedHashSet<String>();
        for (Espectacle e : espectacles){
            result.add(e.getTitol());
        }

        return result;
    }

    /**
     * @pre exiseixEspecacle: L'espectacle amb titol existeix.
     * @pre dataCorrecta: La data es correcta.
     * @param titol Titol de l'espectacle.
     * @param data Data de l'espectacle.
     * @return result = obte els locals, sessions, el nombre de seients lliures, la indicacio de si es estrena i el preu de totes les representacions.
     */
    public Set<TupleTypeRepresentacio> consultaRepresentacions(String titol, Date data) {
        FactoriaCtrl factoriaCtrl = FactoriaCtrl.getInstance();
        CtrlEspectacle ctrlEspectacle = factoriaCtrl.getCtrlEspectacle();

        Espectacle espectacle = ctrlEspectacle.getEspectacle(titol);

        return espectacle.obteRepresentacions(data);
    }
}
