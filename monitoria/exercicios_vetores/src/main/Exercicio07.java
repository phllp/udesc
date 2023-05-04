package main;

/**
 * Leia dois vetores de inteiros de 20 posições A e B e transfira seus conteúdos para um
 * terceiro vetor C. Este vetor conterá, nas posições pares os valores do vetor A e nas
 * posições impares os valores do vetor B.
 */
public class Exercicio07 {

    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetorB = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorC.length; i++) {
            if (i % 2 == 0) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[i];
            }
        }

        for (int item : vetorC) {
            System.out.print(item + " ");
        }
    }


}
