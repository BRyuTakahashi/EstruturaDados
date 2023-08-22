package org.example;

public class Comida extends Produto{

    private Double preco;
    private Boolean quente;
    private Boolean bebida;

    public Comida(String nome, Double preco, Boolean quente, Boolean bebida){
        super(nome);
        this.preco = preco;
        this.quente = quente;
        this.bebida = bebida;
    }

    public Double getPreco(){
        if(bebida == true){
            return preco + 7.0;
        } else {
            return preco;
        }
    }

    @Override
    public String toString() {
        return "Comida{" +
                "preco=" + preco +
                ", quente=" + quente +
                ", bebida=" + bebida +
                "} " + super.toString();
    }
}
