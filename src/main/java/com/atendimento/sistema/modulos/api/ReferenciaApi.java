package com.atendimento.sistema.modulos.api;

import com.atendimento.sistema.modulos.model.Referencia;
import com.atendimento.sistema.modulos.repository.ReferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/referencia")
public class ReferenciaApi {

    @Autowired
    private ReferenciaRepository referenciaRepository;

    @GetMapping
    public List<Referencia> listaReferencia(){
      return referenciaRepository.findAll();
    }

    @PostMapping
    public void salvarReferencia (@RequestBody Referencia referencia){
        referenciaRepository.save(referencia);
    }


}
