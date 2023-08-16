package org.example;

public class Professor extends Funcionario implements Bonus{

    private Integer qntdAulasSemana;
    private Double valorHoraAula;

    public Professor(String nome, Integer qntdAulasSemana, Double valorHoraAula) {
        super(nome);
        this.qntdAulasSemana = qntdAulasSemana;
        this.valorHoraAula = valorHoraAula;
    }

    public Double getValorBonus() {
        return qntdAulasSemana * valorHoraAula * 4.5 * 0.15;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "qntdAulasSemana=" + qntdAulasSemana +
                ", valorHoraAula=" + valorHoraAula +
                "} " + super.toString();
    }
}
