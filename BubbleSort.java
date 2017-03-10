import java.util.Random;

public class BubbleSort {

	private int[] array = new int[2501];
	private int swaps = 0;
	private int temp = 0;

	public void assignRandomNumbersAndBubbleSort(int n) {
		Random random_number = new Random();

		for (int i = 0; i < n; i++)
			array[i] = random_number.nextInt(100);

		long start = System.nanoTime();
		for (int j = 1; j <= n; j++) {
			swaps = 0;
			for (int k = 0; k <= n - j; k++) {

				if (array[k] > array[k + 1]) {
					temp = array[k];
					array[k] = array[k + 1];
					array[k + 1] = temp;
					swaps = swaps + 1;
				}
			}
			if (swaps == 0)
				break;
		}
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Bubble n=" + n + " running time " + time + " nanosecond");
	}
}
