package Patterns;

import java.util.ArrayList;
import java.util.List;

public class isSorted {
	public static boolean isSorted(ArrayList<Integer> nums) {
		boolean status = true;
		for (int i = 0; i < nums.size() - 1; i++) {
			if (nums.get(i) > nums.get(i + 1))
				status = false;
		}
		return status;
	}

	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1, 2, 1, 4, 5));
		System.out.println(isSorted(arr));
	}

}
