package com.atendimento.sistema.modulos.api;

import com.atendimento.sistema.modulos.model.Atendimento;
import com.atendimento.sistema.modulos.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/atendimento")
public class AtendimentoApi {

    @Autowired
    private AtendimentoRepository atendimentoRepository;

    @CrossOrigin
    @GetMapping
    public List<Atendimento> listarAtendimento() {
       return atendimentoRepository.findAll();
    }
}