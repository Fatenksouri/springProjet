package tn.esprit.tic.sprinprojet.Entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table( name = "Reservation")


public class Reservation implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idReservation")
    Long idReservation;
    @Temporal(TemporalType.DATE)
    Date anneUniversitaire;
    Boolean estvalide ;
    @ManyToMany(cascade = CascadeType.ALL)
    Set<Etudiant> etudiants;
    @ManyToOne
    Chambre chambre;









}