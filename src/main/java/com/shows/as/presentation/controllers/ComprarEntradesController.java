package com.shows.as.presentation.controllers;

import com.shows.as.domain.classes.Seient;
import com.shows.as.domain.enums.Moneda;
import com.shows.as.domain.enums.TipusSessio;
import com.shows.as.domain.useCaseControllers.ComprarEntradesUseCaseController;
import com.shows.as.presentation.views.*;

import java.sql.Date;
import java.util.Set;

public class ComprarEntradesController {

    private ComprarEntradesUseCaseController domainController;
    private IniView iniView;
    private ComprarEntradesView comprarEntradesView;
    private SeientsView seientsView;
    private PagamentView pagamentView;
    private ErrorView errorView;

    public ComprarEntradesController() {
        domainController = new ComprarEntradesUseCaseController();
        iniView = new IniView(this);
        comprarEntradesView = new ComprarEntradesView(this);
        seientsView = new SeientsView();
        pagamentView = new PagamentView();
        errorView = new ErrorView();
    }

    public void run() {
        iniView.setVisible(true);
        comprarEntradesView.setVisible(false);
        seientsView.setVisible(false);
        pagamentView.setVisible(false);
        errorView.setVisible(false);

        prConsultaEspectacles();
    }

    public void prConsultaEspectacles() {
        iniView.setVisible(false);
        //comprarEntradesView.mostraEspectacles(domainController.obteEspectacles());
        comprarEntradesView.setVisible(true);
    }

    public void prOkConsultaRepresentacions(String titol, Date data) {
        comprarEntradesView.mostraRepresentacions(domainController.obteRepresentacions(titol, data));

    }

    public void prOkConsultaOcupacio(String nomLocal, TipusSessio sessio, Integer nombEspectadors) {

    }

    public void prOkSeleccionarSeients(Set<Seient> seients) {
        comprarEntradesView.setVisible(false);
        seientsView.setVisible(true);
    }

    public void prCanviMoneda(Moneda moneda) {

    }

    public void prOkPagament(String dni, Integer codiB, String numCompte) {

    }

    public void prAcabar() {
        System.exit(0);
    }

    public void prCancel() {
        System.exit(0);
    }

}
