package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Vendavel> lista;

    // construtor

    public Carrinho(){
        lista = new ArrayList<>();
    }

    // metodos

    public void adicionarVendavel(Vendavel v){
        lista.add(v);
    }

    public Double calcTotalVenda(){
        Double totalVenda = 0.0;
        for(Vendavel v: lista){
            totalVenda += v.getValorVenda();
        }
        return totalVenda;
    }

    public void exibeListaCarrinho(){
        for(Vendavel v: lista){
            System.out.println(v);
        }
    }
}
