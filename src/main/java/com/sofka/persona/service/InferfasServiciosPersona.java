package com.sofka.persona.service;

import com.sofka.persona.domaint.entity.Persona;

import java.util.List;
import java.util.Optional;

public interface InferfasServiciosPersona {
    public List<Persona> listar();
    public Optional<Persona> ListId(int id);
    public Persona crear(Persona persona);
    public void borrar(int id);
    public Persona actualizar(Persona persona);


}