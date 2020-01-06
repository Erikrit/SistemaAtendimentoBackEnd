package com.atendimento.sistema.modulos.api;


import com.atendimento.sistema.modulos.model.Empresa;
import com.atendimento.sistema.modulos.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaApi {

    @Autowired
    private EmpresaRepository empresaRepository;

    @CrossOrigin
    @GetMapping
    public List<Empresa> listarEmpresa(){
       return empresaRepository.findAll();
    }
}
