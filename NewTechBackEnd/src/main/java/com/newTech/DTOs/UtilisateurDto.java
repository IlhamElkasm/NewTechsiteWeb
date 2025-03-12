package com.newTech.DTOs;


import com.newTech.Enum.Role;
import lombok.Data;

@Data
public class UtilisateurDto {
    private Long id;
    private String nom;
    private String email;
    private Role role;
}

