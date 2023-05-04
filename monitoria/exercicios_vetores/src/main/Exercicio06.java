package main;

/**
 * Leia um vetor de inteiros de 40 posições e atribua valor 0 para todos os elementos que
 * possuírem valores negativos.
 */
public class Exercicio06 {

    public static void main(String[] args) {
        int[] vetor = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10, 11, -12, 13, -14, 15, -16, 17, -18, 19, -20};

        for(int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }
        for (int item : vetor) {
            System.out.print(item + " ");
        }
    }


}
