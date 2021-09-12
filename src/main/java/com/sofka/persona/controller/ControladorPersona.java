package com.sofka.persona.controller;

import com.sofka.persona.entity.Persona;
import com.sofka.persona.service.InferfasServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api")
public class ControladorPersona {

    @Autowired
    private InferfasServiciosPersona servicio;

    @GetMapping(value = "listarPersonas")
    public Iterable<Persona> listarPersonas() {
        return servicio.listar();

    }

    @PostMapping(value = "guardarPersona")
    public Persona guardarPersona(@RequestBody Persona persona) {
        return servicio.guardar(persona);

    }


}
