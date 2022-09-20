package chapters.Chapter6;

public class C6_E01 {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {

			if (i % 10 == 0)
				System.out.println();
			System.out.print(getPentagonalNumber(i) + " ");

		}

	}

	public static int getPentagonalNumber(int n) {

		return (n * (3 * n) - 1) / 2;

	}

}
