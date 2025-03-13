package com.newTech.Mapper;

import com.newTech.DTOs.FormationDto;
import com.newTech.Model.Formation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FormationMapper {
    FormationMapper INSTANCE = Mappers.getMapper(FormationMapper.class);

    FormationDto toDto(Formation formation);
    Formation toEntity(FormationDto dto);

    List<FormationDto> toDtoList(List<Formation> formations);
    List<Formation> toEntityList(List<FormationDto> dtos);
}
