package com.kenuiworks.api.controle.racha.mapper;

import com.kenuiworks.api.controle.racha.model.dto.EventoDTO;
import com.kenuiworks.api.controle.racha.model.dto.SocioDTO;
import com.kenuiworks.api.controle.racha.model.evento.Evento;
import com.kenuiworks.api.controle.racha.model.socio.Socio;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

//@Mapper(componentModel = "spring")
public interface EventoMapper {

    @Mapping(target = "data", source = "data", dateFormat = "dd-MM-yyyy")
    Evento toModel(EventoDTO dto);

    EventoDTO toDTO(Evento evento);
}
