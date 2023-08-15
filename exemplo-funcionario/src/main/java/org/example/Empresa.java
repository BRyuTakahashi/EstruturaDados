package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    /// Atributo

    private List<Funcionario> lista;

    //Construtor

    public Empresa(){
        lista = new ArrayList<>();
    }

    // Métodos

    public void adicionaFunc(Funcionario f) {
        lista.add(f);
    }

    public void exibeTodos() {
        System.out.println("\nLista dos Funcionários");
        for (Funcionario f: lista){
            System.out.println(f);
        }
    }

    public void exibeTotalSalario() {
        Double total = 0.0;
        for (Funcionario f: lista) {
            total += f.calcSalario();
        }
        System.out.printf("\nTotal do salário: R$ %.2f\n", total);
    }

    public void exibeHoristas() {
        System.out.println("\nLista dos horistas:");
        for(Funcionario f: lista) {
            if(f instanceof Horista) {
                System.out.println(f);
            } else {
                System.out.println("Não há nenhum horista registrado nessa empresa");
            }
        }
    }

}
