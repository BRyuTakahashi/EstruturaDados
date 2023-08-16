package org.example;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

    private List<Bonus> listaFuncionarios;

    public ControleBonus() {
        listaFuncionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Bonus funcionario){
        listaFuncionarios.add(funcionario);
    }
}
