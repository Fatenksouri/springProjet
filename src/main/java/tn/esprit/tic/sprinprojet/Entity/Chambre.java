package tn.esprit.tic.sprinprojet.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table( name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
     Long idChambre;
     Long numerochambre;
    @Enumerated(EnumType.STRING)
    Typec typechambre;
    @ManyToOne
    Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="chambre")
    Set<Reservation> Reservations;

}
