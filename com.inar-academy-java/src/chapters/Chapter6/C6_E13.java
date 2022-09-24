package chapters.Chapter6;

public class C6_E13 {

	public static void main(String[] args) {

		System.out.println("i\t\tm(i)");
		System.out.println("--------------------");

		for (double i = 1.0; i <= 20.0; i += 1.0) {

			System.out.print(i + "\t\t");
			System.out.printf("%.4f", sumSeries(i));
			System.out.println();

		}

	}

	public static double sumSeries(double a) {

		double sum = 0;

		for (double i = 1.0; i <= a; i += 1.0) {

			sum += i / (i + 1);

		}
		return sum;

	}

}
