package tn.esprit.tic.sprinprojet.services;

import tn.esprit.tic.sprinprojet.Entity.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversite();

    Universite addUniversite(Universite u);

    Universite updateUniversite(Universite u);

    Universite retrieveUniversite(Long idUniversite);

    void removeUniversite(Long idUniversite);
}
