package org.avol.hibernate.test;

import org.avol.hibernate.config.AppConfig;
import org.avol.hibernate.entities.DrugDiseaseMapEntity;
import org.avol.hibernate.entities.DrugEntity;
import org.avol.hibernate.service.DrugService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.Serializable;

/**
 * Created by Durga on 8/19/2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class DrugTest {

    @Autowired
    private DrugService drugService;

    @Test
    public void testSave(){
        //Saving drug and drug_disease info.
        Serializable id = drugService.save(drugEntity());
        System.out.println("Drug Inserted: " + id);

        //get drug by id.
        DrugEntity drugEntity = drugService.get((Integer)id);
        System.out.println("++++++++++ Drug Info ++++++++++");
        System.out.println("DrugId   : " + drugEntity.getId());
        System.out.println("DrugName : " + drugEntity.getName());
        System.out.println("DrugPrice: " + drugEntity.getPrice());
        System.out.println("DiseaseId: " + drugEntity.getDrugDiseaseMapEntity().getDiseaseId());
    }

    private DrugEntity drugEntity(){
        DrugEntity drugEntity = new DrugEntity();
        drugEntity.setName("Crocin");
        drugEntity.setPrice(2.5);

        DrugDiseaseMapEntity drugDiseaseMapEntity = new DrugDiseaseMapEntity();
        drugDiseaseMapEntity.setDiseaseId(123);
        drugDiseaseMapEntity.setDrugEntity(drugEntity); //to establish one-to-one.

        drugEntity.setDrugDiseaseMapEntity(drugDiseaseMapEntity);
        return drugEntity;
    }
}
