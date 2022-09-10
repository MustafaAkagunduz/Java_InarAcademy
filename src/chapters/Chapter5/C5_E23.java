package chapters.Chapter5;

public class C5_E23 {

	public static void main(String[] args) {

		double rightToLeft = 0.0;
		double leftToRight = 0.0;

		for (double i = 1.0; i <= 5000.0; i++) {

			leftToRight += 1.0 / i;
		}

		System.out.print("Result of the left to right addition: ");
		System.out.printf("%.10f", leftToRight);
		System.out.println();

		for (double i = 5000.0; i >= 1.0; i--) {

			rightToLeft += 1.0 / i;

		}
		System.out.print("Result of the right to left addition: ");
		System.out.printf("%.10f", rightToLeft);
		System.out.println();

		System.out.println("It is stated that, right to left addition gives more accurate results...");
		System.out.println("But I see the same outputs.. Maybe i didn't understand the matter..");
	}

}
