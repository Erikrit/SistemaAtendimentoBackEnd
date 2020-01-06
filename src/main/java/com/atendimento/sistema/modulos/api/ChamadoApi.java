package com.atendimento.sistema.modulos.api;


import com.atendimento.sistema.modulos.model.Chamado;
import com.atendimento.sistema.modulos.repository.ChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chamado")
public class ChamadoApi {

    @Autowired
    private ChamadoRepository chamadoRepository;


    @CrossOrigin
    @GetMapping
    private List<Chamado> listarChamado(){
       return chamadoRepository.findAll();
    }

}
