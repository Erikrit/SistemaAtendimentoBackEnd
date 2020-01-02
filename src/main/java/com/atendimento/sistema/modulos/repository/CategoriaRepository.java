package com.atendimento.sistema.modulos.repository;

import com.atendimento.sistema.modulos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long > {
}
