package com.shows.as.persistence;

import com.shows.as.domain.classes.Espectacle;
import com.shows.as.domain.classes.Representació;
import com.shows.as.domain.classes.RepresentacióPK;
import com.shows.as.domain.controllers.CtrlRepresentacio;
import com.shows.as.domain.enums.TipusSessio;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Set;
//Entitat que representa un controlador de la classe Representació a la base de dades
public class CtrlRepresentacioDB implements CtrlRepresentacio {
    public Set<Representació> getAll() {
        SessionFactory sf = HibernateUtils.getSessionFactory();
        Session session = sf.openSession();

        Set<Representació> res = (Set<Representació>) session.createQuery("from "+ Representació.TAULA).list();
        session.close();
        return res;
    }

    public Representació getRepresentacio(String nomLocal, String sessio) {
        SessionFactory sf = HibernateUtils.getSessionFactory();
        Session session = sf.openSession();

        Representació res = (Representació) session.get(Representació.class, new RepresentacióPK(nomLocal, sessio));
        session.close();
        if (res == null)
            throw new IllegalStateException("representacioNoExisteix");
        return res;
    }

    public List<Representació> getRepresentacioTitol(String titol){
        SessionFactory sf = HibernateUtils.getSessionFactory();
        Session session = sf.openSession();

        List<Representació> res = (List<Representació>) session.createQuery("from "+ Representació.TAULA+" where títolesp = "+titol).list();
        session.close();
        if (res == null)
            throw new IllegalStateException("representacioNoExisteix");
        return res;
    }


}
