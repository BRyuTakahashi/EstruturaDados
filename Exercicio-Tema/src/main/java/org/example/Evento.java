package org.example;

import java.util.ArrayList;
import java.util.List;

public class Evento {

    private String nome;

    private List<Barraca> lista;

    public Evento(String nome){
        this.nome = nome;
        lista = new ArrayList<>();
    }

    public void adicionarBarraca(Barraca b){
        lista.add(b);
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", lista=" + lista +
                '}';
    }
}
