package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ColaboradorModel;
import com.example.demo.services.ColaboradorService; // Cambio del servicio

@RestController
@RequestMapping("/colaborador") // Cambio de la ruta base
public class ColaboradorController { // Cambio del nombre del controlador

    @Autowired
    ColaboradorService colaboradorService; // Cambio del servicio

    @GetMapping()
    public ArrayList<ColaboradorModel> obtenerColaboradores() { // Cambio del nombre del método
        return colaboradorService.obtenerColaboradores(); // Cambio del nombre del servicio
    }

    @PostMapping()
    public ColaboradorModel guardarColaborador(@RequestBody ColaboradorModel colaborador) { // Cambio del nombre del método y entidad
        return colaboradorService.guardarColaborador(colaborador); // Cambio del nombre del servicio
    }

    @GetMapping(path = "/{id}")
    public Optional<ColaboradorModel> obtenerColaboradorPorId(@PathVariable("id") long id) { // Cambio del nombre del método y entidad
        return colaboradorService.obtenerColaboradorPorId(id); // Cambio del nombre del servicio
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) { // Cambio del nombre del método y tipo de dato del parámetro
        boolean ok = colaboradorService.eliminarColaborador(id); // Cambio del nombre del servicio

        if (ok) {
            return "Se eliminó el colaborador con id " + id; // Cambio del mensaje
        } else {
            return "No pudo eliminar el colaborador con id " + id; // Cambio del mensaje
        }
    }
}
