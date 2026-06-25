package sorting;

public class SelectionSort {

	public static int[] selectSort(int arr[]) {
		int min = 0, temp;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j])
					min = j;
			}
			int key = arr[min];
			// shift instead of swap -- stable sort... maintain order for duplicates
			while (min > i) {
				arr[min] = arr[min - 1];
				min--;
			}
			arr[i] = key;
//	        unstable sort-->
//			if (min != i) {
//				temp = arr[i];
//				arr[i] = arr[min];
//				arr[min] = temp;
//			}

		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 5, 9, 2, 8 };
		arr = selectSort(arr);
		for (int l = 0; l < arr.length; l++) {
			System.out.println(arr[l]);
		}
	}
}
