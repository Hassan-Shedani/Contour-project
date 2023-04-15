package com.example.seedsReport.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "seed")
public class Seed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seed_id")
    private Long seedId;
    @Column(name = "seed_name")
    private String seedName;
    @Column(name = "soil_ph")
    private double soilPh;
    @Column(name = "soil_nutrient_level")
    private double soilNutrientLevel;
    @Column(name = "water_nutrient_level")
    private double waterNutrientLevel;
    @Column(name = "water_ph")
    private double waterPh;
    @ManyToOne
    @JoinColumn(name = "crop_id")
    private Crop crop;

}
