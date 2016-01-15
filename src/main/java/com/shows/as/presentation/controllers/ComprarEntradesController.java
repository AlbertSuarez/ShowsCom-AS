package com.shows.as.presentation.controllers;

import com.shows.as.domain.classes.Seient;
import com.shows.as.domain.enums.Moneda;
import com.shows.as.domain.enums.TipusSessio;
import com.shows.as.domain.useCaseControllers.ComprarEntradesUseCaseController;
import com.shows.as.presentation.views.*;

import java.sql.Date;
import java.util.Set;

//Entitat que representa un controlador de persistencia del cas d'ús ComprarEntrades
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
        seientsView = new SeientsView(this);
        pagamentView = new PagamentView(this);
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

    public void prOkConsultaOcupacio(String nomLocal, String sessio, Integer nombEspectadors) {
        seientsView.mostraSeients(domainController.obteOcupacio(nomLocal, sessio, nombEspectadors));
        seientsView.repInfo(nombEspectadors, nomLocal);
        seientsView.setVisible(true);
    }

    public void prOkSeleccionarSeients(Set<Seient> seients) {
        pagamentView.seientsSeleccionats(domainController.seleccionarSeients(seients));
        pagamentView.setVisible(true);
    }

    public void prCanviMoneda(Moneda moneda) {
        pagamentView.mostraPreu(domainController.obtePreuMoneda(moneda));
    }

    public void prOkPagament(String dni, Integer codiB, String numCompte) {
        try {
            domainController.pagament(dni, codiB, numCompte);
            iniView.setVisible(true);
            pagamentView.dispose();
        }
        catch (Exception e) {
            prMostraMissatgeError("<html>El banc ha refusat<br>el pagament de l'entrada.</html>");
        }
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
