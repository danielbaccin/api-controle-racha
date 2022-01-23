package com.kenuiworks.api.controle.racha.controller;

import com.kenuiworks.api.controle.racha.model.dto.SocioDTO;
import com.kenuiworks.api.controle.racha.service.SocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/socios")
public class SocioController {

    @Autowired
    private SocioService service;

    @GetMapping
    public List<SocioDTO> listAll() {
        return service.findAll();
    }



}
