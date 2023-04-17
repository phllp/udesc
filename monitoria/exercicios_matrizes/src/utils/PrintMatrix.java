package utils;

public class PrintMatrix {

	
	public static void printIntegerMatrix(int[][] matrix) {
		int padSize = 1;
		String output = "";
		
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; j++) {
				 int numeroAtual = matrix[i][j];
				 
				 if (("" + numeroAtual).length() > padSize) {
					 padSize = ("" + numeroAtual).length();
				 }
			 }
		}
		
		for (int i = 0; i < matrix.length; ++i) {
			output += "| "; 
			for (int j = 0; j < matrix[i].length; j++) {
				 int numeroAtual = matrix[i][j];
				 String formattingRule = "%0"+padSize+"d";
				 String formatted = String.format(formattingRule, numeroAtual);
				 output += formatted + " | ";
			 }
			 output += "\n";
		}
		
		System.out.println(output);
	}
	

}
