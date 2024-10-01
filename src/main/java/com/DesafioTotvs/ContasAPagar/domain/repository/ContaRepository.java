package com.DesafioTotvs.ContasAPagar.domain.repository;

import com.DesafioTotvs.ContasAPagar.domain.entities.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {

}
