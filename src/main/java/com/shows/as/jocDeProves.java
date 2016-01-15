//Obres de Teatre (shows)
    HibernateUtils.save(new Espectacle("La Gran Ilusión", 7));
    HibernateUtils.save(new Espectacle("El Rey León", 25));
    HibernateUtils.save(new Espectacle("BITS - Tricicle", 3));
    HibernateUtils.save(new Espectacle("Berto Romero", 1));
    HibernateUtils.save(new Espectacle("Mr Snow", 1));
    HibernateUtils.save(new Espectacle("Patufet - El Musical", 1));
    HibernateUtils.save(new Espectacle("The Hole", 3));

//Sessions
    HibernateUtils.save(new Sessió(TipusSessio.mati.toString()));
    HibernateUtils.save(new Sessió(TipusSessio.tarda.toString()));
    HibernateUtils.save(new Sessió(TipusSessio.nit.toString()));

//Teatres
    HibernateUtils.save(new Local("Alexandre", "Rambla Catalunya 90"));
    HibernateUtils.save(new Local("Capitol", "Les Rambles 138"));
    HibernateUtils.save(new Local("Victòria", "Av. Paral·lel 67"));
    HibernateUtils.save(new Local("Coliseum", "Gran Via de les Corts Catalanes 595"));
    HibernateUtils.save(new Local("Borràs", "Pl. Urquinaona 9"));
    HibernateUtils.save(new Local("TNC", "Pl. de les Arts 1"));

//Crear Seients Teatres
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 8; j++) {
            HibernateUtils.save(new Seient(i, j, "Alexandre"));
        }
    }
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 8; j++) {
            HibernateUtils.save(new Seient(i, j, "Capitol"));
        }
    }
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 8; j++) {
            HibernateUtils.save(new Seient(i, j, "Victòria"));
        }
    }
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 8; j++) {
            HibernateUtils.save(new Seient(i, j, "Coliseum"));
        }
    }
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 8; j++) {
            HibernateUtils.save(new Seient(i, j, "Borràs"));
        }
    }
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 8; j++) {
            HibernateUtils.save(new Seient(i, j, "TNC"));
        }
    }

//La Gran Ilusión - Borràs
    HibernateUtils.save(new Representació(30.0, Utils.createDate(15, 1, 2016), 32, "mati", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(15, 1, 2016), 32, "tarda", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(15, 1, 2016), 32, "nit", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(16, 1, 2016), 32, "mati", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(16, 1, 2016), 32, "tarda", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(16, 1, 2016), 32, "nit", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(17, 1, 2016), 32, "mati", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(17, 1, 2016), 32, "tarda", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(17, 1, 2016), 32, "nit", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(18, 1, 2016), 32, "mati", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(18, 1, 2016), 32, "tarda", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(18, 1, 2016), 32, "nit", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(19, 1, 2016), 32, "mati", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(19, 1, 2016), 32, "tarda", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(19, 1, 2016), 32, "nit", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(15.0, Utils.createDate(20, 1, 2016), 32, "mati", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(15.0, Utils.createDate(20, 1, 2016), 32, "tarda", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(15.0, Utils.createDate(20, 1, 2016), 32, "nit", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(21, 1, 2016), 32, "mati", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(21, 1, 2016), 32, "tarda", "Borràs", "La Gran Ilusión"));
    HibernateUtils.save(new Representació(30.0, Utils.createDate(21, 1, 2016), 32, "nit", "Borràs", "La Gran Ilusión"));

//Mr Snow - Alexandre
    HibernateUtils.save(new Representació(8.0, Utils.createDate(15, 1, 2016), 32, "mati", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(15, 1, 2016), 32, "tarda", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(15, 1, 2016), 32, "nit", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(8.0, Utils.createDate(16, 1, 2016), 32, "mati", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(16, 1, 2016), 32, "tarda", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(16, 1, 2016), 32, "nit", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(8.0, Utils.createDate(17, 1, 2016), 32, "mati", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(17, 1, 2016), 32, "tarda", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(17, 1, 2016), 32, "nit", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(8.0, Utils.createDate(18, 1, 2016), 32, "mati", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(18, 1, 2016), 32, "tarda", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(18, 1, 2016), 32, "nit", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(8.0, Utils.createDate(19, 1, 2016), 32, "mati", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(19, 1, 2016), 32, "tarda", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(19, 1, 2016), 32, "nit", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(8.0, Utils.createDate(20, 1, 2016), 32, "mati", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(8.0, Utils.createDate(20, 1, 2016), 32, "tarda", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(8.0, Utils.createDate(20, 1, 2016), 32, "nit", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(8.0, Utils.createDate(21, 1, 2016), 32, "mati", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(21, 1, 2016), 32, "tarda", "Alexandre", "Mr Snow"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(21, 1, 2016), 32, "nit", "Alexandre", "Mr Snow"));

// Teatre Coliseum - Variat
    HibernateUtils.save(new Representació(12.0, Utils.createDate(15, 1, 2016), 32, "mati", "Coliseum", "Patufet - El Musical"));
    HibernateUtils.save(new Representació(12.0, Utils.createDate(18, 1, 2016), 32, "mati", "Coliseum", "Patufet - El Musical"));
    HibernateUtils.save(new Representació(12.0, Utils.createDate(19, 1, 2016), 32, "mati", "Coliseum", "Patufet - El Musical"));
    HibernateUtils.save(new Representació(12.0, Utils.createDate(20, 1, 2016), 32, "mati", "Coliseum", "Patufet - El Musical"));
    HibernateUtils.save(new Representació(12.0, Utils.createDate(21, 1, 2016), 32, "mati", "Coliseum", "Patufet - El Musical"));
    HibernateUtils.save(new Representació(12.0, Utils.createDate(22, 1, 2016), 32, "mati", "Coliseum", "Patufet - El Musical"));
    HibernateUtils.save(new Representació(12.0, Utils.createDate(25, 1, 2016), 32, "mati", "Coliseum", "Patufet - El Musical"));
    HibernateUtils.save(new Representació(12.0, Utils.createDate(26, 1, 2016), 32, "mati", "Coliseum", "Patufet - El Musical"));

    HibernateUtils.save(new Representació(22.0, Utils.createDate(15, 1, 2016), 32, "nit", "Coliseum", "The Hole"));
    HibernateUtils.save(new Representació(22.0, Utils.createDate(16, 1, 2016), 32, "nit", "Coliseum", "The Hole"));
    HibernateUtils.save(new Representació(22.0, Utils.createDate(17, 1, 2016), 32, "nit", "Coliseum", "The Hole"));
    HibernateUtils.save(new Representació(22.0, Utils.createDate(18, 1, 2016), 32, "nit", "Coliseum", "The Hole"));
    HibernateUtils.save(new Representació(22.0, Utils.createDate(19, 1, 2016), 32, "nit", "Coliseum", "The Hole"));
    HibernateUtils.save(new Representació(22.0, Utils.createDate(20, 1, 2016), 32, "nit", "Coliseum", "The Hole"));
    HibernateUtils.save(new Representació(22.0, Utils.createDate(21, 1, 2016), 32, "nit", "Coliseum", "The Hole"));
    HibernateUtils.save(new Representació(22.0, Utils.createDate(22, 1, 2016), 32, "nit", "Coliseum", "The Hole"));
    HibernateUtils.save(new Representació(22.0, Utils.createDate(23, 1, 2016), 32, "nit", "Coliseum", "The Hole"));
    HibernateUtils.save(new Representació(22.0, Utils.createDate(24, 1, 2016), 32, "nit", "Coliseum", "The Hole"));
    HibernateUtils.save(new Representació(22.0, Utils.createDate(25, 1, 2016), 32, "nit", "Coliseum", "The Hole"));
    HibernateUtils.save(new Representació(22.0, Utils.createDate(26, 1, 2016), 32, "nit", "Coliseum", "The Hole"));

// El Rey Leon - Capitol
    HibernateUtils.save(new Representació(58.0, Utils.createDate(15, 1, 2016), 32, "mati", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(46.0, Utils.createDate(15, 1, 2016), 32, "tarda", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(46.0, Utils.createDate(15, 1, 2016), 32, "nit", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(58.0, Utils.createDate(16, 1, 2016), 32, "mati", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(46.0, Utils.createDate(16, 1, 2016), 32, "tarda", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(46.0, Utils.createDate(16, 1, 2016), 32, "nit", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(58.0, Utils.createDate(17, 1, 2016), 32, "mati", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(46.0, Utils.createDate(17, 1, 2016), 32, "tarda", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(46.0, Utils.createDate(17, 1, 2016), 32, "nit", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(58.0, Utils.createDate(18, 1, 2016), 32, "mati", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(46.0, Utils.createDate(18, 1, 2016), 32, "tarda", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(46.0, Utils.createDate(18, 1, 2016), 32, "nit", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(58.0, Utils.createDate(19, 1, 2016), 32, "mati", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(46.0, Utils.createDate(19, 1, 2016), 32, "tarda", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(46.0, Utils.createDate(19, 1, 2016), 32, "nit", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(58.0, Utils.createDate(20, 1, 2016), 32, "mati", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(58.0, Utils.createDate(20, 1, 2016), 32, "tarda", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(58.0, Utils.createDate(20, 1, 2016), 32, "nit", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(58.0, Utils.createDate(21, 1, 2016), 32, "mati", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(46.0, Utils.createDate(21, 1, 2016), 32, "tarda", "Capitol", "El Rey León"));
    HibernateUtils.save(new Representació(46.0, Utils.createDate(21, 1, 2016), 32, "nit", "Capitol", "El Rey León"));

// Berto Romero - Victòria
    HibernateUtils.save(new Representació(16.0, Utils.createDate(15, 1, 2016), 32, "tarda", "Victòria", "Berto Romero"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(15, 1, 2016), 32, "nit", "Victòria", "Berto Romero"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(16, 1, 2016), 32, "tarda", "Victòria", "Berto Romero"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(16, 1, 2016), 32, "nit", "Victòria", "Berto Romero"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(17, 1, 2016), 32, "tarda", "Victòria", "Berto Romero"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(17, 1, 2016), 32, "nit", "Victòria", "Berto Romero"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(18, 1, 2016), 32, "tarda", "Victòria", "Berto Romero"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(18, 1, 2016), 32, "nit", "Victòria", "Berto Romero"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(19, 1, 2016), 32, "tarda", "Victòria", "Berto Romero"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(19, 1, 2016), 32, "nit", "Victòria", "Berto Romero"));
    HibernateUtils.save(new Representació(13.0, Utils.createDate(20, 1, 2016), 32, "tarda", "Victòria", "Berto Romero"));
    HibernateUtils.save(new Representació(13.0, Utils.createDate(20, 1, 2016), 32, "nit", "Victòria", "Berto Romero"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(21, 1, 2016), 32, "tarda", "Victòria", "Berto Romero"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(21, 1, 2016), 32, "nit", "Victòria", "Berto Romero"));

// BITS - Tricicle - TNC
    HibernateUtils.save(new Representació(26.0, Utils.createDate(15, 1, 2016), 32, "tarda", "TNC", "BITS - Tricicle"));
    HibernateUtils.save(new Representació(26.0, Utils.createDate(15, 1, 2016), 32, "nit", "TNC", "BITS - Tricicle"));
    HibernateUtils.save(new Representació(26.0, Utils.createDate(16, 1, 2016), 32, "tarda", "TNC", "BITS - Tricicle"));
    HibernateUtils.save(new Representació(26.0, Utils.createDate(16, 1, 2016), 32, "nit", "TNC", "BITS - Tricicle"));
    HibernateUtils.save(new Representació(26.0, Utils.createDate(17, 1, 2016), 32, "tarda", "TNC", "BITS - Tricicle"));
    HibernateUtils.save(new Representació(26.0, Utils.createDate(17, 1, 2016), 32, "nit", "TNC", "BITS - Tricicle"));
    HibernateUtils.save(new Representació(26.0, Utils.createDate(18, 1, 2016), 32, "tarda", "TNC", "BITS - Tricicle"));
    HibernateUtils.save(new Representació(26.0, Utils.createDate(18, 1, 2016), 32, "nit", "TNC", "BITS - Tricicle"));
    HibernateUtils.save(new Representació(26.0, Utils.createDate(19, 1, 2016), 32, "tarda", "TNC", "BITS - Tricicle"));
    HibernateUtils.save(new Representació(26.0, Utils.createDate(19, 1, 2016), 32, "nit", "TNC", "BITS - Tricicle"));
    HibernateUtils.save(new Representació(18.0, Utils.createDate(20, 1, 2016), 32, "tarda", "TNC", "BITS - Tricicle"));
    HibernateUtils.save(new Representació(18.0, Utils.createDate(20, 1, 2016), 32, "nit", "TNC", "BITS - Tricicle"));
    HibernateUtils.save(new Representació(16.0, Utils.createDate(21, 1, 2016), 32, "tarda", "TNC", "BITS - Tricicle"));
    HibernateUtils.save(new Representació(26.0, Utils.createDate(21, 1, 2016), 32, "nit", "TNC", "BITS - Tricicle"));

//Ocupació Seients

    //La Gran Ilusión - Borràs
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 8; j++) {
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Borràs","mati",null));
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Borràs","tarda",null));
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Borràs","nit",null));
        }
    }
    //Mr Snow - Alexandre
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 8; j++) {
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Alexandre","mati",null));
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Alexandre","tarda",null));
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Alexandre","nit",null));
        }
    }

    // Teatre Coliseum - Variat
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 8; j++) {
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Coliseum","mati",null));
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Coliseum","tarda",null));
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Coliseum","nit",null));
        }
    }

    // El Rey Leon - Capitol
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 8; j++) {
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Capitol","mati",null));
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Capitol","tarda",null));
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Capitol","nit",null));
        }
    }

    // Berto Romero - Victòria
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 8; j++) {
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Victòria","mati",null));
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Victòria","tarda",null));
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "Victòria","nit",null));
        }
    }

    // BITS - Tricicle - TNC
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 8; j++) {
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "TNC","mati",null));
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "TNC","tarda",null));
            HibernateUtils.save(new Seientenrepresentació("lliure",i, j, "TNC","nit",null));
        }
    }

//Afegir seients ocupats

    //Alexandre
    HibernateUtils.save(new Seientenrepresentació("ocupat",1, 3, "Alexandre","mati",null));
    HibernateUtils.save(new Seientenrepresentació("ocupat",1, 4, "Alexandre","mati",null));
    HibernateUtils.save(new Seientenrepresentació("ocupat",1, 5, "Alexandre","mati",null));

    HibernateUtils.save(new Seientenrepresentació("ocupat",2, 3, "Alexandre","nit",null));
    HibernateUtils.save(new Seientenrepresentació("ocupat",2, 4, "Alexandre","nit",null));
    HibernateUtils.save(new Seientenrepresentació("ocupat",2, 5, "Alexandre","nit",null));
    HibernateUtils.save(new Seientenrepresentació("ocupat",2, 6, "Alexandre","nit",null));

    //TNC
    HibernateUtils.save(new Seientenrepresentació("ocupat",1, 1, "TNC","tarda",null));
    HibernateUtils.save(new Seientenrepresentació("ocupat",1, 2, "TNC","tarda",null));

//Afegir Estrenes
    HibernateUtils.save(new Estrena(3, mati, "TNC"));
    HibernateUtils.save(new Estrena(3, tarda, "TNC"));

    HibernateUtils.save(new Estrena(2, mati, "Capitol"));

    HibernateUtils.save(new Estrena(1, nit, "Alexandre"));
    HibernateUtils.save(new Estrena(1, tarda, "Alexandre"));

//Afegir Entrades
    HibernateUtils.save(new Estrena("IDAL3150116", "41234567T", 3, Utils.createDate(15, 1, 2016), 24.0, mati, "Alexandre"));
    HibernateUtils.save(new Estrena("IDTNC2170116", "41234568B", 2, Utils.createDate(17, 1, 2016), 52.0, tarda, "TNC"));
    HibernateUtils.save(new Estrena("IDAL4190116", "41234569N", 4, Utils.createDate(19, 1, 2016), 68.0, nit, "Alexandre"));
