package com.shows.as.domain.classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import java.util.Date;

/**
 * Created by Usuari on 12/01/2016.
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(Local.class);
        config.addAnnotatedClass(Seient.class);
        config.addAnnotatedClass(Espectacle.class);
        config.addAnnotatedClass(Representacio.class);
        config.addAnnotatedClass(SeientEnRepresentacio.class);
        config.addAnnotatedClass(Sessio.class);
        config.addAnnotatedClass(Entrada.class);

        config.configure("hibernate.cfg.xml");

        new SchemaExport(config).create(true, true);

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        Local A = new Local("El Molino", "C/Vila i Vilà, 99"); //crea local
        Espectacle E = new Espectacle("Mar i Cel",50);
        Seient S = new Seient(1,1,A);
        Date data = new Date();
        Entrada entrada = new Entrada("identificador","dniClient", 100, data, (float)5.2);


        session.save(A);
        session.save(E);
        session.save(S);
        session.save(entrada);


        session.getTransaction().commit();
    }
}
