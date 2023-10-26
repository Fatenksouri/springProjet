package tn.esprit.tic.sprinprojet.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tic.sprinprojet.Entity.Etudiant;
import tn.esprit.tic.sprinprojet.Entity.Universite;
import tn.esprit.tic.sprinprojet.repositories.UniversiteRepository;

import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class UniversiteServicelmpl implements IUniversiteService{
    UniversiteRepository universiteRepository;
    @Override
    public List<Universite> retrieveAllUniversite() {
        return (List<Universite>) universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
}
