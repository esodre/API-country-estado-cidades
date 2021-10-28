package com.esodre.citiesapi.countries.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country {
    @Id
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nome_pt")
    private  String nomePortugues;

    @Column(name = "sigla")
    private String code;

    private Integer bacen;

    public Country() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNomePortugues() {
        return nomePortugues;
    }

    public String getCode() {
        return code;
    }

    public Integer getBacen() {
        return bacen;
    }
}
