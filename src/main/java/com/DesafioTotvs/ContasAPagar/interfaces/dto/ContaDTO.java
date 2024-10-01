package com.DesafioTotvs.ContasAPagar.interfaces.dto;

import com.DesafioTotvs.ContasAPagar.domain.entities.enums.SituacaoConta;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ContaDTO(LocalDate dataVencimento, LocalDate dataPagamento, BigDecimal valor,
                       String descricao, SituacaoConta situacao) {
}
