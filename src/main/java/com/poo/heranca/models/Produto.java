package com.poo.heranca.models;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcular(int quantidade) {
        return (double) quantidade * this.preco;
    }

    public String toString() {
        return "Produto: " + this.nome +
                "\nPreço: " + this.preco;
    }
}
