package org.example;

public class AlunoPos extends Aluno{

    // Atributos

    private Double nota1;
    private Double nota2;
    private Double notaMonografia;

    // Construtor

    public AlunoPos(Integer ra, String nome, Double nota1, Double nota2, Double notaMonografia) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    public Double calculaMedia() {
        return (nota1 + nota2 + notaMonografia) / 3;
    }

    @Override
    public String toString() {
        return "AlunoPos{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + notaMonografia +
                ", média=" + calculaMedia() +
                "} " + super.toString();
    }
}
