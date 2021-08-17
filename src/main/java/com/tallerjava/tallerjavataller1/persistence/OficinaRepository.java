package com.tallerjava.tallerjavataller1.persistence;

import com.tallerjava.tallerjavataller1.domain.dto.Office;
import com.tallerjava.tallerjavataller1.domain.repository.OfficeRepository;
import com.tallerjava.tallerjavataller1.persistence.crud.OficinaCrudRepository;
import com.tallerjava.tallerjavataller1.persistence.entity.Oficina;
import com.tallerjava.tallerjavataller1.persistence.mapper.OfficeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OficinaRepository implements OfficeRepository{

    @Autowired
    private OficinaCrudRepository OficinaCrudRepository;
    @Autowired
    private OfficeMapper Mapper2;

    @Override
    public List<Office> getAll() {
        List<Oficina> oficinas = (List<Oficina>) OficinaCrudRepository.findAll();
        return Mapper2.toOffices(oficinas);
    }

    @Override
    public Optional<Office> getOffice(int OfficeId) {
        return OficinaCrudRepository.findById(OfficeId).map(oficina -> Mapper2.toOffice(oficina));
    }
}
