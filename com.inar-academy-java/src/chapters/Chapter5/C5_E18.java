package chapters.Chapter5;

public class C5_E18 {

	public static void main(String[] args) {
		System.out.println("Pattern A");

		for (int i = 1; i <= 6; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();

		}
		System.out.println();
		System.out.println("Pattern B");

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 7 - i; j++) {
				System.out.print(j);
			}
			System.out.println();

		}
		System.out.println();
		System.out.println("Pattern C");

		for (int i = 1; i <= 6; i++) {

			for (int s = 1; s <= 6 - i; s++) {
				System.out.print(" ");
			}
			for (int left = i; left >= 1; left--) {

				System.out.print(left);
			}
			System.out.println();

		}
		System.out.println();
		System.out.println("Pattern D");

		for (int i = 0; i <= 5; i++) {
			for (int s = 1; s <= i; s++) { // skips the first iteration..
				System.out.print(" ");
			}

			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(j);

			}

			System.out.println();

		}

	}

}
