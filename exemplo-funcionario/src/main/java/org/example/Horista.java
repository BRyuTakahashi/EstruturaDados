package org.example;

public class Horista extends Funcionario{

    // Atributos

    private Integer qtdHora;
    private Double valorHora;

    // Construtor

    public Horista(String cpf, String nome, Integer qtdHora, Double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    // Métodos

    public Double calcSalario() {
        return qtdHora * valorHora;
    }

    @Override
    public String toString() {
        return "Horista{" +
                "qtdHora=" + qtdHora +
                ", valorHora=" + valorHora +
                "} " + super.toString();
    }
}
