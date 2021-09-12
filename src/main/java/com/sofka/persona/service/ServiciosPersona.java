package com.sofka.persona.service;

import com.sofka.persona.entity.Persona;
import com.sofka.persona.repository.InterfacesRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosPersona implements  InferfasServiciosPersona{

    @Autowired
    private InterfacesRepositorioPersona data;

    @Override
    public Persona crear(Persona persona) {
        return data.save(persona);
    }

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Persona ListerId(int id) {
        return null;
    }

    @Override
    public Persona guardar(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void borrar(int id) {
       data.deleteById(id);
    }

    @Override
    public Persona actualizar(Persona persona) {
        return null;
    }
}
