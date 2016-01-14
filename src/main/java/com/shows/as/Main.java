package com.shows.as;

import com.shows.as.presentation.controllers.ComprarEntradesController;


public class Main {

    public static void main(String[] args) {
        carregaBaseDadesCas1();
        ComprarEntradesController comprarEntradesController = new ComprarEntradesController();
        comprarEntradesController.run();
    }

    private static void carregaBaseDadesCas1() {

        /*HibernateUtils.save(new Espectacle("Cats", 10));
        HibernateUtils.save(new Espectacle("El Rey Leon", 20));
        HibernateUtils.save(new Espectacle("La Sirenita", 20));
        HibernateUtils.save(new Espectacle("Frozen", 20));
        HibernateUtils.save(new Espectacle("La Cantina", 20));
        HibernateUtils.save(new Sessió(TipusSessio.mati.toString()));
        HibernateUtils.save(new Sessió(TipusSessio.tarda.toString()));
        HibernateUtils.save(new Sessió(TipusSessio.nit.toString()));
        HibernateUtils.save(new Local("Cyrano", "Aribau 21"));
        HibernateUtils.save(new Local("Bling Bling", "Tusset 49"));
        HibernateUtils.save(new Local("Apolo", "Paralel 845"));
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                HibernateUtils.save(new Seient(i, j, "Cyrano"));
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                HibernateUtils.save(new Seient(i, j, "Bling Bling"));
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                HibernateUtils.save(new Seient(i, j, "Apolo"));
            }
        }
        HibernateUtils.save(new Representació(50.0, Utils.createDate(14, 1, 2016), 32, "mati", "Cyrano", "Cats"));
        HibernateUtils.save(new Representació(60.0, Utils.createDate(14, 1, 2016), 32, "nit", "Cyrano", "El Rey Leon"));
        HibernateUtils.save(new Representació(70.0, Utils.createDate(15, 1, 2016), 32, "tarda", "Cyrano", "Frozen"));
        HibernateUtils.save(new Representació(40.0, Utils.createDate(14, 1, 2016), 32, "mati", "Bling Bling", "Cats"));
        HibernateUtils.save(new Representació(30.0, Utils.createDate(14, 1, 2016), 32, "nit", "Bling Bling", "La Cantina"));
        HibernateUtils.save(new Representació(20.0, Utils.createDate(15, 1, 2016), 32, "tarda", "Bling Bling", "Frozen"));
        HibernateUtils.save(new Representació(10.0, Utils.createDate(14, 1, 2016), 32, "mati", "Apolo", "Cats"));
        HibernateUtils.save(new Representació(70.0, Utils.createDate(14, 1, 2016), 32, "nit", "Apolo", "El Rey Leon"));
        HibernateUtils.save(new Representació(50.0, Utils.createDate(15, 1, 2016), 32, "tarda", "Apolo", "La Sirenita"));

        HibernateUtils.save(new Estrena(60.0, Utils.createDate(14, 1, 2016), 32, "nit", "Cyrano", "El Rey Leon",1));
        HibernateUtils.save(new Estrena(70.0, Utils.createDate(14, 1, 2016), 32, "nit", "Apolo", "El Rey Leon",1));
        HibernateUtils.save(new Estrena(30.0, Utils.createDate(14, 1, 2016), 32, "nit", "Bling Bling", "La Cantina",1));


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Cyrano","mati",null));
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Cyrano","tarda",null));
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Cyrano","nit",null));
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Apolo","nit",null));
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Apolo","tarda",null));
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Apolo","mati",null));
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Bling Bling","nit",null));
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Bling Bling","mati",null));
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Bling Bling","tarda",null));
            }
        }*/
    }
}
