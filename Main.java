import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int n = 100; 				// it can change..
		int array[] = new int[n];

		MatrixMultiplication object1 = new MatrixMultiplication();
		MaximumElement object2 = new MaximumElement();
		BubbleSort object3 = new BubbleSort();
		BinarySearch object4 = new BinarySearch();
		MergeSort object5 = new MergeSort();

		Random random_number = new Random();
		int number = random_number.nextInt(100);

		object1.assignRandomNumbersAndMultiply(n);
		object2.assignRandomNumbersAndFindMaximum(n);
		object3.assignRandomNumbersAndBubbleSort(n);
		object4.assignSortedNumbersAndSearch(n, number);
		object5.assignRandomNumbers(n, array);
	}
}
