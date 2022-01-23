package com.kenuiworks.api.controle.racha.service;

import com.kenuiworks.api.controle.racha.model.Socio;
import com.kenuiworks.api.controle.racha.model.dto.SocioDTO;

import java.util.List;

public interface SocioService {

    public List<SocioDTO> findAll();
    public Socio findById(Long id);
    public Socio save(Socio socio);
}
