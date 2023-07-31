package com.example.demo.services;
import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.ClienteModel;
import com.example.demo.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

@Autowired
ClienteRepository clienteRepository;

public ArrayList<ClienteModel> obtenerCliente(){
 
    return (ArrayList<ClienteModel>) clienteRepository.findAll();
}

public ClienteModel guardarCliente(ClienteModel cliiente){
  return clienteRepository.save(cliiente);
}

public Optional<ClienteModel> obtenerPorId(long id){
  return clienteRepository.findById(id);
}

public boolean eliminarCliente(Long id) {
    try{
    clienteRepository.deleteById(id);
    return true;
    }catch(Exception err){
    return false;
    }
}
    


}