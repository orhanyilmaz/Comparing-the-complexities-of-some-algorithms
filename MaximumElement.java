import java.util.Random;

public class MaximumElement {

	private int[] array = new int[2501];
	private int maximum_element = 0;

	public void assignRandomNumbersAndFindMaximum(int n) {
		Random random_number = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = random_number.nextInt(3000);
		}
		maximum_element = array[0];
		long start = System.nanoTime();
		for (int j = 1; j <= n; j++) {
			if (array[j] > maximum_element) {
				maximum_element = array[j];
			}
		}
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Maximum n=" + n + " running time " + time + " nanosecond");
	}
}
