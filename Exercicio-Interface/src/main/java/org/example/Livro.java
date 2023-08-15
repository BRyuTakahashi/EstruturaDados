package org.example;

public class Livro extends Produto {

    private String nome;
    private String autor;
    private String isbn;

    // construtor

    public Livro(Integer codigo, Double precoCusto, String nome, String autor, String isbn) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    // get

    public Double getValorVenda(){
        return getPrecoCusto() * 1.1;
    }

    // toString

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                "} " + super.toString();
    }
}
