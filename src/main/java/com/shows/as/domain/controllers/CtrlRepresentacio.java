package com.shows.as.domain.controllers;

import com.shows.as.domain.classes.Representació;
import com.shows.as.domain.enums.TipusSessio;

import java.util.List;
import java.util.Set;
/*
Implementacio de la classe CtrlSeientEnRepresentacio del paquet domain.controllers
 */
//Entitat que representa un controlador de la classe representació
public interface CtrlRepresentacio {

    Set<Representació> getAll();

    Representació getRepresentacio(String nomLocal, String sessio);

    List<Representació> getRepresentacioTitol(String titol);

}
