package com.shows.as.presentation.controllers;

import com.shows.as.domain.classes.Seient;
import com.shows.as.domain.enums.Moneda;
import com.shows.as.domain.enums.TipusSessio;
import com.shows.as.domain.useCaseControllers.ComprarEntradesUseCaseController;
import com.shows.as.presentation.views.IniView;

import java.util.Date;
import java.util.Set;

public class ComprarEntradesController {

    private ComprarEntradesUseCaseController domainController;
    private IniView iniView;

    public ComprarEntradesController() {
        domainController = new ComprarEntradesUseCaseController();
        iniView = new IniView();
    }

    public void prConsultaEspectacles() {

    }

    public void prOkConsultaRepresentacions(String titol, Date data) {

    }

    public void prOkConsultaOcupacio(String nomLocal, TipusSessio sessio, Integer nombEspectadors) {

    }

    public void prOkSeleccionarSeients(Set<Seient> seients) {

    }

    public void prCanviMoneda(Moneda moneda) {

    }

    public void prOkPagament(String dni, Integer codiB, String numCompte) {

    }

    public void prAcabar() {

    }

    public void prCancel() {

    }

}
