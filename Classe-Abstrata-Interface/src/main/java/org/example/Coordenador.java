package org.example;

public class Coordenador extends Funcionario implements Bonus{

    private Integer qntdHorasCoordSemana;

    private Double valorHoraCoord;

    public Coordenador(String nome, Integer qntdHorasCoordSemana, Double valorHoraCoord) {
        super(nome);
        this.qntdHorasCoordSemana = qntdHorasCoordSemana;
        this.valorHoraCoord = valorHoraCoord;
    }

    public Double getValorBonus() {
        return qntdHorasCoordSemana * valorHoraCoord * 4.5 * 0.2;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "qntdHorasCoordSemana=" + qntdHorasCoordSemana +
                ", valorHoraCoord=" + valorHoraCoord +
                "} " + super.toString();
    }
}
