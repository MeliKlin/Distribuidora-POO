package com.poo.heranca.models;

public class Pereciveis extends Produto {

    private int diasParaVencer;

    public Pereciveis(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcular(int quantidade) {
        double precoFinal = (double) quantidade * getPreco();

        if (this.diasParaVencer == 1) {
            return precoFinal * (1.0/4.0);
        }

        if (this.diasParaVencer == 2) {
            return precoFinal * getPreco() * (1.0/3.0);
        }

        if (this.diasParaVencer == 3) {
            return precoFinal * getPreco() * 0.5;
        }

        return precoFinal;
    }

}
