package com.example.seedsReport.repository;

import com.example.seedsReport.entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// testing purpose
@Repository
public interface CropRepository extends JpaRepository<Crop,Long> {
}
