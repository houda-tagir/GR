package org.hospital.modetravail.service;

import org.hospital.modetravail.entities.ModeTravail;
import org.hospital.modetravail.repository.ModeTravailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModeTravailImpl implements ModeTravailService {
    @Override
    public void incrementModeTravail(String semaine, String jour) {

    }
   /* @Autowired
    private ModeTravailRepository modeTravailRepository;*/
    /*public void incrementModeTravail( String semaine, String jour){
        ModeTravail modeTravail=new ModeTravail(null,semaine,jour);
        modeTravailRepository.save(modeTravail);
    }
*/
}
