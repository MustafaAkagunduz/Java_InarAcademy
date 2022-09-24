package chapters.Chapter5;

public class C5_E24 {

	public static void main(String[] args) {

		double sum = 0.0;

		for (int i = 1; i <= 97; i += 2) {

			System.out.print(i + "/" + (i + 2) + "+ ");

			sum += i / i + 2;

		}
		System.out.println();
		System.out.println("= " + sum);
	}

}
