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
@Table( name = "Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    Long idFoyer;
    String nomfoyer;
    Long capacitefoyer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    Set<Bloc> blocs;
    @OneToOne(mappedBy = "foyer")
    Universite universite;
}