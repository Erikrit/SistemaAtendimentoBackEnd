package com.atendimento.sistema.modulos.repository;

import com.atendimento.sistema.modulos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long > {
}
