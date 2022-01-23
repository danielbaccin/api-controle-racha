package com.kenuiworks.api.controle.racha.service.impl;

import com.kenuiworks.api.controle.racha.repository.SocioRepository;
import com.kenuiworks.api.controle.racha.mapper.SocioMapper;
import com.kenuiworks.api.controle.racha.model.Socio;
import com.kenuiworks.api.controle.racha.model.dto.SocioDTO;
import com.kenuiworks.api.controle.racha.service.SocioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SocioServiceImpl implements SocioService {

    private final SocioRepository repository;

    private final SocioMapper mapper;

    @Override
    public List<SocioDTO> findAll() {

        List<Socio> all = repository.findAll();
        return all.stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Socio findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Socio save(Socio post) {
        return repository.save(post);
    }

}
