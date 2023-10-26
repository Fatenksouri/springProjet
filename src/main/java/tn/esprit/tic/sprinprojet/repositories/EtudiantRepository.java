package tn.esprit.tic.sprinprojet.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.sprinprojet.Entity.Etudiant;
@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant,Long> {
}
