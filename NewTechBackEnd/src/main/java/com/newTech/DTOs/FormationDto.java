package com.newTech.DTOs;

import lombok.Data;

@Data
public class FormationDto {
    private Long id;
    private String titre;
    private String description;
    private Double prix;
    private String duree;
}
