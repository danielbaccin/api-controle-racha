package com.kenuiworks.api.controle.racha.model.evento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EVENTO")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "LOCAL")
    private LocalEvento local;

    @Column(name = "DATA")
    private LocalDate data;

    @Column(name = "STATUS")
    private StatusEvento status;

}
