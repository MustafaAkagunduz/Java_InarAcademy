package chapters.Chapter5;

import java.util.Scanner;

public class C5_E50 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = scn.nextLine();
		int numOfUppers = 0;

		for (int i = 0; i < str.length(); i++) {

			int ch = (int) str.charAt(i);
			if (ch >= 65 && ch <= 90) {
				numOfUppers++;
			}

		}
		System.out.println("The number of uppercase letters is: " + numOfUppers);

		scn.close();
	}

}
