package org.avol.hibernate.repository;

import org.avol.hibernate.entities.DrugEntity;

import java.io.Serializable;

/**
 * Created by Durga on 8/19/2015.
 */
public interface DrugRepository {

    Serializable save(DrugEntity drugEntity);

    DrugEntity get(int drugId);
}
