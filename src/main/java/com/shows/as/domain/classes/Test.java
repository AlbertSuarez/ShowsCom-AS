package com.shows.as.domain.classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

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
        config.addAnnotatedClass(Showscom.class);
        config.addAnnotatedClass(Estrena.class);

        config.configure("hibernate.cfg.xml");

        new SchemaExport(config).create(true, true);

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.getCurrentSession();

        session.beginTransaction();


        /*session.save(E);
        session.save(S);
        session.save(entrada);

*/
        session.getTransaction().commit();
    }
}
