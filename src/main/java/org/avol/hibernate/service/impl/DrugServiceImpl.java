package org.avol.hibernate.service.impl;

import org.avol.hibernate.entities.DrugEntity;
import org.avol.hibernate.repository.DrugRepository;
import org.avol.hibernate.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * Created by Durga on 8/19/2015.
 */
@Service
public class DrugServiceImpl implements DrugService {

    @Autowired
    private DrugRepository drugRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Serializable save(DrugEntity drugEntity) {
        return drugRepository.save(drugEntity);
    }

    @Override
    @Transactional(readOnly = true)
    public DrugEntity get(int drugId) {
        return drugRepository.get(drugId);
    }
}
