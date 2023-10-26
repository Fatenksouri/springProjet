package tn.esprit.tic.sprinprojet.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tic.sprinprojet.services.IUniversiteService;

@RestController
@AllArgsConstructor
public class UniversiteController {
    IUniversiteService universiteService;
}
