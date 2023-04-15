package com.example.seedsReport.service;

import com.example.seedsReport.entity.Season;
import com.example.seedsReport.entity.Seed;
import com.example.seedsReport.model.AdvisoryModel;
import com.example.seedsReport.model.SeedModel;
import com.example.seedsReport.repository.SeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeedService {
    @Autowired
    SeedRepository seedRepository;
    public SeedModel saveSeed(SeedModel seedModel){
        return new SeedModel(seedRepository.save(seedModel.dissamble()));
    }
    public String advisorySeed(AdvisoryModel advisoryModel){
        Seed seed=seedRepository.findSeedBySoilPhAndSoilNutrientLevelAndWaterPhAndWaterNutrientLevelAndCrop_Name(advisoryModel.getSoilPh(),advisoryModel.getSoilNutrientLevel(),advisoryModel.getWaterPh(),advisoryModel.getWaterNutrientLevel(),advisoryModel.getCropName());
        if(seed!=null){
            return "Recommended Seed: "+seed.getSeedName();
        }
        else{
            return "No seed found correspond your input";
        }
    }
}
