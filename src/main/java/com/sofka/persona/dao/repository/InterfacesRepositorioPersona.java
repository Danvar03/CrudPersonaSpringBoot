package com.sofka.persona.dao.repository;

import com.sofka.persona.domaint.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfacesRepositorioPersona extends CrudRepository<Persona, Integer> {

}
