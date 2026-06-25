package Patterns;

import java.util.Scanner;

public class SecondLargestElement {
	public static int secondLargestElement(int[] nums) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > first) {
				second = first;
				first = nums[i];
			} else if (first > nums[i] && second < nums[i] && nums[i] != first) {
				second = nums[i];
			}
		}
		if (second == Integer.MIN_VALUE) {
			return -1;
		}
		return second;
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
		System.out.println(secondLargestElement(arr));
	}
}