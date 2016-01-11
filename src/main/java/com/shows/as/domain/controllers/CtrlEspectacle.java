package com.shows.as.domain.controllers;

import com.shows.as.domain.classes.Espectacle;

import java.util.Set;

public interface CtrlEspectacle {

    Set<Espectacle> getAll();

    Espectacle getEspectacle(String titol);

}
