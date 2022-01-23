package com.kenuiworks.api.controle.racha.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "GRUPO")
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "TIPO")
    @Enumerated(EnumType.STRING)
    private TipoGrupo tipo;

    @OneToMany(
            mappedBy = "grupo",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Socio> socios = new ArrayList<>();

    public void adicionaSocio(Socio socio) {
        if(socios == null)
            socios = new ArrayList<>();
        socio.setGrupo(this);
        socios.add(socio);
    }
}
