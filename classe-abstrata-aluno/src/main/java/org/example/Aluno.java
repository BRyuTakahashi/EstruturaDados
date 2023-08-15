package org.example;

abstract public class Aluno {

    // Atributos

    private Integer ra;
    private String nome;

    // Construtor

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    // get setters


    public Integer getRa() {
        return ra;
    }

    // Metodos
    public abstract Double calculaMedia();

    // toString

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                '}';
    }
}
