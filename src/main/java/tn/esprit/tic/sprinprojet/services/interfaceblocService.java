package tn.esprit.tic.sprinprojet.services;

import tn.esprit.tic.sprinprojet.Entity.Bloc;
import tn.esprit.tic.sprinprojet.Entity.TypeChambre;

import java.util.List;

public interface interfaceblocService {

    List<Bloc> retrieveAllBlocs();
    Bloc addBloc (Bloc u);
    Bloc updateBloc (Bloc u);
    Bloc retrieveBloc (long idbloc);
    void removeBloc  (long idbloc );
    public long nbChambreParTypeEtBloc(TypeChambre type, long idBloc );
}
