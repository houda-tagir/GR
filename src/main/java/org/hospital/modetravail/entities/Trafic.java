package org.hospital.modetravail.entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.List;

public class Trafic {
    @Enumerated(EnumType.STRING)
    private Typetrafic typetrafic;
}
