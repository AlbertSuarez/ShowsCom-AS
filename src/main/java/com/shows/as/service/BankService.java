package com.shows.as.service;

import com.shows.as.domain.utils.Utils;

import java.util.Date;

public class BankService {

    public Boolean autoritza(String dni, Integer codiB, String numCompte, Double preu, Integer codiBancShows, String numCompteShows, Date dAvui){
        return (Utils.randomInt() % 4 != 0);
    }
}
