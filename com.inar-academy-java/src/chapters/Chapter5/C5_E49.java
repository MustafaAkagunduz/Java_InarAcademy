package chapters.Chapter5;

import java.util.Scanner;

public class C5_E49 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int vowels = 0;
		int consonants = 0;

		System.out.println("Enter a string: ");
		String str1 = scn.nextLine().toLowerCase();

		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			switch (ch) {

			case 'a':
				vowels++;
				break;
			case 'e':
				vowels++;
				break;
			case 'i':
				vowels++;
				break;
			case 'o':
				vowels++;
				break;
			case 'u':
				vowels++;
				break;
			case ' ':
				continue;
				
			default:
				consonants++;
				break;

			}

		}
		System.out.println("The number of vowels is: " + vowels);
		System.out.println("The number of consonants is: " + consonants);

		scn.close();
	}

}
