package chapters.Chapter4;

import java.util.Scanner;

public class C4_E19 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int checkSum = 0;

		System.out.println("Enter the first 9 digit of ISBN: ");
		String isbnNumber = scn.nextLine();

		for (int d = 0, dx = 1; d < 9; d++, dx++) {
			int num = Integer.parseInt(String.valueOf(isbnNumber.charAt(d))); //***
			checkSum += num * dx;
		}

		int d10 = checkSum % 11;

		if (d10 == 10) { isbnNumber += "X";
		} else isbnNumber += d10;
			
		System.out.println("The ISBN-10 is " + isbnNumber);

		scn.close();
	}

}
