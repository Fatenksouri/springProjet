package tn.esprit.tic.sprinprojet.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.sprinprojet.Entity.Bloc;
@Repository
public interface BlocRepository extends CrudRepository<Bloc,Long> {
}