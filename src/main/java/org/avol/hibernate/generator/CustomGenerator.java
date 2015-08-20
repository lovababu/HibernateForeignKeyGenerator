package org.avol.hibernate.generator;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;

/**
 * Created by Durga on 8/19/2015.
 */
public class CustomGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
        Random random = new Random();
        int id = random.nextInt(99999);
        System.out.println("CustomGenerator.generated Id is : " + id);
        return id;
    }
}
