package com.atendimento.sistema.repository;

import com.atendimento.sistema.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long > {
}
