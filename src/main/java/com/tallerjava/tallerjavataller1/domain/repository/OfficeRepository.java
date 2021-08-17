package com.tallerjava.tallerjavataller1.domain.repository;

import com.tallerjava.tallerjavataller1.domain.dto.Office;

import java.util.List;
import java.util.Optional;
//Me define los 02 metodos que brindamos en la API REST
public interface OfficeRepository {
    List<Office>getAll();
    Optional<Office>getOffice(int OfficeId);
}
