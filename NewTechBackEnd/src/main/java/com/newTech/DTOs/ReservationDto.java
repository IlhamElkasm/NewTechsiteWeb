package com.newTech.DTOs;

import com.newTech.Enum.Statut;
import lombok.Data;

import java.util.Date;

@Data
public class ReservationDto {
    private Long id;
    private Date dateReservation;
    private Statut statut;
    private Long clientId;
    private Long formationId;
}

