package java_14th_may;

public class TwoDimensionArrayExample {
	
	public static void main(String[] args) {
		int rows = 4;
		int cols = 3;
		int[][] matrix = new int[rows][cols];
		
		int index = 23;
		
		for ( int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				matrix[row][col] = index;
				index++;
			}
		}
		
		for ( int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.print(matrix[row][col] + "|");
			}
			System.out.println("");
		}
	}

}
