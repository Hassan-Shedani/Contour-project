package com.example.seedsReport.service;

import com.example.seedsReport.model.SeasonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.seedsReport.repository.SeasonRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeasonService {
    @Autowired
    SeasonRepository seasonRepository;
    public SeasonModel saveSeason(SeasonModel seasonModel){
        return new SeasonModel(seasonRepository.save(seasonModel.dissamble()));

//        public String save(SeasonModel seasonModel) {
//            if (seasonRepository.findSeasonByType(seasonyModel.getType()) == null) {
//                categoryModel.assemble(categoryRepository.save(categoryModel.dissamble()));
//                return "Category saved successfully.";
//            } else {
//                return "Category already exists.";
//            }
//        }
    }

    public List<SeasonModel> getSeason(){
        return seasonRepository.findAll().stream().map(SeasonModel::new).collect(Collectors.toList());
    }
}
