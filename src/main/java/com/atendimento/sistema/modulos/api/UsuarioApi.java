package com.atendimento.sistema.modulos.api;

import com.atendimento.sistema.modulos.model.Usuario;
import com.atendimento.sistema.modulos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioApi {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public void salvar(@RequestBody Usuario usuario){
        this.usuarioRepository.save(usuario);

    }
    @CrossOrigin
    @GetMapping
    public List<Usuario> listarUsuario(){
        return this.usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Usuario listUsuarioId(@RequestBody long id){
       return this.usuarioRepository.getOne(id);
    }

    @PutMapping
    public void updateUsuario(@RequestBody Usuario usuario){
        this.usuarioRepository.save(usuario);
    }



}
