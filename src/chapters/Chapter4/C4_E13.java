package chapters.Chapter4;

import java.util.Scanner;

public class C4_E13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a letter: ");
		String letter = scn.next();
		char ch = letter.charAt(0);
		boolean isLetterr = false;

		if (Character.isLetter(ch) == true) {
			isLetterr = true;
		}

		if (isLetterr == true) {

			if ("aeıioöuü".contains(letter)) {
				System.out.println(letter + " is a vowel.. ");
			} else if ("AEIİOÖUÜ".contains(letter)) {
				System.out.println(letter + " is a vowel.. ");
			} else
				System.out.println(letter + " is a consonant");
		} else
			System.out.println("Invalid input..");

		scn.close();
	}

}
