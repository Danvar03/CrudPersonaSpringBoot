package com.sofka.persona.repository;

import com.sofka.persona.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfacesRepositorioPersona extends CrudRepository<Persona, Integer> {

}
