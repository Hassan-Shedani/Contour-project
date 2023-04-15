package com.example.seedsReport.model;

import com.example.seedsReport.entity.Season;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SeasonModel
{

    private Long id;
    private String name;

 public Season dissamble(){
     Season season=new Season();
     season.setId(this.id);
     season.setName(this.name);
     return  season;
 }
 public SeasonModel(Season season){
     this.setId(season.getId());
     this.setName(season.getName());
 }
}
