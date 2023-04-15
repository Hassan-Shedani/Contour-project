package com.example.seedsReport.model;

import com.example.seedsReport.entity.Crop;
import com.example.seedsReport.entity.Seed;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SeedModel
{
    private Long seedId;

    private String seedName;

    private double soilPh;
    private double soilNutrientLevel;

    private double waterNutrientLevel;

    private double waterPh;

    private CropModel cropModel;
    public SeedModel(Seed seed){
        this.setSeedName(seed.getSeedName());
        this.setSeedId(seed.getSeedId());
        this.setSoilPh(seed.getSoilPh());
        this.setWaterPh(seed.getWaterPh());
        this.setWaterNutrientLevel(seed.getWaterNutrientLevel());
        this.setSoilNutrientLevel(seed.getSoilNutrientLevel());
        this.setCropModel(new CropModel(seed.getCrop()));
    }
    public Seed dissamble(){
        Seed seed=new Seed();
        seed.setSeedId(this.seedId);
        seed.setSeedName(this.seedName);
        seed.setSoilPh(this.soilPh);
        seed.setSoilNutrientLevel(this.soilNutrientLevel);
        seed.setWaterNutrientLevel(this.waterNutrientLevel);
        seed.setWaterPh(this.waterPh);
        seed.setCrop(this.cropModel.dissamble());
        return  seed;
    }
}
