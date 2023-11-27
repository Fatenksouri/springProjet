package tn.esprit.tic.sprinprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.sprinprojet.Entity.Etudiant;
import java.util.Optional;

@Repository
public interface Etudiantreposiory extends JpaRepository<Etudiant, Long> {

    Optional<Etudiant>  findByNomAndPrenom(String nom , String prenom);
}
