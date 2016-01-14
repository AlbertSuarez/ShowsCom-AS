package com.shows.as.domain.controllers;

import com.shows.as.domain.classes.Seientenrepresentació;
import com.shows.as.domain.enums.TipusSessio;

import java.util.Set;

public interface CtrlSeientEnRepresentacio {

    Set<Seientenrepresentació> getAll();

    Seientenrepresentació getSeientEnRepresentacio(String nomLocal, String sessio, Integer fila, Integer columna);

}
