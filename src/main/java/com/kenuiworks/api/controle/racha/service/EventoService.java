package com.kenuiworks.api.controle.racha.service;

import com.kenuiworks.api.controle.racha.model.dto.EventoDTO;
import com.kenuiworks.api.controle.racha.model.dto.SocioDTO;
import com.kenuiworks.api.controle.racha.model.evento.Evento;
import com.kenuiworks.api.controle.racha.model.socio.Socio;

import java.util.List;

public interface EventoService {

    List<EventoDTO> findAll();
    Evento findById(Long id);
    Evento save(Evento evento);
}
