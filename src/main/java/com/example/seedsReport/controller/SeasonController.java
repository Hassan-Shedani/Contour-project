package com.example.seedsReport.controller;

import com.example.seedsReport.model.SeasonModel;
import com.example.seedsReport.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SeasonController {
    @Autowired
    private SeasonService seasonService;
    @PostMapping("/save-season")

    public SeasonModel saveSeason(@RequestBody SeasonModel seasonModel){
        return seasonService.saveSeason(seasonModel);
    }
    @GetMapping("/getSeasons")
    public List<SeasonModel> getSeason(){
        return seasonService.getSeason();
    }
}
