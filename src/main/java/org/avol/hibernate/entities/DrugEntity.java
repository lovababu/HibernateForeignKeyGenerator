package org.avol.hibernate.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by Durga on 8/19/2015.
 */

@Entity
@Table(name = "DRUG")
@Setter @Getter  //This adds setters/getters to to the .class at compile time.
public class DrugEntity {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GenericGenerator(name = "generator", strategy = "org.avol.hibernate.generator.CustomGenerator")
    @GeneratedValue(generator = "generator")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private Double price;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "drugEntity", cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "DRUG_ID")
    private DrugDiseaseMapEntity drugDiseaseMapEntity;
}
