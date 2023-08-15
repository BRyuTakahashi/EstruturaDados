package org.example;

abstract public class Funcionario {

    // Atributos


    private String cpf;

    private String nome;

    // Construtor

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    // Métodos

    public abstract Double calcSalario();

    // toString


    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + calcSalario() +
                '}';
    }
}
