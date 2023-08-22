package org.example;

import java.util.ArrayList;
import java.util.List;

public class Barraca {

    private String nome;
    private String departamento;
    private List<Vendavel> lista;

    public Barraca(String nome, String departamento){
        this.nome = nome;
        this.departamento = departamento;
        lista = new ArrayList<>();
    }

    public void adicionarVendavel(Vendavel v){
        lista.add(v);
    }

    @Override
    public String toString() {
        return "Barraca{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", lista=" + lista +
                '}';
    }
}
