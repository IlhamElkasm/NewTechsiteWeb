package com.newTech.Mapper;

import com.newTech.DTOs.UtilisateurDto;
import com.newTech.Model.Utilisateur;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UtilisateurMapper {
    UtilisateurMapper INSTANCE = Mappers.getMapper(UtilisateurMapper.class);

    UtilisateurDto toDto(Utilisateur utilisateur);
    Utilisateur toEntity(UtilisateurDto dto);

    List<UtilisateurDto> toDtoList(List<Utilisateur> utilisateurs);
    List<Utilisateur> toEntityList(List<UtilisateurDto> dtos);
}
