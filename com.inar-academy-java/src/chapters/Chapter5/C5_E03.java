package chapters.Chapter5;

public class C5_E03 {

	public static void main(String[] args) {

		System.out.println("Kilograms\tPounds");
		for (int i = 1; i <= 199; i += 2) {

			System.out.println(i + "\t\t" + ((int) (i * 2.2) * 100 / 100.0));

		}

	}
}
