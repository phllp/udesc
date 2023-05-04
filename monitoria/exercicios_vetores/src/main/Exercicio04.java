package main;

import java.util.Scanner;

/**
 * Leia um vetor de inteiros de 20 posições e em seguida um valor X qualquer. Seu
 * programa devera fazer uma busca do valor de X no vetor lido e informar a posição em
 * que foi encontrado ou se não foi encontrado.
 */
public class Exercicio04 {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para ser buscado:");
        int busca = sc.nextInt();
        boolean encontrou = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == busca) {
                System.out.println("O número " + busca + " se encontra na posição " + i);
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("O número " + busca + " não foi encontrado");
        }
    }


}
