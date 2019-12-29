package com.atendimento.sistema.atendimentoApi;

import com.atendimento.sistema.model.Categoria;
import com.atendimento.sistema.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaApi {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> listCategoria(){
        return categoriaRepository.findAll();
    }
    @GetMapping("/id")
    public void listCategoriaPorId(Long id){

    }
    @PostMapping
    public void salvarCategoria(@RequestBody Categoria categoria){
        categoriaRepository.save(categoria);
    }
}
