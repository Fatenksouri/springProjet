package tn.esprit.tic.sprinprojet.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table( name = "Bloc")


public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBloc")
    private Long idBloc;
    private String nombloc;
    private Long capacitebloc;
}