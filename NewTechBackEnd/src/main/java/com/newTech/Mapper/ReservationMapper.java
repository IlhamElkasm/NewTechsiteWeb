package com.newTech.Mapper;

import com.newTech.DTOs.ReservationDto;
import com.newTech.Model.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservationMapper {
    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

    ReservationDto toDto(Reservation reservation);
    Reservation toEntity(ReservationDto dto);

    List<ReservationDto> toDtoList(List<Reservation> reservations);
    List<Reservation> toEntityList(List<ReservationDto> dtos);
}
