package chapters.Chapter5;

public class C5_E15 {

	public static void main(String[] args) {

		char ch;
		int counter = 1;
		for (int i = 33; i <= 126; i++) {
			ch = (char) i;
			System.out.print(ch + " ");
			counter++;
			if (counter == 10) {
				System.out.println();
				counter = 1;
			}

		}

	}

}
