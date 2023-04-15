package com.example.seedsReport.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
// hello
@Entity
@Data
@Table(name = "crop")
public class Crop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @ManyToOne
    @JoinColumn(name ="season_id")
    private Season season;
    @OneToMany(mappedBy = "crop")
    private List<Seed> seedList;


}