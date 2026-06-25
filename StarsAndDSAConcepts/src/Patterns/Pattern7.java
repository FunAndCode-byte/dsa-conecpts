package Patterns;

public class Pattern7 {

	public static void main(String[] args) {

		System.out.println("Basic Stars----->");
		int k = 5;
		for (int i = 0; i < k; i++) {
			System.out.println();
			for (int j = 0; j < (k * 2) - 1; j++) {
				System.out.print(" ");
			}
			for (int l = 0; l < k / 2; l++) {
				System.out.print("*");
			}
			for (int m = (k / 2) + 1; m < k * 2 - 1; m++) {
				System.out.print(" ");
			}
		}
	}
}
