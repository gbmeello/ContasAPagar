package com.DesafioTotvs.ContasAPagar.aplication;

import com.DesafioTotvs.ContasAPagar.domain.entities.enums.SituacaoConta;
import com.DesafioTotvs.ContasAPagar.interfaces.dto.ContaDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ContaServiceImpl implements ContaService {

    @Override
    public ContaDTO cadastrar(ContaDTO conta) {
        return null;
    }

    @Override
    public ContaDTO atualizar(ContaDTO conta, Long id) {
        return null;
    }

    @Override
    public ContaDTO alterarSituacaoConta(Long id, SituacaoConta situacaoConta) {
        return null;
    }

    @Override
    public Page<ContaDTO> buscarListaContasPagar(LocalDate localDate, Pageable pageable, String descricao) {
        return null;
    }
}
