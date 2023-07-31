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

import com.example.demo.models.ClienteModel;
import com.example.demo.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;
    @GetMapping()
    public ArrayList<ClienteModel> obtenerCliente(){
        return clienteService.obtenerCliente();
    }

    @PostMapping()
    public ClienteModel guardarCliente(@RequestBody ClienteModel cliente){
        return this.clienteService.guardarCliente(cliente);
       
    }

    @GetMapping(path = "/{id}")
    public Optional <ClienteModel> obtenerClientePorId(@PathVariable("id") long id) {
        return this.clienteService.obtenerPorId(id);
    }


    @DeleteMapping( path ="/{id}")
    public String eliminarPorId(@PathVariable("id")Long id){
    
    boolean ok = this.clienteService.eliminarCliente(id);
    
    if (ok){
            return "Se eliminó el usuario con id " + id;
    }else{
            return "No pudo eliminar el usuario con id" + id;
    }
    }


}
