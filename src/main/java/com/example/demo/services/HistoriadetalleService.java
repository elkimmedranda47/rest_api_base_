package com.example.demo.services;

import com.example.demo.models.HistoriadetalleModel;
import com.example.demo.repositories.HistoriadetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoriadetalleService {

    private final HistoriadetalleRepository historiadetalleRepository;

    @Autowired
    public HistoriadetalleService(HistoriadetalleRepository historiadetalleRepository) {
        this.historiadetalleRepository = historiadetalleRepository;
    }

    public HistoriadetalleModel createHistoriadetalle(HistoriadetalleModel historiadetalle) {
        // Agrega aquí la lógica para validar y procesar los datos antes de guardarlos en la base de datos (si es necesario)
        return historiadetalleRepository.save(historiadetalle);
    }

    public HistoriadetalleModel getHistoriadetalleById(Long id) {
        return historiadetalleRepository.findById(id).orElse(null);
    }

    // Agrega aquí más métodos del servicio según tus necesidades
}
