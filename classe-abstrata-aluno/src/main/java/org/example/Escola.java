package org.example;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    // Atributos

    private String nome;
    private List<Aluno> lista;

    // Construtor

    public Escola(String nome) {
        this.nome = nome;
        lista = new ArrayList<>();
    }

    // Métodos

    public void adicionarAluno(Aluno a) {
        lista.add(a);
        System.out.println("\n Aluno adicionado com sucesso!");
    }

    public void exibeTodos() {
        System.out.println("\nLista dos alunos cadastrados:");
        for(Aluno a: lista){
            System.out.println(a);
        }
    }

    public void exibeAlunosGraduacao() {
        System.out.println("\nAlunos na Graduação:");
        for (Aluno a: lista) {
            if(a instanceof AlunoGraduacao) {
                System.out.println(a);
            }
        }
    }

    public void exibeAprovado() {
        System.out.println("\nLista dos alunos aprovados:");
        for (Aluno a: lista) {
            if (a.calculaMedia() >= 6) {
                System.out.println(a);
            }
        }
    }

    public void buscarAluno(Integer ra) {
        for (Aluno a: lista){
            if (a.getRa().equals(ra)) {
                System.out.println("\n" + a);
                break;
            }
        }
    }
}
