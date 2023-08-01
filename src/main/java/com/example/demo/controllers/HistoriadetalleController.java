package com.example.demo.controllers;

import com.example.demo.models.HistoriadetalleModel;
import com.example.demo.services.HistoriadetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/historiadetalle")
public class HistoriadetalleController {

    private final HistoriadetalleService historiadetalleService;
    
    @Autowired
    public HistoriadetalleController(HistoriadetalleService historiadetalleService) {
        this.historiadetalleService = historiadetalleService;
    }

    @PostMapping
    public ResponseEntity<HistoriadetalleModel> createHistoriadetalle(@RequestBody HistoriadetalleModel historiadetalle) {
        HistoriadetalleModel createdHistoriadetalle = historiadetalleService.createHistoriadetalle(historiadetalle);
        return new ResponseEntity<>(createdHistoriadetalle, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HistoriadetalleModel> getHistoriadetalle(@PathVariable Long id) {
        HistoriadetalleModel historiadetalle = historiadetalleService.getHistoriadetalleById(id);
        if (historiadetalle != null) {
            return new ResponseEntity<>(historiadetalle, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Agrega aquí más métodos del controlador según tus necesidades
}
