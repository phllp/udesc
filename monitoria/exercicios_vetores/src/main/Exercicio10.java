package main;

/**
 * Leia dois vetores de 5 posições contendo em cada posição uma letra qualquer do
 * alfabeto. Verifique e escreva se ambos possuem o mesmo conteúdo. Considera-se
 * que um array tem o mesmo conteúdo do outro se contiverem as mesmas letras, não
 * importando a ordem em que aparecem em ambos os vetores.
 */
public class Exercicio10 {

    public static void main(String[] args) {
        System.out.println("Exercício 10");
        char[] vetorA = {'A', 'B', 'C', 'D', 'E'};
        char[] vetorB = {'E', 'P', 'A', 'D', 'C'};

        boolean encontrou = false;
        int itensEncontrados = 0;

        for (int i = 0; i < vetorA.length; i++) {
            char letra = vetorA[i];
            for (int j = 0; j < vetorA.length; j ++) {
                if (letra == vetorB[j]) {
                    encontrou = true;
                    itensEncontrados++;
                    break;
                }
            }
            if (!encontrou) {
                System.out.println("Os vetores são diferentes");
                break;
            }
            encontrou = false;
        }

        if (itensEncontrados == vetorA.length) {
            System.out.println("Os vetores são iguais.");
        }

    }


}
