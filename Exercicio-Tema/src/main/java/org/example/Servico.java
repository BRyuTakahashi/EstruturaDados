package org.example;

import org.example.Vendavel;

public class Servico implements Vendavel{

    // atributos
    private String descricao;
    private Double preco;
    private Integer tempoMinuto;

    public Servico(String descricao, Double preco, Integer tempoMinuto){
        this.descricao = descricao;
        this.preco = preco;
        this.tempoMinuto = tempoMinuto;
    }

    public Double getPreco(){
        return preco * tempoMinuto;
    }

    // toString
    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
