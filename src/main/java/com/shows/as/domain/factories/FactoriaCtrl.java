package com.shows.as.domain.factories;

import com.shows.as.domain.controllers.CtrlEspectacle;
import com.shows.as.domain.controllers.CtrlRepresentacio;
import com.shows.as.domain.controllers.CtrlSeientEnRepresentacio;
import com.shows.as.persistence.CtrlEspectacleDB;
import com.shows.as.persistence.CtrlRepresentacioDB;
import com.shows.as.persistence.CtrlSeientEnRepresentacioDB;

public class FactoriaCtrl {

    private static FactoriaCtrl instance = new FactoriaCtrl();
    private CtrlEspectacle ctrlEspectacle;
    private CtrlRepresentacio ctrlRepresentacio;
    private CtrlSeientEnRepresentacio ctrlSeientEnRepresentacio;

    public static FactoriaCtrl getInstance() {
        return instance;
    }

    private FactoriaCtrl() {
        ctrlEspectacle = new CtrlEspectacleDB();
        ctrlRepresentacio = new CtrlRepresentacioDB();
        ctrlSeientEnRepresentacio = new CtrlSeientEnRepresentacioDB();
    }

    public CtrlEspectacle getCtrlEspectacle() {
        return ctrlEspectacle;
    }

    public CtrlRepresentacio getCtrlRepresentacio() {
        return ctrlRepresentacio;
    }

    public CtrlSeientEnRepresentacio getCtrlSeientEnRepresentacio() {
        return ctrlSeientEnRepresentacio;
    }

}
