package org.hospital.modetravail.web;

import org.hospital.modetravail.service.ModeTravailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModeTravailController {
    @Autowired
    private ModeTravailService incrementModeTravail;
    @PostMapping("/increment")
    public void incrementModeTravail(@RequestParam String semaine, @RequestParam String jour) {
        incrementModeTravail.incrementModeTravail(semaine, jour);
    }
    @GetMapping("/print")
    public String printit(){
        return "it s working";
    }
}
