package sorting;

public class BubbleSort {

	public static int[] bubbleSort(int nums[]) {
		int temp;
		boolean swapped;
		for (int i = nums.length - 1; i >= 0; i--) {
			swapped = false;
			for (int j = 0; j < i; j++) {
				if (nums[j] > nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
		return nums;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 5, 9, 2, 8 };
		arr = bubbleSort(arr);
		for (int l = 0; l < arr.length; l++) {
			System.out.println(arr[l]);
		}
	}
}
