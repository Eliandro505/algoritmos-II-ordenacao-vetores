package br.com.gomes.service.strategies;

import java.util.Scanner;
import br.com.gomes.util.ImpressaoVetor;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qnts nomes? ");
        int qntNomes = scan.nextInt();
        scan.nextLine();

        String[] nomes = new String[qntNomes];
        for (int i = 0; i < qntNomes; i++) {
            System.out.println(i+1+"° Nome: ");
            nomes[i] = scan.nextLine();
        }

        ordenarNomes(nomes);
        ImpressaoVetor.imprimirString(nomes);

//        int[] vetor = {10, 1, 2, 3, 4};
//        ordenar(vetor);
//        ImpressaoVetor.imprimir(vetor);
    }

    private static void ordenar(int[] vetor) {
        for (int i = 0; i < vetor.length-1; i++) {
            int menor = i;
            for (int x =  i + 1; x < vetor.length; x++) {
                if (vetor[menor] > vetor[x]) menor = x;
            }
            if (menor != i) {
                int temp = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = temp;
            }
        }
    }

    private static void ordenarNomes(String[] nomes) {
        for (int i = 0; i < nomes.length - 1; i++) {
            int menor = i;
            for (int x = i + 1; x < nomes.length; x++) {
                if (nomes[menor].compareTo(nomes[x]) > 0) menor = x;
            }
            if (menor != i) {
                String temp = nomes[i];
                nomes[i] = nomes[menor];
                nomes[menor] = temp;
            }
        }
    }
}
