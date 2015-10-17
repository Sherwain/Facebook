package arraystring;


public class RotateMatrix {
	public static void main(String[] args){
		int[][] matrix = {{11,12,13,14,15},
						  {16,17,18,19,20},
						  {21,22,23,24,25},
		  				  {26,27,28,29,30},
		  				  {31,32,33,34,35}};
		
		//displayArray(matrix);
		rotate2(matrix);
		//System.out.println();
		//displayArray(matrix);
	}
	
	public static void displayArray(int[][] arry){
		for(int r= 0; r < arry.length; r ++){
			for (int c = 0; c < arry[0].length; c++ ){
				System.out.print(arry[r][c] + " ");
			}
			System.out.println();
		}
	}
	
	public static void rotate(int[][] arry){
		if (arry[0].length != arry.length)
			return;
		
		int temp = 0, n = arry.length;
		
		for(int r = 0; r < arry.length / 2; r ++){
			for (int c = 0; c < Math.ceil(arry[0].length / 2); c++ ){
				temp = arry[r][c];
				arry[r][c] = arry[n-1-c][r];
				arry[n-1-c][r] = arry[n-1-c][n-1-c];
				arry[n-1-c][n-1-c] = arry[c][n-1-c];
				arry[c][n-1-c] = temp;
			}
		}
	}
	
	public static int[] getRowCol(int row, int col, int demensionUPX, int demensionDownY, int demensionLeftX, int demensionRightY){
		int[] index = new int[2];
		
		return index;
	}
	
	
	public static void rotate1(int[][] matrix) {
		int n = matrix.length;
		for (int r = 0; r < matrix.length / 2; r++){
			for (int c = 0; c < Math.ceil(matrix.length/2); c++){
				int temp = matrix[r][c];
				matrix[r][c] = matrix[n-1-c][r];
				matrix[n-1-c][r] = matrix[n-1-c][n-1-c];
				matrix[n-1-c][n-1-c] = matrix[c][n-1-c];
				matrix[c][n-1-c] = temp;
			}
		}
	}
	
	public static void rotate2(int[][] matrix){
		int n = matrix.length;
		for(int r = 0; r < n / 2; r++){
			for (int c = 0; c < Math.ceil(n/2); c++){
				int temp = matrix[r][c];
				displayArray(matrix); System.out.println();
				matrix[r][c] = matrix[n-1-c][r];
				displayArray(matrix);System.out.println();
				matrix[n-1-c][r] = matrix[n-1-c][n-1-c];
				displayArray(matrix);System.out.println();
				matrix[n-1-c][n-1-c] = matrix[c][n-1-c];
				displayArray(matrix);System.out.println();
				matrix[c][n-1-c] = temp;
				displayArray(matrix);System.out.println();
			}
		}
	}
}
