package com.newTech.DTOs;

import lombok.Data;

import java.util.Date;
@Data
public class ProjetDto {
    private Long id;
    private String titre;
    private String description;
    private Date dateDebut;
    private Date dateFin;
}
