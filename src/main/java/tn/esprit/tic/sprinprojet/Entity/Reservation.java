package tn.esprit.tic.sprinprojet.Entity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table( name = "Reservation")


public class Reservation implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idReservation")
    private Long idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneUniversitaire;
    private Boolean estvalide ;









}