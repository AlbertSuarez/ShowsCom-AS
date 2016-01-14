package com.shows.as.persistence;

import com.shows.as.domain.classes.Espectacle;
import com.shows.as.domain.controllers.CtrlEspectacle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Set;

public class CtrlEspectacleDB implements CtrlEspectacle {

    public Set<Espectacle> getAll() {
        SessionFactory sf = HibernateUtils.getSessionFactory();
        Session session = sf.openSession();

        Set<Espectacle> res = (Set<Espectacle>) session.createQuery("from "+ Espectacle.TAULA).list();
        session.close();
        return res;
    }

    public Espectacle getEspectacle(String titol) {
        SessionFactory sf = HibernateUtils.getSessionFactory();
        Session session = sf.openSession();

        Espectacle res = (Espectacle) session.get(Espectacle.class, titol);
        session.close();
        if (res == null)
            throw new IllegalStateException("espectacleNoExisteix");
        return res;
    }
}
