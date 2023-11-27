package tn.esprit.tic.sprinprojet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.sprinprojet.Entity.Reservation;
import tn.esprit.tic.sprinprojet.repositories.Reservationrepository;

import java.util.Date;
import java.util.List;
@Service
public class reservationserviceimpl implements interfaceresefvationService{
    @Autowired
    private Reservationrepository resrvationrepo;
    @Override
    public List<Reservation> retrieveAllReservations() {
        return resrvationrepo.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return resrvationrepo.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return resrvationrepo.save(r);
    }

    @Override
    public Reservation retrieveReservation(String idreservation) {
        return resrvationrepo.getReferenceById(idreservation);
    }

    @Override
    public void removeReservation(String idreservation) {
        resrvationrepo.deleteById(idreservation);
    }

    @Override
    public List<Reservation> getReservationParAnneeUniversitaire(Date dateDebut, Date dateFin) {
        return resrvationrepo.findByAnneeuniversitaireGreaterThanEqualAndAnneeuniversitaireLessThanEqual(dateDebut,dateFin);
    }
}
