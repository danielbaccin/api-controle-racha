package com.kenuiworks.api.controle.racha.model.dto;

import com.kenuiworks.api.controle.racha.model.socio.TipoAssociacao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocioDTO {

    private String nome;
    private LocalDate dataNascimento;
    private TipoAssociacao tipo;
    private String descricao;
}
