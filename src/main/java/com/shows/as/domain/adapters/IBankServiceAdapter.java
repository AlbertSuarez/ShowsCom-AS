package com.shows.as.domain.adapters;

import java.util.Date;

public interface IBankServiceAdapter {

    Boolean autoritza(Integer dni, Integer codiB, String numCompte, Float preu, Integer codiBancShows, Date dAvui);

}
