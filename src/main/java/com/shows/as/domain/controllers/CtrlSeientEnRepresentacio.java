package com.shows.as.domain.controllers;

import com.shows.as.domain.classes.SeientEnRepresentacio;
import com.shows.as.domain.enums.TipusSessio;

import java.util.Set;

public interface CtrlSeientEnRepresentacio {

    Set<SeientEnRepresentacio> getAll();

    SeientEnRepresentacio getSeientEnRepresentacio(String nomLocal, TipusSessio sessio, Integer fila, Integer columna);

}
