package com.shows.as.persistence;

import com.shows.as.domain.classes.Espectacle;
import com.shows.as.domain.classes.Representació;
import com.shows.as.domain.controllers.CtrlRepresentacio;
import com.shows.as.domain.enums.TipusSessio;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Set;

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

        Representació res = (Representació) session.get(Representació.class, Representació.hashCode(nomLocal, sessio));
        session.close();
        if (res == null)
            throw new IllegalStateException("representacioNoExisteix");
        return res;
    }
}
