package com.example.seedsReport.controller;

import com.example.seedsReport.model.CropModel;
import com.example.seedsReport.model.SeasonModel;
import com.example.seedsReport.service.CropService;
import com.example.seedsReport.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CropController {

    @Autowired
    private CropService cropService;
    @PostMapping("/save-crop")

    public CropModel saveCrop(@RequestBody CropModel cropModel){
        return cropService.saveCrop(cropModel);
    }
    @GetMapping("/get-crop")
    public List<CropModel> getCrop(){
        return cropService.getCrop();
    }


}
