package main;

/**
 * Considere um vetor de trajetórias de 9 elementos, onde cada elemento possui o valor do
 * próximo elemento do vetor a ser lido.
 *
 * Índice 0 1 2 3 4 5 6 7 8 9
 * Valor  1 5 7 6 9 2 8 4 0 3
 *
 * Assim, a seqüência da leitura seria 5, 2, 7, 4, 9, 3, 6, 8, 0, 1
 *
 * Faça um algoritmo que seja capaz de ler esse vetor e seguir a trajetória.
 */
public class Exercicio13 {

    public static void main(String[] args) {
        int[] vetor = {1, 5, 7, 6, 9, 2, 8, 4, 0, 3};
        int j = 1;

        for (int i = 0; i < vetor.length; i++) {
            int itemAtual = vetor[j];
            System.out.print(itemAtual + " ");
            j = itemAtual;
        }
    }


}
