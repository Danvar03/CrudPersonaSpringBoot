package com.sofka.persona.service;

import com.sofka.persona.domaint.entity.Persona;
import com.sofka.persona.dao.repository.InterfacesRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServiciosPersona implements InferfasServiciosPersona {


    @Autowired
    private InterfacesRepositorioPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> ListId(int id) {
        return Optional.empty();
    }

    @Override
    public Persona crear(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void borrar(int id) {
        data.deleteById(id);

    }

    @Override
    public Persona actualizar(Persona persona) {
        return data.save(persona);
    }
}






