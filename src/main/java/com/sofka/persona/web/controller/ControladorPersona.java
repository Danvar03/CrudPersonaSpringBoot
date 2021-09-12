package com.sofka.persona.web.controller;

import com.sofka.persona.domaint.entity.Persona;
import com.sofka.persona.service.InferfasServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("api")
public class ControladorPersona {

    @Autowired
    private InferfasServiciosPersona servicio;

    @PostMapping(value = "crearPersona")
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona) {
        return new ResponseEntity<Persona>(servicio.crear(persona), HttpStatus.CREATED);
    }

    @GetMapping(value = "listarPersonas")
    public Iterable<Persona> listarPersonas() {
        return servicio.listar();
    }

    @GetMapping(value = "listarPersonaId")
    public Optional<Persona> ListarPesonaId(@PathVariable int id) {
        return servicio.ListId(id);
    }

    @PutMapping(value = "ActualizarPersona")
    public void actualizar(@RequestBody Persona persona) {
        servicio.actualizar(persona);

    }

    @DeleteMapping(value = "borrarPorId/{id}")
    public void borrar(@PathVariable int id) {
        servicio.borrar(id);
    }

}







