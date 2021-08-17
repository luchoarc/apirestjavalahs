package com.tallerjava.tallerjavataller1.domain.repository;

import com.tallerjava.tallerjavataller1.domain.dto.Office;

import java.util.List;
import java.util.Optional;

public interface OfficeRepository {
    List<Office>getAll();
    Optional<Office>getOffice(int OfficeId);
}
