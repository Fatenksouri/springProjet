package tn.esprit.tic.sprinprojet.services;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tic.sprinprojet.Entity.Foyer;
import tn.esprit.tic.sprinprojet.repositories.FoyerRepository;

import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class FoyerServicelmpl implements IFoyerService{
    FoyerRepository foyerRepository;
    @Override
    public List<Foyer> retrieveAllFoyer() {
        return (List<Foyer>) foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
}
