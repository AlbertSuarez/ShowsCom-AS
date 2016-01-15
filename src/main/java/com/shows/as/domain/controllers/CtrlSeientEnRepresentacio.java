package com.shows.as.domain.controllers;

import com.shows.as.domain.classes.Seientenrepresentació;
import com.shows.as.domain.enums.TipusSessio;

import java.util.Set;
/*
Implementació de la classe CtrlSeientEnRepresentacio del paquet domain.controllers
 */
//Entitat que reprenta un controlador de la classe SeientEnRepresentació
public interface CtrlSeientEnRepresentacio {

    Set<Seientenrepresentació> getAll();

    Seientenrepresentació getSeientEnRepresentacio(String nomLocal, String sessio, Integer fila, Integer columna);

}
