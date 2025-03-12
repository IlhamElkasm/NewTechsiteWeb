package com.newTech.Model;


import com.newTech.Enum.MethodePaiement;
import com.newTech.Enum.StatutPaiement;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double montant;

    @Enumerated(EnumType.STRING)
    private MethodePaiement methode;

    @Enumerated(EnumType.STRING)
    private StatutPaiement statut;

    @OneToOne
    private Reservation reservation;
}


