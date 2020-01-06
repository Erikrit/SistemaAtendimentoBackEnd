package com.atendimento.sistema.modulos.repository;

import com.atendimento.sistema.modulos.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long > {

}
