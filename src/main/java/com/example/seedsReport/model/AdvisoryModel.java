package com.example.seedsReport.model;

import lombok.Data;

@Data
public class AdvisoryModel {
    private double soilPh;
    private double soilNutrientLevel;
    private double waterNutrientLevel;
    private double waterPh;
    private  String cropName;
}
