package chapters.Chapter6;

public class C6_E12 {

	public static void main(String[] args) {

		printChars('1', 'z', 10);
	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int counter = 1;
		for (int i = (int) ch1; i <= (int) ch2; i++) {

			System.out.print(((char) i) + " ");

			counter++;
			if (counter == 10) {
				System.out.println();
				counter = 1;
			}
		}

	}

}
