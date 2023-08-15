package org.example;

public class Perfume extends Produto{

    private String fragancia;

    // construtor

    public Perfume(Integer codigo, String descricao, Double preco, String fragancia) {
        super(codigo, descricao, preco);
        this.fragancia = fragancia;
    }

    // metodos

    public Double getValorTributo(){
        return getPreco() * 0.27;
    }

    // toString


    @Override
    public String toString() {
        return "Perfume{" +
                "fragancia='" + fragancia + '\'' +
                "} " + super.toString();
    }
}
