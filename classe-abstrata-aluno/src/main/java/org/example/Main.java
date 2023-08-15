package org.example;

public class Main {
    public static void main(String[] args) {

        AlunoFundamental aF = new AlunoFundamental(1222151, "Bruno", 6.0, 5.5, 6.5, 7.0);
        AlunoGraduacao aG = new AlunoGraduacao(1222123, "Estela", 6.0, 6.0);
        AlunoPos aP = new AlunoPos(1222013, "Bruno P", 5.0, 7.0, 5.9);

        System.out.println(aF);
        System.out.println(aG);
        System.out.println(aP);

        Escola spTech = new Escola("Sptech");

        spTech.adicionarAluno(aF);
        spTech.adicionarAluno(aG);
        spTech.adicionarAluno(aP);

        spTech.exibeTodos();
        spTech.exibeAlunosGraduacao();
        spTech.exibeAprovado();
        spTech.buscarAluno(1222151);
    }
}