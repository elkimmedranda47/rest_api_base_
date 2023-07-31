package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.MascotaModel;
import com.example.demo.repositories.MascotaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService {

    @Autowired
    MascotaRepository mascotaRepository;

    public ArrayList<MascotaModel> obtenerMascotas() {
        return (ArrayList<MascotaModel>) mascotaRepository.findAll();
    }

    public MascotaModel guardarMascota(MascotaModel mascota) {
        return mascotaRepository.save(mascota);
    }

    public Optional<MascotaModel> obtenerMascotaPorId(long id) {
        return mascotaRepository.findById(id);
    }

    public boolean eliminarMascota(Long id) {
        try {
            mascotaRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
