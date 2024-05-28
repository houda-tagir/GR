package org.hospital.modetravail.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manutention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @ElementCollection
    private List<String> typeTrafic = new ArrayList<>(Arrays.asList("Sacherie et divers", "Vrac", "Conteneur"));
    @ElementCollection
    private List<String> trafic = new ArrayList<>(Arrays.asList("Pallette", "Bib Bag"));
    @ElementCollection
    private List<String> equipementFamille = new ArrayList<>(Arrays.asList("Grue", "Elévateur", "Remorque")); ;



}
