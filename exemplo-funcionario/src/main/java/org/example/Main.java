package org.example;

public class Main {

    public static void main(String[] args){

        //Não é possível fazer new de uma classe abstrata
        // Funcionario f = new Funcionario("12345", "Fulano")

        Engenheiro e = new Engenheiro("12345", "Fulano", 15000.0);
        Vendedor v = new Vendedor("12345", "Ciclano", 3000.0, 0.10);
        Horista h = new Horista("12345", "Beltrano", 100, 40.0);

        System.out.println(e);
        System.out.println(v);
        System.out.println(h);

        Empresa sptech = new Empresa();

        sptech.adicionaFunc(e);
        sptech.adicionaFunc(v);
        sptech.adicionaFunc(h);

        sptech.exibeHoristas();
        sptech.exibeTodos();
        sptech.exibeTotalSalario();


    }
}