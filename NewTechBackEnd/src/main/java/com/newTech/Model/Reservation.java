package com.newTech.Model;



import com.newTech.Enum.Statut;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateReservation;

    @Enumerated(EnumType.STRING)
    private Statut statut;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Formation formation;
}



