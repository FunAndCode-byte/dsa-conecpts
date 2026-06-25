package Patterns;

import java.util.Scanner;

public class LargestElement {
	public static int largestElement(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < nums[i + 1]) {
				max = nums[i + 1];
			}
		}
		return max;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = 0;
		if (sc.hasNextInt()) {
			s = sc.nextInt();
		}
		int arr[] = new int[s];

		for (int i = 0; i < s; i++) {
			if (sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}
		}
		System.out.println(largestElement(arr));
	}
}