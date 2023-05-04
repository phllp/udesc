package main;

/**
 * Declare um vetor de inteiros de 10 posições e o preencha automaticamente com os 10
 * primeiros números impares e o escreva.
 */
public class Exercicio02 {

    public static void main(String[] args) {
        int[] vetor = new int[10];

        int numero = 1;
        int i = 0;

        while (i < 10) {
            vetor[i] = numero;
            i++;
            numero += 2;
        }

        for (int item : vetor) {
            System.out.print(item + " ");
        }
    }

}
