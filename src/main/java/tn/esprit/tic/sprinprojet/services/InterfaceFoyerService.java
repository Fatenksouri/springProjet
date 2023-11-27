package tn.esprit.tic.sprinprojet.services;

import tn.esprit.tic.sprinprojet.Entity.Foyer;

import java.util.List;

public interface InterfaceFoyerService {
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer (Foyer f);
    Foyer updateFoyer (Foyer f);
    Foyer retrieveFoyer (long idFoyer);
    void archiverFoyer (long idFoyer);
    Foyer addFoyerWithBloc (Foyer foyer);
}
