package com.shows.as.persistence;

import com.shows.as.domain.classes.Representació;
import com.shows.as.domain.classes.Seientenrepresentació;
import com.shows.as.domain.classes.SeientenrepresentacióPK;
import com.shows.as.domain.controllers.CtrlSeientEnRepresentacio;
import com.shows.as.domain.enums.TipusSessio;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Set;

//Entitat que representa un controlador de la classe SeientenRepresentació de la base de dades
public class CtrlSeientEnRepresentacioDB implements CtrlSeientEnRepresentacio {
    public Set<Seientenrepresentació> getAll() {
        SessionFactory sf = HibernateUtils.getSessionFactory();
        Session session = sf.openSession();

        Set<Seientenrepresentació> res = (Set<Seientenrepresentació>) session.createQuery("from "+ Seientenrepresentació.TAULA).list();
        session.close();
        return res;
    }

    public Seientenrepresentació getSeientEnRepresentacio(String nomLocal, String sessio, Integer fila, Integer columna) {
        SessionFactory sf = HibernateUtils.getSessionFactory();
        Session session = sf.openSession();

        Seientenrepresentació res = (Seientenrepresentació) session.get(Seientenrepresentació.class, new SeientenrepresentacióPK(fila, columna, nomLocal, sessio));
        session.close();
        if (res == null)
            throw new IllegalStateException("seientenrepresentacioNoExisteix");
        return res;
    }
}
