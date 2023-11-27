package tn.esprit.tic.sprinprojet.services;
import tn.esprit.tic.sprinprojet.Entity.Bloc;
import tn.esprit.tic.sprinprojet.Entity.Chambre;

import java.util.List;

public interface inyterfacechambreService {

    List<Chambre> retrieveAllChambres();
    Chambre addChambre (Chambre u);
    Chambre updateChambre (Chambre u);
    Chambre retrieveChambre (long idchambre);
    void removeChambre  (long idchambre );

    Bloc affecterChambresABloc (List<Long> numChambre, String nomBloc) ;
     List<Chambre> getChambresParNomBloc ( String nomBloc );
    void listeChambresParBloc();
    void pourcentageChambreParTypeChambre();
    void nbPlacesDisponibleParChambreAnneeEnCours();
}
