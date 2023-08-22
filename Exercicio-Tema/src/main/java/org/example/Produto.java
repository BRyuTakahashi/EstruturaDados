package org.example;

import org.example.Vendavel;

public abstract class Produto implements Vendavel{

    private String nome;

    public Produto(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
