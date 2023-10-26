
package tn.esprit.tic.sprinprojet.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.sprinprojet.Entity.Foyer;
@Repository
public interface FoyerRepository extends CrudRepository<Foyer,Long> {
}
