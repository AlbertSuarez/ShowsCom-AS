package com.shows.as.domain.adapters;

import com.shows.as.domain.factories.ServiceLocator;
import com.shows.as.service.BankService;

import java.util.Date;

/*
Classe adaptador del servei de pagament
 */
public class BankServiceAdapter implements IBankServiceAdapter {
    public Boolean autoritza(String dni, Integer codiB, String numCompte, Double preu, Integer codiBancShows, String numCompteShows, Date dAvui){
       ServiceLocator  s = ServiceLocator.getInstance();
        BankService b = s.getBankService();
        return b.autoritza(dni,codiB,numCompte,preu,codiBancShows,numCompteShows,dAvui);
    }

}
