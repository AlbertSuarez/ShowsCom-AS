package com.shows.as.domain.adapters;

import java.util.Date;

//interficie de la classe adaptadora del servei de Banc
public interface IBankServiceAdapter {

    Boolean autoritza(String dni, Integer codiB, String numCompte, Double preu, Integer codiBancShows, String numCompteShows, Date dAvui);

}
