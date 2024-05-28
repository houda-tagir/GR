package org.hospital.modetravail;

import org.hospital.modetravail.repository.EmployeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModetravailApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModetravailApplication.class, args);
    }
/*    CommandLineRunner satart(){
        EmployeRepository.save(null,"Aziz_77","Grutier",)
    }*/

}
