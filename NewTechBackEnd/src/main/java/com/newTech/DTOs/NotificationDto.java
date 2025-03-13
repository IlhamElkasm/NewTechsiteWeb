package com.newTech.DTOs;

import lombok.Data;

import java.util.Date;
@Data
public class NotificationDto {
    private Long id;
    private String message;
    private Date dateEnvoi;
    private Long utilisateurId;
    private Long paiementId;
}
