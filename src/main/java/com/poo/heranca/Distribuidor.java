package com.poo.heranca;

import com.poo.heranca.models.NaoPereciveis;

public class Distribuidor {

    public static void main(String[] args) {
        NaoPereciveis garrafa = new NaoPereciveis("garrafa", 29.90);
        System.out.println(garrafa.toString());
        System.out.println(garrafa.calcular(10));
    }
}
