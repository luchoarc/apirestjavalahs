package com.tallerjava.tallerjavataller1.persistence.crud;

import com.tallerjava.tallerjavataller1.persistence.entity.Oficina;
//La magia la realiza la siguiente libreria
import org.springframework.data.repository.CrudRepository;

public interface OficinaCrudRepository extends CrudRepository<Oficina, Integer>{

}
