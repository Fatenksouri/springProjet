package tn.esprit.tic.sprinprojet.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.sprinprojet.Entity.Bloc;
import tn.esprit.tic.sprinprojet.Entity.Chambre;
import tn.esprit.tic.sprinprojet.Entity.Reservation;
import tn.esprit.tic.sprinprojet.Entity.TypeChambre;
import tn.esprit.tic.sprinprojet.repositories.Blocrepository;

import tn.esprit.tic.sprinprojet.repositories.chambrerepository;

import java.util.*;

@Service
public class blocserviceimpl implements interfaceblocService{

    @Autowired
    private tn.esprit.tic.sprinprojet.repositories.Blocrepository Blocrepository;


    @Override
    public List<Bloc> retrieveAllBlocs() {
        return Blocrepository.findAll();
    }

    @Override
    public Bloc addBloc(Bloc u) {
        return Blocrepository.save(u);
    }

    @Override
    public Bloc updateBloc(Bloc u) {
        return Blocrepository.save(u);
    }

    @Override
    public Bloc retrieveBloc(long idbloc) {
        return Blocrepository.getReferenceById(idbloc);
    }

    @Override
    public void removeBloc(long idbloc) {
        Blocrepository.deleteById(idbloc);
    }

    @Override
    public long nbChambreParTypeEtBloc(TypeChambre type, long idBloc) {

        return Blocrepository.countChambresByIdblocAndChambresTypec(idBloc,type) ;
    }


}
