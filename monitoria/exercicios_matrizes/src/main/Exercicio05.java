package main;

import utils.PrintMatrix;
import utils.RandomMatrix;

public class Exercicio05 {
	
	/**
	 * Elabore um programa que declare uma matriz de valores inteiros, cujas dimensões são
	 * 5 linhas e 5 colunas. Este programa deverá fazer a troca dos elementos, onde linhas 
	 * são transferidas para colunas e vice versa
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matriz = new RandomMatrix(5,5,100).matrix;
		
		System.out.println("Matriz original");
		PrintMatrix.printIntegerMatrix(matriz);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				if (i > j) {
					int numLinha = matriz[i][j];
					int numColuna = matriz[j][i];
					matriz[i][j] = numColuna;
					matriz[j][i] = numLinha;
				}
			}
		}
		
		System.out.println("Matriz transposta");
		PrintMatrix.printIntegerMatrix(matriz);
	}

	
}
