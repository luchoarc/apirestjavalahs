package com.tallerjava.tallerjavataller1.persistence.mapper;

import com.tallerjava.tallerjavataller1.domain.dto.Office;
import com.tallerjava.tallerjavataller1.persistence.entity.Oficina;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OfficeMapper {
    @Mappings({
            //source persistence-entity-Oficina ==> target domain-dto-Office
            @Mapping(source = "idOficina", target = "oficinaId"),
            @Mapping(source = "nomOficina", target = "nombreId"),
            @Mapping(source = "gestOficina", target = "gestorId"),
            @Mapping(source = "emailOficina", target = "emailId"),
            @Mapping(source = "dirOficina", target = "direccionId"),
            @Mapping(source = "ciudOficina", target = "ciudadId"),
            @Mapping(source = "depOficina", target = "departamentoId")
    })
    Office toOffice(Oficina oficina);
    List<Office> toOffices(List<Oficina> oficinas);
    @InheritInverseConfiguration
    Oficina toOficina(Office offices);

}
