package Patterns;

public class Pattern6 {

	public static void main(String[] args) {

		System.out.println("Basic Patterns----->");
		int k = 5;
		for (int i = k; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
	}
}