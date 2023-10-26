package tn.esprit.tic.sprinprojet.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tic.sprinprojet.services.IChambreService;

@RestController
@AllArgsConstructor
public class ChambreController {
    IChambreService chambreService;
}
