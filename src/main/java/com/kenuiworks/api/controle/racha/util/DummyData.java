package com.kenuiworks.api.controle.racha.util;

import com.kenuiworks.api.controle.racha.model.grupo.Grupo;
import com.kenuiworks.api.controle.racha.model.socio.TipoAssociacao;
import com.kenuiworks.api.controle.racha.model.grupo.TipoGrupo;
import com.kenuiworks.api.controle.racha.repository.GrupoRepository;
import com.kenuiworks.api.controle.racha.model.socio.Socio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class DummyData {

    @Autowired
    GrupoRepository repository;

//    @PostConstruct
    public void saveGrupo(){

        Grupo grupoDefault = new Grupo();
        grupoDefault.setNome("Rachaça");
        grupoDefault.setTipo(TipoGrupo.FUTEBOL);

        Socio ivan = Socio.builder()
                .nome("Ivan")
                .dataNascimento(LocalDate.of(2010, 10, 1))
                .tipo(TipoAssociacao.MENSALISTA)
                .descricao("Atacante de área")
                .build();

        Socio daniel = Socio.builder()
                .nome("Daniel")
                .dataNascimento(LocalDate.of(1984, 10, 6))
                .tipo(TipoAssociacao.MENSALISTA)
                .descricao("Meia atacante")
                .build();

        grupoDefault.adicionaSocio(ivan);
        grupoDefault.adicionaSocio(daniel);

        repository.save(grupoDefault);
    }

}
