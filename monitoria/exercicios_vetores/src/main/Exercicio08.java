package main;

import com.sun.security.jgss.GSSUtil;

/**
 * Leia um vetor de 40 posições e acumule os valores do primeiro elemento no segundo,
 * deste no terceiro e assim por diante. Ao final, escreva o vetor obtido.
 */
public class Exercicio08 {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < (vetor.length - 1); i++) {
            int itemAtual = vetor[i];
            int proximoItem = vetor[i + 1];

            int novoItem = itemAtual + proximoItem;
            vetor[i + 1] = novoItem;
        }

        for (int item : vetor) {
            System.out.print(item + " ");
        }
    }


}
