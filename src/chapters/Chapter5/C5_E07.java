package chapters.Chapter5;

public class C5_E07 {

	public static void main(String[] args) {
		double tuition = 10000.0;
		double rate = 0.05;
		double newCost;
		double sum = 0;

		System.out.println("The education costs of first ten years: ");
		for (int i = 1; i <= 10; i++) {

			System.out.println(i + " - " + tuition);
			newCost = tuition * rate;
			tuition += newCost;

		}
		System.out.println("\nThe education costs of four years after the first ten years: ");

		for (int i = 1; i <= 4; i++) {

			System.out.println(i + " - " + tuition);
			newCost = tuition * rate;
			tuition += newCost;
			sum += tuition;

		}
		System.out.println("Sum of those 4 years: ");
		System.out.print(sum);

	}

}
