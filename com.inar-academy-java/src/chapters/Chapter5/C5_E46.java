package chapters.Chapter5;

import java.util.Scanner;

public class C5_E46 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = scn.next();

		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));

		}

		scn.close();

	}

}
