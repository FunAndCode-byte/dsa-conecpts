package sorting;

public class InsertionSort {

	public static int[] insertSort(int arr[]) {
		int temp;
		// will start from 1 as element 0 is already sorted
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
				temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 5, 9, 2, 8 };
		arr = insertSort(arr);
		for (int l = 0; l < arr.length; l++) {
			System.out.println(arr[l]);
		}
	}
}
