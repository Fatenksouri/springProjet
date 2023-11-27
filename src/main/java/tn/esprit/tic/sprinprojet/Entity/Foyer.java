package tn.esprit.tic.sprinprojet.Entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import tn.esprit.tic.sprinprojet.Entity.Bloc;
import tn.esprit.tic.sprinprojet.Entity.Universte;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table( name = "Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idfoyer")
    private Long idfoyer;
    private String nomfoyer;
    private Long capacitefoyer;
    private boolean archived = false;
    @OneToOne(fetch = FetchType.EAGER,mappedBy = "foyer")
    private Universte universte;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy="foyer")
    @JsonManagedReference
    private Set<Bloc> blocs;
}
