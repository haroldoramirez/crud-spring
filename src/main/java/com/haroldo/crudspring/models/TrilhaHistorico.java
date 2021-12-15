package com.haroldo.crudspring.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class TrilhaHistorico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30, nullable = false)
    private String responsavelAcao;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAcao;

    @Column(length = 30, nullable = false)
    private String ipUsuario;

    @Column(length = 20, nullable = false)
    private String icFuncionalidade;

    @Column(length = 20, nullable = false)
    private String noFuncionalidade;

    @Column(length = 200, nullable = false)
    private String camposVelhos;

    @Column(length = 200, nullable = false)
    private String camposNovos;

    @Column(length = 200, nullable = false)
    private String informacaoAdicional;

}
