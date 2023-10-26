

package tn.esprit.tic.sprinprojet.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.sprinprojet.Entity. Universite;
@Repository
public interface  UniversiteRepository extends CrudRepository<Universite,Long> {
}
