package com.kenuiworks.api.controle.racha.controller;

import com.kenuiworks.api.controle.racha.model.dto.EventoDTO;
import com.kenuiworks.api.controle.racha.model.dto.SocioDTO;
import com.kenuiworks.api.controle.racha.service.EventoService;
import com.kenuiworks.api.controle.racha.service.SocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eventos")
public class EventoController {

    @Autowired
    private EventoService service;

    @GetMapping
    public List<EventoDTO> listAll() {
        return service.findAll();
    }



}
