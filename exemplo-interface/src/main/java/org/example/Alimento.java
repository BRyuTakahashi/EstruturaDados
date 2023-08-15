package org.example;

public class Alimento extends Produto{

    private Integer quantVitamina;

    // construtor

    public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }

    // metodos

    @Override
    public Double getValorTributo(){
        return getPreco() * 0.15;
    }

    // toString

    @Override
    public String toString() {
        return "Alimento{" +
                "quantVitamina=" + quantVitamina +
                "} " + super.toString();
    }
}
