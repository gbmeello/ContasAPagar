package com.DesafioTotvs.ContasAPagar.aplication;

import com.DesafioTotvs.ContasAPagar.domain.entities.enums.SituacaoConta;
import com.DesafioTotvs.ContasAPagar.interfaces.dto.ContaDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

public interface ContaService {

    public ContaDTO cadastrar(ContaDTO conta);

    public ContaDTO atualizar(ContaDTO conta, Long id);

    public ContaDTO alterarSituacaoConta(Long id, SituacaoConta situacaoConta);

    public Page<ContaDTO> buscarListaContasPagar(LocalDate localDate, Pageable pageable, String descricao);



}
