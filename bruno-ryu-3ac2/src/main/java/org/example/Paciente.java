package org.example;

public class Paciente {

    private int id;

    private String nome;

    private Boolean prioritario;

    private String sintomas;

    private int idade;

    private Double peso;

    public Paciente(int id, String nome, Boolean prioritario, String sintomas, int idade, Double peso) {
        this.id = id;
        this.nome = nome;
        this.prioritario = prioritario;
        this.sintomas = sintomas;
        this.idade = idade;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getPrioritario() {
        return prioritario;
    }

    public void setPrioritario(Boolean prioritario) {
        this.prioritario = prioritario;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
