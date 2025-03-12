package com.newTech.Model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private Date dateEnvoi;

    @ManyToOne
    private Utilisateur utilisateur;

    @OneToOne
    private Paiement paiement;
}

