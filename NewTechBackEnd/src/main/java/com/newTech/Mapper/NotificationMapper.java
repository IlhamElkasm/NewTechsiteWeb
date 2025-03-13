package com.newTech.Mapper;

import com.newTech.DTOs.NotificationDto;
import com.newTech.Model.Notification;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NotificationMapper {
    NotificationMapper INSTANCE = Mappers.getMapper(NotificationMapper.class);

    NotificationDto toDto(Notification notification);
    Notification toEntity(NotificationDto dto);

    List<NotificationDto> toDtoList(List<Notification> notifications);
    List<Notification> toEntityList(List<NotificationDto> dtos);
}