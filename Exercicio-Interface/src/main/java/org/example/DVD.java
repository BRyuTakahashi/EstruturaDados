package org.example;

public class DVD extends Produto {

    private String nome;
    private String gravadora;

    // construtor

    public DVD(Integer codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    // get

    public Double getValorVenda(){
        return getPrecoCusto() * 1.1;
    }

    // toString

    @Override
    public String toString() {
        return "DVD{" +
                "nome='" + nome + '\'' +
                ", gravadora='" + gravadora + '\'' +
                "} " + super.toString();
    }
}

