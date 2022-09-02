package chapters.Chapter4;

import java.util.Scanner;

public class C4_E08 {

	public static void main(String[] args) {

		/*
		 * (Find the character of an ASCII code) Write a program that receives an ASCII
		 * code (an integer between 0 and 127) and displays its character.
		 */

		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter a number between 0-127: ");
		int code = scn.nextInt();

		char ch = (char) code;
		// The character for ASCII code 69 is E
		System.out.println("The character for ASCII code " + code + " is " + ch);

		scn.close();
	}

}
