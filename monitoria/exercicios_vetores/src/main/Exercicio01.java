package main;

import java.util.Scanner;

/**
 * Leia um vetor de inteiros de 12 posições e em seguida ler também dois valores X e Y
 * quaisquer correspondentes a duas posições no vetor. Ao final seu programa deverá
 * escrever a soma dos valores encontrados nas respectivas posições X e Y.
 */
public class Exercicio01 {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Scanner sc = new Scanner(System.in);

        System.out.println("(POSIÇÃO 1) Informe uma posição entre 0 e 11:");
        int pos1 = sc.nextInt();

        System.out.println("(POSIÇÃO 2) Informe uma posição entre 0 e 11:");
        int pos2 = sc.nextInt();

        int item1 = vetor[pos1];
        int item2 = vetor[pos2];

        int soma = item1 + item2;

        System.out.println("A soma dos itens " + item1 + " e " + item2 + " é igual a: " + soma);
    }

}
