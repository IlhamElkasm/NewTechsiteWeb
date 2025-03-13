package com.newTech.Mapper;

import com.newTech.DTOs.PaiementDto;
import com.newTech.Model.Paiement;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaiementMapper {
    PaiementMapper INSTANCE = Mappers.getMapper(PaiementMapper.class);

    PaiementDto toDto(Paiement paiement);
    Paiement toEntity(PaiementDto dto);

    List<PaiementDto> toDtoList(List<Paiement> paiements);
    List<Paiement> toEntityList(List<PaiementDto> dtos);
}
