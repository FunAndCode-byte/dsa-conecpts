package sorting;

public class MergeSort {

	public static int[] mergeSort(int nums[]) {
		//recursion will be used divide and conquer like politics :D
		if(nums.length%2==0) {
		}
		return nums;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 5, 9, 2, 8 };
		arr = mergeSort(arr);
		for (int l = 0; l < arr.length; l++) {
			System.out.println(arr[l]);
		}
	}
}