package chapters.Chapter6;

import java.util.Scanner;

public class C6_E21 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a phone number (As a string, it may contain letters): ");
		String phoneNumber = scn.nextLine();
		System.out.println(convert(phoneNumber));

		scn.close();

	}

	public static String convert(String str) {

		String result = "";
		char ch;
		int a;
		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);

			if (Character.isLetter(ch)) {
				a = getNumber(ch);

				result += a;
			} else
				result += ch;

		}

		return result;

	}

	public static int getNumber(char uppercaseLetter) {

		int control = (int) uppercaseLetter;
		int result = 0;

		if (control > 96) {
			control -= 32;
		}

		uppercaseLetter = (char) control;

		switch (uppercaseLetter) {

		case 'A':
			result = 2;
			break;
		case 'B':
			result = 2;
			break;
		case 'C':
			result = 2;
			break;
		case 'D':
			result = 3;
			break;
		case 'E':
			result = 3;
			break;
		case 'F':
			result = 3;
			break;
		case 'G':
			result = 4;
			break;
		case 'H':
			result = 4;
			break;
		case 'I':
			result = 4;
			break;
		case 'J':
			result = 5;
			break;
		case 'K':
			result = 5;
			break;
		case 'L':
			result = 5;
			break;
		case 'M':
			result = 6;
			break;
		case 'N':
			result = 6;
			break;
		case 'O':
			result = 6;
			break;
		case 'P':
			result = 7;
			break;
		case 'Q':
			result = 7;
			break;
		case 'R':
			result = 7;
			break;
		case 'S':
			result = 7;
			break;
		case 'T':
			result = 8;
			break;
		case 'U':
			result = 8;
			break;
		case 'V':
			result = 8;
			break;
		case 'W':
			result = 9;
			break;
		case 'X':
			result = 9;
			break;
		case 'Y':
			result = 9;
			break;
		case 'Z':
			result = 9;
			break;
		default:
			result = 0;
			break;
		}
		return result;

	}

}
