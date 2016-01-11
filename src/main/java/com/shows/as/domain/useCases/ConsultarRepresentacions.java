package com.shows.as.domain.useCases;

import com.shows.as.domain.classes.Espectacle;
import com.shows.as.domain.classes.Representacio;
import com.shows.as.domain.controllers.CtrlEspectacle;
import com.shows.as.domain.factories.FactoriaCtrl;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class ConsultarRepresentacions {

    public Set<String> consultaEspectacles() {
        FactoriaCtrl factoriaCtrl = FactoriaCtrl.getInstance();
        CtrlEspectacle ctrlEspectacle = factoriaCtrl.getCtrlEspectacle();
        Set<Espectacle> espectacles = ctrlEspectacle.getAll();
        if(espectacles.size() == 0)throw new IllegalStateException("No hi ha espectacles");
        Set<String> result = new LinkedHashSet<String>();
        for(Espectacle e : espectacles){
            result.add(e.getTitol());
        }
        return result;
    }

    //todo revisar pq segons esquema retorna set de tuples
    public Set<Representacio> consultaRepresentacions(String titol, Date data) {
        FactoriaCtrl factoriaCtrl = FactoriaCtrl.getInstance();
        CtrlEspectacle ctrlEspectacle = factoriaCtrl.getCtrlEspectacle();
        Espectacle espectacle = ctrlEspectacle.getEspectacle(titol);
        Set<Representacio> result = new LinkedHashSet<Representacio>();
        result = espectacle.obteRepresentacions(data);
        return result;
    }
}
