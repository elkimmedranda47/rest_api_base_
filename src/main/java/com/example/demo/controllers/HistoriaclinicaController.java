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

import com.example.demo.models.HistoriaclinicaModel;
import com.example.demo.services.HistoriaclinicaService;




// Importar las dependencias necesarias

@RestController
@RequestMapping("/historiaclinica")
public class HistoriaclinicaController {

    @Autowired
    HistoriaclinicaService historiaClinicaService;

    @GetMapping()
    public ArrayList<HistoriaclinicaModel> obtenerHistoriasClinicas() {
        return historiaClinicaService.obtenerHistoriasClinicas();
    }

    @PostMapping()
    public HistoriaclinicaModel guardarHistoriaClinica(@RequestBody HistoriaclinicaModel historiaClinica) {
        return this.historiaClinicaService.guardarHistoriaClinica(historiaClinica);
    }

    @GetMapping(path = "/{id}")
    public Optional<HistoriaclinicaModel> obtenerHistoriaClinicaPorId(@PathVariable("id") long id) {
        return this.historiaClinicaService.obtenerHistoriaClinicaPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarHistoriaClinicaPorId(@PathVariable("id") Long id) {
        boolean ok = this.historiaClinicaService.eliminarHistoriaClinica(id);
        
        if (ok) {
            return "Se eliminó la historia clínica con id " + id;
        } else {
            return "No se pudo eliminar la historia clínica con id " + id;
        }
    }
}
