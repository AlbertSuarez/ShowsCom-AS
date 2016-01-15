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
        comprarEntradesView.setVisible(true);
        seientsView.setVisible(false);
        pagamentView.setVisible(false);
        errorView.setVisible(false);
    }

    public void prConsultaEspectacles() {
        comprarEntradesView.mostraEspectacles(domainController.obteEspectacles());
        iniView.setVisible(false);
        //comprarEntradesView.setVisible(true);
    }

    public void prOkConsultaRepresentacions(String titol, Date data) {
        try {
            comprarEntradesView.mostraRepresentacions(domainController.obteRepresentacions(titol, data));
        }
        catch (Exception e) {
            prMostraMissatgeError("<html>No hi ha cap representació per<br>l'espectacle i data seleccionats.</html>");
            comprarEntradesView.amaga();
        }
    }

    public void prOkConsultaOcupacio(String nomLocal, String s, Integer nombEspectadors) {
        //comprarEntradesView.mostraSeients(domainController.obteOcupacio(nomLocal, sessio, nombEspectadors));
    }

    public void prOkSeleccionarSeients(Set<Seient> seients) {
        comprarEntradesView.setVisible(false);
        seientsView.setVisible(true);
    }

    public void prCanviMoneda(Moneda moneda) {
        //pagamentView.mostraPreu(domainController.obtePreuMoneda(moneda));
    }

    public void prOkPagament(String dni, Integer codiB, String numCompte) {
        
    }

    public void prMostraMissatgeError(String text) {
        errorView.mostraMissatgeError(text);
        errorView.setVisible(true);
    }

    public void prAcabar() {
        System.exit(0);
    }

    public void prCancel() {
        System.exit(0);
    }
}
