package chapters.Chapter5;

public class C5_E11 {

	public static void main(String[] args) {
		
		int counter = 0;
		for (int i = 100; i <= 1000; i++) {

			if (i % 6 == 0 ^ i % 5 == 0) {
				System.out.print(i + " ");
				counter++;

				if (counter == 10) {
					System.out.println();
					counter = 0;
				} // end of the inner if

			} // end of the outer if

		} // end of the for

	}

}
