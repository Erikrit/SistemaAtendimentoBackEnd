package com.atendimento.sistema.modulos.api;

import com.atendimento.sistema.modulos.model.Funcao;
import com.atendimento.sistema.modulos.repository.FuncaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcao")
public class FuncaoApi {

    @Autowired
    private FuncaoRepository funcaoRepository;

    @CrossOrigin
    @GetMapping
    public List<Funcao> listarFuncao(){
       return funcaoRepository.findAll();
    }

    @PostMapping
    public void salvarFuncao(@RequestBody Funcao funcao){
        funcaoRepository.save(funcao);
    }

}
