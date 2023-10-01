package tn.esprit.tic.sprinprojet.Entity;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table( name = "Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    private Long idFoyer;
    private String nomfoyer;
    private Long capacitefoyer;

}