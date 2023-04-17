package utils;
import java.util.Random;

public class RandomMatrix {
	
	public int[][] matrix;
	
	public RandomMatrix(int rows, int columns) {
		this.matrix = this.getIntegerMatrix(rows, columns, 100);
	}
	
	public RandomMatrix(int rows, int columns, int limit) {
		this.matrix = this.getIntegerMatrix(rows, columns, limit);
	}
	
	public RandomMatrix(int rows, int columns, int limit, int seed) {
		this.matrix = this.getIntegerMatrix(rows, columns, limit);
	}
	
	private int[][] getIntegerMatrix(int rows, int columns, int limit) {
		Random rand = new Random(100);
		
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < matrix.length; i++) {
			 for (int j = 0; j < matrix[i].length; j++) {
				 int newInteger =  rand.nextInt(limit);
				 matrix[i][j] = newInteger;
			 }
		}
		return matrix;
	}
	
}
