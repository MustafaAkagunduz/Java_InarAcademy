package chapters.Chapter5;

public class C5_E20 {

	public static void main(String[] args) {

		int counter = 0;

		for (int i = 2; i <= 1000; i++) {

			if (i == 2) {
				System.out.print(i + " ");
				counter++;
				continue;
			}

			else if (i == 3) {
				System.out.print(i + " ");
				counter++;
				continue;
			}

			else if (i == 5) {
				System.out.print(i + " ");
				counter++;
				continue;
			}

			else if (i == 7) {
				System.out.print(i + " ");
				counter++;
				continue;
			} else if (i % 2 != 0 && (i % 3 != 0 && (i % 5 != 0 && i % 7 != 0))) {

				System.out.print(i + " ");
				counter++;
				if (counter == 8) {
					System.out.println();
					counter = 0;
				}
			}

		}

	}
}