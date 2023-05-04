package main;

/**
 * Leia um vetor de 5 posições contendo os algarismos de um numero. Em seguida
 * escreva esse numero por extenso
 */
public class Exercicio09 {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        String numero = "";

        for (int item : vetor) {
            numero += item;
        }
        System.out.println(numero);
    }

}
