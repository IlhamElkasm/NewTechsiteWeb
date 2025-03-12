package com.newTech.DTOs;

import com.newTech.Enum.MethodePaiement;
import com.newTech.Enum.StatutPaiement;
import lombok.Data;

@Data
public class PaiementDto {
    private Long id;
    private Double montant;
    private MethodePaiement methode;
    private StatutPaiement statut;
    private Long reservationId;
}

