package org.example;

import org.example.Vendavel;

public class Servico implements Vendavel {

    private String descricao;
    private Integer codigo;
    private Integer quantHoras;
    private Double valorHora;

    // construtor

    public Servico(String descricao, Integer codigo, Integer quantHoras, Double valorHora){
        this.descricao = descricao;
        this.codigo = codigo;
        this.quantHoras = quantHoras;
        this.valorHora = valorHora;
    }

    // get

    public Double getValorVenda() {
        return valorHora * quantHoras;
    }

    // toString

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", codigo=" + codigo +
                ", quantHoras=" + quantHoras +
                ", valorHora=" + valorHora +
                '}';
    }
}
