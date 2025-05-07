package br.com.gomes.main;

import br.com.gomes.service.Ordenador;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayNum = {5, 3, 8, 1, 2};

        System.out.printf("[insertionsort] ou [insertion] - Insertion\n" +
                "[qualquer outra entrada] - BubbleSort\n" +
                "---[");

        String entrada = new Scanner(System.in).nextLine();
        Ordenador ordenador = new Ordenador(entrada);
        ordenador.ordenar(arrayNum);

        System.out.println("Vetor ordenado: " + Arrays.toString(arrayNum));
    }
}
