package com.example.seedsReport.model;

import com.example.seedsReport.entity.Crop;
import com.example.seedsReport.entity.Season;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CropModel {
    private Long id;
    private String name;
    private String type;
    private SeasonModel seasonModel;

    public CropModel(Crop crop){
        this.setId(crop.getId());
        this.setName(crop.getName());
        this.setType(crop.getType());
        this.setSeasonModel(new SeasonModel(crop.getSeason()));
    }

    public Crop dissamble(){
        Crop crop=new Crop();
        crop.setId(this.id);
        crop.setType(this.type);
        crop.setName(this.name);
        crop.setSeason(this.seasonModel.dissamble());
        return crop;
    }
}
