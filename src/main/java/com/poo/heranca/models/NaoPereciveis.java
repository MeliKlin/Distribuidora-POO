package com.poo.heranca.models;

public class NaoPereciveis extends Produto {

    private String tipo;

    public NaoPereciveis(String nome, double preco) {
        super(nome, preco);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return super.toString() + "\ntipo: " + tipo;
    }
}
