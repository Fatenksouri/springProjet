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
@Table( name = "Bloc")


public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBloc")
    Long idBloc;
    String nombloc;
    Long capacitebloc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    Set<Chambre>chambres;
    @ManyToOne
    Foyer foyer;

}
