import java.util.Random;

public class BinarySearch {
	private int[] array = new int[2501];
	private int left = 0, right = 0, mid = 0;

	public int assignSortedNumbersAndSearch(int n, int value) {
		Random random_number = new Random();

		for (int i = 0; i < n; i++)
			array[i] = random_number.nextInt(100);

		long start = System.nanoTime();
		left = array[0];
		right = array[n];
		while (left <= right) {
			mid = (int) ((right - left) / 2) + left;
			if (array[mid] == value) {
				long end1 = System.nanoTime();
				long time = end1 - start;
				System.out.println("Binary n=" + n + " running time " + time + " nanosecond");
				return mid;
			}
			if (value < array[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		long end2 = System.nanoTime();
		long time = end2 - start;
		System.out.println("Binary n=" + n + " running time " + time + " nanosecond");
		return 0;
	}

}
