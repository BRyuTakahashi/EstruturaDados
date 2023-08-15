package org.example;

public class Servico implements Tributavel{

    private String descricao;
    private Double preco;

    // construtor

    public Servico(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    // get

    public Double getPreco() {
        return preco;
    }


    // metodos

    public Double getValorTributo(){
        return getPreco() * 0.12;
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
