package com.kenuiworks.api.controle.racha.repository;

import com.kenuiworks.api.controle.racha.model.evento.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
