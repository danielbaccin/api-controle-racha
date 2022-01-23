package com.kenuiworks.api.controle.racha.service;

import com.kenuiworks.api.controle.racha.model.socio.Socio;
import com.kenuiworks.api.controle.racha.model.dto.SocioDTO;

import java.util.List;

public interface SocioService {

    List<SocioDTO> findAll();
    Socio findById(Long id);
    Socio save(Socio socio);
}
