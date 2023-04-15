package com.example.seedsReport.controller;

import com.example.seedsReport.entity.Seed;
import com.example.seedsReport.model.AdvisoryModel;
import com.example.seedsReport.model.SeedModel;
import com.example.seedsReport.service.SeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.seedsReport.repository.SeedRepository;

@RestController
public class SeedController {
    @Autowired
    SeedService seedService;
    @PostMapping("/save-seed")
    public SeedModel saveSeed(@RequestBody SeedModel seedModel){
        return seedService.saveSeed(seedModel);
    }
    @GetMapping("/advisory-seed")
    public String advisorySeed(@RequestBody AdvisoryModel advisoryModel){
        return seedService.advisorySeed(advisoryModel);
    }
}
