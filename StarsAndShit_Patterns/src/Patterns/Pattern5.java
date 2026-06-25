package Patterns;

public class Pattern5 {

	public static void main(String[] args) {

		System.out.println("Basic Stars----->");

		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j <= i; j--) {
				System.out.print("*");
			}
		}
	}
}
