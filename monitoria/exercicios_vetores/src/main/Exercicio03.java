package main;

import java.util.Scanner;

/**
 * Leia um vetor de inteiros de 16 posições e troque os 8 primeiros valores pelos 8
 * últimos e vice-e-versa. Não pode criar vetor auxiliar. Escreva ao final o vetor obtido.
 */
public class Exercicio03 {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        Scanner sc = new Scanner(System.in);


        for ( int i = 0; i < (vetor.length / 2); i++) {
            int itemAtual = vetor[i];
            int proximoItem = vetor[i + 8];

            vetor[i] = proximoItem;
            vetor[i + 8] = itemAtual;
        }

        System.out.println(vetor);

        for (int item : vetor) {
            System.out.print(item + " ");
        }
    }
}
