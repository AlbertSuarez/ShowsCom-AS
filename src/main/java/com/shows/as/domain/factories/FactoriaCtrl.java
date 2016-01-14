package com.shows.as.domain.factories;

import com.shows.as.domain.controllers.CtrlEspectacle;
import com.shows.as.domain.controllers.CtrlRepresentacio;
import com.shows.as.domain.controllers.CtrlSeientEnRepresentacio;
import com.shows.as.persistence.CtrlEspectacleDB;
import com.shows.as.persistence.CtrlRepresentacioDB;
import com.shows.as.persistence.CtrlSeientEnRepresentacioDB;

/*
Implementació de la classe FactoriaCtrl.
 */
public class FactoriaCtrl {

    private static FactoriaCtrl instance;
    private CtrlEspectacle ctrlEspectacle;
    private CtrlRepresentacio ctrlRepresentacio;
    private CtrlSeientEnRepresentacio ctrlSeientEnRepresentacio;

    public static FactoriaCtrl getInstance() {
        if (instance == null) {
            instance = new FactoriaCtrl();
        }
        return instance;
    }

    private FactoriaCtrl() {

    }

    public CtrlEspectacle getCtrlEspectacle() {
        if (ctrlEspectacle == null) {
            ctrlEspectacle = new CtrlEspectacleDB();
        }
        return ctrlEspectacle;
    }

    public CtrlRepresentacio getCtrlRepresentacio() {
        if (ctrlRepresentacio == null) {
            ctrlRepresentacio = new CtrlRepresentacioDB();
        }
        return ctrlRepresentacio;
    }

    public CtrlSeientEnRepresentacio getCtrlSeientEnRepresentacio() {
        if (ctrlSeientEnRepresentacio == null) {
            ctrlSeientEnRepresentacio = new CtrlSeientEnRepresentacioDB();
        }
        return ctrlSeientEnRepresentacio;
    }

}
