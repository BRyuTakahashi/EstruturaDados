package org.example.Entity;

import java.time.LocalDate;

public class Evento {

    private Integer id;
    private String nomeEvento;
    private String categoria;
    private String descricao;
    private String dataEvento;
    private Integer qtdBarracas;
    private Double preçoEntrada;

    public Evento(Integer id, String nomeEvento, String categoria, String descricao, String dataEvento, Integer qtdBarracas, Double preçoEntrada) {
        this.id = id;
        this.nomeEvento = nomeEvento;
        this.categoria = categoria;
        this.descricao = descricao;
        this.dataEvento = dataEvento;
        this.qtdBarracas = qtdBarracas;
        this.preçoEntrada = preçoEntrada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public Integer getQtdBarracas() {
        return qtdBarracas;
    }

    public void setQtdBarracas(Integer qtdBarracas) {
        this.qtdBarracas = qtdBarracas;
    }

    public Double getPreçoEntrada() {
        return preçoEntrada;
    }

    public void setPreçoEntrada(Double preçoEntrada) {
        this.preçoEntrada = preçoEntrada;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", nomeEvento='" + nomeEvento + '\'' +
                ", categoria='" + categoria + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataEvento=" + dataEvento +
                ", qtdBarracas=" + qtdBarracas +
                ", preçoEntrada=" + preçoEntrada +
                '}';
    }
}
