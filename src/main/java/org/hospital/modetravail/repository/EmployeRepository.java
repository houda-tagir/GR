package org.hospital.modetravail.repository;

import org.hospital.modetravail.entities.Employe;
import org.hospital.modetravail.entities.ModeTravail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
