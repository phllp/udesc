package main;
import utils.PrintMatrix;
import utils.RandomMatrix;


public class Exercicio02 {
	
	/**
	 * Elabore um programa que declare duas matrizes de valores inteiros, cujas 
	 * dimensões são 5 linhas e 5 colunas. Este programa deverá realizar o 
	 * somatório dos elementos correspondentes e mostrar o resultado
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matrizA = new RandomMatrix(5,5,100).matrix;
		int[][] matrizB = new RandomMatrix(5,5,100).matrix;
		int[][] matrizC = new int[5][5];
		
		System.out.println("Matriz A");
		PrintMatrix.printIntegerMatrix(matrizA);
		
		System.out.println("Matriz B");
		PrintMatrix.printIntegerMatrix(matrizB);
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				int numA = matrizA[i][j];
				int numB = matrizB[i][j];
				int soma = numA + numB;
				matrizC[i][j] = soma;
			}
		}
		System.out.println("Matriz C");
		PrintMatrix.printIntegerMatrix(matrizC);
	}
	

}
