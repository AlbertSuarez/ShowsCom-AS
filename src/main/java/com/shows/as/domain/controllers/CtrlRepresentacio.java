package com.shows.as.domain.controllers;

import com.shows.as.domain.classes.Representacio;
import com.shows.as.domain.enums.TipusSessio;

import java.util.Set;

public interface CtrlRepresentacio {

    Set<Representacio> getAll();

    Representacio getRepresentacio(String nomLocal, TipusSessio sessio);

}
