package com.tallerjava.tallerjavataller1.domain.service;

import com.tallerjava.tallerjavataller1.domain.dto.Office;
import com.tallerjava.tallerjavataller1.domain.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfficeService {
    @Autowired
    private OfficeRepository officeRepository;

    public List<Office> getAll(){return officeRepository.getAll();}
    public Optional<Office>getOffice(int officeId){return officeRepository.getOffice(officeId);}


}
