package com.atendimento.sistema.modulos.repository;

import com.atendimento.sistema.modulos.model.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Long > {
}
