package com.DesafioTotvs.ContasAPagar.domain.entities;

import com.DesafioTotvs.ContasAPagar.domain.entities.enums.SituacaoConta;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@Table(name = "conta")
@Getter
@Setter
@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;
    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;
    private BigDecimal valor;
    private String descricao;
    private SituacaoConta situacao;



}
