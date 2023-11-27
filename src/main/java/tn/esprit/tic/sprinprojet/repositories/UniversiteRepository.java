package tn.esprit.tic.sprinprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.sprinprojet.Entity.Universte;
@Repository
public interface Universiterepository extends JpaRepository<Universte, Long> {

    Universte findByNomuniverste(String nom);
}
