package chapters.Chapter5;

import java.util.Scanner;

public class C5_E17 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter an integer between 1-15: ");

		int userInput = scn.nextInt();

		for (int i = 1; i <= userInput; i++) {

			int spaces = userInput - i;
			for (int s = 0; s < spaces; s++) {
				System.out.print(" ");
			}
			for (int left = userInput - spaces; left >= 2; left--) {
				System.out.print((left)); // never reaches to the 1
			}
			for (int right = 1; right < userInput - spaces + 1; right++) {
				System.out.print((right)); // Always starts with 1
			}
			System.out.println();
		}

		scn.close();

	}

}
