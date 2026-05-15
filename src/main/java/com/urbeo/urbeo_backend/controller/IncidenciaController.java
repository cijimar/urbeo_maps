package com.urbeo.urbeo_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.urbeo.urbeo_backend.model.Incidencia;
import com.urbeo.urbeo_backend.repository.IncidenciaRepository;

@RestController
@RequestMapping("/api/incidencias")
@CrossOrigin("*")
public class IncidenciaController {

    @Autowired
    private IncidenciaRepository repository;

    @GetMapping
    public List<Incidencia> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Incidencia guardar(@RequestBody Incidencia incidencia) {
        return repository.save(incidencia);
    }
}
