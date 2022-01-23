package com.kenuiworks.api.controle.racha.service.impl;

import com.kenuiworks.api.controle.racha.mapper.EventoMapper;
import com.kenuiworks.api.controle.racha.model.dto.EventoDTO;
import com.kenuiworks.api.controle.racha.model.evento.Evento;
import com.kenuiworks.api.controle.racha.model.socio.Socio;
import com.kenuiworks.api.controle.racha.repository.EventoRepository;
import com.kenuiworks.api.controle.racha.service.EventoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EventoServiceImpl implements EventoService {

    private final EventoRepository repository;
    private final EventoMapper mapper;

    @Override
    public List<EventoDTO> findAll() {
        List<Evento> all = repository.findAll();
        return all.stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Evento findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Evento save(Evento evento) {
        return repository.save(evento);
    }
}
