package tn.esprit.tic.sprinprojet.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.sprinprojet.Entity.Chambre;

@Repository
public interface ChambreRepository extends CrudRepository<Chambre,Long> {
}