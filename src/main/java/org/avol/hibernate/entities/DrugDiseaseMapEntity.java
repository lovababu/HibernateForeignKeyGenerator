package org.avol.hibernate.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by Durga on 8/19/2015.
 */

@Entity
@Table(name = "DRUG_DISEASE")
@Setter @Getter  //This adds setters/getters to to the .class at compile time.
public class DrugDiseaseMapEntity {

    @Id
    @Column(name = "DRUG_ID", unique = true, nullable = false)
    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @Parameter(name = "property", value = "drugEntity")) //here drugEntity property name of DrugEntity variable.
    @GeneratedValue(generator = "generator")
    private int drugId;

    @Column(name = "DISEASE_ID", nullable = false) //assume diseaseId from another table.
    private long diseaseId;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private DrugEntity drugEntity;
}
