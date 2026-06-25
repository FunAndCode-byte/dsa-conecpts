package Patterns;

import java.util.Scanner;

public class LinearSearch {
	public static int secondLargestElement(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = 0;
		if (sc.hasNextInt()) {
			s = sc.nextInt();
		}
		int arr[] = { 2, 3, 4, 5, 3 };
//				new int[s];

//		for (int i = 0; i < s; i++) {
//			if (sc.hasNextInt()) {
//				arr[i] = sc.nextInt();
//			}
//		}
		System.out.println("Enter target value-->");
		int target = sc.nextInt();
		System.out.println(secondLargestElement(arr, target));
	}
}