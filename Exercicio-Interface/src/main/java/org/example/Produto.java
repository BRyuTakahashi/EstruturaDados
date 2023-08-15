package org.example;

import org.example.Vendavel;

public abstract class Produto implements Vendavel {

    private Integer codigo;
    private Double precoCusto;

    // construtor

    public Produto(Integer codigo, Double precoCusto){
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    // get

    public Double getPrecoCusto(){
        return precoCusto;
    }

    // toString


    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", precoCusto=" + precoCusto +
                '}';
    }
}
