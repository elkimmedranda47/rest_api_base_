package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.HistoriaclinicaModel;
import com.example.demo.repositories.HistoriaclinicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoriaclinicaService {

    @Autowired
    private HistoriaclinicaRepository historiaclinicaRepository;

    public ArrayList<HistoriaclinicaModel> obtenerHistoriasClinicas() {
        return (ArrayList<HistoriaclinicaModel>) historiaclinicaRepository.findAll();
    }

    public HistoriaclinicaModel guardarHistoriaClinica(HistoriaclinicaModel historiaClinica) {
        return historiaclinicaRepository.save(historiaClinica);
    }

    public Optional<HistoriaclinicaModel> obtenerHistoriaClinicaPorId(long id) {
        return historiaclinicaRepository.findById(id);
    }

    public boolean eliminarHistoriaClinica(Long id) {
        try {
            historiaclinicaRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
