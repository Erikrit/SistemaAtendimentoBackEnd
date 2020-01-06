package com.atendimento.sistema.modulos.repository;

import com.atendimento.sistema.modulos.model.Atendimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Long > {
}
