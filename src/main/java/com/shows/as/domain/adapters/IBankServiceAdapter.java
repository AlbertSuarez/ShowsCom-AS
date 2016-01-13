package com.shows.as.domain.adapters;

import java.util.Date;

public interface IBankServiceAdapter {

    Boolean autoritza(String dni, Integer codiB, String numCompte, Double preu, Integer codiBancShows, String numCompteShows, Date dAvui);

}
