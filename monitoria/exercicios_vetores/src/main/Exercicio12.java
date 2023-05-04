package main;

/**
 * Leia um vetor de inteiros de 50 posições e o compacte, ou seja,
 * elimine as posições com valor zero avançando uma posição, com os
 * com os valores subseqüentes do vetor. Dessa forma todos “zeros”
 * devem ficar para as posições finais do vetor.
 */
public class Exercicio12 {

    public static void main(String[] args) {
        int[] vetor = {19, 55, 38, 72, 0, 43, 64, 0, 5, 51, 30, 0, 90, 0, 0, 48, 77, 87, 17, 61, 3, 36};

        int i = 0;

        while (i < vetor.length) {
            int itemAtual = vetor[i];

            if ((itemAtual == 0) && (i + 1 < vetor.length)) {
                int j = i + 1;
                int proximoItem = vetor[j];
                while ((proximoItem == 0) && (j + 1 < vetor.length)) {
                    j++;
                    proximoItem = vetor[j];
                }

                vetor[i] = proximoItem;
                vetor[j] = itemAtual;
            }
            i++;
        }

        for (int item : vetor) {
            System.out.print(item + " ");
        }
    }


}
