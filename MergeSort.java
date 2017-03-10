import java.util.Random;

public class MergeSort {

	public void assignRandomNumbers(int n, int array[]) { // i add this function because i must assign random numbers

		Random random_number = new Random();

		for (int i = 0; i < n; i++)
			array[i] = random_number.nextInt(100);
		
		long start = System.nanoTime();		
		mergeSort(array);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge n=" + n + " running time " + time + " nanosecond");
	}

	public int[] mergeSort(int array[]) {

		int array1[] = new int[array.length / 2];
		int array2[] = new int[array.length - array1.length];

		if (array.length == 1)
			return array;

		System.arraycopy(array, 0, array1, 0, array1.length);
		System.arraycopy(array, array1.length, array2, 0, array2.length);

		array1 = mergeSort(array1);
		array2 = mergeSort(array2);

		return merge(array1, array2);
	}

	public int[] merge(int array1[], int array2[]) {
		int sorted_array[] = new int[array1.length + array2.length];

		int i = 0, j = 0, k = 0;
		while (array1.length > i && array2.length > j) {
			if (array1[i] > array2[j]) {
				sorted_array[k] = array2[j];
				j++;
				k++;
			} else {
				sorted_array[k] = array1[i];
				i++;
				k++;
			}
		}
		while (array1.length > i) {
			sorted_array[k] = array1[i];
			i++;
			k++;
		}
		while (array2.length > j) {
			sorted_array[k] = array2[j];
			j++;
			k++;
		}
		return sorted_array;

	}
}
