package main;

/**
 * Leia um vetor de inteiros de 40 posições. Contar e escrever quantos valores pares ele
 * possui.
 */
public class Exercicio05 {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int contador = 0;

        for (int item : vetor) {
            if (item % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Existem " + contador + " números pares no vetor.");
    }


}
