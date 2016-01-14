package com.shows.as.domain.controllers;

import com.shows.as.domain.classes.Representació;
import com.shows.as.domain.enums.TipusSessio;

import java.util.Set;

public interface CtrlRepresentacio {

    Set<Representació> getAll();

    Representació getRepresentacio(String nomLocal, String sessio);

}
