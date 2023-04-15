package com.example.seedsReport.service;

import com.example.seedsReport.model.CropModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.seedsReport.repository.CropRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CropService {
    @Autowired
    CropRepository cropRepository;

    public CropModel saveCrop(CropModel cropModel){
       return new CropModel(cropRepository.save(cropModel.dissamble()));
    }
    public List<CropModel> getCrop(){
        return cropRepository.findAll().stream().map(CropModel::new).collect(Collectors.toList());
    }
}
