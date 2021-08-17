package com.tallerjava.tallerjavataller1.persistence.mapper;

import com.tallerjava.tallerjavataller1.domain.dto.Office;
import com.tallerjava.tallerjavataller1.persistence.entity.Oficina;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-17T14:25:27-0500",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.1.1.jar, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class OfficeMapperImpl implements OfficeMapper {

    @Override
    public Office toOffice(Oficina oficina) {
        if ( oficina == null ) {
            return null;
        }

        Office office = new Office();

        office.setOficinaId( oficina.getIdOficina() );
        office.setNombreId( oficina.getNomOficina() );
        office.setGestorId( oficina.getGestOficina() );
        office.setEmailId( oficina.getEmailOficina() );
        office.setDireccionId( oficina.getDirOficina() );
        office.setCiudadId( oficina.getCiudOficina() );
        office.setDepartamentoId( oficina.getDepOficina() );

        return office;
    }

    @Override
    public List<Office> toOffices(List<Oficina> oficinas) {
        if ( oficinas == null ) {
            return null;
        }

        List<Office> list = new ArrayList<Office>( oficinas.size() );
        for ( Oficina oficina : oficinas ) {
            list.add( toOffice( oficina ) );
        }

        return list;
    }

    @Override
    public Oficina toOficina(Office offices) {
        if ( offices == null ) {
            return null;
        }

        Oficina oficina = new Oficina();

        oficina.setIdOficina( offices.getOficinaId() );
        oficina.setNomOficina( offices.getNombreId() );
        oficina.setGestOficina( offices.getGestorId() );
        oficina.setEmailOficina( offices.getEmailId() );
        oficina.setDirOficina( offices.getDireccionId() );
        oficina.setCiudOficina( offices.getCiudadId() );
        oficina.setDepOficina( offices.getDepartamentoId() );

        return oficina;
    }
}
