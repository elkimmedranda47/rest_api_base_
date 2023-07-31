package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.ColaboradorModel;
import com.example.demo.repositories.ColaboradorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColaboradorService {

    @Autowired
    ColaboradorRepository colaboradorRepository;

    public ArrayList<ColaboradorModel> obtenerColaboradores() {
        return (ArrayList<ColaboradorModel>) colaboradorRepository.findAll();
    }

    public ColaboradorModel guardarColaborador(ColaboradorModel colaborador) {
        return colaboradorRepository.save(colaborador);
    }

    public Optional<ColaboradorModel> obtenerColaboradorPorId(long id) {
        return colaboradorRepository.findById(id);
    }

    public boolean eliminarColaborador(Long id) {
        try {
            colaboradorRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
