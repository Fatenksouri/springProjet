package tn.esprit.tic.sprinprojet.services;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tic.sprinprojet.Entity.Chambre;
import tn.esprit.tic.sprinprojet.Entity.Etudiant;
import tn.esprit.tic.sprinprojet.repositories.ChambreRepository;
import tn.esprit.tic.sprinprojet.repositories.EtudiantRepository;

import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class ChambreServicelmpl implements IChambreService {
    ChambreRepository chambreRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return (List<Chambre>) chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public void removeChambre(Long idChambre) {
        chambreRepository.findById(idChambre).get();
    }
}
