package chapters.Chapter6;

import java.util.Scanner;

/*(Check password) Some websites impose certain rules for passwords. Write a
method that checks whether a string is a valid password. Suppose the password
rules are as follows:
■ A password must have at least eight characters.
■ A password consists of only letters and digits.
■ A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed or Invalid Password otherwise.*/

public class C6_E18 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter your password: ");
		String password = scn.nextLine();
		isValid(password);
		scn.close();

	}

	public static void isValid(String password) {
		int digitCounter = 0;
		char ch;

		boolean isValid = true;

		// First Check(A password must have at least eight characters.)
		if (password.length() < 8)
			isValid = false;

		// Second Check(A password must contain at least two digits.)
		for (int i = 0; i <= password.length() - 1; i++) {
			ch = password.charAt(i);
			if (Character.isDigit(ch) == true) {
				digitCounter++;
			}

		}
		if (digitCounter < 2)
			isValid = false;

		// Third Check(A password consists of only letters and digits.)
		for (int i = 0; i <= password.length() - 1; i++) {
			ch = password.charAt(i);

			if (Character.isDigit(ch) || Character.isLetter(ch) == true)
				continue;
			else
				isValid = false;

		}

		// Return Process
		if (isValid == true)
			System.out.println("Your password is valid..");
		else
			System.out.println("Your password is invalid..");

	}

}
