package com.shows.as.service;

import com.shows.as.domain.utils.Utils;

import java.util.Date;

/**
 * Created by victor on 12/01/2016.
 */
public class BankService {

    public Boolean autoritza(String dni, Integer codiB, String numCompte, Float preu, Integer codiBancShows, String numCompteShows, Date dAvui){
        int random = Utils.randomInt();
        if (random%4 == 0)return false;
        return true;
    }
}
