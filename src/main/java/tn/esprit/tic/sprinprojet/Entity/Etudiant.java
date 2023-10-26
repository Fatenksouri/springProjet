package tn.esprit.tic.sprinprojet.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
    @Table( name = "Etudiant")
    public class Etudiant implements Serializable {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY) //.TABLE ou AUTO
        @Column(name="idEtudiant")
        Long idEtudiant; // Clé primaire
        //@column(name=)
        String nomEt;
        String prenomEt;
        Long cin;
        String ecole;
        @Temporal(TemporalType.DATE)
        //localdate
        Date dateNaissance;

        //@ManyToMany(mappedBy="Etudiants", cascade = CascadeType.ALL)
       // @ManyToMany(mappedBy="Etudiants", cascade = CascadeType.ALL)
        @ManyToMany(cascade = CascadeType.ALL)
        Set<Reservation> reservations;
}
