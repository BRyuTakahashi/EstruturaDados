package org.example;

public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor("Célia", 18, 32.0);
        Coordenador coordenador = new Coordenador("Monteiro", 24,36.0);

        ControleBonus controle = new ControleBonus();

        controle.adicionarFuncionario(professor);
        controle.adicionarFuncionario(coordenador);

        System.out.printf("Salário bonificado do professor é de R$ %.2f\n", professor.getValorBonus());
        System.out.printf("Salário bonificado do coordenador é de R$ %.2f\n", coordenador.getValorBonus());
    }
}