package tn.esprit.tic.sprinprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.sprinprojet.Entity.Foyer;
@Repository
public interface Foyerrepository extends JpaRepository<Foyer, Long> {
}
