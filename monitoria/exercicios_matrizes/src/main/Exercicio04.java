package main;

import java.util.ArrayList;
import utils.PrintMatrix;
import utils.RandomMatrix;

public class Exercicio04 {
	
	/**
	 * Elabore um programa que declare uma matriz de valores inteiros, cujas dimensões 
	 * são 5 colunas e 5 linhas. Este programa deverá realizar a contagem dos números 
	 * primos contido na matriz 
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matriz = new RandomMatrix(5, 5, 100).matrix;
		int contPrimos = 0;
		
		ArrayList<Integer> primos = new ArrayList<Integer>();
		
		PrintMatrix.printIntegerMatrix(matriz);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				boolean numeroPrimo = true;
				int numero = matriz[i][j];
				for(int k=2; k < numero; k++) {
					int restoDivisao = numero % k;
					if (restoDivisao == 0)  {
						numeroPrimo = false;
						break;
					}	
				}
				if (numeroPrimo) {
					primos.add(numero);
					contPrimos++;
				}
			}
		}
		System.out.println("Foram encontrados " + contPrimos + " números primos.");
		System.out.println(primos);
	}
	

}
