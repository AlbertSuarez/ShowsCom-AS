package com.shows.as.service;

import com.shows.as.domain.utils.Utils;

import java.util.Date;


//Entitat que simula el comportament del servei web de pagament
public class BankService {

    public Boolean autoritza(String dni, Integer codiB, String numCompte, Double preu, Integer codiBancShows, String numCompteShows, Date dAvui){
        return (Utils.randomInt() % 4 != 0);
    }
}
