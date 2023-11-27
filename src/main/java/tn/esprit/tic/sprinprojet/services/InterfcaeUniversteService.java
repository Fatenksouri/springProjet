package tn.esprit.tic.sprinprojet.services;

import tn.esprit.tic.sprinprojet.Entity.Universte;

import java.util.List;

public interface InterfcaeUniversteService {
    List<Universte> retrieveAllUniversities();
    Universte addUniversity (Universte u);
    Universte updateUniversity (Universte u);
    Universte retrieveUniversity (long idUniversity);
    void removeUniversity  (long idUniversity );

     Universte affecterFoyerAUniversite(long idFoyer, String nomUniversite) ;

     Universte desaffecterFoyerAUniversite (long idFoyer,  long idUniversite);

}
