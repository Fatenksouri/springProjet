package tn.esprit.tic.sprinprojet.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tic.sprinprojet.services.IFoyerService;

@RestController
@AllArgsConstructor
public class FoyerController {
    IFoyerService foyerService;
}
