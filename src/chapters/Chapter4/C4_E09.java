package chapters.Chapter4;

import java.util.Scanner;

public class C4_E09 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter a character: ");
		char ch = scn.next().charAt(0);
		int unicode = (int) ch;
		// The Unicode for the character E is 69
		System.out.println("The Unicode for the character " + ch + " is " + unicode);

		scn.close();
	}

}
