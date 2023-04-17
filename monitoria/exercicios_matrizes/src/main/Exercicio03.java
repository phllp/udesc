package main;
import utils.PrintMatrix;
import utils.RandomMatrix;

public class Exercicio03 {
	
	/**
	 * Elabore um programa que declare uma matriz de valores inteiros
	 * cujas dimens�es s�o 5 linhas e colunas. Este programa dever� 
	 * realizar o somat�rio dos elementos da diagonal principal DP. 
	 * Este programa tamb�m ter� de realizar o somat�rio dos programas 
	 * da diagonal secund�ria, e ao final subtrair os dois e exibir o 
	 * resultado;
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matriz = new RandomMatrix(5,5,100).matrix;
		int diagonalPrincipal = 0;
		int diagonalSecundaria = 0;
		
		int line = 0;
		int column = matriz[1].length - 1;
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				if (i == j) {
					diagonalPrincipal += matriz[i][j];	 
				}
				
				if ((i == line) && (j == column)) {
					diagonalSecundaria += matriz[i][j];
					column--;
					line++;
				}
			}
		}
		
		System.out.println("A matriz analizada � a seguinte:");
		PrintMatrix.printIntegerMatrix(matriz);
		System.out.println("A soma dos elementos da DP �: " + diagonalPrincipal);
		System.out.println("A soma dos elementos da DS �: " + diagonalSecundaria);
		
		System.out.println("DP - DS = " + (diagonalPrincipal - diagonalSecundaria));

	}

}
