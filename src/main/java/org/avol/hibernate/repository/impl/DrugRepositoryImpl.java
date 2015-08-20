package org.avol.hibernate.repository.impl;

import org.avol.hibernate.entities.DrugEntity;
import org.avol.hibernate.repository.DrugRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Durga on 8/19/2015.
 */
@Repository
public class DrugRepositoryImpl implements DrugRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public DrugRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Serializable save(DrugEntity drugEntity) {
        return sessionFactory.getCurrentSession().save(drugEntity);
    }

    @Override
    public DrugEntity get(int drugId) {
        return (DrugEntity) sessionFactory.getCurrentSession().get(DrugEntity.class, drugId);
    }
}
