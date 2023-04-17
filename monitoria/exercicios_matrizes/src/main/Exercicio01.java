package main;
import utils.RandomMatrix;
import utils.PrintMatrix;

public class Exercicio01 {
	
	/**
	 * Elabore um programa que declare uma matriz de valores inteiros, cujas
	 * dimensões são 5 linhas e 5 colunas (5X5). Este programa deve encontrar 
	 * o maior e o menor valor dentro da matriz e escrever.
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matriz = new RandomMatrix(5,5,1000).matrix;
		boolean primeiraVez = true;
		int menor = 0;
		int maior = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			 for (int j = 0; j < matriz[i].length; j++) {
				 int numeroAtual = matriz[i][j];
				 
				 if (primeiraVez) {
					 maior = numeroAtual;
					 menor = numeroAtual;
					 primeiraVez = false;
				 }
				 
				 if ((numeroAtual > maior) && !primeiraVez) {
					 maior = numeroAtual;
				 }
				 if ((numeroAtual < menor) && !primeiraVez) {
					 menor = numeroAtual;
				 }
			 }
		}
		System.out.println("A matriz analisada é a seguinte:");
		PrintMatrix.printIntegerMatrix(matriz);
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
	}

}
