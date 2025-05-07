package br.com.gomes.service.strategies;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    private static int fatorial(int numero) {
        if (numero > 1) {
            return numero * fatorial(numero - 1);
        }
        return 1;
    }
}
