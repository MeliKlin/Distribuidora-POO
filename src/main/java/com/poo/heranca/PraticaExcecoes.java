package com.poo.heranca;

public class PraticaExcecoes {

    private static int a = 0;
    private static int b = 300;

    public static void main(String[] args) {
        try {
            int i = b / a;
            System.out.println(i);
        } catch(RuntimeException e) {
            throw new IllegalArgumentException("Não pode ser dividido por zero.");
        }
    }

}
