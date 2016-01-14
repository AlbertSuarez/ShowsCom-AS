package com.shows.as.domain.controllers;

import com.shows.as.domain.classes.Espectacle;

import java.util.List;
import java.util.Set;

public interface CtrlEspectacle {

    List<Espectacle> getAll();

    Espectacle getEspectacle(String titol);

}
