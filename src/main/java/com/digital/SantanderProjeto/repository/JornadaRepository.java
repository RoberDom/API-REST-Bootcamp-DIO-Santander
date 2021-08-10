package com.digital.SantanderProjeto.repository;

import com.digital.SantanderProjeto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
// JpaRepository é uma classe com vários métodos para fazer persistência no Banco de Dados
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho,Long> {
}
