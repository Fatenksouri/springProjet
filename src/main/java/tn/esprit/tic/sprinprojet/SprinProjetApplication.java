package tn.esprit.tic.sprinprojet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@SpringBootApplication
@EnableScheduling
public class SprinProjetApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprinProjetApplication.class, args);
    }

}
