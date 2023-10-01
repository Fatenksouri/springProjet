package tn.esprit.tic.sprinprojet.Entity;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table( name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private Long idChambre;
    private Long numerochambre;
    @Enumerated(EnumType.STRING)
    private Typec typechambre;

}