package tn.esprit.tic.sprinprojet.services;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tic.sprinprojet.repositories.BlocRepository;
import tn.esprit.tic.sprinprojet.Entity.Bloc;

import java.util.List;
@Service
@Slf4j
@AllArgsConstructor

public class BlocServicelmpl implements IBlocService {

    BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return (List<Bloc>) blocRepository.findAll();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
}

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.findById(idBloc).get();
    }
}
