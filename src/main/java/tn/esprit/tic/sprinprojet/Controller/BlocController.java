package tn.esprit.tic.sprinprojet.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tic.sprinprojet.services.IBlocService;

@RestController
@AllArgsConstructor
@RequestMapping
public class BlocController {
    IBlocService blocService;
}
