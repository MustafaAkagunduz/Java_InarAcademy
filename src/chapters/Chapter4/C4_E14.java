package chapters.Chapter4;

import java.util.Scanner;

public class C4_E14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch;
		System.out.println("Enter a letter grade(Upper Case Please): ");
		ch = scn.next().charAt(0);

		switch (ch) {
		case 'A':
			System.out.println("The numeric value for grade " + ch + " is " + 4);
			break;
		case 'B':
			System.out.println("The numeric value for grade " + ch + " is " + 3);
			break;
		case 'C':
			System.out.println("The numeric value for grade " + ch + " is " + 2);
			break;
		case 'D':
			System.out.println("The numeric value for grade " + ch + " is " + 1);
			break;
		case 'F':
			System.out.println("The numeric value for grade " + ch + " is " + 0);
			break;

		default:
			System.out.println(ch+ " is an invalid grade");
			break;
		}

		scn.close();
	}

}
