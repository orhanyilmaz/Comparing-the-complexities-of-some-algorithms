import java.util.Random;

public class MatrixMultiplication {

	private int[][] matrix1 = new int[2501][2501];
	private int[][] matrix2 = new int[2501][2501];
	private int[][] matrix3 = new int[2501][2501];

	public void assignRandomNumbersAndMultiply(int n) {
		Random random_number = new Random();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				matrix1[i][j] = random_number.nextInt(100);
				matrix2[i][j] = random_number.nextInt(100);
			}
		}
		long start = System.nanoTime();
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				matrix3[i][j] = 0;
				for (int k = 0; k <= n; k++) {
					matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Matrix n=" + n + " running time " + time + " nanosecond");
	}
}
