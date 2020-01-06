package com.atendimento.sistema.modulos.repository;

import com.atendimento.sistema.modulos.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long > {
}
