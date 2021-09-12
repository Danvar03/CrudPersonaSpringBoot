package com.sofka.persona.service;

import com.sofka.persona.entity.Persona;

import java.util.List;

public interface InferfasServiciosPersona {
    public List<Persona> listar();

    public Persona ListerId(int id);

    public Persona guardar(Persona persona);

    public void borrar(int id);

    public Persona actualizar(Persona persona);

}
