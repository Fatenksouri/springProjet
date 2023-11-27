package tn.esprit.tic.sprinprojet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.sprinprojet.Entity.Bloc;
import tn.esprit.tic.sprinprojet.Entity.Chambre;
import tn.esprit.tic.sprinprojet.Entity.TypeChambre;
import tn.esprit.tic.sprinprojet.Entity.Universte;
import tn.esprit.tic.sprinprojet.services.UniversteServiceimpl;
import tn.esprit.tic.sprinprojet.services.blocserviceimpl;
import java.util.List;

@RestController
public class BlocControlleur {

    @Autowired
    private blocserviceimpl blocserviceimpl;

    public BlocControlleur(blocserviceimpl blocserviceimpl){
        super();
        this.blocserviceimpl=blocserviceimpl;
    }

    @GetMapping("/AllBloc")
    public List<Bloc> retrieveAllUniversty() {
        return blocserviceimpl.retrieveAllBlocs();
    }

    @PostMapping("/AddBloc")
    public Bloc AddBloc(@RequestBody Bloc e){
        return blocserviceimpl.addBloc(e);
    }

    @PutMapping("/UpdateBloc")
    public Bloc UpdateBloc(@RequestBody Bloc e){
        return blocserviceimpl.updateBloc(e);
    }

    @GetMapping("/OneBloc/{id}")
    public Bloc OneBloc(@PathVariable("id") Long id) {
        return blocserviceimpl.retrieveBloc(id);
    }

    @DeleteMapping("/DeleteBloc/{id}")
    public void DeleteBloc(@PathVariable("id") Long id) {
        blocserviceimpl.removeBloc(id);
    }

    @PutMapping("/nbChambreParTypeEtBloc/{type}/{idBloc}")
    public Long nbChambreParTypeEtBloc(@PathVariable("type") TypeChambre type,@PathVariable("idBloc") Long idBloc){
        return blocserviceimpl.nbChambreParTypeEtBloc(type,idBloc);
    }
}
