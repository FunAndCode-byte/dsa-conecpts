package Patterns;

class Solution {
	public static void rotate(int[] nums, int k) {

		for (int i = 0; i < k && k >= 0; i++) {
			int arr[] = new int[nums.length];
			for (int j = 0; j < nums.length; j++) {
				if (j == nums.length - 1) {
					arr[0] = nums[nums.length - 1];
				} else {
					arr[j + 1] = nums[j];
				}
			}
			nums = arr;
		}
		for (int l = 0; l < nums.length; l++)
			System.out.println(nums[l]);
	}

	public static void main(String[] args) {
		int arr[] = { -1,-100,3,99 };
		rotate(arr, 2);
	}
}