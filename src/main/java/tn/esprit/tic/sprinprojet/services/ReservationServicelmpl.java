package tn.esprit.tic.sprinprojet.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tic.sprinprojet.Entity.Etudiant;
import tn.esprit.tic.sprinprojet.Entity.Reservation;
import tn.esprit.tic.sprinprojet.repositories. ReservationRepository;

import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class ReservationServicelmpl implements IReservationService {
    ReservationRepository  reservationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public void removeReservation(Long idReservation) {
        reservationRepository.deleteById(idReservation);
    }
}
