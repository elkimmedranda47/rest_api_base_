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

import com.example.demo.models.MascotaModel; // Asumo que tienes una clase llamada MascotaModel
import com.example.demo.services.MascotaService; // Asumo que tienes una clase llamada MascotaService

@RestController
@RequestMapping("/mascota") // Cambiamos el mapeo para la ruta de las mascotas
public class MascotaController {
    @Autowired
    MascotaService mascotaService;

    @GetMapping()
    public ArrayList<MascotaModel> obtenerMascotas() {
        return mascotaService.obtenerMascotas();
    }

    @PostMapping()
    public MascotaModel guardarMascota(@RequestBody MascotaModel mascota) {
        return mascotaService.guardarMascota(mascota);
    }

    @GetMapping(path = "/{id}")
    public Optional<MascotaModel> obtenerMascotaPorId(@PathVariable("id") long id) {
        return mascotaService.obtenerMascotaPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarMascotaPorId(@PathVariable("id") Long id) {
        boolean ok = mascotaService.eliminarMascota(id);
        if (ok) {
            return "Se eliminó la mascota con id " + id;
        } else {
            return "No se pudo eliminar la mascota con id " + id;
        }
    }
}
