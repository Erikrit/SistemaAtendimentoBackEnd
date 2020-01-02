package com.atendimento.sistema.modulos.api;

import com.atendimento.sistema.modulos.model.Categoria;
import com.atendimento.sistema.modulos.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaApi {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @CrossOrigin
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
