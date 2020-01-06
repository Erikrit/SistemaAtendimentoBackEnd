package com.atendimento.sistema.modulos.api;


import com.atendimento.sistema.modulos.model.Cliente;
import com.atendimento.sistema.modulos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteApi {


    @Autowired
    private ClienteRepository clienteRepository;

    @CrossOrigin
    @GetMapping
    public List<Cliente> listarCliente(){
      return clienteRepository.findAll();
    }
}
