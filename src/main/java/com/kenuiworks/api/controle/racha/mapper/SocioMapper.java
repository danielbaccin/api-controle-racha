package com.kenuiworks.api.controle.racha.mapper;

import com.kenuiworks.api.controle.racha.model.socio.Socio;
import com.kenuiworks.api.controle.racha.model.dto.SocioDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

//@Mapper(componentModel = "spring")
public interface SocioMapper {

    @Mapping(target = "dataNascimento", source = "dataNascimento", dateFormat = "dd-MM-yyyy")
    Socio toModel(SocioDTO dto);

    SocioDTO toDTO(Socio dto);
}
