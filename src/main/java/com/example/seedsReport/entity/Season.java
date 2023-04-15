package com.example.seedsReport.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

// testing purpose
// testing purpose
@Entity
@Data
@Table(name = "season")
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "season")
    private List<Crop> cropList;

}
