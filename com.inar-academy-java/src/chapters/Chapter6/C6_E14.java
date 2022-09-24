package chapters.Chapter6;

public class C6_E14 {

	public static void main(String[] args) {

		System.out.println("i\t\tm(i)");
		System.out.println("--------------------");

		for (int i = 1; i <= 901; i += 100) {

			System.out.print(i + "\t\t");
			System.out.printf("%.4f", estimatePI(i));
			System.out.println();

		}

	}

	public static double estimatePI(int step) {
		double sum = 0.0;

		for (int i = 1; i <= step; i++) {

			sum += Math.pow(-1, i + 1) / (2 * i - 1);

		}
		sum *= 4;

		return sum;
	}

}
