package com.newTech.Mapper;

import com.newTech.DTOs.ProjetDto;
import com.newTech.Model.Projet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProjetMapper {
    ProjetMapper INSTANCE = Mappers.getMapper(ProjetMapper.class);

    ProjetDto toDto(Projet projet);
    Projet toEntity(ProjetDto dto);
}
