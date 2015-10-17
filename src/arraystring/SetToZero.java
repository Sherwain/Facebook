package arraystring;

public class SetToZero {
	public static void main(String[] args){
		int[][] matrix = {{1,0,1,0},
				{2,1,7,5},
				{2,5,2,1},
				{4,7,9,9}};
		display(matrix);
		System.out.println();
		setToZero(matrix);
		display(matrix);
	}
	
	public static void setToZero(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix.length];
		for (int r = 0; r < matrix.length; r++){
			for(int c = 0; c < matrix[0].length; c++){
				if (matrix[r][c] == 0){
					row[r] = true;
					col[c] = true;
				}
			}
		}
		for(int r = 0; r < matrix.length; r++){
			for(int c = 0; c < matrix.length; c++){
				if(row[r] || col[c])
					matrix[r][c] = 0;
			}
		}
	}
	
	public static void display(int[][] matrix){
		for (int r = 0; r < matrix.length; r++){
			for(int c = 0; c < matrix[0].length; c++){
				System.out.print(matrix[r][c] + " ");
			}
			System.out.println();
		}
	}
}
