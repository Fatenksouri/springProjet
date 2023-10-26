package tn.esprit.tic.sprinprojet.services;

import tn.esprit.tic.sprinprojet.Entity.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyer();

    Foyer addFoyer(Foyer f);

    Foyer updateFoyer(Foyer f);

    Foyer retrieveFoyer(Long idFoyer);

    void removeFoyer(Long idFoyer);


}
