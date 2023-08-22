package org.example;

public class Cosmetico extends Produto{

    private Double preco;
    private String descricao;

    public Cosmetico(String nome, Double preco, String descricao){
        super(nome);
        this.preco = preco;
        this.descricao = descricao;
    }

    public Double getPreco(){
        return preco;
    }

    @Override
    public String toString() {
        return "Cosmetico{" +
                "preco=" + preco +
                ", descricao='" + descricao + '\'' +
                "} " + super.toString();
    }
}
