package com.kenuiworks.api.controle.racha.model.dto;

import com.kenuiworks.api.controle.racha.model.evento.LocalEvento;
import com.kenuiworks.api.controle.racha.model.evento.StatusEvento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventoDTO {

    private LocalEvento local;
    private LocalDate data;
    private StatusEvento status;

}
